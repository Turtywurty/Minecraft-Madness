package com.turtywurty.minecraftmadness.init;

import java.util.ArrayList;
import java.util.List;

import com.turtywurty.minecraftmadness.MinecraftMadness;
import com.turtywurty.minecraftmadness.objects.blocks.BlockBase;
import com.turtywurty.minecraftmadness.objects.blocks.flags.BlackFlag;
import com.turtywurty.minecraftmadness.objects.blocks.flags.BlueFlag;
import com.turtywurty.minecraftmadness.objects.blocks.flags.BrownFlag;
import com.turtywurty.minecraftmadness.objects.blocks.flags.CyanFlag;
import com.turtywurty.minecraftmadness.objects.blocks.flags.GreenFlag;
import com.turtywurty.minecraftmadness.objects.blocks.flags.GreyFlag;
import com.turtywurty.minecraftmadness.objects.blocks.flags.LightBlueFlag;
import com.turtywurty.minecraftmadness.objects.blocks.flags.LightGreyFlag;
import com.turtywurty.minecraftmadness.objects.blocks.flags.LimeGreenFlag;
import com.turtywurty.minecraftmadness.objects.blocks.flags.MagentaFlag;
import com.turtywurty.minecraftmadness.objects.blocks.flags.OrangeFlag;
import com.turtywurty.minecraftmadness.objects.blocks.flags.PinkFlag;
import com.turtywurty.minecraftmadness.objects.blocks.flags.PurpleFlag;
import com.turtywurty.minecraftmadness.objects.blocks.flags.RedFlag;
import com.turtywurty.minecraftmadness.objects.blocks.flags.WhiteFlag;
import com.turtywurty.minecraftmadness.objects.blocks.flags.YellowFlag;
import com.turtywurty.minecraftmadness.objects.blocks.furniture.BirdBath;
import com.turtywurty.minecraftmadness.objects.blocks.furniture.BlockCandle;
import com.turtywurty.minecraftmadness.objects.blocks.furniture.ChoppingBoard;
import com.turtywurty.minecraftmadness.objects.blocks.furniture.ChristmasTree;
import com.turtywurty.minecraftmadness.objects.blocks.furniture.CoffeeTable;
import com.turtywurty.minecraftmadness.objects.blocks.furniture.CupboardBlock;
import com.turtywurty.minecraftmadness.objects.blocks.furniture.Globe;
import com.turtywurty.minecraftmadness.objects.blocks.furniture.PlateBlock;
import com.turtywurty.minecraftmadness.objects.blocks.machines.BlockTeleporter;
import com.turtywurty.minecraftmadness.objects.blocks.machines.FreezerBlock;
import com.turtywurty.minecraftmadness.objects.blocks.machines.FryingPanBlock;
import com.turtywurty.minecraftmadness.objects.blocks.machines.MicrowaveBlock;
import com.turtywurty.minecraftmadness.objects.blocks.machines.MoneyMaker;
import com.turtywurty.minecraftmadness.objects.blocks.ores.AmethystOre;
import com.turtywurty.minecraftmadness.objects.blocks.ores.CopperOre;
import com.turtywurty.minecraftmadness.objects.blocks.ores.RubyOre;
import com.turtywurty.minecraftmadness.objects.blocks.ores.SapphireOre;
import com.turtywurty.minecraftmadness.objects.blocks.ores.TinOre;
import com.turtywurty.minecraftmadness.objects.blocks.ores.UraniumOre;
import com.turtywurty.minecraftmadness.objects.blocks.plushies.PlushieBase;
import com.turtywurty.minecraftmadness.objects.blocks.quarry.QuarryBlockBasic;
import com.turtywurty.minecraftmadness.objects.blocks.quarry.QuarryBlockTier1;
import com.turtywurty.minecraftmadness.objects.blocks.random.BlockUranium;
import com.turtywurty.minecraftmadness.objects.blocks.random.CharcoalBlock;
import com.turtywurty.minecraftmadness.objects.blocks.random.GlassDoor;
import com.turtywurty.minecraftmadness.objects.blocks.random.LandmineBlock;
import com.turtywurty.minecraftmadness.objects.blocks.world.crops.BlockLemonPlant;
import com.turtywurty.minecraftmadness.objects.blocks.world.crops.BlockTomatoPlant;
import com.turtywurty.minecraftmadness.objects.blocks.world.grass.MadnessGrass;
import com.turtywurty.minecraftmadness.objects.blocks.world.trees.MadnessLog;
import com.turtywurty.minecraftmadness.objects.blocks.world.trees.MadnessPlanks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockInit 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	//Ores
	public static final Block RUBY_ORE = new RubyOre("ruby_ore", Material.ROCK);
	public static final Block COPPER_ORE = new CopperOre("copper_ore", Material.ROCK);
	public static final Block AMETHYST_ORE = new AmethystOre("amethyst_ore", Material.ROCK);
	public static final Block TIN_ORE = new TinOre("tin_ore", Material.ROCK);
	public static final Block SAPPHIRE_ORE = new SapphireOre("sapphire_ore", Material.ROCK);
	public static final Block URANIUM_ORE = new UraniumOre("uranium_ore", Material.ROCK);
	
	/*Fluids
	public static final Block RAW_OIL = new BlockFluid("raw_oil", FluidInit.RAW_OIL, Material.LAVA);
	*/
	
	//Madness Dimension Blocks
	public static final Block MADNESS_GRASS = new MadnessGrass("madness_grass", Material.GRASS);
	public static final Block MADNESS_PLANKS = new MadnessPlanks("madness_planks", Material.WOOD);
	public static final Block MADNESS_LOG = new MadnessLog("madness_log");
	
	//Chopping Boards
	public static final Block OAK_CHOPPING_BOARD = new ChoppingBoard("oak_chopping_board", Material.WOOD);
	public static final Block SPRUCE_CHOPPING_BOARD = new ChoppingBoard("spruce_chopping_board", Material.WOOD);
	public static final Block BIRCH_CHOPPING_BOARD = new ChoppingBoard("birch_chopping_board", Material.WOOD);
	public static final Block DARK_OAK_CHOPPING_BOARD = new ChoppingBoard("dark_oak_chopping_board", Material.WOOD);
	public static final Block JUNGLE_CHOPPING_BOARD = new ChoppingBoard("jungle_chopping_board", Material.WOOD);
	public static final Block ACACIA_CHOPPING_BOARD = new ChoppingBoard("acacia_chopping_board", Material.WOOD);
	
	//Coffee Tables
	public static final Block OAK_COFFEE_TABLE = new CoffeeTable("oak_coffee_table", Material.WOOD);
	public static final Block SPRUCE_COFFEE_TABLE = new CoffeeTable("spruce_coffee_table", Material.WOOD);
	public static final Block BIRCH_COFFEE_TABLE = new CoffeeTable("birch_coffee_table", Material.WOOD);
	public static final Block DARK_OAK_COFFEE_TABLE = new CoffeeTable("dark_oak_coffee_table", Material.WOOD);
	public static final Block JUNGLE_COFFEE_TABLE = new CoffeeTable("jungle_coffee_table", Material.WOOD);
	public static final Block ACACIA_COFFEE_TABLE = new CoffeeTable("acacia_coffee_table", Material.WOOD);
	
	//Machines
	public static final Block MONEY_MAKER = new MoneyMaker("money_maker", Material.IRON);
	public static final Block MICROWAVE_BLOCK = new MicrowaveBlock("microwave_block", Material.IRON);
	public static final Block FRYING_PAN_BLOCK = new FryingPanBlock("frying_pan_block", Material.IRON);
    public static final Block CUPBOARD_BLOCK = new CupboardBlock("cupboard_block", Material.WOOD);
	public static final Block FREEZER_BLOCK = new FreezerBlock("freezer_block", Material.IRON);
	public static final Block QUARRY_BLOCK_BASIC = new QuarryBlockBasic("quarry_basic", Material.IRON);
	public static final Block QUARRY_BLOCK_TIER1 = new QuarryBlockTier1("quarry_tier1", Material.IRON);
	public static final Block TELEPORTER = new BlockTeleporter("teleporter", Material.IRON);
    //public static final Block BLENDER_BLOCK = new BlenderBlock("blender_block", Material.CLAY);
	//public static final Block OVEN_BLOCK = new OvenBlock("oven_block", Material.IRON);
    
	//Blocks
	public static final Block SUGARCANE_BLOCK = new BlockBase("sugarcane_block", Material.CLOTH);
	public static final Block CHARCOAL_BLOCK = new CharcoalBlock("charcoal_block", Material.ROCK);
	public static final Block BASALT_BLOCK = new BlockBase("basalt_block", Material.ROCK);
	public static final Block ASH_BLOCK = new BlockBase("ash_block", Material.SAND);
	public static final Block BIRD_BATH = new BirdBath("bird_bath", Material.ROCK);
	public static final Block CANDLE_BLOCK = new BlockCandle("block_candle", Material.CLAY);
	public static final Block GLASS_DOOR = new GlassDoor("glass_door");
	public static final Block LANDMINE_BLOCK = new LandmineBlock("land_mine", Material.GRASS);
	public static final Block PLATE_BLOCK = new PlateBlock("plate_block", Material.ROCK);
	public static final Block SAPPHIRE_BLOCK = new BlockBase("sapphire_block", Material.IRON);
	public static final Block COPPER_BLOCK = new BlockBase("copper_block", Material.IRON);
	public static final Block SILVER_BLOCK = new BlockBase("silver_block", Material.IRON);
	public static final Block URANIUM_BLOCK = new BlockUranium("uranium_block", Material.IRON);
	public static final Block TIN_BLOCK = new BlockBase("tin_block", Material.IRON);
	public static final Block RUBY_BLOCK = new BlockBase("ruby_block", Material.IRON);
	public static final Block AMETHYST_BLOCK = new BlockBase("amethyst_block", Material.IRON);
	public static final Block CHRISTMAS_TREE = new ChristmasTree("christmas_tree", Material.WOOD);
	public static final Block GLOBE = new Globe("globe", Material.WOOD);
	
	//Plushies
	public static final Block TURTYWURTY_PLUSHIE = new PlushieBase("turtywurty_plushie", Material.CLOTH);
	public static final Block CJMINECRAFT01_PLUSHIE = new PlushieBase("cjminecraft01_plushie", Material.CLOTH);
	public static final Block FAPDOS_PLUSHIE = new PlushieBase("fapdos_plushie", Material.CLOTH);
	public static final Block HUSKYTHEARTIST_PLUSHIE = new PlushieBase("huskytheartist_plushie", Material.CLOTH);
	public static final Block IVANDPF_PLUSHIE = new PlushieBase("ivandpf_plushie", Material.CLOTH);
	public static final Block SALRADAHN_PLUSHIE = new PlushieBase("salradahn_plushie", Material.CLOTH);
	public static final Block VIKTORP04_PLUSHIE = new PlushieBase("viktorp04_plushie", Material.CLOTH);
	public static final Block MRCRAYFISH_PLUSHIE = new PlushieBase("mrcrayfish_plushie", Material.CLOTH);
	public static final Block INTIVI_PLUSHIE = new PlushieBase("intivi_plushie", Material.CLOTH);
	public static final Block STEVE_PLUSHIE = new PlushieBase("steve_plushie", Material.CLOTH);
	public static final Block ALEX_PLUSHIE = new PlushieBase("alex_plushie", Material.CLOTH);
	
	//Plants/Crops
	public static final Block TOMATO_PLANT = new BlockTomatoPlant("tomato_plant");
	public static final Block LEMON_PLANT = new BlockLemonPlant("lemon_plant");
	
	//Flags
	public static final Block WHITE_FLAG = new WhiteFlag("white_flag", Material.WOOD);
	public static final Block LIGHT_GREY_FLAG = new LightGreyFlag("light_grey_flag", Material.WOOD);
	public static final Block GREY_FLAG = new GreyFlag("grey_flag", Material.WOOD);
	public static final Block BLACK_FLAG = new BlackFlag("black_flag", Material.WOOD);
	public static final Block GREEN_FLAG = new GreenFlag("green_flag", Material.WOOD);
	public static final Block LIME_GREEN_FLAG = new LimeGreenFlag("lime_green_flag", Material.WOOD);
	public static final Block YELLOW_FLAG = new YellowFlag("yellow_flag", Material.WOOD);
	public static final Block ORANGE_FLAG = new OrangeFlag("orange_flag", Material.WOOD);
	public static final Block LIGHT_BLUE_FLAG = new LightBlueFlag("light_blue_flag", Material.WOOD);
	public static final Block BLUE_FLAG = new BlueFlag("blue_flag", Material.WOOD);
	public static final Block CYAN_FLAG = new CyanFlag("cyan_flag", Material.WOOD);
	public static final Block BROWN_FLAG = new BrownFlag("brown_flag", Material.WOOD);
	public static final Block PURPLE_FLAG = new PurpleFlag("purple_flag", Material.WOOD);
	public static final Block PINK_FLAG = new PinkFlag("pink_flag", Material.WOOD);
	public static final Block MAGENTA_FLAG = new MagentaFlag("magenta_flag", Material.WOOD);
	public static final Block RED_FLAG = new RedFlag("red_flag", Material.WOOD);
	
	//Dyed Oak Planks
	public static final Block RED_OAK_PLANKS = new BlockBase("red_oak_planks", Material.WOOD).setCreativeTab(MinecraftMadness.MINECRAFTMADNESSDYEDBLOCKSTAB);
	public static final Block ORANGE_OAK_PLANKS = new BlockBase("orange_oak_planks", Material.WOOD).setCreativeTab(MinecraftMadness.MINECRAFTMADNESSDYEDBLOCKSTAB);
	public static final Block YELLOW_OAK_PLANKS = new BlockBase("yellow_oak_planks", Material.WOOD).setCreativeTab(MinecraftMadness.MINECRAFTMADNESSDYEDBLOCKSTAB);
	public static final Block BROWN_OAK_PLANKS = new BlockBase("brown_oak_planks", Material.WOOD).setCreativeTab(MinecraftMadness.MINECRAFTMADNESSDYEDBLOCKSTAB);
	public static final Block GREY_OAK_PLANKS = new BlockBase("grey_oak_planks", Material.WOOD).setCreativeTab(MinecraftMadness.MINECRAFTMADNESSDYEDBLOCKSTAB);
	public static final Block LIGHT_GREY_OAK_PLANKS = new BlockBase("light_grey_oak_planks", Material.WOOD).setCreativeTab(MinecraftMadness.MINECRAFTMADNESSDYEDBLOCKSTAB);
	public static final Block BLACK_OAK_PLANKS = new BlockBase("black_oak_planks", Material.WOOD).setCreativeTab(MinecraftMadness.MINECRAFTMADNESSDYEDBLOCKSTAB);
	public static final Block WHITE_OAK_PLANKS = new BlockBase("white_oak_planks", Material.WOOD).setCreativeTab(MinecraftMadness.MINECRAFTMADNESSDYEDBLOCKSTAB);
	public static final Block GREEN_OAK_PLANKS = new BlockBase("green_oak_planks", Material.WOOD).setCreativeTab(MinecraftMadness.MINECRAFTMADNESSDYEDBLOCKSTAB);
	public static final Block CYAN_OAK_PLANKS = new BlockBase("cyan_oak_planks", Material.WOOD).setCreativeTab(MinecraftMadness.MINECRAFTMADNESSDYEDBLOCKSTAB);
	public static final Block LIME_OAK_PLANKS = new BlockBase("lime_oak_planks", Material.WOOD).setCreativeTab(MinecraftMadness.MINECRAFTMADNESSDYEDBLOCKSTAB);
	public static final Block BLUE_OAK_PLANKS = new BlockBase("blue_oak_planks", Material.WOOD).setCreativeTab(MinecraftMadness.MINECRAFTMADNESSDYEDBLOCKSTAB);
	public static final Block LIGHT_BLUE_OAK_PLANKS = new BlockBase("light_blue_oak_planks", Material.WOOD).setCreativeTab(MinecraftMadness.MINECRAFTMADNESSDYEDBLOCKSTAB);
	public static final Block PURPLE_OAK_PLANKS = new BlockBase("purple_oak_planks", Material.WOOD).setCreativeTab(MinecraftMadness.MINECRAFTMADNESSDYEDBLOCKSTAB);
	public static final Block MAGENTA_OAK_PLANKS = new BlockBase("magenta_oak_planks", Material.WOOD).setCreativeTab(MinecraftMadness.MINECRAFTMADNESSDYEDBLOCKSTAB);
	public static final Block PINK_OAK_PLANKS = new BlockBase("pink_oak_planks", Material.WOOD).setCreativeTab(MinecraftMadness.MINECRAFTMADNESSDYEDBLOCKSTAB);
	
	//Dyed Cobblestone
	public static final Block RED_COBBLESTONE = new BlockBase("red_cobblestone", Material.ROCK).setCreativeTab(MinecraftMadness.MINECRAFTMADNESSDYEDBLOCKSTAB);
	public static final Block ORANGE_COBBLESTONE = new BlockBase("orange_cobblestone", Material.ROCK).setCreativeTab(MinecraftMadness.MINECRAFTMADNESSDYEDBLOCKSTAB);
	public static final Block YELLOW_COBBLESTONE = new BlockBase("yellow_cobblestone", Material.ROCK).setCreativeTab(MinecraftMadness.MINECRAFTMADNESSDYEDBLOCKSTAB);
	public static final Block BROWN_COBBLESTONE = new BlockBase("brown_cobblestone", Material.ROCK).setCreativeTab(MinecraftMadness.MINECRAFTMADNESSDYEDBLOCKSTAB);
	public static final Block GREY_COBBLESTONE = new BlockBase("grey_cobblestone", Material.ROCK).setCreativeTab(MinecraftMadness.MINECRAFTMADNESSDYEDBLOCKSTAB);
	public static final Block LIGHT_GREY_COBBLESTONE = new BlockBase("light_grey_cobblestone", Material.ROCK).setCreativeTab(MinecraftMadness.MINECRAFTMADNESSDYEDBLOCKSTAB);
	public static final Block BLACK_COBBLESTONE = new BlockBase("black_cobblestone", Material.ROCK).setCreativeTab(MinecraftMadness.MINECRAFTMADNESSDYEDBLOCKSTAB);
	public static final Block WHITE_COBBLESTONE = new BlockBase("white_cobblestone", Material.ROCK).setCreativeTab(MinecraftMadness.MINECRAFTMADNESSDYEDBLOCKSTAB);
	public static final Block GREEN_COBBLESTONE = new BlockBase("green_cobblestone", Material.ROCK).setCreativeTab(MinecraftMadness.MINECRAFTMADNESSDYEDBLOCKSTAB);
	public static final Block CYAN_COBBLESTONE = new BlockBase("cyan_cobblestone", Material.ROCK).setCreativeTab(MinecraftMadness.MINECRAFTMADNESSDYEDBLOCKSTAB);
	public static final Block LIME_COBBLESTONE = new BlockBase("lime_cobblestone", Material.ROCK).setCreativeTab(MinecraftMadness.MINECRAFTMADNESSDYEDBLOCKSTAB);
	public static final Block BLUE_COBBLESTONE = new BlockBase("blue_cobblestone", Material.ROCK).setCreativeTab(MinecraftMadness.MINECRAFTMADNESSDYEDBLOCKSTAB);
	public static final Block LIGHT_BLUE_COBBLESTONE = new BlockBase("light_blue_cobblestone", Material.ROCK).setCreativeTab(MinecraftMadness.MINECRAFTMADNESSDYEDBLOCKSTAB);
	public static final Block PURPLE_COBBLESTONE = new BlockBase("purple_cobblestone", Material.ROCK).setCreativeTab(MinecraftMadness.MINECRAFTMADNESSDYEDBLOCKSTAB);
	public static final Block MAGENTA_COBBLESTONE = new BlockBase("magenta_cobblestone", Material.ROCK).setCreativeTab(MinecraftMadness.MINECRAFTMADNESSDYEDBLOCKSTAB);
	public static final Block PINK_COBBLESTONE = new BlockBase("pink_cobblestone", Material.ROCK).setCreativeTab(MinecraftMadness.MINECRAFTMADNESSDYEDBLOCKSTAB);
	
	//Dyed Stone
	public static final Block RED_STONE = new BlockBase("red_stone", Material.ROCK).setCreativeTab(MinecraftMadness.MINECRAFTMADNESSDYEDBLOCKSTAB);
	public static final Block ORANGE_STONE = new BlockBase("orange_stone", Material.ROCK).setCreativeTab(MinecraftMadness.MINECRAFTMADNESSDYEDBLOCKSTAB);
	public static final Block YELLOW_STONE = new BlockBase("yellow_stone", Material.ROCK).setCreativeTab(MinecraftMadness.MINECRAFTMADNESSDYEDBLOCKSTAB);
	public static final Block BROWN_STONE = new BlockBase("brown_stone", Material.ROCK).setCreativeTab(MinecraftMadness.MINECRAFTMADNESSDYEDBLOCKSTAB);
	public static final Block GREY_STONE = new BlockBase("grey_stone", Material.ROCK).setCreativeTab(MinecraftMadness.MINECRAFTMADNESSDYEDBLOCKSTAB);
	public static final Block LIGHT_GREY_STONE = new BlockBase("light_grey_stone", Material.ROCK).setCreativeTab(MinecraftMadness.MINECRAFTMADNESSDYEDBLOCKSTAB);
	public static final Block BLACK_STONE = new BlockBase("black_stone", Material.ROCK).setCreativeTab(MinecraftMadness.MINECRAFTMADNESSDYEDBLOCKSTAB);
	public static final Block WHITE_STONE = new BlockBase("white_stone", Material.ROCK).setCreativeTab(MinecraftMadness.MINECRAFTMADNESSDYEDBLOCKSTAB);
	public static final Block GREEN_STONE = new BlockBase("green_stone", Material.ROCK).setCreativeTab(MinecraftMadness.MINECRAFTMADNESSDYEDBLOCKSTAB);
	public static final Block CYAN_STONE = new BlockBase("cyan_stone", Material.ROCK).setCreativeTab(MinecraftMadness.MINECRAFTMADNESSDYEDBLOCKSTAB);
	public static final Block LIME_STONE = new BlockBase("lime_stone", Material.ROCK).setCreativeTab(MinecraftMadness.MINECRAFTMADNESSDYEDBLOCKSTAB);
	public static final Block BLUE_STONE = new BlockBase("blue_stone", Material.ROCK).setCreativeTab(MinecraftMadness.MINECRAFTMADNESSDYEDBLOCKSTAB);
	public static final Block LIGHT_BLUE_STONE = new BlockBase("light_blue_stone", Material.ROCK).setCreativeTab(MinecraftMadness.MINECRAFTMADNESSDYEDBLOCKSTAB);
	public static final Block PURPLE_STONE = new BlockBase("purple_stone", Material.ROCK).setCreativeTab(MinecraftMadness.MINECRAFTMADNESSDYEDBLOCKSTAB);
	public static final Block MAGENTA_STONE = new BlockBase("magenta_stone", Material.ROCK).setCreativeTab(MinecraftMadness.MINECRAFTMADNESSDYEDBLOCKSTAB);
	public static final Block PINK_STONE = new BlockBase("pink_stone", Material.ROCK).setCreativeTab(MinecraftMadness.MINECRAFTMADNESSDYEDBLOCKSTAB);
	
	/*Dyed Stonebricks
	public static final Block RED_STONEBRICKS = new BlockBase("red_stonebricks", Material.ROCK).setCreativeTab(MinecraftMadness.MINECRAFTMADNESSDYEDBLOCKSTAB);
	public static final Block ORANGE_STONEBRICKS = new BlockBase("orange_stonebricks", Material.ROCK).setCreativeTab(MinecraftMadness.MINECRAFTMADNESSDYEDBLOCKSTAB);
	public static final Block YELLOW_STONEBRICKS = new BlockBase("yellow_stonebricks", Material.ROCK).setCreativeTab(MinecraftMadness.MINECRAFTMADNESSDYEDBLOCKSTAB);
	public static final Block BROWN_STONEBRICKS = new BlockBase("brown_stonebricks", Material.ROCK).setCreativeTab(MinecraftMadness.MINECRAFTMADNESSDYEDBLOCKSTAB);
	public static final Block GREY_STONEBRICKS = new BlockBase("grey_stonebricks", Material.ROCK).setCreativeTab(MinecraftMadness.MINECRAFTMADNESSDYEDBLOCKSTAB);
	public static final Block LIGHT_GREY_STONEBRICKS = new BlockBase("light_grey_stonebricks", Material.ROCK).setCreativeTab(MinecraftMadness.MINECRAFTMADNESSDYEDBLOCKSTAB);
	public static final Block BLACK_STONEBRICKS = new BlockBase("black_stonebricks", Material.ROCK).setCreativeTab(MinecraftMadness.MINECRAFTMADNESSDYEDBLOCKSTAB);
	public static final Block WHITE_STONEBRICKS = new BlockBase("white_stonebricks", Material.ROCK).setCreativeTab(MinecraftMadness.MINECRAFTMADNESSDYEDBLOCKSTAB);
	public static final Block GREEN_STONEBRICKS = new BlockBase("green_stonebricks", Material.ROCK).setCreativeTab(MinecraftMadness.MINECRAFTMADNESSDYEDBLOCKSTAB);
	public static final Block CYAN_STONEBRICKS = new BlockBase("cyan_stonebricks", Material.ROCK).setCreativeTab(MinecraftMadness.MINECRAFTMADNESSDYEDBLOCKSTAB);
	public static final Block LIME_STONEBRICKS = new BlockBase("lime_stonebricks", Material.ROCK).setCreativeTab(MinecraftMadness.MINECRAFTMADNESSDYEDBLOCKSTAB);
	public static final Block BLUE_STONEBRICKS = new BlockBase("blue_stonebricks", Material.ROCK).setCreativeTab(MinecraftMadness.MINECRAFTMADNESSDYEDBLOCKSTAB);
	public static final Block LIGHT_BLUE_STONEBRICKS = new BlockBase("light_blue_stonebricks", Material.ROCK).setCreativeTab(MinecraftMadness.MINECRAFTMADNESSDYEDBLOCKSTAB);
	public static final Block PURPLE_STONEBRICKS = new BlockBase("purple_stonebricks", Material.ROCK).setCreativeTab(MinecraftMadness.MINECRAFTMADNESSDYEDBLOCKSTAB);
	public static final Block MAGENTA_STONEBRICKS = new BlockBase("magenta_stonebricks", Material.ROCK).setCreativeTab(MinecraftMadness.MINECRAFTMADNESSDYEDBLOCKSTAB);
	public static final Block PINK_STONEBRICKS = new BlockBase("pink_stonebricks", Material.ROCK).setCreativeTab(MinecraftMadness.MINECRAFTMADNESSDYEDBLOCKSTAB);
	*/
	
}
