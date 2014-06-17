package hellstone;

/*
  ____  _  _  __      __    _  _  ____  ____  _  _ 
 (  _ \( \/ )(  )    /__\  ( \( )(  _ \(  _ \( \/ )
  )(_) )\  /  )(__  /(__)\  )  (  )___/ )(_) ))  ( 
 (____/ (__) (____)(__)(__)(_)\_)(__)  (____/(_/\_)
 ~ Hellstone mod 2014

 Daniel, stop looking at my marvelous ASCII art and see what's wrong. I know
 your reading this.

 */

/*
 * Basic importing
 */
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

//import net.minecraft.block.Block;

/*
 * Basic needed forge stuff
 */
@Mod(modid = "hellstone_mod", name = "Hellstone Mod", version = "v1")
public class Mod_hellstone_main
{
    public static final String MODID = "hellstone_mod";
    public static final String VERSION = "1.0";
	public static CreativeTabs HellstoneTab = new CreativeTabs("HellstoneTab")
	{
		public ItemStack getIconItemStack()
		{
			return new ItemStack(Blocks.fence, 1, 0);
		}

		@Override
		@SideOnly(Side.CLIENT)
		public Item getTabIconItem()
		{
			// TODO Auto-generated method stub
			return null;
		}
	};

	public static Item HellstoneAxe;
	public static Item HellstoneShovel;
	public static Item HellstoneSword;
	public static Item HellstonePickaxe;
	public static Item HellstoneHoe;
	
	public static Item HellstoneHat;
	public static Item HellstoneChestplate;
	public static Item HellstoneLeggings;
	public static Item HellstoneBoots;
	/*
	 * ToolMaterial goes liek dis: (
	 */
	static ToolMaterial EnumToolMaterialHellstone = EnumHelper.addToolMaterial("HighPower", 3, 500, 3.0F, 6, 5);

	// Telling forge that we are creating these

	public static Item HellStone;
	public static Block HellstoneOre;
	public static Block EasterEgg;
	public static Block dylanpdxFarmland;
	public static Block HellPotato;
	public static Item TickerDebug;

	public static List EpItems;
	public static List EpValues;

	// public static Block easterEgg = (new
	// blockEasterEgg(255)).setHardness(3.0F).setResistance(15.0F).setLightValue(0.125F).setBlockName("easterEgg").setTextureName("dragon_egg");

	// Declaring Init

	// @Init
	@EventHandler
	public void preInit(FMLPreInitializationEvent e)
	{
		// define items/blocks/generators
		GameRegistry.registerWorldGenerator(new EventManager(), 0);
		
		
		// Items
		HellStone = new dylanpdx_hellstone_items().setTextureName("hellstone_mod:HellstoneSprite1");
		TickerDebug = new debug_ticker().setCreativeTab(this.HellstoneTab).setUnlocalizedName("Ticker");
		dylanpdxFarmland = new dylanpdxFarmland().setBlockName("HellFarm").setBlockTextureName("hellstone_mod:hellstn");
		// blocks
		HellstoneOre = new dylanpdx_hellstone_blocks().setBlockName("hellstoneore").setCreativeTab(this.HellstoneTab).setBlockTextureName("hellstone_mod:hellstoneore");
		EasterEgg = new blockEasterEgg().setBlockName("easteregg_h");
		// tools
		HellstoneSword = new dylanpdxSword(EnumToolMaterialHellstone).setUnlocalizedName("HellSword").setTextureName("hellstone_mod:Hellsword").setCreativeTab(this.HellstoneTab);
		HellstonePickaxe = new dylanpdxPickaxe(EnumToolMaterialHellstone).setUnlocalizedName("HellPick").setTextureName("hellstone_mod:Hellpick").setCreativeTab(this.HellstoneTab);
		HellstoneAxe = new dylanpdxAxe(EnumToolMaterialHellstone).setUnlocalizedName("HellAxe").setCreativeTab(this.HellstoneTab).setTextureName("hellstone_mod:Hellaxe");
		HellstoneShovel = new dylanpdxShovel(EnumToolMaterialHellstone).setUnlocalizedName("HellSpade").setCreativeTab(this.HellstoneTab).setTextureName("hellstone_mod:Hellshovel");
		HellstoneHoe = new dylanpdxHoe(EnumToolMaterialHellstone).setUnlocalizedName("HellHoe").setCreativeTab(this.HellstoneTab).setTextureName("hellstone_mod:Hellhoe");

		// misc
		HellPotato = new PotatoCropHellized().setBlockName("HellPotato");
		HellPotato.setBlockTextureName("potatoes");
		//Armor
		//HellstoneHat = new HellstoneHelmet().setUnlocalizedName("HellHat");
		
		// FarmlandID = dylanpdxFarmland.blockID;

		// adding names

		/*
		 * LanguageRegistry.addName(HellStone, "Hellstone Chunk");
		 * LanguageRegistry.addName(HellstoneOre, "Hellstone Ore");
		 * LanguageRegistry.addName(HellstoneSword, "Hellstone Sword");
		 * LanguageRegistry.addName(HellstonePickaxe, "Hellstone Pickaxe");
		 * LanguageRegistry.addName(HellstoneAxe, "Hellstone Axe");
		 * LanguageRegistry.addName(HellstoneShovel, "Hellstone Shovel");
		 * LanguageRegistry.addName(HellstoneHoe, "Hellstone Hoe");
		 * LanguageRegistry.addName(EasterEgg, "~~Easter Egg~~"); // make it so
		 * on // easter day it // puts one in // inventory
		 */
		// registering the blocks
		GameRegistry.registerBlock(HellstoneOre, "HellstoneOre");
		GameRegistry.registerBlock(EasterEgg, "LEasterEgg");
		GameRegistry.registerBlock(dylanpdxFarmland, "HellFarmland");
		GameRegistry.registerBlock(HellPotato, "HellishPotato");
		GameRegistry.registerItem(HellstoneAxe, "Hellstone Axe");
		GameRegistry.registerItem(HellstoneHoe,"Hellstone Hoe");
		GameRegistry.registerItem(HellstonePickaxe,"Hellstone Pickaxe");
		GameRegistry.registerItem(HellstoneShovel,"Hellstone Spade");
		GameRegistry.registerItem(HellstoneSword,"Hellstone Sword");
		GameRegistry.registerItem(TickerDebug, "Ticker");

		// crafting

		// test

	}

	public static boolean addEPItem(Item par0item, Integer par1int)
	{
		EpItems.add(par0item);
		EpValues.add(par1int);
		return true;
	}

}
