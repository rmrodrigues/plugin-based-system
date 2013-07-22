> **Note:** The documentation  is being constructed. It can constains some errors or wrong sentences.


#plugin-based-system
This is a simple example of a plugin based system. Simple and easy to learn and very useful when we want to have a scalable system.
##Example
We have a system that saves person data in a file. We need also to save the person data in diferent types such as:
* Plain Text (Java toString)
* JSon
* CSV
* XML

In the future, probably we will need save it in much more formats, so the system must be prepared to be scalable.

##How it works?
Fistly we need to have a perception that what entities we need to develop the solution.
## Entities
Given the example we need to have some entities that will write the person data using a specific format. Those entities we call them as a plugin.
###Plugin
A plugin is a system component that has the function to write the person data in a specific format. The system can has many plugins.

###Plugin Manager
We need a entity to manage system plugins, the plugin manager do that work. The Plugin Manager has a reference for all plugins registered.



###Creating a new plugin
We want to create a plugin to save person data in JSon format.
#### 1º Step
To create a new plugin you only need create a maven project and put the below configuration on pom.xml file.

```xml

<dependencies>
  	<dependency>
			<groupId>org.rmr.spring.pbs</groupId>
			<artifactId>plugin-based-system</artifactId>
			<version>1.0.0</version>
		</dependency>
		<dependency>
			<groupId>com.google.code.gson</groupId>
			<artifactId>gson</artifactId>
			<version>1.7.1</version>
		</dependency>
	</dependencies>

```
> **Note:** We are dependent of the plugin-based-system to acces the plugin structure. The gson dependency refers to a JSon libraby that will be used to write person data in json format.

#### 2º Step
We need create an applicationContext.xml thet will contains the plugin definition. So, the file created must be placed on folder src/main/resources.
After create file we need to define the plugin.

```xml

<bean id="pJSon" class="com.rmr.plugin.PJSon" parent="pluginBase">
		<property name="pluginName">
			<value>Person to Json</value>
		</property>
		<property name="pluginVendor">
			<value>JSON INC</value>
		</property>
		<property name="pluginVersion">
			<value>1.6.0</value>
		</property>
</bean>

```
#####Spring Bean Description
* id -> Bean ID
* class -> Our class that represents the plugin.
* parent -> Define the plugin base of "SDK".
* 
#####Properties escription
* pluginName -> The plugin Name
* pluginVersion -> The plugin Version
* pluginVendor -> The plugin Vendor
* 

#####Plugin Class
In this case, we need to create the class `com.rmr.plugin.PJSon`. This class must extends the abstract class `PluginBase`.
In this plugin exampl, we'll use the library `gson` defined on pom.xml.
```java

package com.rmr.plugin;

import org.rmr.spring.pbs.core.plugin.definition.PluginBase;
import org.rmr.spring.pbs.core.runnable.Person;

import com.google.gson.Gson;

public class PJSon extends PluginBase {

	@Override
	public void write(Person person) {
		Gson gson = new Gson();
		String jsonString = gson.toJson(person);
		System.out.println(jsonString);

	}

}

```

[![githalytics.com alpha](https://cruel-carlota.pagodabox.com/5961ed27ce1cac22795ec10d7e1c6f9b "githalytics.com")](http://githalytics.com/rmrodrigues/plugin-based-system)
