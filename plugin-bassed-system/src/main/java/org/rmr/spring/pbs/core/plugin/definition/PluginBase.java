package org.rmr.spring.pbs.core.plugin.definition;

import org.rmr.spring.pbs.core.plugins.manager.PluginManager;
import org.rmr.spring.pbs.core.runnable.Person;

// TODO: Auto-generated Javadoc
/**
 * The Class PluginBase.
 */
public abstract class PluginBase implements Plugin {

	/** The plugin name. */
	private String pluginName;

	/** The plugin version. */
	private String pluginVersion;

	/** The plugin vendor. */
	private String pluginVendor;

	/** The plugin manager. */
	private PluginManager pluginManager;

	/**
	 * Gets the plugin manager.
	 * 
	 * @return the plugin manager
	 */
	public PluginManager getPluginManager() {
		return pluginManager;
	}

	/**
	 * Sets the plugin manager.
	 * 
	 * @param pluginManager
	 *            the new plugin manager
	 */
	public void setPluginManager(PluginManager pluginManager) {
		this.pluginManager = pluginManager;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.springframework.beans.factory.InitializingBean#afterPropertiesSet()
	 */
	public void afterPropertiesSet() throws Exception {
		getPluginManager().register(this);
	}

	/**
	 * Gets the plugin name.
	 * 
	 * @return the plugin name
	 */
	public String getPluginName() {
		return pluginName;
	}

	/**
	 * Sets the plugin name.
	 * 
	 * @param pluginName
	 *            the new plugin name
	 */
	public void setPluginName(String pluginName) {
		this.pluginName = pluginName;
	}

	/**
	 * Gets the plugin version.
	 * 
	 * @return the plugin version
	 */
	public String getPluginVersion() {
		return pluginVersion;
	}

	/**
	 * Sets the plugin version.
	 * 
	 * @param pluginVersion
	 *            the new plugin version
	 */
	public void setPluginVersion(String pluginVersion) {
		this.pluginVersion = pluginVersion;
	}

	/**
	 * Gets the plugin vendor.
	 * 
	 * @return the plugin vendor
	 */
	public String getPluginVendor() {
		return pluginVendor;
	}

	/**
	 * Sets the plugin vendor.
	 * 
	 * @param pluginVendor
	 *            the new plugin vendor
	 */
	public void setPluginVendor(String pluginVendor) {
		this.pluginVendor = pluginVendor;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.rmr.spring.pbs.core.plugin.definition.Plugin#writer()
	 */
	public abstract void write(Person person);

}
