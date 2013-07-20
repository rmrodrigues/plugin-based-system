package org.rmr.spring.pbs.core.plugins.manager;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.rmr.spring.pbs.core.plugin.definition.PluginBase;

/**
 * The Class PluginManagerBase.
 */
public class PluginManagerBase implements PluginManager {

	/** The log. */
	private static Log LOG = LogFactory.getLog(PluginManagerBase.class);

	/** The plugins. */
	private List<PluginBase> plugins;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.rmr.spring.pbs.core.plugins.manager.PluginManager#register(org.rmr
	 * .spring.pbs.core.plugin.definition.PluginBase)
	 */
	public void register(PluginBase plugin) {
		LOG.info("Registering plugin \"" + plugin.getPluginName()
				+ "\" with version: " + plugin.getPluginVersion()
				+ " from Vendor: " + plugin.getPluginVendor());
		getPlugins().add(plugin);
		LOG.info("Plugin: " + plugin.getPluginName() + "\" registered.");
	}

	/**
	 * Gets the plugins.
	 * 
	 * @return the plugins
	 */
	public List<PluginBase> getPlugins() {
		return plugins;
	}

	/**
	 * Sets the plugins.
	 * 
	 * @param plugins
	 *            the new plugins
	 */
	public void setPlugins(List<PluginBase> plugins) {
		this.plugins = plugins;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.rmr.spring.pbs.core.plugins.manager.PluginManager#size()
	 */
	public int size() {
		return plugins.size();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.rmr.spring.pbs.core.plugins.manager.PluginManager#plugins()
	 */
	public List<PluginBase> plugins() {
		return plugins;
	}

}
