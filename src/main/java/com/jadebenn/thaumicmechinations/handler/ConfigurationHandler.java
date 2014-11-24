package com.jadebenn.thaumicmechinations.handler;

import java.io.File;

import com.jadebenn.thaumicmechinations.reference.Reference;
import com.jadebenn.thaumicmechinations.util.LogHelper;

import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;

public class ConfigurationHandler 
{
	public static Configuration configuration;
	public static boolean testValue = false;
	
	public static void init(File configFile)
	{
		//This creates the config objects form the config
		if (configuration == null)
		{
			configuration = new Configuration(configFile);
			loadConfiguration();
		}
	}
	
	@SubscribeEvent
	public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event)
	{
		if (event.modID.equalsIgnoreCase(Reference.MOD_ID))
		{
			//This resyncs the configs to update for changes
			loadConfiguration();
		}
	}
	
	private static void loadConfiguration()
	{
		testValue = configuration.getBoolean("configValue", Configuration.CATEGORY_GENERAL, false, "EXAMPLE CONFIG VALUE");
	}
}
