package com.jadebenn.thaumicmechinations.client.gui;

import java.util.List;

import com.jadebenn.thaumicmechinations.handler.ConfigurationHandler;
import com.jadebenn.thaumicmechinations.reference.Reference;

import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;
import cpw.mods.fml.client.config.GuiConfig;
import cpw.mods.fml.client.config.IConfigElement;

public class ModGuiConfig extends GuiConfig
{

	public ModGuiConfig(GuiScreen guiScreen) 
	{
		super(
			guiScreen,
			new ConfigElement(ConfigurationHandler.configuration.getCategory(Configuration.CATEGORY_GENERAL)).getChildElements(),
			Reference.MOD_ID,
			false,
			false,
			GuiConfig.getAbridgedConfigPath(ConfigurationHandler.configuration.toString())
		);
	}

}
