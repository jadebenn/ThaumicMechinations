package com.jadebenn.thaumicmechinations.init;

import net.minecraft.item.ItemStack;
import thaumcraft.api.ThaumcraftApi;
import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.aspects.AspectList;

import com.jadebenn.thaumicmechinations.item.ItemTM;
import com.jadebenn.thaumicmechinations.item.ItemThaumiumIronIngot;
import com.jadebenn.thaumicmechinations.reference.Reference;

import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems 
{
	public static final ItemTM ThaumiumIronIngot = new ItemThaumiumIronIngot();

	public static void init()
	{
		//Items
		GameRegistry.registerItem(ThaumiumIronIngot, "thaumiumAlloy");
		
		//Item Aspects
		ThaumcraftApi.registerObjectTag(new ItemStack(ThaumiumIronIngot), (new AspectList()).add(Aspect.METAL, 4).add(Aspect.MAGIC, 2).add(Aspect.ORDER, 2));
	}
}
