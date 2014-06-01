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
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
//import net.minecraft.block.Block;

/*
 * Basic needed forge stuff
 */
@Mod(modid = "hellstone_mod", name = "Hellstone Mod", version = "v1")
//@NetworkMod(clientSideRequired = true, serverSideRequired = false)  NotNeeded
public class Mod_hellstone_main {

	public static CreativeTabs HellstoneTab = new CreativeTabs("HellstoneTab") {
		public ItemStack getIconItemStack() {
			return new ItemStack(
					Blocks.fence, 1, 0);
		}

		@Override
		@SideOnly(Side.CLIENT)
		public Item getTabIconItem() {
			// TODO Auto-generated method stub
			return null;
		}
	};

	public static Item HellstoneAxe;
	public static Item HellstoneShovel;
	public static Item HellstoneSword;
	public static Item HellstonePickaxe;
	public static Item HellstoneHoe;
	/*
	 * ToolMaterial goes liek dis: (
	 */
	static ToolMaterial EnumToolMaterialHellstone = EnumHelper
			.addToolMaterial("HighPower", 3, 500, 3.0F, 6, 5);

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

	//@Init
	public void load(FMLInitializationEvent event) {
		// define items/blocks/generators
		GameRegistry.registerWorldGenerator(new EventManager(),0);
		// GameRegistry.registerItem(HellstoneSword, "Hellsword");
//		LanguageRegistry.instance().addStringLocalization(
//				"itemGroup.HellstoneTab", "en_US", "Hellstone");
		// Items
		HellStone = new dylanpdx_hellstone_items(2111)
				.setUnlocalizedName("HellstoneSprite1");
		HellStone.setTextureName("HellstoneSprite1");
		TickerDebug = new debug_ticker(2112).setCreativeTab(CreativeTabs.tabBrewing)
				.setUnlocalizedName("Ticker");
		dylanpdxFarmland = new dylanpdxFarmland(201)
				.setBlockName("HellFarm");
		dylanpdxFarmland.setBlockTextureName("hellstn");
		// blocks
		HellstoneOre = new dylanpdx_hellstone_blocks(200, "hellstoneore")
				.setBlockName("hellstoneore");
		HellstoneOre.setBlockTextureName("hellstoneore");
		HellstoneOre.setCreativeTab(this.HellstoneTab);
		EasterEgg = new blockEasterEgg(255);
		EasterEgg.setBlockTextureName("EasterEgg");
		EasterEgg.setCreativeTab(this.HellstoneTab);
		// tools
		HellstoneSword = new dylanpdxSword(8018, EnumToolMaterialHellstone)
				.setUnlocalizedName("HellSword");
		HellstoneSword.setTextureName("Hellsword");
		HellstoneSword.setCreativeTab(this.HellstoneTab);
		HellstonePickaxe = new dylanpdxPickaxe(8019, EnumToolMaterialHellstone)
				.setUnlocalizedName("HellPick");
		HellstonePickaxe.setTextureName("Hellpick");
		HellstonePickaxe.setCreativeTab(this.HellstoneTab);
		HellstoneAxe = new dylanpdxAxe(8021, EnumToolMaterialHellstone)
				.setUnlocalizedName("HellAxe");
		HellstoneAxe.setCreativeTab(this.HellstoneTab);
		HellstoneShovel = new dylanpdxShovel(8020, EnumToolMaterialHellstone)
				.setUnlocalizedName("HellSpade");
		HellstoneShovel.setCreativeTab(this.HellstoneTab);
		HellstoneHoe = new dylanpdxHoe(9018, EnumToolMaterialHellstone)
				.setUnlocalizedName("HellHoe");
		HellstoneHoe.setCreativeTab(this.HellstoneTab);

		// misc
		HellPotato = new PotatoCropHellized(1337)
				.setBlockName("HellPotato");
		HellPotato.setBlockTextureName("potatoes");

		int FarmlandID;

		//FarmlandID = dylanpdxFarmland.blockID;

		// adding names

		/*LanguageRegistry.addName(HellStone, "Hellstone Chunk");
		LanguageRegistry.addName(HellstoneOre, "Hellstone Ore");
		LanguageRegistry.addName(HellstoneSword, "Hellstone Sword");
		LanguageRegistry.addName(HellstonePickaxe, "Hellstone Pickaxe");
		LanguageRegistry.addName(HellstoneAxe, "Hellstone Axe");
		LanguageRegistry.addName(HellstoneShovel, "Hellstone Shovel");
		LanguageRegistry.addName(HellstoneHoe, "Hellstone Hoe");
		LanguageRegistry.addName(EasterEgg, "~~Easter Egg~~"); // make it so on
																// easter day it
																// puts one in
																// inventory
*/
		// registering the blocks
		GameRegistry.registerBlock(HellstoneOre, "HellstoneOre");
		GameRegistry.registerBlock(EasterEgg, "LEasterEgg");
		GameRegistry.registerBlock(dylanpdxFarmland, "HellFarmland");
		GameRegistry.registerBlock(HellPotato, "HellishPotato");

		// crafting
		
		
		//test
		
		
	}

	public static boolean addEPItem(Item par0item, Integer par1int){
		EpItems.add(par0item);
		EpValues.add(par1int);
		return true;
	}

}
