package org.rmr.spring.pbs.core.runnable;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.rmr.spring.pbs.core.plugin.definition.PluginBase;
import org.rmr.spring.pbs.core.plugins.manager.PluginManager;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	private static Log LOG = LogFactory.getLog(App.class);

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "classpath*:applicationContext.xml" });

		PluginManager pluginManager = (PluginManager) context
				.getBean("pluginManager");

		LOG.info(pluginManager.size() + " plugins() registered.");
		
		Person person = new Person(1, "Rui", "Rodrigues", 25,
				"Viana do Castelo", "Portugal");
		
		for (PluginBase current : pluginManager.plugins()) {
			current.write(person);
		}
	}

}
