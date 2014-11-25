package com.jadebenn.thaumicmechinations.init;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class Recipes 
{
	public static void init()
	{
		//Testing Recipe
		GameRegistry.addRecipe(new ItemStack(ModItems.ThaumiumIronIngot), " i "," t "," i ", 'i', new ItemStack(Items.iron_ingot),'t', new ItemStack(Items.gold_ingot));
	}
}
