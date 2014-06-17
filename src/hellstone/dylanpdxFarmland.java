package hellstone;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.Random;

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

//import net.minecraftforge.common.ForgeDirection;
import net.minecraftforge.common.IPlantable;
import net.minecraftforge.common.util.ForgeDirection;

public class dylanpdxFarmland extends BlockFarmland {
    @SideOnly(Side.CLIENT)
    private IIcon field_149824_a;
    @SideOnly(Side.CLIENT)
    private IIcon field_149823_b;
    private static final String __OBFID = "CL_00000241";

	protected dylanpdxFarmland() {
		super();
		this.setTickRandomly(true);
		this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.9375F, 1.0F);
		this.setLightOpacity(0);

	}

	/**
	 * Returns a bounding box from the pool of bounding boxes (this means this
	 * box can change after the pool has been cleared to be reused)
	 */
	public AxisAlignedBB getCollisionBoundingBoxFromPool(World par1World,
			int par2, int par3, int par4) {
		return AxisAlignedBB.getAABBPool().getAABB((double) (par2 + 0),
				(double) (par3 + 0), (double) (par4 + 0), (double) (par2 + 1),
				(double) (par3 + 1), (double) (par4 + 1));
	}
	

	/**
	 * Is this block (a) opaque and (b) a full 1m cube? This determines whether
	 * or not to render the shared face of two adjacent blocks and also whether
	 * the player can attach torches, redstone wire, etc to this block.
	 */
	public boolean isOpaqueCube() {
		return false;
	}

	/**
	 * If this block doesn't render as an ordinary block it will return False
	 * (examples: signs, buttons, stairs, etc)
	 */
	public boolean renderAsNormalBlock() {
		return false;
	}

	@SideOnly(Side.CLIENT)
	/**
	 * From the specified side and block metadata retrieves the blocks texture. Args: side, metadata
	 */
    
	/* public IIcon getIcon(int p_149691_1_, int p_149691_2_)
    {
        return p_149691_1_ == 1 ? (p_149691_2_ > 0 ? this.field_149824_a : this.field_149823_b) : Blocks.dirt.getBlockTextureFromSide(p_149691_1_);
    } */
	
	/*public void updateTick(World par1World, int par2, int par3, int par4,
			Random par5Random) {
		if (!this.isWaterNearby(par1World, par2, par3, par4)
				&& !par1World.canLightningStrikeAt(par2, par3 + 1, par4)) {
			int l = par1World.getBlockMetadata(par2, par3, par4);

			if (l > 0) {
				par1World
						.setBlockMetadataWithNotify(par2, par3, par4, l - 1, 2);
			} else if (!this.func_149822_e(p_149674_1_, p_149674_2_, p_149674_3_, p_149674_4_)) {
				par1World.setBlock(par2, par3, par4, Blocks.dirt);
			}
		} else {
			par1World.setBlockMetadataWithNotify(par2, par3, par4, 7, 2);
		}
		if (getIdFromBlock(par1World.getBlock(par2, par3 + 1, par4)) == getIdFromBlock(this)) {
			// par1World.setBlockToAir(par2, par3, par4);
			// System.out.println("ded"); //works!

		}
		// par1World.scheduleBlockUpdate(par2, par3, par4, this.blockID, 10);
	}

	/**
	 * Block's chance to react to an entity falling on it.
	 */
	public void onFallenUpon(World par1World, int par2, int par3, int par4,
			Entity par5Entity, float par6) {
		if (!par1World.isRemote && par1World.rand.nextFloat() < par6 - 0.5F) {
			if (!(par5Entity instanceof EntityPlayer)
					&& !par1World.getGameRules().getGameRuleBooleanValue(
							"mobGriefing")) {
				return;
			}

			par1World.setBlock(par2, par3, par4, Blocks.dirt);
		}
	}

	/**
	 * returns true if there is at least one cropblock nearby (x-1 to x+1, y+1,
	 * z-1 to z+1)
	 */
	
    /*private boolean func_149822_e(World p_149822_1_, int p_149822_2_, int p_149822_3_, int p_149822_4_)
    {
        byte b0 = 0;

        for (int l = p_149822_2_ - b0; l <= p_149822_2_ + b0; ++l)
        {
            for (int i1 = p_149822_4_ - b0; i1 <= p_149822_4_ + b0; ++i1)
            {
                Block block = p_149822_1_.getBlock(l, p_149822_3_ + 1, i1);

                if (block instanceof IPlantable && canSustainPlant(p_149822_1_, p_149822_2_, p_149822_3_, p_149822_4_, ForgeDirection.UP, (IPlantable)block))
                {
                    return true;
                }
            }
        }

        return false;
    }*/

	/**
	 * returns true if there's water nearby (x-4 to x+4, y to y+1, k-4 to k+4)
	 */
	private boolean isWaterNearby(World par1World, int par2, int par3, int par4) {
		for (int l = par2 - 4; l <= par2 + 4; ++l) {
			for (int i1 = par3; i1 <= par3 + 1; ++i1) {
				for (int j1 = par4 - 4; j1 <= par4 + 4; ++j1) {
					if (par1World.getBlock(l, i1, j1).getMaterial() == Material.water) {
						return true;
					}
				}
			}
		}

		return false;
	}

	/**
	 * Lets the block know when one of its neighbor changes. Doesn't know which
	 * neighbor changed (coordinates passed are their own) Args: x, y, z,
	 * neighbor blockID
	 */
    public void onNeighborBlockChange(World p_149695_1_, int p_149695_2_, int p_149695_3_, int p_149695_4_, Block p_149695_5_)
    {
        super.onNeighborBlockChange(p_149695_1_, p_149695_2_, p_149695_3_, p_149695_4_, p_149695_5_);
        Material material = p_149695_1_.getBlock(p_149695_2_, p_149695_3_ + 1, p_149695_4_).getMaterial();

        if (material.isSolid())
        {
            p_149695_1_.setBlock(p_149695_2_, p_149695_3_, p_149695_4_, Blocks.dirt);
        }
    }

	/**
	 * Returns the ID of the items to drop on destruction.
	 */
	public int idDropped(int par1, Random par2Random, int par3) {
		//return Blocks.dirt.getidDropped(0, par2Random, par3);
		return 3;
	}

	@SideOnly(Side.CLIENT)
	/**
	 * only called by clickMiddleMouseButton , and passed to inventory.setCurrentItem (along with isCreative)
	 */
	public int idPicked(World par1World, int par2, int par3, int par4) {
		return getIdFromBlock(Blocks.dirt);
	}

	@SideOnly(Side.CLIENT)
	/**
	 * When this method is called, your block should register all the icons it needs with the given IconRegister. This
	 * is the only chance you get to register icons.
	 */
    public void registerBlockIcons(IIconRegister p_149651_1_)
    {
        this.field_149824_a = p_149651_1_.registerIcon(this.getTextureName() + "_wet");
        this.field_149823_b = p_149651_1_.registerIcon(this.getTextureName() + "_dry");
    }
//
	@SideOnly(Side.CLIENT)
	public boolean onBlockActivated(World par1World, int par2, int par3,
			int par4, EntityPlayer par5EntityPlayer, int par6, float par7,
			float par8, float par9) {
		// par5EntityPlayer.displayGUIWorkbench(par2, par3, par4);
		ItemStack stack = par5EntityPlayer.getHeldItem();
		if (stack != null && Item.getIdFromItem(stack.getItem()) == Item.getIdFromItem(Items.potato)) {
			par1World.setBlock(par2, par3 + 1, par4,
					hellstone.Mod_hellstone_main.HellPotato);
			if (par5EntityPlayer.capabilities.isCreativeMode != true) {
				stack.stackSize = stack.stackSize - 1;
			}
			return true;
		} else {
			return false;
		}
	}
}
