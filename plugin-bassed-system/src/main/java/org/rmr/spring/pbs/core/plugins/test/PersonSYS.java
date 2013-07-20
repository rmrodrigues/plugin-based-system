package org.rmr.spring.pbs.core.plugins.test;

import org.rmr.spring.pbs.core.plugin.definition.PluginBase;
import org.rmr.spring.pbs.core.runnable.Person;

public class PersonSYS extends PluginBase {

	public PersonSYS() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void write(Person person) {
		System.out.println(person);

	}

}
