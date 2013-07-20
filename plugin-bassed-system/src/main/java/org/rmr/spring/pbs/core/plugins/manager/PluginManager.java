package org.rmr.spring.pbs.core.plugins.manager;

import java.util.List;

import org.rmr.spring.pbs.core.plugin.definition.PluginBase;

public interface PluginManager {

	public void register(PluginBase plugin);

	public List<PluginBase> plugins();

	public int size();
}
