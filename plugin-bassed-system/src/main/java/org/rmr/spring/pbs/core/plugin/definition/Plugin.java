package org.rmr.spring.pbs.core.plugin.definition;

import org.rmr.spring.pbs.core.runnable.Person;
import org.springframework.beans.factory.InitializingBean;

/**
 * The Interface Plugin.
 */
public interface Plugin extends InitializingBean {

	/**
	 * Writer.
	 */
	public void write(Person person);

}
