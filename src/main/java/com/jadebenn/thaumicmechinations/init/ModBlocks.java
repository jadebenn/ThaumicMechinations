package com.jadebenn.thaumicmechinations.init;

import net.minecraft.item.ItemStack;
import thaumcraft.api.ThaumcraftApi;
import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.aspects.AspectList;

import com.jadebenn.thaumicmechinations.block.BlockTM;
import com.jadebenn.thaumicmechinations.block.BlockThaumiumAlloy;
import com.jadebenn.thaumicmechinations.reference.Reference;

import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks 
{
	public static final BlockTM BlockThaumiumAlloy = new BlockThaumiumAlloy();

	public static void init()
	{
		//Blocks
		GameRegistry.registerBlock(BlockThaumiumAlloy, "thaumiumAlloyBlock");
		
		//Block Aspects
		ThaumcraftApi.registerObjectTag(new ItemStack(BlockThaumiumAlloy), (new AspectList()).add(Aspect.METAL, 6).add(Aspect.MAGIC, 3).add(Aspect.ORDER, 3));
	}
}
