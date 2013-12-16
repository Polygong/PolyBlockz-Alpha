package mods.polyblockz.common.fluids;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;

public class Sewerage_Water extends Fluid {
	private Icon blockIcon;

	public Sewerage_Water() {
		super("seweragebucket");
		setDensity(7);
		setViscosity(700);
		FluidRegistry.registerFluid(this);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public Icon getStillIcon() {
		return Block_SewerageWater.sewerage_stillIcon;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public Icon getFlowingIcon() {
		return Block_SewerageWater.seweragewaterIcon;
	}

}
