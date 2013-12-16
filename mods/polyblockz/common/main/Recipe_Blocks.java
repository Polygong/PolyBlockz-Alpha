package mods.polyblockz.common.main;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class Recipe_Blocks {
	public static void setupBlocksRecepies() {

		/*
		 * Blocks
		 */

		GameRegistry.addRecipe(new ItemStack(Block_Helper.Reet, 3),
				new Object[] { "ff", "ff", 'f', Item.wheat, });

		GameRegistry.addRecipe(new ItemStack(Block_Helper.Ornament, 1),
				new Object[] { "jjj", "j.j", "jjj", 'j', Item.ingotGold });

		GameRegistry.addRecipe(new ItemStack(Block_Helper.CorrugatedSheetdark,
				9), new Object[] { "qqq", "qeq", "qqq", 'q', Item.ingotIron,
				Character.valueOf('e'), new ItemStack(Item.dyePowder, 1, 8) });

		GameRegistry.addRecipe(new ItemStack(Block_Helper.CorrugatedSheetlight,
				9), new Object[] { "qqq", "qeq", "qqq", 'q', Item.ingotIron,
				Character.valueOf('e'), new ItemStack(Item.dyePowder, 1, 7) });

		GameRegistry.addRecipe(new ItemStack(Block.mycelium, 5),
				new Object[] { "ddd", "dmd", "ddd", 'd', Block.dirt, 'm',
						Block.mushroomBrown });

		GameRegistry.addRecipe(new ItemStack(Block.mycelium, 5), new Object[] {
				"ddd", "dmd", "ddd", 'd', Block.dirt, 'm', Block.mushroomRed });

		/*
		 * Rock Blocks
		 */
		GameRegistry.addRecipe(new ItemStack(Block_Helper.Headstone, 4),
				new Object[] { "CC", "CC", 'C', Block.cobblestone });

		GameRegistry.addRecipe(new ItemStack(Block_Helper.Dirtwall, 4),
				new Object[] { "DD", "DD", 'D', Block.dirt });

		GameRegistry.addRecipe(new ItemStack(Block_Helper.Dirtbrickfine, 3),
				new Object[] { "FF", "FF", 'F',
						new ItemStack(Block_Helper.Dirtbrick, 1) });

		GameRegistry.addRecipe(new ItemStack(Block_Helper.darkbluesmoothBricks,
				2), new Object[] { "SD", 'S',
				new ItemStack(Block.stoneBrick, 1, 0), 'D',
				new ItemStack(Item.dyePowder, 1, 4) });

		GameRegistry.addRecipe(new ItemStack(Block_Helper.darkredsmoothBricks,
				2), new Object[] { "SD", 'S',
				new ItemStack(Block.stoneBrick, 1, 0), 'D',
				new ItemStack(Item.dyePowder, 1, 1) });

		GameRegistry.addRecipe(new ItemStack(Block_Helper.redsmoothBricks, 2),
				new Object[] { "SD", 'S',
						new ItemStack(Block.stoneBrick, 1, 0), 'D',
						new ItemStack(Item.dyePowder, 1, 9) });

		GameRegistry
				.addRecipe(new ItemStack(Block.cobblestoneMossy, 1),
						new Object[] { "ly", 'l', Block.cobblestone, 'y',
								Block.vine, });

		GameRegistry.addRecipe(new ItemStack(Block.stoneBrick, 1, 1),
				new Object[] { "ly", 'l', Block.stoneBrick, 'y', Block.vine, });

		GameRegistry.addRecipe(new ItemStack(Block.stoneBrick, 1, 2),
				new Object[] { "la", 'l', Block.stoneBrick, 'a',
						Block.cobblestone, });

		GameRegistry
				.addRecipe(new ItemStack(Block.stoneBrick, 1, 3), new Object[] {
						"lr", 'l', Block.stoneBrick, 'r', Block.stone, });

		GameRegistry.addRecipe(new ItemStack(Block_Helper.Roof, 1),
				new Object[] { "lll", "l.l", 'l', Item.brick });

		GameRegistry.addRecipe(
				new ItemStack(Block_Helper.Brickstone_black, 2),
				new Object[] { "bn", 'b', Block.stoneBrick,
						Character.valueOf('n'),
						new ItemStack(Item.dyePowder, 1, 0) });

		GameRegistry.addRecipe(
				new ItemStack(Block_Helper.Brickstone_white, 2),
				new Object[] { "bn", 'b', Block.stoneBrick,
						Character.valueOf('n'),
						new ItemStack(Item.dyePowder, 1, 15) });

		GameRegistry.addRecipe(new ItemStack(Block_Helper.Sewerage_stone, 2),
				new Object[] { "bn", 'b', Block.cobblestoneMossy, 'n',
						Block.vine });

		GameRegistry.addRecipe(new ItemStack(Block_Helper.Sewerage_I, 2),
				new Object[] { "bnm", "..m", "..m", 'b',
						Block.cobblestoneMossy, 'n', Block.vine, 'm',
						Item.stick });

		GameRegistry.addRecipe(new ItemStack(Block_Helper.Sewerage_H, 2),
				new Object[] { "bn.", "mmm", 'b', Block.cobblestoneMossy, 'n',
						Block.vine, 'm', Item.stick });

		GameRegistry.addRecipe(new ItemStack(Block_Helper.Sewerage_L, 2),
				new Object[] { "bnm", 'b', Block.cobblestoneMossy, 'n',
						Block.vine, 'm', Block.trapdoor });

		GameRegistry.addRecipe(new ItemStack(Block_Helper.Sewerage_O, 2),
				new Object[] { "bnm", 'b', Block.cobblestoneMossy, 'n',
						Block.vine, 'm', Block.pressurePlatePlanks });

		GameRegistry.addRecipe(new ItemStack(Block_Helper.Sewerage_X, 2),
				new Object[] { "bn", "mm", "mm", 'b', Block.cobblestoneMossy,
						'n', Block.vine, 'm', Item.stick });

		/*
		 * Ghost Blocks
		 */

		GameRegistry.addRecipe(new ItemStack(Block_Helper.BrickGhostblock, 2),
				new Object[] { "GH", 'G', Block.glass, 'H', Block.brick });

		GameRegistry.addRecipe(new ItemStack(Block_Helper.CleanstoneGhostblock,
				2), new Object[] { "GH", 'G', Block.glass, 'H', Block.stone });

		GameRegistry.addRecipe(new ItemStack(
				Block_Helper.CobblestoneGhoststone, 2), new Object[] { "GH",
				'G', Block.glass, 'H', Block.cobblestone });

		GameRegistry.addRecipe(new ItemStack(Block_Helper.DirtGhostblock, 2),
				new Object[] { "GH", 'G', Block.glass, 'H', Block.dirt });

		GameRegistry.addRecipe(new ItemStack(Block_Helper.SandstoneGhostblock,
				2),
				new Object[] { "GH", 'G', Block.glass, 'H', Block.sandStone });

		GameRegistry.addRecipe(new ItemStack(Block_Helper.BrickGhostblock, 2),
				new Object[] { "GH", 'G', Block.glass, 'H',
						new ItemStack(Block.stoneBrick, 1, 0) });

		GameRegistry.addRecipe(new ItemStack(
				Block_Helper.BrickstoneGhostblockmossy, 2), new Object[] {
				"GH", 'G', Block.glass, 'H',
				new ItemStack(Block.stoneBrick, 1, 1) });

		GameRegistry.addRecipe(new ItemStack(
				Block_Helper.CobblestoneGhostblockmossy, 2), new Object[] {
				"GH", 'G', Block.glass, 'H', Block.cobblestoneMossy });

		GameRegistry.addRecipe(new ItemStack(Block_Helper.QuartzGhostblock, 2),
				new Object[] { "GH", 'G', Block.glass, 'H',
						Block.blockNetherQuartz });

		GameRegistry.addRecipe(new ItemStack(Block_Helper.OakGhostblock, 2),
				new Object[] { "GH", 'G', Block.glass, 'H',
						new ItemStack(Block.planks, 1, 0) });

		GameRegistry.addRecipe(new ItemStack(Block_Helper.BirchGhostblock, 2),
				new Object[] { "GH", 'G', Block.glass, 'H',
						new ItemStack(Block.planks, 1, 1) });

		GameRegistry.addRecipe(new ItemStack(Block_Helper.JungleGhostblock, 2),
				new Object[] { "GH", 'G', Block.glass, 'H',
						new ItemStack(Block.planks, 1, 2) });

		GameRegistry.addRecipe(new ItemStack(Block_Helper.SpruceGhostblock, 2),
				new Object[] { "GH", 'G', Block.glass, 'H',
						new ItemStack(Block.planks, 1, 3) });

		GameRegistry.addRecipe(new ItemStack(
				Block_Helper.BirchParquetGhostblock, 2), new Object[] { "GH",
				'G', Block.glass, 'H', Block_Helper.BirchParquet });

		GameRegistry.addRecipe(new ItemStack(
				Block_Helper.Brickstone_blackGhostblock, 2), new Object[] {
				"GH", 'G', Block.glass, 'H', Block_Helper.Brickstone_black });

		GameRegistry.addRecipe(new ItemStack(
				Block_Helper.Brickstone_whiteGhostblock, 2), new Object[] {
				"GH", 'G', Block.glass, 'H', Block_Helper.Brickstone_white });

		GameRegistry.addRecipe(new ItemStack(Block_Helper.OakParquetGhostblock,
				2), new Object[] { "GH", 'G', Block.glass, 'H',
				Block_Helper.OakParquet });

		GameRegistry.addRecipe(new ItemStack(
				Block_Helper.JungelParquetGhostblock, 2), new Object[] { "GH",
				'G', Block.glass, 'H',
				new ItemStack(Block_Helper.JungelParquet) });

		GameRegistry.addRecipe(new ItemStack(
				Block_Helper.SpruceParquetGhostblock, 2), new Object[] { "GH",
				'G', Block.glass, 'H',
				new ItemStack(Block_Helper.SpruceParquet) });

		GameRegistry.addRecipe(new ItemStack(
				Block_Helper.Sewerage_stoneGhostblock, 2), new Object[] { "GH",
				'G', Block.glass, 'H', Block_Helper.Sewerage_stone });

		GameRegistry.addRecipe(new ItemStack(Block_Helper.HeadstoneGhostblock,
				2), new Object[] { "GH", 'G', Block.glass, 'H',
				Block_Helper.Headstone });

		GameRegistry.addRecipe(new ItemStack(Block_Helper.DirtbrickGhostblock,
				2), new Object[] { "GH", 'G', Block.glass, 'H',
				new ItemStack(Block_Helper.Dirtbrick) });

		GameRegistry.addRecipe(new ItemStack(
				Block_Helper.DirtbrickfineGhostblock, 2), new Object[] { "GH",
				'G', Block.glass, 'H',
				new ItemStack(Block_Helper.Dirtbrickfine) });

		GameRegistry.addRecipe(
				new ItemStack(Block_Helper.DirtwallGhostblock, 2),
				new Object[] { "GH", 'G', Block.glass, 'H',
						new ItemStack(Block_Helper.Dirtwall) });

		/*
		 * Wood
		 */

		GameRegistry.addRecipe(new ItemStack(Block_Helper.OakParquet, 2),
				new Object[] { ".H", "H.", 'H',
						new ItemStack(Block.planks, 1, 0) });

		GameRegistry.addRecipe(new ItemStack(Block_Helper.BirchParquet, 2),
				new Object[] { ".H", "H.", 'H',
						new ItemStack(Block.planks, 1, 2) });

		GameRegistry.addRecipe(new ItemStack(Block_Helper.JungelParquet, 2),
				new Object[] { ".H", "H.", 'H',
						new ItemStack(Block.planks, 1, 1) });

		GameRegistry.addRecipe(new ItemStack(Block_Helper.SpruceParquet, 2),
				new Object[] { ".H", "H.", 'H',
						new ItemStack(Block.planks, 1, 3) });

		GameRegistry.addRecipe(new ItemStack(Block_Helper.greenPlanks, 2),
				new Object[] { "GH", "H.", 'G',
						new ItemStack(Item.dyePowder, 1, 2), 'H',
						new ItemStack(Block.planks, 1, 0) });

		GameRegistry.addRecipe(new ItemStack(Block_Helper.fadedWreck, 2),
				new Object[] { "GH", "H.", 'G',
						new ItemStack(Item.dyePowder, 1, 8), 'H',
						new ItemStack(Block.planks, 1, 0) });

		GameRegistry.addRecipe(new ItemStack(Block_Helper.coloredWreck, 2),
				new Object[] { "GH", "H.", 'G',
						new ItemStack(Item.dyePowder, 1, 1), 'H',
						new ItemStack(Block.planks, 1, 0) });

		/*
		 * Framework
		 */

		GameRegistry.addRecipe(new ItemStack(Block_Helper.XFramework, 4),
				new Object[] { "XZX", "ZXZ", "XZX", 'X', Item.stick, 'Z',
						new ItemStack(Block_Helper.Dirtbrickfine, 1) });

		GameRegistry.addRecipe(new ItemStack(Block_Helper.LFramework, 4),
				new Object[] { "XZZ", "ZXZ", "ZZX", 'X', Item.stick, 'Z',
						new ItemStack(Block_Helper.Dirtbrickfine, 1) });

		GameRegistry.addRecipe(new ItemStack(Block_Helper.RFramework, 4),
				new Object[] { "ZZX", "ZXZ", "XZZ", 'X', Item.stick, 'Z',
						new ItemStack(Block_Helper.Dirtbrickfine, 1) });

		GameRegistry.addRecipe(new ItemStack(Block_Helper.PFramework, 4),
				new Object[] { "ZXZ", "XXX", "ZXZ", 'X', Item.stick, 'Z',
						new ItemStack(Block_Helper.Dirtbrickfine, 1) });

		GameRegistry.addRecipe(new ItemStack(Block_Helper.MFramework, 4),
				new Object[] { "ZZZ", "XXX", "ZZZ", 'X', Item.stick, 'Z',
						new ItemStack(Block_Helper.Dirtbrickfine, 1) });

		GameRegistry.addRecipe(new ItemStack(Block_Helper.HFramework, 4),
				new Object[] { "ZXZ", "ZXZ", "ZXZ", 'X', Item.stick, 'Z',
						new ItemStack(Block_Helper.Dirtbrickfine, 1) });

		GameRegistry.addRecipe(new ItemStack(Block_Helper.OFramework, 4),
				new Object[] { "XXX", "XZX", "XXX", 'X', Item.stick, 'Z',
						new ItemStack(Block_Helper.Dirtbrickfine, 1) });

		/*
		 * Glowstones
		 */

		GameRegistry.addRecipe(
				new ItemStack(Block_Helper.Glow_Birch, 2),
				new Object[] { "bv", 'b', Block.glowStone,
						Character.valueOf('v'),
						new ItemStack(Block.planks, 1, 1) });

		GameRegistry.addRecipe(
				new ItemStack(Block_Helper.Glow_Blackplank, 2),
				new Object[] { "bv", 'b', Block.glowStone,
						Character.valueOf('v'),
						new ItemStack(Item.dyePowder, 1, 15) });

		GameRegistry.addRecipe(new ItemStack(Block_Helper.Glow_Brickstone, 2),
				new Object[] { "bv", 'b', Block.glowStone, 'v', Block.brick });

		GameRegistry.addRecipe(
				new ItemStack(Block_Helper.Glow_Brickstone, 2),
				new Object[] { "bv", 'b', Block.glowStone,
						Character.valueOf('v'),
						new ItemStack(Block.stoneBrick, 1, 0) });

		GameRegistry.addRecipe(new ItemStack(
				Block_Helper.Glow_Brickstone_black, 2), new Object[] { "bv",
				'b', Block.glowStone, Character.valueOf('v'),
				new ItemStack(Block_Helper.Brickstone_black) });

		GameRegistry.addRecipe(new ItemStack(
				Block_Helper.Glow_Brickstone_white, 2), new Object[] { "bv",
				'b', Block.glowStone, Character.valueOf('v'),
				new ItemStack(Block_Helper.Brickstone_white) });

		GameRegistry.addRecipe(
				new ItemStack(Block_Helper.Glow_Brickstonemossy, 2),
				new Object[] { "bv", 'b', Block.glowStone,
						Character.valueOf('v'),
						new ItemStack(Block.stoneBrick, 1, 1) });

		GameRegistry.addRecipe(
				new ItemStack(Block_Helper.Glow_Cleanstone, 2),
				new Object[] { "bv", 'b', Block.glowStone,
						Character.valueOf('v'), new ItemStack(Block.stone) });

		GameRegistry.addRecipe(
				new ItemStack(Block_Helper.Glow_Cleanstone, 2),
				new Object[] { "bv", 'b', Block.glowStone,
						Character.valueOf('v'), new ItemStack(Block.stone) });

		GameRegistry.addRecipe(
				new ItemStack(Block_Helper.Glow_Cobble, 2),
				new Object[] { "bv", 'b', Block.glowStone,
						Character.valueOf('v'),
						new ItemStack(Block.cobblestone) });

		GameRegistry.addRecipe(
				new ItemStack(Block_Helper.Glow_Cobblemossy, 2),
				new Object[] { "bv", 'b', Block.glowStone,
						Character.valueOf('v'),
						new ItemStack(Block.cobblestoneMossy) });

		GameRegistry.addRecipe(
				new ItemStack(Block_Helper.Glow_Dirtbrick, 2),
				new Object[] { "bv", 'b', Block.glowStone,
						Character.valueOf('v'),
						new ItemStack(Block_Helper.Dirtbrick) });

		GameRegistry.addRecipe(
				new ItemStack(Block_Helper.Glow_Dirtbrick_fine, 2),
				new Object[] { "bv", 'b', Block.glowStone,
						Character.valueOf('v'),
						new ItemStack(Block_Helper.Dirtbrickfine) });

		GameRegistry.addRecipe(
				new ItemStack(Block_Helper.Glow_Greenplank, 2),
				new Object[] { "bv", 'b', Block.glowStone,
						Character.valueOf('v'),
						new ItemStack(Block_Helper.greenPlanks) });

		GameRegistry.addRecipe(
				new ItemStack(Block_Helper.Glow_Headstone, 2),
				new Object[] { "bv", 'b', Block.glowStone,
						Character.valueOf('v'),
						new ItemStack(Block_Helper.Headstone) });

		GameRegistry.addRecipe(
				new ItemStack(Block_Helper.Glow_Jungle, 2),
				new Object[] { "bv", 'b', Block.glowStone,
						Character.valueOf('v'),
						new ItemStack(Block.planks, 1, 3) });

		GameRegistry.addRecipe(
				new ItemStack(Block_Helper.Glow_Oak, 2),
				new Object[] { "bv", 'b', Block.glowStone,
						Character.valueOf('v'),
						new ItemStack(Block.planks, 1, 0) });

		GameRegistry.addRecipe(
				new ItemStack(Block_Helper.Glow_Quartz, 2),
				new Object[] { "bv", 'b', Block.glowStone,
						Character.valueOf('v'),
						new ItemStack(Block.blockNetherQuartz) });

		GameRegistry
				.addRecipe(
						new ItemStack(Block_Helper.Glow_Sandstone, 2),
						new Object[] { "bv", 'b', Block.glowStone,
								Character.valueOf('v'),
								new ItemStack(Block.sandStone) });

		GameRegistry.addRecipe(
				new ItemStack(Block_Helper.Glow_Sewerage, 2),
				new Object[] { "bv", 'b', Block.glowStone,
						Character.valueOf('v'),
						new ItemStack(Block_Helper.Sewerage_stone) });

		GameRegistry.addRecipe(
				new ItemStack(Block_Helper.Glow_Spruce, 2),
				new Object[] { "bv", 'b', Block.glowStone,
						Character.valueOf('v'),
						new ItemStack(Block.planks, 1, 2) });

		GameRegistry.addRecipe(
				new ItemStack(Block_Helper.Glow_Stoneplate_blue, 2),
				new Object[] { "bv", 'b', Block.glowStone,
						Character.valueOf('v'),
						new ItemStack(Block_Helper.darkbluesmoothBricks) });

		GameRegistry.addRecipe(new ItemStack(
				Block_Helper.Glow_Stoneplate_darkred, 2), new Object[] { "bv",
				'b', Block.glowStone, Character.valueOf('v'),
				new ItemStack(Block_Helper.darkredsmoothBricks) });

		GameRegistry.addRecipe(
				new ItemStack(Block_Helper.Glow_Stoneplate_red, 2),
				new Object[] { "bv", 'b', Block.glowStone,
						Character.valueOf('v'),
						new ItemStack(Block_Helper.redsmoothBricks) });

		/*
		 * Stairs
		 */

		GameRegistry
				.addRecipe(new ItemStack(Block_Helper.HeadStoneStair, 6),
						new Object[] { "sss", "ss.", "s..", 's',
								Block_Helper.Headstone });

		GameRegistry
				.addRecipe(new ItemStack(Block_Helper.DirtwallStair, 6),
						new Object[] { "sss", "ss.", "s..", 's',
								Block_Helper.Dirtwall });

		GameRegistry
				.addRecipe(new ItemStack(Block_Helper.DirtbrickStair, 6),
						new Object[] { "sss", "ss.", "s..", 's',
								Block_Helper.Dirtbrick });

		GameRegistry.addRecipe(
				new ItemStack(Block_Helper.DirtbrickfineStair, 6),
				new Object[] { "sss", "ss.", "s..", 's',
						Block_Helper.Dirtbrickfine });

		GameRegistry.addRecipe(new ItemStack(Block_Helper.ReetStair, 6),
				new Object[] { "sss", "ss.", "s..", 's', Block_Helper.Reet });

		GameRegistry.addRecipe(new ItemStack(Block_Helper.RoofStair, 6),
				new Object[] { "sss", "ss.", "s..", 's', Block_Helper.Reet });

		GameRegistry.addRecipe(new ItemStack(Block_Helper.oakParquetStair, 6),
				new Object[] { "sss", "ss.", "s..", 's',
						Block_Helper.OakParquet });

		GameRegistry.addRecipe(
				new ItemStack(Block_Helper.birchParquetStair, 6), new Object[] {
						"sss", "ss.", "s..", 's', Block_Helper.BirchParquet });

		GameRegistry.addRecipe(
				new ItemStack(Block_Helper.spruceParquetStair, 6),
				new Object[] { "sss", "ss.", "s..", 's',
						Block_Helper.SpruceParquet });

		GameRegistry.addRecipe(
				new ItemStack(Block_Helper.jungleParquetStair, 6),
				new Object[] { "sss", "ss.", "s..", 's',
						Block_Helper.JungelParquet });

		GameRegistry.addRecipe(new ItemStack(Block_Helper.greenPlankStair, 6),
				new Object[] { "sss", "ss.", "s..", 's',
						Block_Helper.greenPlanks });

		GameRegistry.addRecipe(new ItemStack(Block_Helper.fadedWereckwoodStair,
				6), new Object[] { "sss", "ss.", "s..", 's',
				Block_Helper.fadedWreck });

		GameRegistry.addRecipe(new ItemStack(
				Block_Helper.coloredWereckwoodStair, 6), new Object[] { "sss",
				"ss.", "s..", 's', Block_Helper.coloredWreck });

		GameRegistry.addRecipe(new ItemStack(
				Block_Helper.CorrugatedSheetdarkStair, 6), new Object[] {
				"sss", "ss.", "s..", 's', Block_Helper.CorrugatedSheetdark });

		GameRegistry.addRecipe(new ItemStack(
				Block_Helper.CorrugatedSheetlightStair, 6), new Object[] {
				"sss", "ss.", "s..", 's', Block_Helper.CorrugatedSheetlight });

		GameRegistry.addRecipe(new ItemStack(Block_Helper.BrickMossyStair, 6),
				new Object[] { "sss", "ss.", "s..", Character.valueOf('s'),
						new ItemStack(Block.stoneBrick, 1, 1) });

		GameRegistry
				.addRecipe(new ItemStack(Block_Helper.MossyStair, 6),
						new Object[] { "sss", "ss.", "s..", 's',
								Block.cobblestoneMossy });

		GameRegistry.addRecipe(new ItemStack(Block_Helper.cleanstoneStair, 6),
				new Object[] { "sss", "ss.", "s..", 's', Block.stone });

		GameRegistry.addRecipe(new ItemStack(Block_Helper.dirtStair, 6),
				new Object[] { "sss", "ss.", "s..", 's', Block.dirt });

		GameRegistry.addRecipe(new ItemStack(Block_Helper.sandStair, 6),
				new Object[] { "sss", "ss.", "s..", 's', Block.sand });

		GameRegistry.addRecipe(new ItemStack(Block_Helper.gravelStair, 6),
				new Object[] { "sss", "ss.", "s..", 's', Block.gravel });

		GameRegistry.addRecipe(new ItemStack(Block_Helper.glassStair, 6),
				new Object[] { "sss", "ss.", "s..", 's', Block.glass });

		GameRegistry.addRecipe(new ItemStack(Block_Helper.blockSnowStair, 6),
				new Object[] { "sss", "ss.", "s..", 's', Block.blockSnow });

		GameRegistry.addRecipe(new ItemStack(Block_Helper.iceStair, 6),
				new Object[] { "sss", "ss.", "s..", 's', Block.ice });

		GameRegistry.addRecipe(
				new ItemStack(Block_Helper.blockRedstoneStair, 6),
				new Object[] { "sss", "ss.", "s..", 's', Block.blockRedstone });

		GameRegistry.addRecipe(new ItemStack(Block_Helper.blockSteelStair, 6),
				new Object[] { "sss", "ss.", "s..", 's', Block.blockIron });

		GameRegistry.addRecipe(new ItemStack(Block_Helper.blockGoldStair, 6),
				new Object[] { "sss", "ss.", "s..", 's', Block.blockGold });

		GameRegistry.addRecipe(
				new ItemStack(Block_Helper.blockEmeraldStair, 6), new Object[] {
						"sss", "ss.", "s..", 's', Block.blockEmerald });

		GameRegistry.addRecipe(
				new ItemStack(Block_Helper.blockDiamondStair, 6), new Object[] {
						"sss", "ss.", "s..", 's', Block.blockDiamond });

		GameRegistry.addRecipe(new ItemStack(Block_Helper.obsidianStair, 6),
				new Object[] { "sss", "ss.", "s..", 's', Block.obsidian });

		GameRegistry.addRecipe(new ItemStack(Block_Helper.Sewerage_stoneStair,
				6), new Object[] { "sss", "ss.", "s..", 's',
				Block_Helper.Sewerage_stone });

		GameRegistry.addRecipe(new ItemStack(
				Block_Helper.Brickstone_blackStair, 6), new Object[] { "sss",
				"ss.", "s..", 's', Block_Helper.Brickstone_black });

		GameRegistry.addRecipe(new ItemStack(
				Block_Helper.Brickstone_whiteStair, 6), new Object[] { "sss",
				"ss.", "s..", 's', Block_Helper.Brickstone_white });

		/*
		 * Redstone Lamps
		 */

		GameRegistry.addRecipe(
				new ItemStack(Block_Helper.blokklampIdlebrick, 2),
				new Object[] { "sd", 's', Block.redstoneLampIdle, 'd',
						Block.brick });

		GameRegistry.addRecipe(new ItemStack(
				Block_Helper.blokklampIdledirtbrickfine, 2), new Object[] {
				"sd", 's', Block.redstoneLampIdle, 'd',
				Block_Helper.Dirtbrickfine });

		GameRegistry.addRecipe(new ItemStack(
				Block_Helper.blokklampIdlenetherBrick, 2), new Object[] { "sd",
				's', Block.redstoneLampIdle, 'd', Block.netherBrick });

		GameRegistry.addRecipe(new ItemStack(
				Block_Helper.blokklampIdlequartzblock, 2), new Object[] { "sd",
				's', Block.redstoneLampIdle, 'd', Block.blockNetherQuartz });

		GameRegistry.addRecipe(new ItemStack(
				Block_Helper.blokklampIdlesandstone, 2), new Object[] { "sd",
				's', Block.redstoneLampIdle, 'd', Block.sandStone });

		GameRegistry.addRecipe(
				new ItemStack(Block_Helper.blokklampIdlestone, 2),
				new Object[] { "sd", 's', Block.redstoneLampIdle, 'd',
						Block.stone });

		GameRegistry.addRecipe(new ItemStack(
				Block_Helper.blokklampIdlestonebrick, 2), new Object[] { "sd",
				's', Block.redstoneLampIdle, Character.valueOf('d'),
				new ItemStack(Block.cobblestone) });

		GameRegistry.addRecipe(new ItemStack(
				Block_Helper.blokklampIdlestonebricksmooth, 2), new Object[] {
				"sd", 's', Block.redstoneLampIdle, Character.valueOf('d'),
				new ItemStack(Block.stoneBrick, 1, 0) });

		GameRegistry.addRecipe(
				new ItemStack(Block_Helper.blokklampIdlestonebricksmooth_mossy,
						2),
				new Object[] { "sd", 's', Block.redstoneLampIdle,
						Character.valueOf('d'),
						new ItemStack(Block.stoneBrick, 1, 1) });

		GameRegistry.addRecipe(new ItemStack(
				Block_Helper.blokklampIdlestoneMoss, 2), new Object[] { "sd",
				's', Block.redstoneLampIdle, 'd', Block.cobblestoneMossy });

		GameRegistry.addRecipe(
				new ItemStack(Block_Helper.blokklampIdlewood, 2),
				new Object[] { "sd", 's', Block.redstoneLampIdle,
						Character.valueOf('d'),
						new ItemStack(Block.planks, 1, 0) });

		GameRegistry.addRecipe(new ItemStack(
				Block_Helper.blokklampIdlewood_birch, 2), new Object[] { "sd",
				's', Block.redstoneLampIdle, Character.valueOf('d'),
				new ItemStack(Block.planks, 1, 1) });

		GameRegistry.addRecipe(new ItemStack(
				Block_Helper.blokklampIdlewood_jungle, 2), new Object[] { "sd",
				's', Block.redstoneLampIdle, Character.valueOf('d'),
				new ItemStack(Block.planks, 1, 3) });

		GameRegistry.addRecipe(new ItemStack(
				Block_Helper.blokklampIdlewood_spruce, 2), new Object[] { "sd",
				's', Block.redstoneLampIdle, Character.valueOf('d'),
				new ItemStack(Block.planks, 1, 2) });


	}
}