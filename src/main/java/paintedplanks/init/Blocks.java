package paintedplanks.init;

import net.minecraft.block.material.Material;

import java.util.HashMap;
import java.util.Map;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;
import paintedplanks.PaintedPlanks;
import paintedplanks.blocks.PaintedBlock;

public class Blocks {
	private static final Map<String,Block> allBlocks = new HashMap<>();

	private static boolean initDone = false;

	public static void init(){
		if(initDone)return;
		
		initDone = true;
	}

	private static Block addBlock(Block block, String name){
		block.setRegistryName(PaintedPlanks.MODID, name);
		block.setUnlocalizedName(PaintedPlanks.MODID+"."+ name);
		GameRegistry.register(block);
		
		ItemBlock itemBlock = new ItemBlock(block);
		itemBlock.setRegistryName(PaintedPlanks.MODID, name);
		GameRegistry.register(itemBlock);
		
		allBlocks.put(name, block);
		return block;
	}

	private static Block createBlock(Material material){
		return addBlock(new PaintedBlock(material),"acacia_planks");
	}

	
}
