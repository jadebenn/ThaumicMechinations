package com.jadebenn.thaumicmechinations;

import com.jadebenn.thaumicmechinations.handler.ConfigurationHandler;
import com.jadebenn.thaumicmechinations.init.ModBlocks;
import com.jadebenn.thaumicmechinations.init.ModItems;
import com.jadebenn.thaumicmechinations.init.Recipes;
import com.jadebenn.thaumicmechinations.proxy.IProxy;
import com.jadebenn.thaumicmechinations.reference.Reference;
import com.jadebenn.thaumicmechinations.util.LogHelper;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;

@Mod(modid=Reference.MOD_ID, name=Reference.MOD_NAME, version=Reference.VERSION, guiFactory=Reference.GUI_FACTORY_CLASS)
public class ThaumicMechinations
{
	//This adds a space where no one should be tampering with my mod
	@Mod.Instance(Reference.MOD_ID)
	public static ThaumicMechinations instance;
	
	//This tells forge where my proxies are
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static IProxy proxy;
	
	//This is where I should put things to tell forge as the game has begun loading
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		//This initializes the configuration handler that makes the config
		ConfigurationHandler.init(event.getSuggestedConfigurationFile());
		FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
		
		//This Intializes all of the items and blocks
		ModItems.init();
		ModBlocks.init();
		
		LogHelper.info("Thaumic Mechinations Pre-Initialization Complete!");
	}

	//This is where I should put things to tell forge once the mod has loaded
	@Mod.EventHandler
	public void init(FMLInitializationEvent event)
	{
		//This initializes the recipes
		Recipes.init();
		
		LogHelper.info("Thaumic Mechinations Initialization Complete!");
	}
	
	//This is where I should put things to tell forge as the game is started
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		LogHelper.info("Thaumic Mechinations Post-initialization Complete!");
	}	
}