package hellstone;


import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.World;
import cpw.mods.fml.common.IWorldGenerator;

public class WorldGeneratorDylanpdx implements IWorldGenerator {
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		switch(world.provider.dimensionId){
		case -1:
		    generateNether(world, random, chunkX * 16, chunkZ * 16);
		    break;
		case 0:
		    generateSurface(world, random, chunkX * 16, chunkZ * 16);
		    break;
		case 1:
		    generateEnd(world, random, chunkX * 16, chunkZ * 16);
		    break;
		}
	}

	private void generateEnd(World world, Random random, int i, int j) {
		// TODO Auto-generated method stub
		
	}

	private void generateSurface(World world, Random random, int i, int j) {
		// TODO Auto-generated method stub
		
	}

	private void generateNether(World world, Random random, int i, int j) {
		// TODO Auto-generated method stub
        for(int k = 0; k < 30; k++){
        	int firstBlockXCoord = i + random.nextInt(16);
        	int firstBlockYCoord = random.nextInt(255); // testing
        	int firstBlockZCoord = j + random.nextInt(16);
        	
        	//(new WorldGenMinable(Block.getIdFromBlock(Mod_hellstone_main.HellstoneOre), 5)).generate(world, random, firstBlockXCoord, firstBlockYCoord, firstBlockZCoord); 
        	//TODO: FEEX FEEX FEEX ^^^^^^^^^^^^ 5/21/14 3:51 PM
        }
	}
	// The constructor for WorldGenMinable is simple.
	// First parameter is the block ID you want to generate. It is very important to use Block.blockID instead of the ID field you probably have in your main class.
	// Second parameter can be omitted. In this case, continue straight to the third one as I did. If you include the second parameter, note that it is the metadata of the block.
	// Third parameter is the number of blocks per vein. Self-explanatory.
	// The generate method has a bunch of parameters.
	// First one is the world. Just use the one the method gives you.
	// Second one is an instance of Random. Again, our method gives one to us.
	// Third, fourth and fifth are the X, Y and Z coordinates. 
}