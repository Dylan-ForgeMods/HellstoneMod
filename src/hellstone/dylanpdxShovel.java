package hellstone;

import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import net.minecraft.entity.player.EntityPlayer;
//import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.EnumChatFormatting;

// Types: ItemPickaxe, ItemAxe, ItemHoe, ItemSword
public class dylanpdxShovel extends ItemSpade { // spade... wtf its shovel noob

	public dylanpdxShovel(int ItemID, ToolMaterial material) {
		super(material);

	}

	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack stack, EntityPlayer player, List list,
			boolean check) {
		// list.add(EnumChatFormatting.DARK_PURPLE+"");
	}

}
