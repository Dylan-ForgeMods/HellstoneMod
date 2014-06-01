package hellstone;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ThreadDownloadImageData;
//import net.minecraft.client.renderer.texture.TextureObject;
import net.minecraft.util.ResourceLocation;

public class devcape {
	public static void addModerCapes() {

		String capeURL = "http://i.imgur.com/sZ6wSBh.png";
		String[] devs = {"darkhax", "other_dev", "dylanpdx"};

		ThreadDownloadImageData image = new ThreadDownloadImageData(capeURL, null, null);

		for (String username : devs) {
				//TODO: Fix capes, 5/21/2014 1:13 PM
		//Minecraft.getMinecraft().renderEngine.loadTexture(new ResourceLocation("cloaks/" + username), (TextureObject) image);
		}
		}
}
