package mods.polyblockz.common.main;

import java.util.Random;

import mods.polyblockz.common.PolyBlockz;
import mods.polyblockz.common.blocks.blockz.Block_AppleBush;
import mods.polyblockz.common.blocks.blockz.Block_CorruSheetdark;
import mods.polyblockz.common.blocks.blockz.Block_CorruSheetlight;
import mods.polyblockz.common.blocks.blockz.Block_Ornament;
import mods.polyblockz.common.blocks.blockz.Block_Polyamid_Block;
import mods.polyblockz.common.blocks.blockz.Block_RaspberryBush;
import mods.polyblockz.common.blocks.blockz.Torch_WhiteLamp;
import mods.polyblockz.common.blocks.constructions.Block_BlokkHouse_big;
import mods.polyblockz.common.blocks.constructions.Block_BlokkHouse_hidingplace;
import mods.polyblockz.common.blocks.constructions.Block_BlokkHouse_middl;
import mods.polyblockz.common.blocks.constructions.Block_BlokkHouse_poly;
import mods.polyblockz.common.blocks.constructions.Block_BlokkHouse_small;
import mods.polyblockz.common.blocks.constructions.BlokkHouse_big;
import mods.polyblockz.common.blocks.constructions.BlokkHouse_hidingplace;
import mods.polyblockz.common.blocks.constructions.BlokkHouse_middl;
import mods.polyblockz.common.blocks.constructions.BlokkHouse_poly;
import mods.polyblockz.common.blocks.constructions.BlokkHouse_small;
import mods.polyblockz.common.blocks.framework.Frame_H;
import mods.polyblockz.common.blocks.framework.Frame_L;
import mods.polyblockz.common.blocks.framework.Frame_M;
import mods.polyblockz.common.blocks.framework.Frame_O;
import mods.polyblockz.common.blocks.framework.Frame_P;
import mods.polyblockz.common.blocks.framework.Frame_R;
import mods.polyblockz.common.blocks.framework.Frame_X;
import mods.polyblockz.common.blocks.ghost.Ghost_BirchParquet;
import mods.polyblockz.common.blocks.ghost.Ghost_Birchplank;
import mods.polyblockz.common.blocks.ghost.Ghost_Brick;
import mods.polyblockz.common.blocks.ghost.Ghost_Brickstone;
import mods.polyblockz.common.blocks.ghost.Ghost_Brickstone_black;
import mods.polyblockz.common.blocks.ghost.Ghost_Brickstone_white;
import mods.polyblockz.common.blocks.ghost.Ghost_Brickstonemossy;
import mods.polyblockz.common.blocks.ghost.Ghost_Cleanstone;
import mods.polyblockz.common.blocks.ghost.Ghost_Cobble;
import mods.polyblockz.common.blocks.ghost.Ghost_Cobblemossy;
import mods.polyblockz.common.blocks.ghost.Ghost_Dirt;
import mods.polyblockz.common.blocks.ghost.Ghost_Dirtbrick;
import mods.polyblockz.common.blocks.ghost.Ghost_Dirtbrickfine;
import mods.polyblockz.common.blocks.ghost.Ghost_Dirtwall;
import mods.polyblockz.common.blocks.ghost.Ghost_Headstone;
import mods.polyblockz.common.blocks.ghost.Ghost_JungelParquet;
import mods.polyblockz.common.blocks.ghost.Ghost_Jungleplank;
import mods.polyblockz.common.blocks.ghost.Ghost_OakParquet;
import mods.polyblockz.common.blocks.ghost.Ghost_Oakplank;
import mods.polyblockz.common.blocks.ghost.Ghost_Quartz;
import mods.polyblockz.common.blocks.ghost.Ghost_Sandstone;
import mods.polyblockz.common.blocks.ghost.Ghost_Sewerage_stone;
import mods.polyblockz.common.blocks.ghost.Ghost_SpruceParquet;
import mods.polyblockz.common.blocks.ghost.Ghost_Spruceplank;
import mods.polyblockz.common.blocks.ghost.Ghost_blackPlanks;
import mods.polyblockz.common.blocks.glowstone.Glow_Birch;
import mods.polyblockz.common.blocks.glowstone.Glow_Blackplank;
import mods.polyblockz.common.blocks.glowstone.Glow_Brick;
import mods.polyblockz.common.blocks.glowstone.Glow_Brickstone;
import mods.polyblockz.common.blocks.glowstone.Glow_Brickstone_black;
import mods.polyblockz.common.blocks.glowstone.Glow_Brickstone_white;
import mods.polyblockz.common.blocks.glowstone.Glow_Brickstonemossy;
import mods.polyblockz.common.blocks.glowstone.Glow_Cleanstone;
import mods.polyblockz.common.blocks.glowstone.Glow_Cobble;
import mods.polyblockz.common.blocks.glowstone.Glow_Cobblemossy;
import mods.polyblockz.common.blocks.glowstone.Glow_Dirtbrick;
import mods.polyblockz.common.blocks.glowstone.Glow_Dirtbrick_fine;
import mods.polyblockz.common.blocks.glowstone.Glow_Greenplank;
import mods.polyblockz.common.blocks.glowstone.Glow_Headstone;
import mods.polyblockz.common.blocks.glowstone.Glow_Jungle;
import mods.polyblockz.common.blocks.glowstone.Glow_Oak;
import mods.polyblockz.common.blocks.glowstone.Glow_Quartz;
import mods.polyblockz.common.blocks.glowstone.Glow_Sandstone;
import mods.polyblockz.common.blocks.glowstone.Glow_Sewerage;
import mods.polyblockz.common.blocks.glowstone.Glow_Spruce;
import mods.polyblockz.common.blocks.glowstone.Glow_Stoneplate_blue;
import mods.polyblockz.common.blocks.glowstone.Glow_Stoneplate_darkred;
import mods.polyblockz.common.blocks.glowstone.Glow_Stoneplate_red;
import mods.polyblockz.common.blocks.ore.Ore_Bone;
import mods.polyblockz.common.blocks.ore.Ore_Citrion;
import mods.polyblockz.common.blocks.ore.Ore_Mithril;
import mods.polyblockz.common.blocks.ore.Ore_Polyamid;
import mods.polyblockz.common.blocks.ore.Ore_Rubin;
import mods.polyblockz.common.blocks.ore.Ore_Saphir;
import mods.polyblockz.common.blocks.ore.Ore_SmokeQuartz;
import mods.polyblockz.common.blocks.ore.Ore_Spinell;
import mods.polyblockz.common.blocks.redlamp.RedLamp_Birchplank;
import mods.polyblockz.common.blocks.redlamp.RedLamp_Blackwood;
import mods.polyblockz.common.blocks.redlamp.RedLamp_Brick;
import mods.polyblockz.common.blocks.redlamp.RedLamp_Cleanstone;
import mods.polyblockz.common.blocks.redlamp.RedLamp_Cobble;
import mods.polyblockz.common.blocks.redlamp.RedLamp_CobbleMosyy;
import mods.polyblockz.common.blocks.redlamp.RedLamp_Dirtbrickfine;
import mods.polyblockz.common.blocks.redlamp.RedLamp_Jungleplank;
import mods.polyblockz.common.blocks.redlamp.RedLamp_Netherbrick;
import mods.polyblockz.common.blocks.redlamp.RedLamp_Oakplank;
import mods.polyblockz.common.blocks.redlamp.RedLamp_Quartz;
import mods.polyblockz.common.blocks.redlamp.RedLamp_Sandstone;
import mods.polyblockz.common.blocks.redlamp.RedLamp_Srpuceplank;
import mods.polyblockz.common.blocks.redlamp.RedLamp_Stonebrick;
import mods.polyblockz.common.blocks.redlamp.RedLamp_StonebrickMossy;
import mods.polyblockz.common.blocks.stairs.Brickstone_blackStair;
import mods.polyblockz.common.blocks.stairs.Brickstone_whiteStair;
import mods.polyblockz.common.blocks.stairs.Sewerage_stoneStair;
import mods.polyblockz.common.blocks.stairs.Stair_BirchParquet;
import mods.polyblockz.common.blocks.stairs.Stair_BlockDiamond;
import mods.polyblockz.common.blocks.stairs.Stair_BlockEmerald;
import mods.polyblockz.common.blocks.stairs.Stair_BlockGold;
import mods.polyblockz.common.blocks.stairs.Stair_BlockRedstone;
import mods.polyblockz.common.blocks.stairs.Stair_BlockSnow;
import mods.polyblockz.common.blocks.stairs.Stair_BlockSteel;
import mods.polyblockz.common.blocks.stairs.Stair_BrickMossy;
import mods.polyblockz.common.blocks.stairs.Stair_Cleanstone;
import mods.polyblockz.common.blocks.stairs.Stair_CobbleMossy;
import mods.polyblockz.common.blocks.stairs.Stair_ColoredWereck;
import mods.polyblockz.common.blocks.stairs.Stair_CorrugatedSheetdark;
import mods.polyblockz.common.blocks.stairs.Stair_CorrugatedSheetlight;
import mods.polyblockz.common.blocks.stairs.Stair_Dirt;
import mods.polyblockz.common.blocks.stairs.Stair_Dirtbrick;
import mods.polyblockz.common.blocks.stairs.Stair_Dirtbrickfine;
import mods.polyblockz.common.blocks.stairs.Stair_Dirtwall;
import mods.polyblockz.common.blocks.stairs.Stair_FadedWereck;
import mods.polyblockz.common.blocks.stairs.Stair_Glass;
import mods.polyblockz.common.blocks.stairs.Stair_Gravel;
import mods.polyblockz.common.blocks.stairs.Stair_GreenPlank;
import mods.polyblockz.common.blocks.stairs.Stair_Headstone;
import mods.polyblockz.common.blocks.stairs.Stair_Ice;
import mods.polyblockz.common.blocks.stairs.Stair_JungleParquet;
import mods.polyblockz.common.blocks.stairs.Stair_OakParquet;
import mods.polyblockz.common.blocks.stairs.Stair_Obsidian;
import mods.polyblockz.common.blocks.stairs.Stair_Reet;
import mods.polyblockz.common.blocks.stairs.Stair_Roof;
import mods.polyblockz.common.blocks.stairs.Stair_Sand;
import mods.polyblockz.common.blocks.stairs.Stair_SpruceParquet;
import mods.polyblockz.common.blocks.stone.Block_Brickstone_black;
import mods.polyblockz.common.blocks.stone.Block_Brickstone_white;
import mods.polyblockz.common.blocks.stone.Block_DarkBlueSmoothBrick;
import mods.polyblockz.common.blocks.stone.Block_DarkRedSmoothBrick;
import mods.polyblockz.common.blocks.stone.Block_Dirtbrick;
import mods.polyblockz.common.blocks.stone.Block_Dirtbrickfine;
import mods.polyblockz.common.blocks.stone.Block_Dirtwall;
import mods.polyblockz.common.blocks.stone.Block_Headstone;
import mods.polyblockz.common.blocks.stone.Block_RedSmoothBrick;
import mods.polyblockz.common.blocks.stone.Block_Roof;
import mods.polyblockz.common.blocks.stone.Block_Sewerage_H;
import mods.polyblockz.common.blocks.stone.Block_Sewerage_I;
import mods.polyblockz.common.blocks.stone.Block_Sewerage_L;
import mods.polyblockz.common.blocks.stone.Block_Sewerage_O;
import mods.polyblockz.common.blocks.stone.Block_Sewerage_X;
import mods.polyblockz.common.blocks.stone.Block_Sewerage_stone;
import mods.polyblockz.common.blocks.wood.Wood_BirchParquet;
import mods.polyblockz.common.blocks.wood.Wood_ColoredWreck;
import mods.polyblockz.common.blocks.wood.Wood_FadedWreck;
import mods.polyblockz.common.blocks.wood.Wood_Greenplank;
import mods.polyblockz.common.blocks.wood.Wood_Jungelparquet;
import mods.polyblockz.common.blocks.wood.Wood_OakParquet;
import mods.polyblockz.common.blocks.wood.Wood_Reet;
import mods.polyblockz.common.blocks.wood.Wood_SpruceParquet;
import mods.polyblockz.common.blocks.wool.Wool_black;
import mods.polyblockz.common.blocks.wool.Wool_brown;
import mods.polyblockz.common.blocks.wool.Wool_cyan;
import mods.polyblockz.common.blocks.wool.Wool_darkblue;
import mods.polyblockz.common.blocks.wool.Wool_darkgreen;
import mods.polyblockz.common.blocks.wool.Wool_darkgrey;
import mods.polyblockz.common.blocks.wool.Wool_lightblue;
import mods.polyblockz.common.blocks.wool.Wool_lightgreen;
import mods.polyblockz.common.blocks.wool.Wool_ligthgrey;
import mods.polyblockz.common.blocks.wool.Wool_magenter;
import mods.polyblockz.common.blocks.wool.Wool_orange;
import mods.polyblockz.common.blocks.wool.Wool_purple;
import mods.polyblockz.common.blocks.wool.Wool_red;
import mods.polyblockz.common.blocks.wool.Wool_rosa;
import mods.polyblockz.common.blocks.wool.Wool_white;
import mods.polyblockz.common.blocks.wool.Wool_yellow;
import mods.polyblockz.common.fluids.Block_SewerageWater;
import mods.polyblockz.common.fluids.Sewerage_Water;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class Block_Helper {

        /*
         * PolyBlock'z Instant Häuser
         */
         
        public static Block BlokkHouse_small;
        public static Block BlokkHouse_middl;
        public static Block BlokkHouse_big;
        public static Block BlokkHouse_poly;
        public static Block BlokkHouse_hidingplace;
        
        /*
         * Instant Häuser Generation
         */
         
        public static final BlokkHouse_small BlokkHouse_smallGen = new BlokkHouse_small();
        public static void generateBlokkHouse_small(World world, Random random, 
                int par2, int par3, int par4) {BlokkHouse_smallGen.generate(world, random, par2, par3, par4);}

        public static final BlokkHouse_middl BlokkHouse_middlGen = new BlokkHouse_middl();
        public static void generateBlokkHouse_middl(World world, Random random, 
                int par2, int par3, int par4) {BlokkHouse_middlGen.generate(world, random, par2, par3, par4);}

        public static final BlokkHouse_big BlokkHouse_bigGen = new BlokkHouse_big();
        public static void generateBlokkHouse_big(World world, Random random, 
                int par2, int par3, int par4) {BlokkHouse_bigGen.generate(world, random, par2, par3, par4);}

        public static final BlokkHouse_poly BlokkHouse_polyGen = new BlokkHouse_poly();
        public static void generateBlokkHouse_poly(World world, Random random, 
                int par2, int par3, int par4) {BlokkHouse_polyGen.generate(world, random, par2, par3, par4);}

        public static final BlokkHouse_hidingplace BlokkHouse_hidingplaceGen = new BlokkHouse_hidingplace();
        public static void generateBlokkHouse_hidingplace(World world, Random random, 
                int par2, int par3, int par4) {BlokkHouse_hidingplaceGen.generate(world, random, par2, par3, par4);}


         
        /*
         * Minecraft Erze
         */
        
        public static Block MithrilOre;
        public static Block BoneOre;
        public static Block PolyamidOre;
        public static Block CitrinOre;
        public static Block RubinOre;
        public static Block SaphirOre;
        public static Block SmokeQuartzOre;
        public static Block SpinellOre;

        
        /*
         * Allgemeine Blöcke
         */
        
        public static Block BlockRaspberry;
        public static Block GlowBlokker;
        public static Block Ornament;
        public static Block CorrugatedSheetdark;
        public static Block CorrugatedSheetlight;
        public static Block Reet;
        public static Block RaspberryBush;
        public static Fluid Sewerage_Water;
        public static Block Block_SewerageWater;
        public static Block AppleBush;

        
        /*
         * Stein Blöcke
         */
        
        public static Block Headstone;
        public static Block Dirtwall;
        public static Block Dirtbrick;
        public static Block Dirtbrickfine;
        public static Block darkbluesmoothBricks;
        public static Block darkredsmoothBricks;
        public static Block redsmoothBricks;
        public static Block Roof;
        public static Block Brickstone_black;
        public static Block Brickstone_white;
        public static Block Sewerage_stone;
        public static Block Sewerage_H;
        public static Block Sewerage_I;
        public static Block Sewerage_L;
        public static Block Sewerage_O;
        public static Block Sewerage_X;
        public static Block Polyamid_Block;

        
        /*
         * "Luft" Blöcke
         */
        
        public static Block BrickGhostblock;
        public static Block CleanstoneGhostblock;
        public static Block CobblestoneGhoststone;
        public static Block DirtGhostblock;
        public static Block SandstoneGhostblock;
        public static Block BrickstoneGhostblock;
        public static Block BrickstoneGhostblockmossy;
        public static Block CobblestoneGhostblockmossy;
        public static Block QuartzGhostblock;
        public static Block OakGhostblock;
        public static Block BirchGhostblock;
        public static Block JungleGhostblock;
        public static Block SpruceGhostblock;
        public static Block OakParquetGhostblock;
        public static Block BirchParquetGhostblock;
        public static Block SpruceParquetGhostblock;
        public static Block JungelParquetGhostblock;
        public static Block blackPlanksGhostblock;
        public static Block HeadstoneGhostblock;
        public static Block DirtwallGhostblock;
        public static Block DirtbrickGhostblock;
        public static Block DirtbrickfineGhostblock;
        public static Block Brickstone_blackGhostblock;
        public static Block Brickstone_whiteGhostblock;
        public static Block Sewerage_stoneGhostblock;

        
        /*
         * Holz Blöcke
         */
        
        public static Block OakParquet;
        public static Block BirchParquet;
        public static Block SpruceParquet;
        public static Block JungelParquet;
        public static Block blackPlanks;
        public static Block greenPlanks;
        public static Block fadedWreck;
        public static Block coloredWreck;

        
        /*
         * Fachwerk Blöcke
         */
        
        public static Block XFramework;
        public static Block LFramework;
        public static Block RFramework;
        public static Block PFramework;
        public static Block MFramework;
        public static Block HFramework;
        public static Block OFramework;

        
        /*
         * Musterwolle
         */
        
        public static Block Woolwhite;
        public static Block Woolorange;
        public static Block Woolmagenter;
        public static Block Woollightblue;
        public static Block Woolyellow;
        public static Block Woollightgreen;
        public static Block Woolrosa;
        public static Block Wooldarkgrey;
        public static Block Woolligthgrey;
        public static Block Woolcyan;
        public static Block Woolpurple;
        public static Block Wooldarkblue;
        public static Block Woolbrown;
        public static Block Wooldarkgreen;
        public static Block Woolred;
        public static Block Woolblack;

        
        /*
         * Leuchtsteine
         */
        
        public static Block Glow_Brick;
        public static Block Glow_Cleanstone;
        public static Block Glow_Cobble;
        public static Block Glow_Sandstone;
        public static Block Glow_Brickstone;
        public static Block Glow_Brickstonemossy;
        public static Block Glow_Cobblemossy;
        public static Block Glow_Quartz;
        public static Block Glow_Oak;
        public static Block Glow_Birch;
        public static Block Glow_Jungle;
        public static Block Glow_Spruce;
        public static Block Glow_Headstone;
        public static Block Glow_Dirtbrick;
        public static Block Glow_Dirtbrick_fine;
        public static Block Glow_Blackplank;
        public static Block Glow_Greenplank;
        public static Block Glow_Brickstone_black;
        public static Block Glow_Brickstone_white;
        public static Block Glow_Sewerage;
        public static Block Glow_Stoneplate_blue;
        public static Block Glow_Stoneplate_darkred;
        public static Block Glow_Stoneplate_red;

        
        /*
         * Zäune - Derzeit Deaktiviert
         */
        
        public static Block Stonebrickfence;
        public static Block mossyStonebrickfence;
        public static Block Cobblestonefence;
        public static Block mossyCobblestonefence;
        public static Block Dirtbrickfence;
        public static Block fadedWereckwoodfence;
        public static Block coloredWereckwoodfence;

        
        /*
         * Treppen
         */
        
        public static Block HeadStoneStair;
        public static Block DirtwallStair;
        public static Block DirtbrickStair;
        public static Block DirtbrickfineStair;
        public static Block RoofStair;
        public static Block ReetStair;
        public static Block oakParquetStair;
        public static Block birchParquetStair;
        public static Block jungleParquetStair;
        public static Block spruceParquetStair;
        public static Block blackPlankStair;
        public static Block greenPlankStair;
        public static Block fadedWereckwoodStair;
        public static Block coloredWereckwoodStair;
        public static Block CorrugatedSheetdarkStair;
        public static Block CorrugatedSheetlightStair;
        public static Block BrickMossyStair;
        public static Block MossyStair;
        public static Block cleanstoneStair;
        public static Block dirtStair;
        public static Block sandStair;
        public static Block gravelStair;
        public static Block glassStair;
        public static Block blockSnowStair;
        public static Block BlockCoalStair;
        public static Block iceStair;
        public static Block blockSteelStair;
        public static Block blockGoldStair;
        public static Block blockRedstoneStair;
        public static Block blockDiamondStair;
        public static Block blockEmeraldStair;
        public static Block obsidianStair;
        public static Block Sewerage_stoneStair;
        public static Block Brickstone_blackStair;
        public static Block Brickstone_whiteStair;

        
        /*
         * Redstone-Lampen
         */
        
        public static Block blokklampIdlebrick;
        public static Block blokklampActivebrick;
        public static Block blokklampIdledirtbrickfine;
        public static Block blokklampActivedirtbrickfine;
        public static Block blokklampIdlenetherBrick;
        public static Block blokklampActivenetherBrick;
        public static Block blokklampIdlequartzblock;
        public static Block blokklampActivequartzblock;
        public static Block blokklampIdlesandstone;
        public static Block blokklampActivesandstone;
        public static Block blokklampIdlestone;
        public static Block blokklampActivestone;
        public static Block blokklampIdlestonebrick;
        public static Block blokklampActivestonebrick;
        public static Block blokklampIdlestonebricksmooth;
        public static Block blokklampActivestonebricksmooth;
        public static Block blokklampIdlestonebricksmooth_mossy;
        public static Block blokklampActivestonebricksmooth_mossy;
        public static Block blokklampIdlestoneMoss;
        public static Block blokklampActivestoneMoss;
        public static Block blokklampIdlewood;
        public static Block blokklampActivewood;
        public static Block blokklampIdlewood_birch;
        public static Block blokklampActivewood_birch;
        public static Block blokklampIdlewood_jungle;
        public static Block blokklampActivewood_jungle;
        public static Block blokklampIdlewood_spruce;
        public static Block blokklampActivewood_spruce;
        public static Block blokklampIdlewoodblack;
        public static Block blokklampActivewoodblack;
		

        public static void configureBlocks(Configuration config) 
        {
        	//
        }

        
        public static void initializeLiquids() 
        {
                Sewerage_Water = new Block_SewerageWater(ID_Helper.Sewerage_WaterID,
                                Sewerage_Water, Material.water).getFluid();
        }

        
        public static void setupBlocks() 
        {
                
                /*
                 * Instant Block Häuser
                 */
                 
                BlokkHouse_small = new Block_BlokkHouse_small(ID_Helper.BlokkHouse_smallID)
                                .setHardness(1.0F)
                                .setResistance(1.0F).setUnlocalizedName("BlokkHouse_small")
                                .setCreativeTab(PolyBlockz.tabPolyBlockzBlocks);
                GameRegistry.registerBlock(BlokkHouse_small, "blokk house small");
        /* --- * --- */
                BlokkHouse_middl = new Block_BlokkHouse_middl(ID_Helper.BlokkHouse_middlID)
                                .setHardness(1.0F)
                                .setResistance(1.0F).setUnlocalizedName("BlokkHouse_middl")
                                .setCreativeTab(PolyBlockz.tabPolyBlockzBlocks);
                GameRegistry.registerBlock(BlokkHouse_middl, "blokk house middl");
        /* --- * --- */
                BlokkHouse_big = new Block_BlokkHouse_big(ID_Helper.BlokkHouse_bigID)
                                .setHardness(1.0F)
                                .setResistance(1.0F).setUnlocalizedName("BlokkHouse_big")
                                .setCreativeTab(PolyBlockz.tabPolyBlockzBlocks);
                GameRegistry.registerBlock(BlokkHouse_big, "blokk house big");
        /* --- * --- */
                BlokkHouse_poly = new Block_BlokkHouse_poly(ID_Helper.BlokkHouse_polyID)
                                .setHardness(1.0F)
                                .setResistance(1.0F).setUnlocalizedName("BlokkHouse_poly")
                                .setCreativeTab(PolyBlockz.tabPolyBlockzBlocks);
                GameRegistry.registerBlock(BlokkHouse_poly, "blokk house poly");
        /* --- * --- */
                BlokkHouse_hidingplace = new Block_BlokkHouse_hidingplace(ID_Helper.BlokkHouse_hidingplaceID)
                                .setHardness(1.0F)
                                .setResistance(1.0F).setUnlocalizedName("BlokkHouse_hidingplace")
                                .setCreativeTab(PolyBlockz.tabPolyBlockzBlocks);
                GameRegistry.registerBlock(BlokkHouse_hidingplace, "BlokkHouse_hidingplace");

                /*
                 * Minecraft Erze 
                 */

                MithrilOre = new Ore_Mithril(ID_Helper.MithrilOreID, Material.rock)
                                .setUnlocalizedName("MithrilOre").setResistance(4.0F)
                                .setHardness(2.0F).setStepSound(Block.soundStoneFootstep)
                                .setCreativeTab(PolyBlockz.tabPolyBlockzBlocks);
                GameRegistry.registerBlock(MithrilOre, "MithrilOre");
                LanguageRegistry.addName(MithrilOre, "MithrilOre");
        /* --- * --- */
                BoneOre = new Ore_Bone(ID_Helper.BoneOreID, Material.rock)
                                .setUnlocalizedName("BoneOre").setResistance(4.0F)
                                .setHardness(2.0F).setStepSound(Block.soundStoneFootstep)
                                .setCreativeTab(PolyBlockz.tabPolyBlockzBlocks);
                GameRegistry.registerBlock(BoneOre, "BoneOre");
                LanguageRegistry.addName(BoneOre, "BoneOre");
        /* --- * --- */
                PolyamidOre = new Ore_Polyamid(ID_Helper.PolyamidOreID, Material.rock)
                                .setUnlocalizedName("PolyamidOre").setResistance(4.0F)
                                .setHardness(2.0F).setStepSound(Block.soundStoneFootstep)
                                .setCreativeTab(PolyBlockz.tabPolyBlockzBlocks);
                GameRegistry.registerBlock(PolyamidOre, "PolyamidOre");
                LanguageRegistry.addName(PolyamidOre, "PolyamidOre");
        /* --- * --- */
                CitrinOre = new Ore_Citrion(ID_Helper.CitrinOreID, Material.rock)
                .setUnlocalizedName("CitrinOre").setResistance(4.0F)
                .setHardness(2.0F).setStepSound(Block.soundStoneFootstep)
                .setCreativeTab(PolyBlockz.tabPolyBlockzBlocks);
                GameRegistry.registerBlock(CitrinOre, "CitrinOre");
                LanguageRegistry.addName(CitrinOre, "CitrinOre");
        /* --- * --- */
                RubinOre = new Ore_Rubin(ID_Helper.RubinOreID, Material.rock)
                .setUnlocalizedName("RubinOre").setResistance(4.0F)
                .setHardness(2.0F).setStepSound(Block.soundStoneFootstep)
                .setCreativeTab(PolyBlockz.tabPolyBlockzBlocks);
                GameRegistry.registerBlock(RubinOre, "RubinOre");
                LanguageRegistry.addName(RubinOre, "RubinOre");
        /* --- * --- */
                SaphirOre = new Ore_Saphir(ID_Helper.SaphirOreID, Material.rock)
                .setUnlocalizedName("SaphirOre").setResistance(4.0F)
                .setHardness(2.0F).setStepSound(Block.soundStoneFootstep)
                .setCreativeTab(PolyBlockz.tabPolyBlockzBlocks);
                GameRegistry.registerBlock(SaphirOre, "SaphirOre");
                LanguageRegistry.addName(SaphirOre, "SaphirOre");
        /* --- * --- */
                SmokeQuartzOre = new Ore_SmokeQuartz(ID_Helper.SmokeQuartzOreID, Material.rock)
                .setUnlocalizedName("SmokeQuartzOre").setResistance(4.0F)
                .setHardness(2.0F).setStepSound(Block.soundStoneFootstep)
                .setCreativeTab(PolyBlockz.tabPolyBlockzBlocks);
                GameRegistry.registerBlock(SmokeQuartzOre, "SmokeQuartzOre");
                LanguageRegistry.addName(SmokeQuartzOre, "SmokeQuartzOre");
        /* --- * --- */
                SpinellOre = new Ore_Spinell(ID_Helper.SpinellOreID, Material.rock)
                .setUnlocalizedName("SpinellOre").setResistance(4.0F)
                .setHardness(2.0F).setStepSound(Block.soundStoneFootstep)
                .setCreativeTab(PolyBlockz.tabPolyBlockzBlocks);
                GameRegistry.registerBlock(SpinellOre, "SpinellOre");
                LanguageRegistry.addName(SpinellOre, "SpinellOre");

                /*
                 * Flüssigkeiten
                 *

                Block_SewerageWater = new Block_SewerageWater(ID_Helper.Sewerage_WaterID, Sewerage_Water, Material.water)
                                .setUnlocalizedName("SewerageWater")
                                .setCreativeTab(PolyBlockz.tabPolyBlockzDekoration);
                GameRegistry.registerBlock(Block_SewerageWater, "Sewerage Water");
        /* --- * --- *
                Sewerage_Water = new Sewerage_Water()
                                .setUnlocalizedName("SewerageWater");
                FluidRegistry.registerFluid(Sewerage_Water);
                
                /*
                 * Allgemeine Blöcke
                 */
                 
                BlockRaspberry = (new Block_RaspberryBush(ID_Helper.BlockRaspberryID)).setCreativeTab(PolyBlockz.tabPolyBlockzBlocks);
                GameRegistry.registerBlock(BlockRaspberry, "PolyBlockz"
                                + (BlockRaspberry.getUnlocalizedName()));
                LanguageRegistry.addName(BlockRaspberry, "BlockRaspberry");
        /* --- * --- */
                /*
                AppleBush = (new Block_RaspberryBush(ID_Helper.AppleBushID));
                GameRegistry.registerBlock(AppleBush, "PolyBlockz"
                                + (AppleBush.getUnlocalizedName()));
                LanguageRegistry.addName(AppleBush, "AppleBush");
                */
                
                AppleBush = new Block_AppleBush(ID_Helper.AppleBushID)
                                .setUnlocalizedName("AppleBush")
                                .setResistance(4.0F)
                                .setHardness(0.2F)
                                .setStepSound(Block.soundGrassFootstep)
                                .setCreativeTab(PolyBlockz.tabPolyBlockzBlocks);
                GameRegistry.registerBlock(AppleBush, "Apple Bush");
                LanguageRegistry.addName(AppleBush, "Apple Bush");
        /* --- * --- */
                GlowBlokker = new Torch_WhiteLamp(ID_Helper.GlowBlokkerID,
                                Material.glass).setUnlocalizedName("GlowBlokker")
                                .setResistance(2.0F).setHardness(0.25F)
                                .setStepSound(Block.soundGlassFootstep)
                                .setCreativeTab(PolyBlockz.tabPolyBlockzDekoration);
                GameRegistry.registerBlock(GlowBlokker, "GlowBlokker");
                LanguageRegistry.addName(GlowBlokker, "GlowBlokker");
        /* --- * --- */
                Ornament = new Block_Ornament(ID_Helper.OrnamentID, Material.iron)
                                .setUnlocalizedName("Ornament").setResistance(4.0F)
                                .setHardness(2.0F).setStepSound(Block.soundMetalFootstep)
                                .setCreativeTab(PolyBlockz.tabPolyBlockzDekoration);
                GameRegistry.registerBlock(Ornament, "Ornament");
                LanguageRegistry.addName(Ornament, "Ornament");
        /* --- * --- */
                Polyamid_Block = new Block_Polyamid_Block(ID_Helper.Polyamid_BlockID, Material.iron)
                .setUnlocalizedName("Polyamid_Block").setResistance(4.0F)
                .setHardness(2.0F).setStepSound(Block.soundMetalFootstep)
                .setCreativeTab(PolyBlockz.tabPolyBlockzDekoration);
                GameRegistry.registerBlock(Polyamid_Block, "Polyamid_Block");
                LanguageRegistry.addName(Polyamid_Block, "Polyamid_Block");
        /* --- * --- */                
                CorrugatedSheetdark = new Block_CorruSheetdark(
                                ID_Helper.CorrugatedSheetdarkID, Material.iron)
                                .setUnlocalizedName("CorrugatedSheetdark").setResistance(4.0F)
                                .setHardness(2.0F).setStepSound(Block.soundMetalFootstep)
                                .setCreativeTab(PolyBlockz.tabPolyBlockzBlocks);
                GameRegistry.registerBlock(CorrugatedSheetdark, "CorrugatedSheetdark");
                LanguageRegistry.addName(CorrugatedSheetdark, "CorrugatedSheetdark");
        /* --- * --- */
                CorrugatedSheetlight = new Block_CorruSheetlight(
                                ID_Helper.CorrugatedSheetlightID, Material.iron)
                                .setUnlocalizedName("CorrugatedSheetlight").setResistance(4.0F)
                                .setHardness(2.0F).setStepSound(Block.soundMetalFootstep)
                                .setCreativeTab(PolyBlockz.tabPolyBlockzBlocks);
                GameRegistry.registerBlock(CorrugatedSheetlight, "CorrugatedSheetlight");
                LanguageRegistry.addName(CorrugatedSheetlight, "CorrugatedSheetlight");
        /* --- * --- */
                Reet = new Wood_Reet(ID_Helper.ReetID, Material.leaves)
                                .setUnlocalizedName("Reet").setResistance(4.0F)
                                .setHardness(2.0F).setStepSound(Block.soundGrassFootstep)
                                .setCreativeTab(PolyBlockz.tabPolyBlockzBlocks);
                GameRegistry.registerBlock(Reet, "Reet");
                LanguageRegistry.addName(Reet, "Reet");

                /*
                 * Stein Blöcke
                 */

                Headstone = new Block_Headstone(ID_Helper.HeadstoneID, Material.rock)
                                .setUnlocalizedName("Headstone").setResistance(4.0F)
                                .setHardness(2.0F).setStepSound(Block.soundStoneFootstep)
                                .setCreativeTab(PolyBlockz.tabPolyBlockzBlocks);
                GameRegistry.registerBlock(Headstone, "Headstone");
                LanguageRegistry.addName(Headstone, "Headstone");
        /* --- * --- */
                Dirtwall = new Block_Dirtwall(ID_Helper.DirtwallID, Material.ground)
                                .setUnlocalizedName("Dirtwall").setResistance(2.0F)
                                .setHardness(1.0F).setStepSound(Block.soundGravelFootstep)
                                .setCreativeTab(PolyBlockz.tabPolyBlockzBlocks);
                GameRegistry.registerBlock(Dirtwall, "Dirtwall");
                LanguageRegistry.addName(Dirtwall, "Dirtwall");
        /* --- * --- */
                Dirtbrick = new Block_Dirtbrick(ID_Helper.DirtbrickID, Material.rock)
                                .setUnlocalizedName("Dirtbrick").setResistance(4.0F)
                                .setHardness(2.0F).setStepSound(Block.soundStoneFootstep)
                                .setCreativeTab(PolyBlockz.tabPolyBlockzBlocks);
                GameRegistry.registerBlock(Dirtbrick, "Dirtbrick");
                LanguageRegistry.addName(Dirtbrick, "Dirtbrick");
                // -- //
                GameRegistry.addSmelting(Block_Helper.Dirtwall.blockID, new ItemStack(
                                Block_Helper.Dirtbrick, 1), 1.25F);
        /* --- * --- */
                Dirtbrickfine = new Block_Dirtbrickfine(ID_Helper.DirtbrickfineID,
                                Material.rock).setUnlocalizedName("Dirtbrick fine")
                                .setResistance(4.0F).setHardness(2.0F)
                                .setStepSound(Block.soundStoneFootstep)
                                .setCreativeTab(PolyBlockz.tabPolyBlockzBlocks);
                GameRegistry.registerBlock(Dirtbrickfine, "Dirtbrickfine");
                LanguageRegistry.addName(Dirtbrickfine, "Dirtbrickfine");
        /* --- * --- */
                darkbluesmoothBricks = new Block_DarkBlueSmoothBrick(
                                ID_Helper.darkbluesmoothBricksID, Material.rock)
                                .setUnlocalizedName("darkbluesmoothBricks").setResistance(4.0F)
                                .setHardness(2.0F).setStepSound(Block.soundStoneFootstep)
                                .setCreativeTab(PolyBlockz.tabPolyBlockzBlocks);
                GameRegistry.registerBlock(darkbluesmoothBricks, "darkbluesmoothBricks");
                LanguageRegistry.addName(darkbluesmoothBricks, "darkbluesmoothBricks");
        /* --- * --- */
                darkredsmoothBricks = new Block_DarkRedSmoothBrick(
                                ID_Helper.darkredsmoothBricksID, Material.rock)
                                .setUnlocalizedName("darkredsmoothBricks").setResistance(4.0F)
                                .setHardness(2.0F).setStepSound(Block.soundStoneFootstep)
                                .setCreativeTab(PolyBlockz.tabPolyBlockzBlocks);
                GameRegistry.registerBlock(darkredsmoothBricks, "darkredsmoothBricks");
                LanguageRegistry.addName(darkredsmoothBricks, "darkredsmoothBricks");
        /* --- * --- */
                redsmoothBricks = new Block_RedSmoothBrick(ID_Helper.redsmoothBricksID,
                                Material.rock).setUnlocalizedName("redsmoothBricks")
                                .setResistance(4.0F).setHardness(2.0F)
                                .setStepSound(Block.soundStoneFootstep)
                                .setCreativeTab(PolyBlockz.tabPolyBlockzBlocks);
                GameRegistry.registerBlock(redsmoothBricks, "redsmoothBricks");
                LanguageRegistry.addName(redsmoothBricks, "redsmoothBricks");
        /* --- * --- */
                Roof = new Block_Roof(ID_Helper.RoofID, Material.rock)
                                .setUnlocalizedName("Roof").setResistance(4.0F)
                                .setHardness(2.0F).setStepSound(Block.soundStoneFootstep)
                                .setCreativeTab(PolyBlockz.tabPolyBlockzBlocks);
                GameRegistry.registerBlock(Roof, "Roof");
                LanguageRegistry.addName(Roof, "Roof");
        /* --- * --- */
                Brickstone_black = new Block_Brickstone_black(
                                ID_Helper.Brickstone_blackID, Material.rock)
                                .setUnlocalizedName("Brickstone_black").setResistance(4.0F)
                                .setHardness(2.0F).setStepSound(Block.soundStoneFootstep)
                                .setCreativeTab(PolyBlockz.tabPolyBlockzBlocks);
                GameRegistry.registerBlock(Brickstone_black, "Brickstone black");
                LanguageRegistry.addName(Brickstone_black, "Brickstone black");
        /* --- * --- */
                Brickstone_white = new Block_Brickstone_white(
                                ID_Helper.Brickstone_whiteID, Material.rock)
                                .setUnlocalizedName("Brickstone_white").setResistance(4.0F)
                                .setHardness(2.0F).setStepSound(Block.soundStoneFootstep)
                                .setCreativeTab(PolyBlockz.tabPolyBlockzBlocks);
                GameRegistry.registerBlock(Brickstone_white, "Brickstone white");
                LanguageRegistry.addName(Brickstone_white, "Brickstone white");
        /* --- * --- */
                Sewerage_stone = new Block_Sewerage_stone(ID_Helper.Sewerage_stoneID,
                                Material.rock).setUnlocalizedName("Sewerage_stone")
                                .setResistance(4.0F).setHardness(2.0F)
                                .setStepSound(Block.soundStoneFootstep)
                                .setCreativeTab(PolyBlockz.tabPolyBlockzBlocks);
                GameRegistry.registerBlock(Sewerage_stone, "Seweragestone");
                LanguageRegistry.addName(Sewerage_stone, "Seweragestone");
        /* --- * --- */
                Sewerage_H = new Block_Sewerage_H(ID_Helper.Sewerage_HID, Material.rock)
                                .setUnlocalizedName("Sewerage_H").setResistance(4.0F)
                                .setHardness(2.0F).setStepSound(Block.soundStoneFootstep)
                                .setCreativeTab(PolyBlockz.tabPolyBlockzBlocks);
                GameRegistry.registerBlock(Sewerage_H, "Sewerage H");
                LanguageRegistry.addName(Sewerage_H, "Sewerage H");
        /* --- * --- */
                Sewerage_I = new Block_Sewerage_I(ID_Helper.Sewerage_IID, Material.rock)
                                .setUnlocalizedName("Sewerage_I").setResistance(4.0F)
                                .setHardness(2.0F).setStepSound(Block.soundStoneFootstep)
                                .setCreativeTab(PolyBlockz.tabPolyBlockzBlocks);
                GameRegistry.registerBlock(Sewerage_I, "Sewerage I");
                LanguageRegistry.addName(Sewerage_I, "Sewerage I");
        /* --- * --- */
                Sewerage_L = new Block_Sewerage_L(ID_Helper.Sewerage_LID, Material.rock)
                                .setUnlocalizedName("Sewerage_L").setResistance(4.0F)
                                .setHardness(2.0F).setStepSound(Block.soundStoneFootstep)
                                .setCreativeTab(PolyBlockz.tabPolyBlockzBlocks);
                GameRegistry.registerBlock(Sewerage_L, "Sewerage L");
                LanguageRegistry.addName(Sewerage_L, "Sewerage L");
        /* --- * --- */
                Sewerage_O = new Block_Sewerage_O(ID_Helper.Sewerage_OID, Material.rock)
                                .setUnlocalizedName("Sewerage_O").setResistance(4.0F)
                                .setHardness(2.0F).setStepSound(Block.soundStoneFootstep)
                                .setCreativeTab(PolyBlockz.tabPolyBlockzBlocks);
                GameRegistry.registerBlock(Sewerage_O, "Sewerage O");
                LanguageRegistry.addName(Sewerage_O, "Sewerage O");
        /* --- * --- */
                Sewerage_X = new Block_Sewerage_X(ID_Helper.Sewerage_XID, Material.rock)
                                .setUnlocalizedName("Sewerage_X").setResistance(4.0F)
                                .setHardness(2.0F).setStepSound(Block.soundStoneFootstep)
                                .setCreativeTab(PolyBlockz.tabPolyBlockzBlocks);
                GameRegistry.registerBlock(Sewerage_X, "Sewerage X");
                LanguageRegistry.addName(Sewerage_X, "Sewerage X");

                /*
                 * "Luft" Blöcke
                 */

                BrickGhostblock = new Ghost_Brick(ID_Helper.BrickGhostblockID,
                                Material.leaves).setUnlocalizedName("BrickGhostblock")
                                .setResistance(4.0F).setHardness(0.75F).setLightOpacity(0)
                                .setCreativeTab(PolyBlockz.tabPolyBlockzDekoration);
                GameRegistry.registerBlock(BrickGhostblock, "BrickGhostblock");
                LanguageRegistry.addName(BrickGhostblock, "BrickGhostblock");
        /* --- * --- */
                CleanstoneGhostblock = new Ghost_Cleanstone(
                                ID_Helper.CleanstoneGhostblockID, Material.leaves)
                                .setUnlocalizedName("CleanstoneGhostblock").setResistance(4.0F)
                                .setHardness(0.75F).setLightOpacity(0)
                                .setCreativeTab(PolyBlockz.tabPolyBlockzDekoration);
                GameRegistry.registerBlock(CleanstoneGhostblock, "CleanstoneGhostblock");
                LanguageRegistry.addName(CleanstoneGhostblock, "CleanstoneGhostblock");
        /* --- * --- */
                CobblestoneGhoststone = new Ghost_Cobble(
                                ID_Helper.CobblestoneGhoststoneID, Material.leaves)
                                .setUnlocalizedName("CobblestoneGhoststone")
                                .setResistance(4.0F).setHardness(0.75F).setLightOpacity(0)
                                .setCreativeTab(PolyBlockz.tabPolyBlockzDekoration);
                GameRegistry.registerBlock(CobblestoneGhoststone,"CobblestoneGhoststone");
                LanguageRegistry.addName(CobblestoneGhoststone, "CobblestoneGhoststone");
        /* --- * --- */
                DirtGhostblock = new Ghost_Dirt(ID_Helper.DirtGhostblockID,
                                Material.leaves).setUnlocalizedName("DirtGhostblock")
                                .setResistance(4.0F).setHardness(0.75F).setLightOpacity(0)
                                .setCreativeTab(PolyBlockz.tabPolyBlockzDekoration);
                GameRegistry.registerBlock(DirtGhostblock, "DirtGhostblock");
                LanguageRegistry.addName(DirtGhostblock, "DirtGhostblock");
        /* --- * --- */
                SandstoneGhostblock = new Ghost_Sandstone(
                                ID_Helper.SandstoneGhostblockID, Material.leaves)
                                .setUnlocalizedName("SandstoneGhostblock").setResistance(4.0F)
                                .setHardness(0.75F).setLightOpacity(0)
                                .setCreativeTab(PolyBlockz.tabPolyBlockzDekoration);
                GameRegistry.registerBlock(SandstoneGhostblock, "SandstoneGhostblock");
                LanguageRegistry.addName(SandstoneGhostblock, "SandstoneGhostblock");
        /* --- * --- */
                BrickstoneGhostblock = new Ghost_Brickstone(
                                ID_Helper.BrickstoneGhostblockID, Material.leaves)
                                .setUnlocalizedName("BrickstoneGhostblock").setResistance(4.0F)
                                .setHardness(0.75F).setLightOpacity(0)
                                .setCreativeTab(PolyBlockz.tabPolyBlockzDekoration);
                GameRegistry.registerBlock(BrickstoneGhostblock, "BrickstoneGhostblock");
                LanguageRegistry.addName(BrickstoneGhostblock, "BrickstoneGhostblock");
        /* --- * --- */
                BrickstoneGhostblockmossy = new Ghost_Brickstonemossy(
                                ID_Helper.BrickstoneGhostblockmossyID, Material.leaves)
                                .setUnlocalizedName("BrickstoneGhostblockmossy")
                                .setResistance(4.0F).setHardness(0.75F).setLightOpacity(0)
                                .setCreativeTab(PolyBlockz.tabPolyBlockzDekoration);
                GameRegistry.registerBlock(BrickstoneGhostblockmossy,"BrickstoneGhostblockmossy");
                LanguageRegistry.addName(BrickstoneGhostblockmossy,"BrickstoneGhostblockmossy");
        /* --- * --- */
                CobblestoneGhostblockmossy = new Ghost_Cobblemossy(
                                ID_Helper.CobblestoneGhostblockmossyID, Material.leaves)
                                .setUnlocalizedName("CobblestoneGhostblockmossy")
                                .setResistance(4.0F).setHardness(0.75F).setLightOpacity(0)
                                .setCreativeTab(PolyBlockz.tabPolyBlockzDekoration);
                GameRegistry.registerBlock(CobblestoneGhostblockmossy,"CobblestoneGhostblockmossy");
                LanguageRegistry.addName(CobblestoneGhostblockmossy,"CobblestoneGhostblockmossy");
        /* --- * --- */
                QuartzGhostblock = new Ghost_Quartz(ID_Helper.QuartzGhostblockID,
                                Material.leaves).setUnlocalizedName("QuartzGhostblock")
                                .setResistance(4.0F).setHardness(0.75F).setLightOpacity(0)
                                .setCreativeTab(PolyBlockz.tabPolyBlockzDekoration);
                GameRegistry.registerBlock(QuartzGhostblock, "QuartzGhostblock");
                LanguageRegistry.addName(QuartzGhostblock, "QuartzGhostblock");
        /* --- * --- */
                OakGhostblock = new Ghost_Oakplank(ID_Helper.OakGhostblockID,
                                Material.leaves).setUnlocalizedName("OakGhostblock")
                                .setResistance(4.0F).setHardness(0.75F).setLightOpacity(0)
                                .setCreativeTab(PolyBlockz.tabPolyBlockzDekoration);
                GameRegistry.registerBlock(OakGhostblock, "OakGhostblock");
                LanguageRegistry.addName(OakGhostblock, "OakGhostblock");
        /* --- * --- */
                BirchGhostblock = new Ghost_Birchplank(ID_Helper.BirchGhostblockID,
                                Material.leaves).setUnlocalizedName("BirchGhostblock")
                                .setResistance(4.0F).setHardness(0.75F).setLightOpacity(0)
                                .setCreativeTab(PolyBlockz.tabPolyBlockzDekoration);
                GameRegistry.registerBlock(BirchGhostblock, "BirchGhostblock");
                LanguageRegistry.addName(BirchGhostblock, "BirchGhostblock");
        /* --- * --- */
                JungleGhostblock = new Ghost_Jungleplank(ID_Helper.JungleGhostblockID,
                                Material.leaves).setUnlocalizedName("JungleGhostblock")
                                .setResistance(4.0F).setHardness(0.75F).setLightOpacity(0)
                                .setCreativeTab(PolyBlockz.tabPolyBlockzDekoration);
                GameRegistry.registerBlock(JungleGhostblock, "JungleGhostblock");
                LanguageRegistry.addName(JungleGhostblock, "JungleGhostblock");
        /* --- * --- */
                SpruceGhostblock = new Ghost_Spruceplank(ID_Helper.SpruceGhostblockID,
                                Material.leaves).setUnlocalizedName("SpruceGhostblock")
                                .setResistance(4.0F).setHardness(0.75F).setLightOpacity(0)
                                .setCreativeTab(PolyBlockz.tabPolyBlockzDekoration);
                GameRegistry.registerBlock(SpruceGhostblock, "SpruceGhostblock");
                LanguageRegistry.addName(SpruceGhostblock, "SpruceGhostblock");
        /* --- * --- */
                OakParquetGhostblock = new Ghost_OakParquet(
                                ID_Helper.OakParquetGhostblockID, Material.leaves)
                                .setUnlocalizedName("OakParquetGhostblock").setResistance(4.0F)
                                .setHardness(0.75F).setLightOpacity(0)
                                .setCreativeTab(PolyBlockz.tabPolyBlockzDekoration);
                GameRegistry.registerBlock(OakParquetGhostblock,"Oak Parquet Ghostblock");
                LanguageRegistry.addName(OakParquetGhostblock, "Oak Parquet Ghostblock");
        /* --- * --- */
                BirchParquetGhostblock = new Ghost_BirchParquet(
                                ID_Helper.BirchParquetGhostblockID, Material.leaves)
                                .setUnlocalizedName("BirchParquetGhostblock")
                                .setResistance(4.0F).setHardness(0.75F).setLightOpacity(0)
                                .setCreativeTab(PolyBlockz.tabPolyBlockzDekoration);
                GameRegistry.registerBlock(BirchParquetGhostblock,"Birch Parquet Ghostblock");
                LanguageRegistry.addName(BirchParquetGhostblock,"Birch Parquet Ghostblock");
        /* --- * --- */
                SpruceParquetGhostblock = new Ghost_SpruceParquet(
                                ID_Helper.SpruceParquetGhostblockID, Material.leaves)
                                .setUnlocalizedName("SpruceParquetGhostblock")
                                .setResistance(4.0F).setHardness(0.75F).setLightOpacity(0)
                                .setCreativeTab(PolyBlockz.tabPolyBlockzDekoration);
                GameRegistry.registerBlock(SpruceParquetGhostblock,
                                "Spruce Parquet Ghostblock");
                LanguageRegistry.addName(SpruceParquetGhostblock,
                                "Spruce Parquet Ghostblock");
        /* --- * --- */
                JungelParquetGhostblock = new Ghost_JungelParquet(
                                ID_Helper.JungelParquetGhostblockID, Material.leaves)
                                .setUnlocalizedName("JungelParquetGhostblock")
                                .setResistance(4.0F).setHardness(0.75F).setLightOpacity(0)
                                .setCreativeTab(PolyBlockz.tabPolyBlockzDekoration);
                GameRegistry.registerBlock(JungelParquetGhostblock,
                                "Jungel Parquet Ghostblock");
                LanguageRegistry.addName(JungelParquetGhostblock,
                                "Jungel Parquet Ghostblock");
        /* --- * --- */
                blackPlanksGhostblock = new Ghost_blackPlanks(
                                ID_Helper.blackPlanksGhostblockID, Material.leaves)
                                .setUnlocalizedName("blackPlanksGhostblock")
                                .setResistance(4.0F).setHardness(0.75F).setLightOpacity(0)
                                .setCreativeTab(PolyBlockz.tabPolyBlockzDekoration);
                GameRegistry.registerBlock(blackPlanksGhostblock,
                                "black Planks Ghostblock");
                LanguageRegistry.addName(blackPlanksGhostblock,
                                "black Planks Ghostblock");
        /* --- * --- */
                HeadstoneGhostblock = new Ghost_Headstone(
                                ID_Helper.HeadstoneGhostblockID, Material.leaves)
                                .setUnlocalizedName("HeadstoneGhostblock").setResistance(4.0F)
                                .setHardness(0.75F).setLightOpacity(0)
                                .setCreativeTab(PolyBlockz.tabPolyBlockzDekoration);
                GameRegistry.registerBlock(HeadstoneGhostblock, "Headstone Ghostblock");
                LanguageRegistry.addName(HeadstoneGhostblock, "Headstone Ghostblock");
        /* --- * --- */
                DirtwallGhostblock = new Ghost_Dirtwall(ID_Helper.DirtwallGhostblockID,
                                Material.leaves).setUnlocalizedName("DirtwallGhostblock")
                                .setResistance(4.0F).setHardness(0.75F).setLightOpacity(0)
                                .setCreativeTab(PolyBlockz.tabPolyBlockzDekoration);
                GameRegistry.registerBlock(DirtwallGhostblock, "Dirtwall Ghostblock");
                LanguageRegistry.addName(DirtwallGhostblock, "Dirtwall Ghostblock");
        /* --- * --- */
                DirtbrickGhostblock = new Ghost_Dirtbrick(
                                ID_Helper.DirtbrickGhostblockID, Material.leaves)
                                .setUnlocalizedName("DirtbrickGhostblock").setResistance(4.0F)
                                .setHardness(0.75F).setLightOpacity(0)
                                .setCreativeTab(PolyBlockz.tabPolyBlockzDekoration);
                GameRegistry.registerBlock(DirtbrickGhostblock, "DirtbrickGhostblock");
                LanguageRegistry.addName(DirtbrickGhostblock, "DirtbrickGhostblock");
        /* --- * --- */
                DirtbrickfineGhostblock = new Ghost_Dirtbrickfine(
                                ID_Helper.DirtbrickfineGhostblockID, Material.leaves)
                                .setUnlocalizedName("DirtbrickfineGhostblock")
                                .setResistance(4.0F).setHardness(0.75F).setLightOpacity(0)
                                .setCreativeTab(PolyBlockz.tabPolyBlockzDekoration);
                GameRegistry.registerBlock(DirtbrickfineGhostblock,
                                "Dirtbrick fine Ghostblock");
                LanguageRegistry.addName(DirtbrickfineGhostblock,
                                "Dirtbrick fine Ghostblock");
        /* --- * --- */
                Brickstone_blackGhostblock = new Ghost_Brickstone_black(
                                ID_Helper.Brickstone_blackGhostblockID, Material.leaves)
                                .setUnlocalizedName("Brickstone_blackGhostblock")
                                .setResistance(4.0F).setHardness(0.75F).setLightOpacity(0)
                                .setCreativeTab(PolyBlockz.tabPolyBlockzDekoration);
                GameRegistry.registerBlock(Brickstone_blackGhostblock,
                                "Brickstone black Ghostblock");
                LanguageRegistry.addName(Brickstone_blackGhostblock,
                                "Brickstone black Ghostblock");
        /* --- * --- */
                Brickstone_whiteGhostblock = new Ghost_Brickstone_white(
                                ID_Helper.Brickstone_whiteGhostblockID, Material.leaves)
                                .setUnlocalizedName("Brickstone_whiteGhostblock")
                                .setResistance(4.0F).setHardness(0.75F).setLightOpacity(0)
                                .setCreativeTab(PolyBlockz.tabPolyBlockzDekoration);
                GameRegistry.registerBlock(Brickstone_whiteGhostblock,
                                "Brickstone white Ghostblock");
                LanguageRegistry.addName(Brickstone_whiteGhostblock,
                                "Brickstone white Ghostblock");
        /* --- * --- */
                Sewerage_stoneGhostblock = new Ghost_Sewerage_stone(
                                ID_Helper.Sewerage_stoneGhostblockID, Material.leaves)
                                .setUnlocalizedName("Sewerage_stoneGhostblock")
                                .setResistance(4.0F).setHardness(0.75F).setLightOpacity(0)
                                .setCreativeTab(PolyBlockz.tabPolyBlockzDekoration);
                GameRegistry.registerBlock(Sewerage_stoneGhostblock,
                                "Seweragestone Ghostblock");
                LanguageRegistry.addName(Sewerage_stoneGhostblock,
                                "Seweragestone Ghostblock");

                /*
                 * Holz Blöcke
                 */

                OakParquet = new Wood_OakParquet(ID_Helper.OakParquetID, Material.wood)
                                .setUnlocalizedName("OakParquet").setResistance(3.25F)
                                .setHardness(1.75F).setStepSound(Block.soundWoodFootstep)
                                .setCreativeTab(PolyBlockz.tabPolyBlockzBlocks);
                GameRegistry.registerBlock(OakParquet, "OakParquet");
                LanguageRegistry.addName(OakParquet, "OakParquet");
        /* --- * --- */
                BirchParquet = new Wood_BirchParquet(ID_Helper.BirchParquetID,
                                Material.wood).setUnlocalizedName("BirchParquet")
                                .setResistance(3.25F).setHardness(1.75F)
                                .setStepSound(Block.soundWoodFootstep)
                                .setCreativeTab(PolyBlockz.tabPolyBlockzBlocks);
                GameRegistry.registerBlock(BirchParquet, "BirchParquet");
                LanguageRegistry.addName(BirchParquet, "BirchParquet");
        /* --- * --- */
                SpruceParquet = new Wood_SpruceParquet(ID_Helper.SpruceParquetID,
                                Material.wood).setUnlocalizedName("SpruceParquet")
                                .setResistance(3.25F).setHardness(1.75F)
                                .setStepSound(Block.soundWoodFootstep)
                                .setCreativeTab(PolyBlockz.tabPolyBlockzBlocks);
                GameRegistry.registerBlock(SpruceParquet, "SpruceParquet");
                LanguageRegistry.addName(SpruceParquet, "SpruceParquet");
        /* --- * --- */
                JungelParquet = new Wood_Jungelparquet(ID_Helper.JungelParquetID,
                                Material.wood).setUnlocalizedName("JungelParquet")
                                .setResistance(3.25F).setHardness(1.75F)
                                .setStepSound(Block.soundWoodFootstep)
                                .setCreativeTab(PolyBlockz.tabPolyBlockzBlocks);
                GameRegistry.registerBlock(JungelParquet, "JungelParquet");
                LanguageRegistry.addName(JungelParquet, "JungelParquet");
        /* --- * --- */
                greenPlanks = new Wood_Greenplank(ID_Helper.greenPlanksID,
                                Material.wood).setUnlocalizedName("greenPlanks")
                                .setResistance(3.25F).setHardness(1.75F)
                                .setStepSound(Block.soundWoodFootstep)
                                .setCreativeTab(PolyBlockz.tabPolyBlockzBlocks);
                GameRegistry.registerBlock(greenPlanks, "greenPlanks");
                LanguageRegistry.addName(greenPlanks, "greenPlanks");
        /* --- * --- */
                fadedWreck = new Wood_FadedWreck(ID_Helper.fadedWreckID, Material.wood)
                                .setUnlocalizedName("fadedWreck").setResistance(3.25F)
                                .setHardness(1.75F).setStepSound(Block.soundWoodFootstep)
                                .setCreativeTab(PolyBlockz.tabPolyBlockzBlocks);
                GameRegistry.registerBlock(fadedWreck, "fadedWreck");
                LanguageRegistry.addName(fadedWreck, "fadedWreck");
        /* --- * --- */
                coloredWreck = new Wood_ColoredWreck(ID_Helper.coloredWreckID,
                                Material.wood).setUnlocalizedName("coloredWreck")
                                .setResistance(3.25F).setHardness(1.75F)
                                .setStepSound(Block.soundWoodFootstep)
                                .setCreativeTab(PolyBlockz.tabPolyBlockzBlocks);
                GameRegistry.registerBlock(coloredWreck, "coloredWreck");
                LanguageRegistry.addName(coloredWreck, "coloredWreck");

                /*
                 * Fachwerk Blöcke
                 */

                XFramework = new Frame_X(ID_Helper.XFrameworkID, Material.rock)
                                .setUnlocalizedName("XFramework").setResistance(4.0F)
                                .setHardness(2.0F).setStepSound(Block.soundStoneFootstep)
                                .setCreativeTab(PolyBlockz.tabPolyBlockzBlocks);
                GameRegistry.registerBlock(XFramework, "XFramework");
                LanguageRegistry.addName(XFramework, "XFramework");
        /* --- * --- */
                LFramework = new Frame_L(ID_Helper.LFrameworkID, Material.rock)
                                .setUnlocalizedName("LFramework").setResistance(4.0F)
                                .setHardness(2.0F).setStepSound(Block.soundStoneFootstep)
                                .setCreativeTab(PolyBlockz.tabPolyBlockzBlocks);
                GameRegistry.registerBlock(LFramework, "LFramework");
                LanguageRegistry.addName(LFramework, "LFramework");
        /* --- * --- */
                RFramework = new Frame_R(ID_Helper.RFrameworkID, Material.rock)
                                .setUnlocalizedName("RFramework").setResistance(4.0F)
                                .setHardness(2.0F).setStepSound(Block.soundStoneFootstep)
                                .setCreativeTab(PolyBlockz.tabPolyBlockzBlocks);
                GameRegistry.registerBlock(RFramework, "RFramework");
                LanguageRegistry.addName(RFramework, "RFramework");
        /* --- * --- */
                PFramework = new Frame_P(ID_Helper.PFrameworkID, Material.rock)
                                .setUnlocalizedName("PFramework").setResistance(4.0F)
                                .setHardness(2.0F).setStepSound(Block.soundStoneFootstep)
                                .setCreativeTab(PolyBlockz.tabPolyBlockzBlocks);
                GameRegistry.registerBlock(PFramework, "PFramework");
                LanguageRegistry.addName(PFramework, "PFramework");
        /* --- * --- */
                MFramework = new Frame_M(ID_Helper.MFrameworkID, Material.rock)
                                .setUnlocalizedName("MFramework").setResistance(4.0F)
                                .setHardness(2.0F).setStepSound(Block.soundStoneFootstep)
                                .setCreativeTab(PolyBlockz.tabPolyBlockzBlocks);
                GameRegistry.registerBlock(MFramework, "MFramework");
                LanguageRegistry.addName(MFramework, "MFramework");
        /* --- * --- */
                HFramework = new Frame_H(ID_Helper.HFrameworkID, Material.rock)
                                .setUnlocalizedName("HFramework").setResistance(4.0F)
                                .setHardness(2.0F).setStepSound(Block.soundStoneFootstep)
                                .setCreativeTab(PolyBlockz.tabPolyBlockzBlocks);
                GameRegistry.registerBlock(HFramework, "HFramework");
                LanguageRegistry.addName(HFramework, "HFramework");
        /* --- * --- */
                OFramework = new Frame_O(ID_Helper.OFrameworkID, Material.rock)
                                .setUnlocalizedName("OFramework").setResistance(4.0F)
                                .setHardness(2.0F).setStepSound(Block.soundStoneFootstep)
                                .setCreativeTab(PolyBlockz.tabPolyBlockzBlocks);
                GameRegistry.registerBlock(OFramework, "OFramework");
                LanguageRegistry.addName(OFramework, "OFramework");

                /*
                 * Musterwolle
                 */

                Woolwhite = new Wool_white(ID_Helper.WoolwhiteID, Material.cloth)
                                .setUnlocalizedName("Woolwhite").setResistance(2.5F)
                                .setHardness(1.5F).setStepSound(Block.soundClothFootstep)
                                .setCreativeTab(PolyBlockz.tabPolyBlockzDekoration);
                GameRegistry.registerBlock(Woolwhite, "Woolwhite");
                LanguageRegistry.addName(Woolwhite, "Woolwhite");
        /* --- * --- */
                Woolorange = new Wool_orange(ID_Helper.WoolorangeID, Material.cloth)
                                .setUnlocalizedName("Woolorange").setResistance(2.5F)
                                .setHardness(1.5F).setStepSound(Block.soundClothFootstep)
                                .setCreativeTab(PolyBlockz.tabPolyBlockzDekoration);
                GameRegistry.registerBlock(Woolorange, "Woolorange");
                LanguageRegistry.addName(Woolorange, "Woolorange");
        /* --- * --- */
                Woolmagenter = new Wool_magenter(ID_Helper.WoolmagenterID,
                                Material.cloth).setUnlocalizedName("Woolmagenter")
                                .setResistance(2.5F).setHardness(1.5F)
                                .setStepSound(Block.soundClothFootstep)
                                .setCreativeTab(PolyBlockz.tabPolyBlockzDekoration);
                GameRegistry.registerBlock(Woolmagenter, "Woolmagenter");
                LanguageRegistry.addName(Woolmagenter, "Woolmagenter");
        /* --- * --- */
                Woollightblue = new Wool_lightblue(ID_Helper.WoollightblueID,
                                Material.cloth).setUnlocalizedName("Woollightblue")
                                .setResistance(2.5F).setHardness(1.5F)
                                .setStepSound(Block.soundClothFootstep)
                                .setCreativeTab(PolyBlockz.tabPolyBlockzDekoration);
                GameRegistry.registerBlock(Woollightblue, "Woollightblue");
                LanguageRegistry.addName(Woollightblue, "Woollightblue");
        /* --- * --- */
                Woolyellow = new Wool_yellow(ID_Helper.WoolyellowID, Material.cloth)
                                .setUnlocalizedName("Woolyellow").setResistance(2.5F)
                                .setHardness(1.5F).setStepSound(Block.soundClothFootstep)
                                .setCreativeTab(PolyBlockz.tabPolyBlockzDekoration);
                GameRegistry.registerBlock(Woolyellow, "Woolyellow");
                LanguageRegistry.addName(Woolyellow, "Woolyellow");
        /* --- * --- */
                Woollightgreen = new Wool_lightgreen(ID_Helper.WoollightgreenID,
                                Material.cloth).setUnlocalizedName("Woollightgreen")
                                .setResistance(2.5F).setHardness(1.5F)
                                .setStepSound(Block.soundClothFootstep)
                                .setCreativeTab(PolyBlockz.tabPolyBlockzDekoration);
                GameRegistry.registerBlock(Woollightgreen, "Woollightgreen");
                LanguageRegistry.addName(Woollightgreen, "Woollightgreen");
        /* --- * --- */
                Woolrosa = new Wool_rosa(ID_Helper.WoolrosaID, Material.cloth)
                                .setUnlocalizedName("Woolrosa").setResistance(2.5F)
                                .setHardness(1.5F).setStepSound(Block.soundClothFootstep)
                                .setCreativeTab(PolyBlockz.tabPolyBlockzDekoration);
                GameRegistry.registerBlock(Woolrosa, "Woolrosa");
                LanguageRegistry.addName(Woolrosa, "Woolrosa");
        /* --- * --- */
                Wooldarkgrey = new Wool_darkgrey(ID_Helper.WooldarkgreyID,
                                Material.cloth).setUnlocalizedName("Wooldarkgrey")
                                .setResistance(2.5F).setHardness(1.5F)
                                .setStepSound(Block.soundClothFootstep)
                                .setCreativeTab(PolyBlockz.tabPolyBlockzDekoration);
                GameRegistry.registerBlock(Wooldarkgrey, "Wooldarkgrey");
                LanguageRegistry.addName(Wooldarkgrey, "Wooldarkgrey");
        /* --- * --- */
                Woolligthgrey = new Wool_ligthgrey(ID_Helper.WoolligthgreyID,
                                Material.cloth).setUnlocalizedName("Woolligthgrey")
                                .setResistance(2.5F).setHardness(1.5F)
                                .setStepSound(Block.soundClothFootstep)
                                .setCreativeTab(PolyBlockz.tabPolyBlockzDekoration);
                GameRegistry.registerBlock(Woolligthgrey, "Woolligthgrey");
                LanguageRegistry.addName(Woolligthgrey, "Woolligthgrey");
        /* --- * --- */
                Woolcyan = new Wool_cyan(ID_Helper.WoolcyanID, Material.cloth)
                                .setUnlocalizedName("Woolcyan").setResistance(2.5F)
                                .setHardness(1.5F).setStepSound(Block.soundClothFootstep)
                                .setCreativeTab(PolyBlockz.tabPolyBlockzDekoration);
                GameRegistry.registerBlock(Woolcyan, "Woolcyan");
                LanguageRegistry.addName(Woolcyan, "Woolcyan");
        /* --- * --- */
                Woolpurple = new Wool_purple(ID_Helper.WoolpurpleID, Material.cloth)
                                .setUnlocalizedName("Woolpurple").setResistance(2.5F)
                                .setHardness(1.5F).setStepSound(Block.soundClothFootstep)
                                .setCreativeTab(PolyBlockz.tabPolyBlockzDekoration);
                GameRegistry.registerBlock(Woolpurple, "Woolpurple");
                LanguageRegistry.addName(Woolpurple, "Woolpurple");
        /* --- * --- */
                Wooldarkblue = new Wool_darkblue(ID_Helper.WooldarkblueID,
                                Material.cloth).setUnlocalizedName("Wooldarkblue")
                                .setResistance(2.5F).setHardness(1.5F)
                                .setStepSound(Block.soundClothFootstep)
                                .setCreativeTab(PolyBlockz.tabPolyBlockzDekoration);
                GameRegistry.registerBlock(Wooldarkblue, "Wooldarkblue");
                LanguageRegistry.addName(Wooldarkblue, "Wooldarkblue");
        /* --- * --- */
                Woolbrown = new Wool_brown(ID_Helper.WoolbrownID, Material.cloth)
                                .setUnlocalizedName("Woolbrown").setResistance(2.5F)
                                .setHardness(1.5F).setStepSound(Block.soundClothFootstep)
                                .setCreativeTab(PolyBlockz.tabPolyBlockzDekoration);
                GameRegistry.registerBlock(Woolbrown, "Woolbrown");
                LanguageRegistry.addName(Woolbrown, "Woolbrown");
        /* --- * --- */
                Wooldarkgreen = new Wool_darkgreen(ID_Helper.WooldarkgreenID,
                                Material.cloth).setUnlocalizedName("Wooldarkgreen")
                                .setResistance(2.5F).setHardness(1.5F)
                                .setStepSound(Block.soundClothFootstep)
                                .setCreativeTab(PolyBlockz.tabPolyBlockzDekoration);
                GameRegistry.registerBlock(Wooldarkgreen, "Wooldarkgreen");
                LanguageRegistry.addName(Wooldarkgreen, "Wooldarkgreen");
        /* --- * --- */
                Woolred = new Wool_red(ID_Helper.WoolredID, Material.cloth)
                                .setUnlocalizedName("Woolred").setResistance(2.5F)
                                .setHardness(1.5F).setStepSound(Block.soundClothFootstep)
                                .setCreativeTab(PolyBlockz.tabPolyBlockzDekoration);
                GameRegistry.registerBlock(Woolred, "Woolred");
                LanguageRegistry.addName(Woolred, "Woolred");
        /* --- * --- */
                Woolblack = new Wool_black(ID_Helper.WoolblackID, Material.cloth)
                                .setUnlocalizedName("Woolblack").setResistance(2.5F)
                                .setHardness(1.5F).setStepSound(Block.soundClothFootstep)
                                .setCreativeTab(PolyBlockz.tabPolyBlockzDekoration);
                GameRegistry.registerBlock(Woolblack, "Woolblack");
                LanguageRegistry.addName(Woolblack, "Woolblack");

                /*
                 * Leuchtsteine
                 */

                Glow_Brick = new Glow_Brick(ID_Helper.Glow_BrickID, Material.glass)
                                .setHardness(0.3F).setStepSound(Block.soundGlassFootstep)
                                .setLightValue(1.0F).setUnlocalizedName("Glow_Brick")
                                .setCreativeTab(PolyBlockz.tabPolyBlockzDekoration);
                GameRegistry.registerBlock(Glow_Brick, "Glowstone Brick");
                LanguageRegistry.addName(Glow_Brick, "Glowstone Brick");
        /* --- * --- */
                Glow_Cleanstone = new Glow_Cleanstone(ID_Helper.Glow_CleanstoneID,
                                Material.glass).setHardness(0.3F)
                                .setStepSound(Block.soundGlassFootstep).setLightValue(1.0F)
                                .setUnlocalizedName("Glow_Cleanstone")
                                .setCreativeTab(PolyBlockz.tabPolyBlockzDekoration);
                GameRegistry.registerBlock(Glow_Cleanstone, "Glow Cleanstone");
                LanguageRegistry.addName(Glow_Cleanstone, "Glow Cleanstone");
        /* --- * --- */
                Glow_Cobble = new Glow_Cobble(ID_Helper.Glow_CobbleID, Material.glass)
                                .setHardness(0.3F).setStepSound(Block.soundGlassFootstep)
                                .setLightValue(1.0F).setUnlocalizedName("Glow_Cobble")
                                .setCreativeTab(PolyBlockz.tabPolyBlockzDekoration);
                GameRegistry.registerBlock(Glow_Cobble, "Glow Cobble");
                LanguageRegistry.addName(Glow_Cobble, "Glow Cobble");
        /* --- * --- */
                Glow_Sandstone = new Glow_Sandstone(ID_Helper.Glow_SandstoneID,
                                Material.glass).setHardness(0.3F)
                                .setStepSound(Block.soundGlassFootstep).setLightValue(1.0F)
                                .setUnlocalizedName("Glow_Sandstone")
                                .setCreativeTab(PolyBlockz.tabPolyBlockzDekoration);
                GameRegistry.registerBlock(Glow_Sandstone, "Glow Sandstone");
                LanguageRegistry.addName(Glow_Sandstone, "Glow Sandstone");
        /* --- * --- */
                Glow_Brickstone = new Glow_Brickstone(ID_Helper.Glow_BrickstoneID,
                                Material.glass).setHardness(0.3F)
                                .setStepSound(Block.soundGlassFootstep).setLightValue(1.0F)
                                .setUnlocalizedName("Glow_Brickstone")
                                .setCreativeTab(PolyBlockz.tabPolyBlockzDekoration);
                GameRegistry.registerBlock(Glow_Brickstone, "Glow Brickstone");
                LanguageRegistry.addName(Glow_Brickstone, "Glow Brickstone");
        /* --- * --- */
                Glow_Brickstonemossy = new Glow_Brickstonemossy(
                                ID_Helper.Glow_BrickstonemossyID, Material.glass)
                                .setHardness(0.3F).setStepSound(Block.soundGlassFootstep)
                                .setLightValue(1.0F).setUnlocalizedName("Glow_Brickstonemossy")
                                .setCreativeTab(PolyBlockz.tabPolyBlockzDekoration);
                GameRegistry.registerBlock(Glow_Brickstonemossy, "Glow Brickstonemossy");
                LanguageRegistry.addName(Glow_Brickstonemossy, "Glow Brickstonemossy");
        /* --- * --- */
                Glow_Cobblemossy = new Glow_Cobblemossy(ID_Helper.Glow_CobblemossyID,
                                Material.glass).setHardness(0.3F)
                                .setStepSound(Block.soundGlassFootstep).setLightValue(1.0F)
                                .setUnlocalizedName("Glow_Cobblemossy")
                                .setCreativeTab(PolyBlockz.tabPolyBlockzDekoration);
                GameRegistry.registerBlock(Glow_Cobblemossy, "Glow Cobblemossy");
                LanguageRegistry.addName(Glow_Cobblemossy, "Glow Cobblemossy");
        /* --- * --- */
                Glow_Quartz = new Glow_Quartz(ID_Helper.Glow_QuartzID, Material.glass)
                                .setHardness(0.3F).setStepSound(Block.soundGlassFootstep)
                                .setLightValue(1.0F).setUnlocalizedName("Glow_Quartz")
                                .setCreativeTab(PolyBlockz.tabPolyBlockzDekoration);
                GameRegistry.registerBlock(Glow_Quartz, "Glow Quartz");
                LanguageRegistry.addName(Glow_Quartz, "Glow Quartz");
        /* --- * --- */
                Glow_Oak = new Glow_Oak(ID_Helper.Glow_OakID, Material.glass)
                                .setHardness(0.3F).setStepSound(Block.soundGlassFootstep)
                                .setLightValue(1.0F).setUnlocalizedName("Glow_Oak")
                                .setCreativeTab(PolyBlockz.tabPolyBlockzDekoration);
                GameRegistry.registerBlock(Glow_Oak, "Glow Oak");
                LanguageRegistry.addName(Glow_Oak, "Glow Oak");
        /* --- * --- */
                Glow_Birch = new Glow_Birch(ID_Helper.Glow_BirchID, Material.glass)
                                .setHardness(0.3F).setStepSound(Block.soundGlassFootstep)
                                .setLightValue(1.0F).setUnlocalizedName("Glow_Birch")
                                .setCreativeTab(PolyBlockz.tabPolyBlockzDekoration);
                GameRegistry.registerBlock(Glow_Birch, "Glow Birch");
                LanguageRegistry.addName(Glow_Birch, "Glow Birch");
        /* --- * --- */
                Glow_Jungle = new Glow_Jungle(ID_Helper.Glow_JungleID, Material.glass)
                                .setHardness(0.3F).setStepSound(Block.soundGlassFootstep)
                                .setLightValue(1.0F).setUnlocalizedName("Glow_Jungle")
                                .setCreativeTab(PolyBlockz.tabPolyBlockzDekoration);
                GameRegistry.registerBlock(Glow_Jungle, "Glow Jungle");
                LanguageRegistry.addName(Glow_Jungle, "Glow Jungle");
        /* --- * --- */
                Glow_Spruce = new Glow_Spruce(ID_Helper.Glow_SpruceID, Material.glass)
                                .setHardness(0.3F).setStepSound(Block.soundGlassFootstep)
                                .setLightValue(1.0F).setUnlocalizedName("Glow_Spruce")
                                .setCreativeTab(PolyBlockz.tabPolyBlockzDekoration);
                GameRegistry.registerBlock(Glow_Spruce, "Glow Spruce");
                LanguageRegistry.addName(Glow_Spruce, "Glow Spruce");
        /* --- * --- */
                Glow_Headstone = new Glow_Headstone(ID_Helper.Glow_HeadstoneID,
                                Material.glass).setHardness(0.3F)
                                .setStepSound(Block.soundGlassFootstep).setLightValue(1.0F)
                                .setUnlocalizedName("Glow_Headstone")
                                .setCreativeTab(PolyBlockz.tabPolyBlockzDekoration);
                GameRegistry.registerBlock(Glow_Headstone, "Glow Headstone");
                LanguageRegistry.addName(Glow_Headstone, "Glow Headstone");
        /* --- * --- */
                Glow_Dirtbrick = new Glow_Dirtbrick(ID_Helper.Glow_DirtbrickID,
                                Material.glass).setHardness(0.3F)
                                .setStepSound(Block.soundGlassFootstep).setLightValue(1.0F)
                                .setUnlocalizedName("Glow_Dirtbrick")
                                .setCreativeTab(PolyBlockz.tabPolyBlockzDekoration);
                GameRegistry.registerBlock(Glow_Dirtbrick, "Glow Dirtbrick");
                LanguageRegistry.addName(Glow_Dirtbrick, "Glow Dirtbrick");
        /* --- * --- */
                Glow_Dirtbrick_fine = new Glow_Dirtbrick_fine(
                                ID_Helper.Glow_Dirtbrick_fineID, Material.glass)
                                .setHardness(0.3F).setStepSound(Block.soundGlassFootstep)
                                .setLightValue(1.0F).setUnlocalizedName("Glow_Dirtbrick_fine")
                                .setCreativeTab(PolyBlockz.tabPolyBlockzDekoration);
                GameRegistry.registerBlock(Glow_Dirtbrick_fine, "Glow Dirtbrick fine");
                LanguageRegistry.addName(Glow_Dirtbrick_fine, "Glow Dirtbrick fine");
        /* --- * --- */
                Glow_Blackplank = new Glow_Blackplank(ID_Helper.Glow_BlackplankID,
                                Material.glass).setHardness(0.3F)
                                .setStepSound(Block.soundGlassFootstep).setLightValue(1.0F)
                                .setUnlocalizedName("Glow_Blackplank")
                                .setCreativeTab(PolyBlockz.tabPolyBlockzDekoration);
                GameRegistry.registerBlock(Glow_Blackplank, "Glow Blackplank");
                LanguageRegistry.addName(Glow_Blackplank, "Glow Blackplank");
        /* --- * --- */
                Glow_Greenplank = new Glow_Greenplank(ID_Helper.Glow_GreenplankID,
                                Material.glass).setHardness(0.3F)
                                .setStepSound(Block.soundGlassFootstep).setLightValue(1.0F)
                                .setUnlocalizedName("Glow_Greenplank")
                                .setCreativeTab(PolyBlockz.tabPolyBlockzDekoration);
                GameRegistry.registerBlock(Glow_Greenplank, "Glow Greenplank");
                LanguageRegistry.addName(Glow_Greenplank, "Glow Greenplank");
        /* --- * --- */
                Glow_Brickstone_black = new Glow_Brickstone_black(
                                ID_Helper.Glow_Brickstone_blackID, Material.glass)
                                .setHardness(0.3F).setStepSound(Block.soundGlassFootstep)
                                .setLightValue(1.0F)
                                .setUnlocalizedName("Glow_Brickstone_black")
                                .setCreativeTab(PolyBlockz.tabPolyBlockzDekoration);
                GameRegistry.registerBlock(Glow_Brickstone_black,"Glow Brickstone black");
                LanguageRegistry.addName(Glow_Brickstone_black, "Glow Brickstone black");
        /* --- * --- */
                Glow_Brickstone_white = new Glow_Brickstone_white(
                                ID_Helper.Glow_Brickstone_whiteID, Material.glass)
                                .setHardness(0.3F).setStepSound(Block.soundGlassFootstep)
                                .setLightValue(1.0F)
                                .setUnlocalizedName("Glow_Brickstone_white")
                                .setCreativeTab(PolyBlockz.tabPolyBlockzDekoration);
                GameRegistry.registerBlock(Glow_Brickstone_white,"Glow Brickstone white");
                LanguageRegistry.addName(Glow_Brickstone_white, "Glow Brickstone white");
        /* --- * --- */
                Glow_Sewerage = new Glow_Sewerage(ID_Helper.Glow_SewerageID,
                                Material.glass).setHardness(0.3F)
                                .setStepSound(Block.soundGlassFootstep).setLightValue(0.65F)
                                .setUnlocalizedName("Glow_Sewerage")
                                .setCreativeTab(PolyBlockz.tabPolyBlockzDekoration);
                GameRegistry.registerBlock(Glow_Sewerage, "Glow Sewerage");
                LanguageRegistry.addName(Glow_Sewerage, "Glow Sewerage");
        /* --- * --- */
                Glow_Stoneplate_blue = new Glow_Stoneplate_blue(
                                ID_Helper.Glow_Stoneplate_blueID, Material.glass)
                                .setHardness(0.3F).setStepSound(Block.soundGlassFootstep)
                                .setLightValue(1.0F).setUnlocalizedName("Glow_Stoneplate_blue")
                                .setCreativeTab(PolyBlockz.tabPolyBlockzDekoration);
                GameRegistry.registerBlock(Glow_Stoneplate_blue, "Glow Stoneplate blue");
                LanguageRegistry.addName(Glow_Stoneplate_blue, "Glow Stoneplate blue");
        /* --- * --- */
                Glow_Stoneplate_darkred = new Glow_Stoneplate_darkred(
                                ID_Helper.Glow_Stoneplate_darkredID, Material.glass)
                                .setHardness(0.3F).setStepSound(Block.soundGlassFootstep)
                                .setLightValue(1.0F)
                                .setUnlocalizedName("Glow_Stoneplate_darkred")
                                .setCreativeTab(PolyBlockz.tabPolyBlockzDekoration);
                GameRegistry.registerBlock(Glow_Stoneplate_darkred,"Glow Stoneplate darkred");
                LanguageRegistry.addName(Glow_Stoneplate_darkred,"Glow Stoneplate darkred");
        /* --- * --- */
                Glow_Stoneplate_red = new Glow_Stoneplate_red(
                                ID_Helper.Glow_Stoneplate_redID, Material.glass)
                                .setHardness(0.3F).setStepSound(Block.soundGlassFootstep)
                                .setLightValue(1.0F).setUnlocalizedName("Glow_Stoneplate_red")
                                .setCreativeTab(PolyBlockz.tabPolyBlockzDekoration);
                GameRegistry.registerBlock(Glow_Stoneplate_red, "Glow Stoneplate red");
                LanguageRegistry.addName(Glow_Stoneplate_red, "Glow Stoneplate red");

                /*
                 * Teppen
                 */

                HeadStoneStair = new Stair_Headstone(ID_Helper.HeadStoneStairID,
                                Block_Helper.Headstone, 0).setUnlocalizedName("HeadStoneStair")
                                .setCreativeTab(PolyBlockz.tabPolyBlockzBlocks);
                GameRegistry.registerBlock(HeadStoneStair, "HeadStone Stair");
                LanguageRegistry.addName(HeadStoneStair, "HeadStoneStair");
        /* --- * --- */
                DirtwallStair = new Stair_Dirtwall(ID_Helper.DirtwallStairID,
                                Block_Helper.Dirtwall, 0).setUnlocalizedName("DirtwallStair")
                                .setCreativeTab(PolyBlockz.tabPolyBlockzBlocks);
                GameRegistry.registerBlock(DirtwallStair, "DirtwallStair");
                LanguageRegistry.addName(DirtwallStair, "DirtwallStair");
        /* --- * --- */
                DirtbrickStair = new Stair_Dirtbrick(ID_Helper.DirtbrickStairID,
                                Block_Helper.Dirtbrick, 0).setUnlocalizedName("DirtbrickStair")
                                .setCreativeTab(PolyBlockz.tabPolyBlockzBlocks);
                GameRegistry.registerBlock(DirtbrickStair, "DirtbrickStair");
                LanguageRegistry.addName(DirtbrickStair, "DirtbrickStair");
        /* --- * --- */
                DirtbrickfineStair = new Stair_Dirtbrickfine(
                                ID_Helper.DirtbrickfineStairID, Block_Helper.Dirtbrickfine, 0)
                                .setUnlocalizedName("DirtbrickfineStair").setCreativeTab(
                                                PolyBlockz.tabPolyBlockzBlocks);
                GameRegistry.registerBlock(DirtbrickfineStair, "DirtbrickfineStair");
                LanguageRegistry.addName(DirtbrickfineStair, "DirtbrickfineStair");
        /* --- * --- */
                RoofStair = new Stair_Roof(ID_Helper.RoofStairID, Block_Helper.Roof, 0)
                                .setUnlocalizedName("RoofStair").setCreativeTab(
                                                PolyBlockz.tabPolyBlockzBlocks);
                GameRegistry.registerBlock(RoofStair, "RoofStair");
                LanguageRegistry.addName(RoofStair, "RoofStair");
        /* --- * --- */
                ReetStair = new Stair_Reet(ID_Helper.ReetStairID, Block_Helper.Reet, 0)
                                .setUnlocalizedName("ReetStair").setCreativeTab(
                                                PolyBlockz.tabPolyBlockzBlocks);
                GameRegistry.registerBlock(ReetStair, "ReetStair");
                LanguageRegistry.addName(ReetStair, "ReetStair");
        /* --- * --- */
                oakParquetStair = new Stair_OakParquet(ID_Helper.oakParquetStairID,
                                Block_Helper.OakParquet, 0).setUnlocalizedName(
                                "oakParquetStair").setCreativeTab(
                                PolyBlockz.tabPolyBlockzBlocks);
                GameRegistry.registerBlock(oakParquetStair, "WoodoakStair");
                LanguageRegistry.addName(oakParquetStair, "oakParquetStair");
        /* --- * --- */
                birchParquetStair = new Stair_BirchParquet(
                                ID_Helper.birchParquetStairID, Block_Helper.BirchParquet, 0)
                                .setUnlocalizedName("birchParquetStair").setCreativeTab(
                                                PolyBlockz.tabPolyBlockzBlocks);
                GameRegistry.registerBlock(birchParquetStair, "WoodbirchStair Stair");
                LanguageRegistry.addName(birchParquetStair, "birchParquetStair");
        /* --- * --- */
                jungleParquetStair = new Stair_JungleParquet(
                                ID_Helper.jungleParquetStairID, Block_Helper.JungelParquet, 0)
                                .setUnlocalizedName("jungleParquetStair").setCreativeTab(
                                                PolyBlockz.tabPolyBlockzBlocks);
                GameRegistry.registerBlock(jungleParquetStair, "WoodjungleStair");
                LanguageRegistry.addName(jungleParquetStair, "jungleParquetStair");
        /* --- * --- */
                spruceParquetStair = new Stair_SpruceParquet(ID_Helper.spruceParquetStairID, Block_Helper.SpruceParquet, 0)
                                .setUnlocalizedName("spruceParquetStair")
                                .setCreativeTab(PolyBlockz.tabPolyBlockzBlocks);
                GameRegistry.registerBlock(spruceParquetStair, "WoodspruceStair");
                LanguageRegistry.addName(spruceParquetStair, "spruceParquetStair");
        /* --- * --- */
                greenPlankStair = new Stair_GreenPlank(ID_Helper.greenPlankStairID,
                                Block_Helper.greenPlanks, 0).setUnlocalizedName(
                                "greenPlankStair").setCreativeTab(
                                PolyBlockz.tabPolyBlockzBlocks);
                GameRegistry.registerBlock(greenPlankStair, "WoodgreenStair");
                LanguageRegistry.addName(greenPlankStair, "greenPlankStair");
        /* --- * --- */
                fadedWereckwoodStair = new Stair_FadedWereck(
                                ID_Helper.fadedWereckwoodStairID, Block_Helper.fadedWreck, 0)
                                .setUnlocalizedName("fadedWereckwoodStair")
                                .setCreativeTab(PolyBlockz.tabPolyBlockzBlocks);
                GameRegistry.registerBlock(fadedWereckwoodStair, "fadedWereckwoodStair");
                LanguageRegistry.addName(fadedWereckwoodStair, "fadedWereckwoodStair");
        /* --- * --- */
                coloredWereckwoodStair = new Stair_ColoredWereck(
                                ID_Helper.coloredWereckwoodStairID, Block_Helper.coloredWreck,
                                0).setUnlocalizedName("coloredWereckwoodStair").setCreativeTab(
                                PolyBlockz.tabPolyBlockzBlocks);
                GameRegistry.registerBlock(coloredWereckwoodStair, "coloredWereckwoodStair");
                LanguageRegistry.addName(coloredWereckwoodStair, "coloredWereckwoodStair");
        /* --- * --- */
                CorrugatedSheetdarkStair = new Stair_CorrugatedSheetdark(
                                ID_Helper.CorrugatedSheetdarkStairID,
                                Block_Helper.CorrugatedSheetdark, 0).setUnlocalizedName(
                                "darkCorrugatedSheetStair").setCreativeTab(
                                PolyBlockz.tabPolyBlockzBlocks);
                GameRegistry.registerBlock(CorrugatedSheetdarkStair,
                                "CorrugatedSheetdarkStair Stair");
                LanguageRegistry.addName(CorrugatedSheetdarkStair,
                                "CorrugatedSheetdarkStair");
        /* --- * --- */
                CorrugatedSheetlightStair = new Stair_CorrugatedSheetlight(
                                ID_Helper.CorrugatedSheetlightStairID,
                                Block_Helper.CorrugatedSheetlight, 0).setUnlocalizedName(
                                "lightCorrugatedSheetStair").setCreativeTab(
                                PolyBlockz.tabPolyBlockzBlocks);
                GameRegistry.registerBlock(CorrugatedSheetlightStair,
                                "CorrugatedSheetlightStair");
                LanguageRegistry.addName(CorrugatedSheetlightStair,
                                "CorrugatedSheetlightStair");
        /* --- * --- */
                BrickMossyStair = new Stair_BrickMossy(ID_Helper.BrickMossyStairID,
                                Block.stoneBrick, 1).setUnlocalizedName("mossyBrickstoneStair")
                                .setCreativeTab(PolyBlockz.tabPolyBlockzBlocks);
                GameRegistry.registerBlock(BrickMossyStair, "BrickMossyStair");
                LanguageRegistry.addName(BrickMossyStair, "BrickMossyStair");
        /* --- * --- */
                MossyStair = new Stair_CobbleMossy(ID_Helper.MossyStairID,
                                Block.cobblestoneMossy, 0).setUnlocalizedName(
                                "mossyCobblestoneStair").setCreativeTab(
                                PolyBlockz.tabPolyBlockzBlocks);
                GameRegistry.registerBlock(MossyStair, "MossyStair");
                LanguageRegistry.addName(MossyStair, "MossyStair");
        /* --- * --- */
                cleanstoneStair = new Stair_Cleanstone(ID_Helper.cleanstoneStairID,
                                Block.stone, 0).setUnlocalizedName("CleanstoneStair")
                                .setCreativeTab(PolyBlockz.tabPolyBlockzBlocks);
                GameRegistry.registerBlock(cleanstoneStair, "cleanstoneStair");
                LanguageRegistry.addName(cleanstoneStair, "cleanstoneStair");
        /* --- * --- */
                dirtStair = new Stair_Dirt(ID_Helper.dirtStairID, Block.dirt, 0)
                                .setUnlocalizedName("DirtStair").setCreativeTab(
                                                PolyBlockz.tabPolyBlockzBlocks);
                GameRegistry.registerBlock(dirtStair, "dirtStair");
                LanguageRegistry.addName(dirtStair, "dirtStair");
        /* --- * --- */
                sandStair = new Stair_Sand(ID_Helper.sandStairID, Block.sand, 0)
                                .setUnlocalizedName("SandStair").setCreativeTab(
                                                PolyBlockz.tabPolyBlockzBlocks);
                GameRegistry.registerBlock(sandStair, "sandStair");
                LanguageRegistry.addName(sandStair, "sandStair");
        /* --- * --- */
                gravelStair = new Stair_Gravel(ID_Helper.gravelStairID, Block.gravel, 0)
                                .setUnlocalizedName("GravelStair").setCreativeTab(
                                                PolyBlockz.tabPolyBlockzBlocks);
                GameRegistry.registerBlock(gravelStair, "gravelStair");
                LanguageRegistry.addName(gravelStair, "gravelStair");
        /* --- * --- */
                glassStair = new Stair_Glass(ID_Helper.glassStairID, Block.glass, 0)
                                .setUnlocalizedName("GlassStair").setCreativeTab(
                                                PolyBlockz.tabPolyBlockzBlocks);
                GameRegistry.registerBlock(glassStair, "glassStair");
                LanguageRegistry.addName(glassStair, "glassStair");
        /* --- * --- */
                blockSnowStair = new Stair_BlockSnow(ID_Helper.blockSnowStairID,
                                Block.blockSnow, 0).setUnlocalizedName("SnowStair")
                                .setCreativeTab(PolyBlockz.tabPolyBlockzBlocks);
                GameRegistry.registerBlock(blockSnowStair, "blockSnowStair");
                LanguageRegistry.addName(blockSnowStair, "blockSnowStair");
        /* --- * --- */
                iceStair = new Stair_Ice(ID_Helper.iceStairID, Block.ice, 0)
                                .setUnlocalizedName("IceStair").setCreativeTab(
                                                PolyBlockz.tabPolyBlockzBlocks);
                GameRegistry.registerBlock(iceStair, "iceStair");
                LanguageRegistry.addName(iceStair, "iceStair");
        /* --- * --- */
                blockSteelStair = new Stair_BlockSteel(ID_Helper.blockSteelStairID,
                                Block.blockIron, 0).setUnlocalizedName("SteelStair")
                                .setCreativeTab(PolyBlockz.tabPolyBlockzBlocks);
                GameRegistry.registerBlock(blockSteelStair, "blockSteelStair");
                LanguageRegistry.addName(blockSteelStair, "blockSteelStair");
        /* --- * --- */
                blockGoldStair = new Stair_BlockGold(ID_Helper.blockGoldStairID,
                                Block.blockGold, 0).setUnlocalizedName("GoldStair")
                                .setCreativeTab(PolyBlockz.tabPolyBlockzBlocks);
                GameRegistry.registerBlock(blockGoldStair, "blockGoldStair");
                LanguageRegistry.addName(blockGoldStair, "blockGoldStair");
        /* --- * --- */
                blockRedstoneStair = new Stair_BlockRedstone(
                                ID_Helper.blockRedstoneStairID, Block.blockRedstone, 0)
                                .setUnlocalizedName("RedstoneStair").setCreativeTab(
                                                PolyBlockz.tabPolyBlockzBlocks);
                GameRegistry.registerBlock(blockRedstoneStair, "blockRedstoneStair");
                LanguageRegistry.addName(blockRedstoneStair, "blockRedstoneStair");
        /* --- * --- */
                blockDiamondStair = new Stair_BlockDiamond(
                                ID_Helper.blockDiamondStairID, Block.blockDiamond, 0)
                                .setUnlocalizedName("DiamondStair").setCreativeTab(
                                                PolyBlockz.tabPolyBlockzBlocks);
                GameRegistry.registerBlock(blockDiamondStair, "blockDiamondStair");
                LanguageRegistry.addName(blockDiamondStair, "blockDiamondStair");
        /* --- * --- */
                blockEmeraldStair = new Stair_BlockEmerald(
                                ID_Helper.blockEmeraldStairID, Block.blockEmerald, 0)
                                .setUnlocalizedName("EmeraldStair").setCreativeTab(
                                                PolyBlockz.tabPolyBlockzBlocks);
                GameRegistry.registerBlock(blockEmeraldStair, "blockEmeraldStair");
                LanguageRegistry.addName(blockEmeraldStair, "blockEmeraldStair");
        /* --- * --- */
                obsidianStair = new Stair_Obsidian(ID_Helper.obsidianStairID,
                                Block.obsidian, 0).setUnlocalizedName("ObsidianStair")
                                .setCreativeTab(PolyBlockz.tabPolyBlockzBlocks);
                GameRegistry.registerBlock(obsidianStair, "obsidianStair");
                LanguageRegistry.addName(obsidianStair, "obsidianStair");
        /* --- * --- */
                Sewerage_stoneStair = new Sewerage_stoneStair(
                                ID_Helper.Sewerage_stoneStairID, Block_Helper.Sewerage_stone, 0)
                                .setUnlocalizedName("Sewerage_stoneStair").setCreativeTab(
                                                PolyBlockz.tabPolyBlockzBlocks);
                GameRegistry.registerBlock(Sewerage_stoneStair, "Seweragestone Stair");
                LanguageRegistry.addName(Sewerage_stoneStair, "Seweragestone Stair");
        /* --- * --- */
                Brickstone_blackStair = new Brickstone_blackStair(
                                ID_Helper.Brickstone_blackStairID,
                                Block_Helper.Brickstone_black, 0).setUnlocalizedName(
                                "Brickstone_blackStair").setCreativeTab(
                                PolyBlockz.tabPolyBlockzBlocks);
                GameRegistry.registerBlock(Brickstone_blackStair,
                                "Brickstone black Stair");
                LanguageRegistry.addName(Brickstone_blackStair,
                                "Brickstone black Stair");
        /* --- * --- */
                Brickstone_whiteStair = new Brickstone_whiteStair(
                                ID_Helper.Brickstone_whiteStairID,
                                Block_Helper.Brickstone_white, 0).setUnlocalizedName(
                                "Brickstone_whiteStair").setCreativeTab(
                                PolyBlockz.tabPolyBlockzBlocks);
                GameRegistry.registerBlock(Brickstone_whiteStair,
                                "Brickstone white Stair");
                LanguageRegistry.addName(Brickstone_whiteStair,
                                "Brickstone white Stair");

                /*
                 * Redstone - Lampen
                 */

                blokklampIdlebrick = (new RedLamp_Brick(ID_Helper.blokklampIdlebrickID,
                                false)).setHardness(0.3F).setUnlocalizedName("brickLight")
                                .setCreativeTab(PolyBlockz.tabPolyBlockzDekoration);
                GameRegistry.registerBlock(blokklampIdlebrick, "blokklampIdlebrick");
                LanguageRegistry.addName(blokklampIdlebrick, "brickLight");
                blokklampActivebrick = (new RedLamp_Brick(
                                ID_Helper.blokklampActivebrickID, true)).setHardness(0.3F)
                                .setUnlocalizedName("brickLight");
        /* --- * --- */
                blokklampIdledirtbrickfine = (new RedLamp_Dirtbrickfine(
                                ID_Helper.blokklampIdledirtbrickfineID, false))
                                .setHardness(0.3F).setUnlocalizedName("dirtbrickfindeLight")
                                .setCreativeTab(PolyBlockz.tabPolyBlockzDekoration);
                GameRegistry.registerBlock(blokklampIdledirtbrickfine,
                                "blokklampIdledirtbrickfine");
                LanguageRegistry.addName(blokklampIdledirtbrickfine,
                                "dirtbrickfindeLight");
                blokklampActivedirtbrickfine = (new RedLamp_Dirtbrickfine(
                                ID_Helper.blokklampActivedirtbrickfineID, true)).setHardness(
                                0.3F).setUnlocalizedName("dirtbrickfindeLight");
        /* --- * --- */
                blokklampIdlenetherBrick = (new RedLamp_Netherbrick(
                                ID_Helper.blokklampIdlenetherBrickID, false)).setHardness(0.3F)
                                .setUnlocalizedName("netherbrickLight")
                                .setCreativeTab(PolyBlockz.tabPolyBlockzDekoration);
                GameRegistry.registerBlock(blokklampIdlenetherBrick,
                                "blokklampIdlenetherBrick");
                LanguageRegistry.addName(blokklampIdlenetherBrick, "netherbrickLight");
                blokklampActivenetherBrick = (new RedLamp_Netherbrick(
                                ID_Helper.blokklampActivenetherBrickID, true))
                                .setHardness(0.3F).setUnlocalizedName("netherbrickLight");
        /* --- * --- */
                blokklampIdlequartzblock = (new RedLamp_Quartz(
                                ID_Helper.blokklampIdlequartzblockID, false)).setHardness(0.3F)
                                .setUnlocalizedName("quartzLigth")
                                .setCreativeTab(PolyBlockz.tabPolyBlockzDekoration);
                GameRegistry.registerBlock(blokklampIdlequartzblock,
                                "blokklampIdlequartzblock");
                LanguageRegistry.addName(blokklampIdlequartzblock, "quartzLight");
                blokklampActivequartzblock = (new RedLamp_Quartz(
                                ID_Helper.blokklampActivequartzblockID, true))
                                .setHardness(0.3F).setUnlocalizedName("quartzLight");
        /* --- * --- */
                blokklampIdlesandstone = (new RedLamp_Sandstone(
                                ID_Helper.blokklampIdlesandstoneID, false)).setHardness(0.3F)
                                .setUnlocalizedName("sandstoneLight")
                                .setCreativeTab(PolyBlockz.tabPolyBlockzDekoration);
                GameRegistry.registerBlock(blokklampIdlesandstone,
                                "blokklampIdlesandstone");
                LanguageRegistry.addName(blokklampIdlesandstone, "sandstoneLight");
                blokklampActivesandstone = (new RedLamp_Sandstone(
                                ID_Helper.blokklampActivesandstoneID, true)).setHardness(0.3F)
                                .setUnlocalizedName("sandstoneLight");
        /* --- * --- */
                blokklampIdlestone = (new RedLamp_Cleanstone(
                                ID_Helper.blokklampIdlestoneID, false)).setHardness(0.3F)
                                .setUnlocalizedName("cleanstoneLight")
                                .setCreativeTab(PolyBlockz.tabPolyBlockzDekoration);
                GameRegistry.registerBlock(blokklampIdlestone, "blokklampIdlestone");
                LanguageRegistry.addName(blokklampIdlestone, "cleanstoneLight");
                blokklampActivestone = (new RedLamp_Cleanstone(
                                ID_Helper.blokklampActivestoneID, true)).setHardness(0.3F)
                                .setUnlocalizedName("cleanstoneLight");
        /* --- * --- */
                blokklampIdlestonebrick = (new RedLamp_Cobble(
                                ID_Helper.blokklampIdlestonebrickID, false)).setHardness(0.3F)
                                .setUnlocalizedName("cobblestoneLight")
                                .setCreativeTab(PolyBlockz.tabPolyBlockzDekoration);
                GameRegistry.registerBlock(blokklampIdlestonebrick,
                                "blokklampIdlestonebrick");
                LanguageRegistry.addName(blokklampIdlestonebrick, "cobblestoneLight");
                blokklampActivestonebrick = (new RedLamp_Cobble(
                                ID_Helper.blokklampActivestonebrickID, true)).setHardness(0.3F)
                                .setUnlocalizedName("cobblestoneLight");
        /* --- * --- */
                blokklampIdlestonebricksmooth = (new RedLamp_Stonebrick(
                                ID_Helper.blokklampIdlestonebricksmoothID, false))
                                .setHardness(0.3F).setUnlocalizedName("stonebricksLigth")
                                .setCreativeTab(PolyBlockz.tabPolyBlockzDekoration);
                GameRegistry.registerBlock(blokklampIdlestonebricksmooth,
                                "blokklampIdlestonebricksmooth");
                LanguageRegistry.addName(blokklampIdlestonebricksmooth,
                                "stonebricksLigth");
                blokklampActivestonebricksmooth = (new RedLamp_Stonebrick(
                                ID_Helper.blokklampActivestonebricksmoothID, true))
                                .setHardness(0.3F).setUnlocalizedName("stonebricksLight");
        /* --- * --- */
                blokklampIdlestonebricksmooth_mossy = (new RedLamp_StonebrickMossy(
                                ID_Helper.blokklampIdlestonebricksmooth_mossyID, false))
                                .setHardness(0.3F).setUnlocalizedName("brickmossLight")
                                .setCreativeTab(PolyBlockz.tabPolyBlockzDekoration);
                GameRegistry.registerBlock(blokklampIdlestonebricksmooth_mossy,
                                "blokklampIdlestonebricksmooth_mossy");
                LanguageRegistry.addName(blokklampIdlestonebricksmooth_mossy,
                                "brickmossLight");
                blokklampActivestonebricksmooth_mossy = (new RedLamp_StonebrickMossy(
                                ID_Helper.blokklampActivestonebricksmooth_mossyID, true))
                                .setHardness(0.3F).setUnlocalizedName("brickmossLight");
        /* --- * --- */
                blokklampIdlestoneMoss = (new RedLamp_CobbleMosyy(
                                ID_Helper.blokklampIdlestoneMossID, false)).setHardness(0.3F)
                                .setUnlocalizedName("cobblmossLight")
                                .setCreativeTab(PolyBlockz.tabPolyBlockzDekoration);
                GameRegistry.registerBlock(blokklampIdlestoneMoss,
                                "blokklampIdlestoneMoss");
                LanguageRegistry.addName(blokklampIdlestoneMoss, "cobblmossLight");
                blokklampActivestoneMoss = (new RedLamp_CobbleMosyy(
                                ID_Helper.blokklampActivestoneMossID, true)).setHardness(0.3F)
                                .setUnlocalizedName("cobblmossLight");
        /* --- * --- */
                blokklampIdlewood = (new RedLamp_Oakplank(
                                ID_Helper.blokklampIdlewoodID, false)).setHardness(0.3F)
                                .setUnlocalizedName("oakLight")
                                .setCreativeTab(PolyBlockz.tabPolyBlockzDekoration);
                GameRegistry.registerBlock(blokklampIdlewood, "blokklampIdlewood");
                LanguageRegistry.addName(blokklampIdlewood, "oakLight");
                blokklampActivewood = (new RedLamp_Oakplank(
                                ID_Helper.blokklampActivewoodID, true)).setHardness(0.3F)
                                .setUnlocalizedName("oakLight");
        /* --- * --- */
                blokklampIdlewood_birch = (new RedLamp_Birchplank(
                                ID_Helper.blokklampIdlewood_birchID, false)).setHardness(0.3F)
                                .setUnlocalizedName("birchLight")
                                .setCreativeTab(PolyBlockz.tabPolyBlockzDekoration);
                GameRegistry.registerBlock(blokklampIdlewood_birch,
                                "blokklampIdlewood_birch");
                LanguageRegistry.addName(blokklampIdlewood_birch, "birchLight");
                blokklampActivewood_birch = (new RedLamp_Birchplank(
                                ID_Helper.blokklampActivewood_birchID, true)).setHardness(0.3F)
                                .setUnlocalizedName("birchLight");
        /* --- * --- */
                blokklampIdlewood_jungle = (new RedLamp_Jungleplank(
                                ID_Helper.blokklampIdlewood_jungleID, false)).setHardness(0.3F)
                                .setUnlocalizedName("jungleLight")
                                .setCreativeTab(PolyBlockz.tabPolyBlockzDekoration);
                GameRegistry.registerBlock(blokklampIdlewood_jungle,
                                "blokklampIdlewood_jungle");
                LanguageRegistry.addName(blokklampIdlewood_jungle, "jungleLight");
                blokklampActivewood_jungle = (new RedLamp_Jungleplank(
                                ID_Helper.blokklampActivewood_jungleID, true))
                                .setHardness(0.3F).setUnlocalizedName("jungleLight");
        /* --- * --- */
                blokklampIdlewood_spruce = (new RedLamp_Srpuceplank(
                                ID_Helper.blokklampIdlewood_spruceID, false)).setHardness(0.3F)
                                .setUnlocalizedName("spruceLight")
                                .setCreativeTab(PolyBlockz.tabPolyBlockzDekoration);
                GameRegistry.registerBlock(blokklampIdlewood_spruce,
                                "blokklampIdlewood_spruce");
                LanguageRegistry.addName(blokklampIdlewood_spruce, "spruceLight");
                blokklampActivewood_spruce = (new RedLamp_Srpuceplank(
                                ID_Helper.blokklampActivewood_spruceID, true))
                                .setHardness(0.3F).setUnlocalizedName("spruceLight");
        /* --- * --- */
                blokklampIdlewoodblack = (new RedLamp_Blackwood(
                                ID_Helper.blokklampIdlewoodblackID, false)).setHardness(0.3F)
                                .setUnlocalizedName("blackwoodLight")
                                .setCreativeTab(PolyBlockz.tabPolyBlockzDekoration);
                GameRegistry.registerBlock(blokklampIdlewoodblack,
                                "blokklampIdlewoodblack");
                LanguageRegistry.addName(blokklampIdlewoodblack, "blackwoodLight");
                blokklampActivewoodblack = (new RedLamp_Blackwood(
                                ID_Helper.blokklampActivewoodblackID, true)).setHardness(0.3F)
                                .setUnlocalizedName("blackwoodLight");

	}

}