package mods.polyblockz.common.main;

import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.IFuelHandler;

public class FuelHandler implements IFuelHandler 
{

	@Override
	public int getBurnTime(ItemStack fuel) 
	{
		if (fuel.itemID == Item_Helper.Polyamid_Ingot.itemID) 
		{
			return 12800;
		}
		
		if (fuel.itemID == Block_Helper.Polyamid_Block.blockID) 
		{
			return 115200;
			
		} 
		else 
		{
			return 0;
		}

	}
}
