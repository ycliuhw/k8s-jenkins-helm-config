Jenkins.instance.pluginManager.plugins.sort { it.getDisplayName() }.each{
  plugin -> 
    println ("- ${plugin.getShortName()}:${plugin.getVersion()}")
}
