package mods.polyblockz.common.main;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class Recipe_Enchanted 
{
	
	public static void setupEnchantedRecepies() 
	{
		ItemStack FeatherFall8_CobbleBoots = new ItemStack(Item_Helper.CobbleBoots);
		FeatherFall8_CobbleBoots.addEnchantment(Enchantment.featherFalling, 8);
		FeatherFall8_CobbleBoots.addEnchantment(Enchantment.blastProtection, 8);
		GameRegistry.addShapelessRecipe(FeatherFall8_CobbleBoots, new Object[] 
				{
				
				new ItemStack(Item.feather), 
				new ItemStack(Item.feather), 
				new ItemStack(Item.feather), 
				new ItemStack(Item.feather),
				new ItemStack(Item.feather), 
				new ItemStack(Item.feather), 
				new ItemStack(Item.feather), 
				new ItemStack(Item.feather),
				new ItemStack(Item_Helper.CobbleBoots) 
				}
		);

	
	}

}
