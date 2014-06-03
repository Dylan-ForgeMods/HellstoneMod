package hellstone;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockCrops;
import net.minecraft.block.material.Material;
//import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
//import net.minecraft.util.Icon;
import net.minecraft.item.Item;
import net.minecraft.world.World;
import javax.swing.Icon;

import net.minecraft.block.Block;
import net.minecraft.block.BlockDirt;
import net.minecraft.block.BlockFarmland;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
//import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSeeds;
import net.minecraft.item.ItemStack;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.IIcon;
//import net.minecraft.util.Icon;
//import net.minecraft.world.EnumGameType;
import net.minecraft.world.World;

public class PotatoCropHellized extends BlockCrops {
	@SideOnly(Side.CLIENT)
	private IIcon[] iconArray;

	public PotatoCropHellized() {
		super();
	}

	@SideOnly(Side.CLIENT)
	/**
	 * From the specified side and block metadata retrieves the blocks texture. Args: side, metadata
	 */
	public boolean canThisPlantGrowOnThisBlockID(int par1) {
		return par1 == net.minecraft.block.Block.getIdFromBlock(hellstone.Mod_hellstone_main.dylanpdxFarmland);
	}

	/* public IIcon getIcon(int par1, int par2) {
		if (par2 < 7) {
			if (par2 == 6) {
				par2 = 5;
			}

			return this.iconArray[par2 >> 1];
		} else {
			return this.iconArray[3];
		}
	}  */

	/**
	 * Generate a seed ItemStack for this crop.
	 */
	protected int getSeedItem() {
		return getIdFromBlock(getBlockFromItem(Items.potato));
	}

	/**
	 * Generate a crop produce ItemStack for this crop.
	 */
	protected int getCropItem() {
		return getIdFromBlock(getBlockFromItem(Items.baked_potato));
	}

	/**
	 * Drops the block items with a specified chance of dropping the specified
	 * items
	 */
	public void dropBlockAsItemWithChance(World par1World, int par2, int par3,
			int par4, int par5, float par6, int par7) {
		super.dropBlockAsItemWithChance(par1World, par2, par3, par4, par5,
				par6, par7);

		if (!par1World.isRemote) {
			if (par5 >= 7 && par1World.rand.nextInt(50) == 0) {
				this.dropBlockAsItem(par1World, par2, par3, par4,
						new ItemStack(Items.poisonous_potato));
			}
			if (par5 >= 7 && par1World.rand.nextInt(20) == 0) {
				this.dropBlockAsItem(par1World, par2, par3, par4,
						new ItemStack(Items.potato));
			}
		}
	}

	@SideOnly(Side.CLIENT)
	/**
	 * When this method is called, your block should register all the icons it needs with the given IconRegister. This
	 * is the only chance you get to register icons.
	 */
	public void registerIcons(IIconRegister par1IconRegister) {
		this.iconArray = new IIcon[4];

		for (int i = 0; i < this.iconArray.length; ++i) {
			this.iconArray[i] = par1IconRegister.registerIcon(this
					.getTextureName() + "_stage_" + i);
		}
	}

	public void onNeighborBlockChange(World par1World, int par2, int par3,
			int par4, int par5) {

		if (par1World.getBlock(par2, par3 - 1, par4) != hellstone.Mod_hellstone_main.dylanpdxFarmland) {
			par1World.setBlock(par2, par3, par4, Blocks.air);
		}
	}
}
