package mods.polyblockz.common.blocks.blockz;

import mods.polyblockz.common.main.Block_Helper;
import mods.polyblockz.common.main.Item_Helper;
import net.minecraft.block.Block;
import net.minecraft.block.BlockCrops;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.Icon;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeDirection;
import net.minecraftforge.common.IPlantable;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class Block_AppleBush extends BlockCrops {
	@SideOnly(Side.CLIENT)
	private Icon[] iconArray;

	public Block_AppleBush(int par1) {
		super(par1);
		this.setTickRandomly(true);
	}

	public Block setTickRandomly(boolean par1) {
		this.needsRandomTick = par1;
		return this;
	}

	@Override
	public AxisAlignedBB getCollisionBoundingBoxFromPool(World world, int x,
			int y, int z) {
		return null;
	}

	@Override
	public int getRenderType() {
		return 6;
	}

	@Override
	public boolean isOpaqueCube() {
		return false;
	}

	@SideOnly(Side.CLIENT)
	public Icon getIcon(int par1, int par2) {
		if (par2 < 7) {
			if (par2 == 6) {
				par2 = 5;
			}

			return this.iconArray[par2 >> 1];
		} else {
			return this.iconArray[3];
		}
	}

	protected int getSeedItem() {
		return Item.appleRed.itemID;
	}

	protected int getCropItem() {
		return Item.appleRed.itemID;
	}

	@SideOnly(Side.CLIENT)
	public void dropBlockAsItemWithChance(World par1World, int par2, int par3,
			int par4, int par5, float par6, int par7) {
		super.dropBlockAsItemWithChance(par1World, par2, par3, par4, par5,
				par6, par7);

		if (!par1World.isRemote) {
			if (par5 >= 7 && par1World.rand.nextInt(75) == 2) {
				this.dropBlockAsItem_do(par1World, par2, par3, par4,
						new ItemStack(Item.appleRed));
			}
		}
	}

	public void registerIcons(IconRegister par1IconRegister) {
		this.iconArray = new Icon[4];

		for (int i = 0; i < this.iconArray.length; ++i) {
			this.iconArray[i] = par1IconRegister.registerIcon("polyblockz:"
					+ "stage_applebush_" + i);
		}
	}
}

/*package mods.polyblockz.common.blocks;

import java.util.Random;

import mods.polyblockz.common.PolyBlockz;
import mods.polyblockz.common.main.Block_Helper;
import mods.polyblockz.common.main.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFlower;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.world.World;
import net.minecraftforge.common.EnumPlantType;
import net.minecraftforge.common.FakePlayer;
import net.minecraftforge.common.ForgeDirection;
import net.minecraftforge.common.IPlantable;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class Block_AppleBush extends BlockFlower implements IPlantable
{
	private static final int appleAmount = 5;
	private Icon grown;
	private int growProgress = 0;
	private int growTime = 100;
	private ItemStack Apple;

	public Block_AppleBush(int id) 
	{
		super(id);
		
		float f = 0.4F;
        this.setBlockBounds(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, f * 2.0F, 0.5F + f);
		this.setCreativeTab(CreativeTabs.tabDecorations);
		this.setHardness(0.0F);
        this.setStepSound(soundGrassFootstep);
        this.disableStats();
		this.setTickRandomly(true);
	}
	
	public boolean onItemUse (ItemStack stack, EntityPlayer player, World world, int x, int y, int z, int side, float par8, float par9, float par10)
    {
        if (side != 1)
            return false;

        else if (player.canPlayerEdit(x, y, z, side, stack) && player.canPlayerEdit(x, y + 1, z, side, stack))
        {
            Block block = Block.blocksList[world.getBlockId(x, y, z)];

            if (block != null && block.canSustainPlant(world, x, y, z, ForgeDirection.UP, (IPlantable) Block_Helper.AppleBush) && world.isAirBlock(x, y + 1, z))
            {
                world.setBlock(x, y + 1, z, Block_Helper.AppleBush.blockID, stack.getItemDamage() % 4, 3);
                if (!player.capabilities.isCreativeMode)
                    stack.stackSize--;
                if (!world.isRemote)
                    world.playAuxSFX(2001, x, y, z, Block_Helper.AppleBush.blockID);
                return true;
            }
            else
                return false;
        }
        else
            return false;
    }
	
	@SideOnly(Side.CLIENT)
	@Override
	public void registerIcons(IconRegister iconRegister) {
	        this.blockIcon = iconRegister.registerIcon(Reference.MOD_ID + ":" + "applebush");
	        this.grown = iconRegister.registerIcon(Reference.MOD_ID + ":" + "applebushgrown");
	}

	@Override
	@SideOnly(Side.CLIENT)
	public Icon getIcon(int side, int metadata) 
	{
		
		if(metadata == 1)
		{
			return grown;
		}
		
		return this.blockIcon;
	}

	@Override
	public boolean onBlockActivated(World world, int x, int y,int z, EntityPlayer player, int par6, float par7, float par8, float par9) 
	{
		Random random = new Random();
		
		int metadata = world.getBlockMetadata(x, y, z);
		
		int appleAmount = random.nextInt(5);
		if(appleAmount == 0)
		{
			appleAmount = 1;
		}

		if(metadata == 0)
		{
			if(player.getCurrentEquippedItem() != null)
			{
				if(player.getCurrentEquippedItem().itemID == Block.leaves.blockID)
				{
					if(!player.capabilities.isCreativeMode)
						--player.getCurrentEquippedItem().stackSize;
					world.setBlockMetadataWithNotify(x, y, z, 1, 2);
					growProgress = 0;
					return true;
				}
			}
			return false;
		}
		
		player.inventory.addItemStackToInventory(Apple);
		world.setBlockMetadataWithNotify(x, y, z, 0, 2);
		return true;
	}

	@Override
	public void randomDisplayTick(World world, int x, int y, int z, Random random) 
	{
		if(world.getBlockMetadata(x, y, z) == 0)
		{
			if(growProgress < growTime)
			{
				growProgress++;
			}
			else
			{
				growProgress = 0;
				world.setBlockMetadataWithNotify(x, y, z, 1, 2);
			}
		}
	}

	

}*/