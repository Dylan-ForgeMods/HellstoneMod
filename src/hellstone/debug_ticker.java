package hellstone;

import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import net.minecraft.entity.player.EntityPlayer;
//import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;
import net.minecraft.*;

// Types: ItemPickaxe, ItemAxe, ItemHoe, ItemSword
public class debug_ticker extends Item{

	public boolean onItemUse(ItemStack par1ItemStack,
			EntityPlayer par2EntityPlayer, World par3World, int par4, int par5,
			int par6, int par7, float par8, float par9, float par10) {
		if (par3World.blockExists(par4, par5, par6)) {
			if (par2EntityPlayer.isSneaking()) {
				for (int supertick = 0; supertick > 40; supertick = supertick + 1)
					;
				{
					par3World.scheduleBlockUpdate(par4, par5, par6,
							par3World.getBlock(par4, par5, par6), 1);
				}
				//IChatComponent
				//ChatComponentText
				/*par2EntityPlayer.addChatMessage("Block "
						+ EnumChatFormatting.BOLD + "Mega"
						+ EnumChatFormatting.RESET + " Ticked!");
			} else {
				par3World.scheduleBlockUpdate(par4, par5, par6,
						par3World.getBlock(par4, par5, par6), 1);
				par2EntityPlayer.addChatMessage("Block Ticked!");

			}
		} else {
			par2EntityPlayer
					.addChatMessage("Couldn't find a block there, sorry :(");
		}
*/
	}}
		
	return true;
	}

	public debug_ticker() {
		super();

	}

	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack stack, EntityPlayer player, List list,
			boolean check) {
		list.add(EnumChatFormatting.DARK_PURPLE + "DEBUG ITEM");
		list.add(EnumChatFormatting.RED + "USE AT OWN RISK");
	}

}
