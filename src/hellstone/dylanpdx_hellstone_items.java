package hellstone;
import net.minecraft.item.Item;
import cpw.mods.fml.relauncher.*;
import net.minecraft.creativetab.CreativeTabs;
public class dylanpdx_hellstone_items extends Item {
	public dylanpdx_hellstone_items(int par1) {
		super(); //Returns super constructor: par1 is ID
		setCreativeTab(CreativeTabs.tabMaterials); //Tells the game what creative mode tab it goes in
}
}