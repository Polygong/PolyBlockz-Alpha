package mods.polyblockz.common.blocks.ghost;

import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import mods.polyblockz.common.main.Block_Helper;
import mods.polyblockz.common.main.Item_Helper;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntityBeacon;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class Ghost_Cobble extends Block {

	public Ghost_Cobble(int id, Material mat) {
		super(id, mat);
		//this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.0625F, 1.0F);

	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerIcons(IconRegister iconRegister) {
		this.blockIcon = iconRegister.registerIcon("polyblockz:ghost_cobble");
	}
	
		@Override
	public int idPicked(World par1World, int par2, int par3, int par4) {
		return blockID;
	}
		
    public int getRenderType()
    {
        return 0;
    }

    
    public boolean isOpaqueCube()
    {
        return false;
    }

    
    public boolean renderAsNormalBlock()
    {
        return true;
    }
    
    
    public AxisAlignedBB getCollisionBoundingBoxFromPool(World par1World, int par2, int par3, int par4)
    {
        return null;
    }

	@Override
	public int damageDropped(int par1) {
		return blockID;
	}
	

}
