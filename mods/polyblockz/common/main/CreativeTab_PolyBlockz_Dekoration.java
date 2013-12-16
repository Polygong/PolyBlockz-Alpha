package mods.polyblockz.common.main;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;

public class CreativeTab_PolyBlockz_Dekoration extends CreativeTabs 
{

	public CreativeTab_PolyBlockz_Dekoration(int par1, String par2Str)
	{
		super(par1, par2Str);
	}

	@SideOnly(Side.CLIENT)
	public int getTabIconItemIndex() 
	{
		return Block_Helper.Woolorange.blockID;
	}

	public String getUnlocalizedName() 
	{
		return "Poly Block'z Dekoration";
	}

}
