package com.jadebenn.thaumicmechinations.creativetab;

import com.jadebenn.thaumicmechinations.init.ModItems;
import com.jadebenn.thaumicmechinations.reference.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabTM 
{
	public static final CreativeTabs TM_TAB = new CreativeTabs(Reference.MOD_ID)
	{
		@Override
		@SideOnly(Side.CLIENT)
		public Item getTabIconItem()
		{
			return ModItems.ThaumiumIronIngot;
		}
		
		@Override
		public String getTranslatedTabLabel()
		{
			return "Thaumic Mechinations";
		}
	};
}
