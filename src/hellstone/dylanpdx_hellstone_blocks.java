package hellstone;

import java.util.Random;

//import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
//import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;

public class dylanpdx_hellstone_blocks extends Block {

public dylanpdx_hellstone_blocks(String texture) {
super(Material.rock);
setCreativeTab(Mod_hellstone_main.HellstoneTab); //place in creative tabs

}


//texure the block (Not sure if it's required)
//public String getTextureFile(){
//return "/textures/blocks/TEXTURE_NAME.png";
}