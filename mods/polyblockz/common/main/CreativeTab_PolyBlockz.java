package mods.polyblockz.common.main;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;

public class CreativeTab_PolyBlockz extends CreativeTabs 
{

	public CreativeTab_PolyBlockz(int par1, String par2Str) 
	{
		super(par1, par2Str);

	}

	@SideOnly(Side.CLIENT)
	public int getTabIconItemIndex() 
	{
		return Block_Helper.PolyamidOre.blockID;
	}

	public String getUnlocalizedName() 
	{
		return "Poly Block'z";
	}

}
