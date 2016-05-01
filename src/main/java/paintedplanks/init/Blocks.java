package paintedplanks.init;

import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import java.util.HashMap;
import java.util.Map;

import net.minecraft.block.Block;
import net.minecraft.block.BlockDoor;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import paintedplanks.PaintedPlanks;
import paintedplanks.blocks.PaintedBlock;

public class Blocks {
	private static final Map<String,Block> allBlocks = new HashMap<>();

	/**
	 * Gets an block by its name. The name is the name as it is registered in 
	 * the GameRegistry, not its unlocalized name (the unlocalized name is the 
	 * registered name plus the prefix "paintedplanks.")
	 * @param name The name of the block in question
	 * @return The block matching that name, or null if there isn't one
	 */
	public static Block getBlockByName(String name) {
		return allBlocks.get(name);
	}

	public static Block oak_planks_white;
	public static Block oak_planks_orange;
	public static Block oak_planks_magenta;
	public static Block oak_planks_light_blue;
	public static Block oak_planks_yellow;
	public static Block oak_planks_lime;
	public static Block oak_planks_pink;
	public static Block oak_planks_gray;
	public static Block oak_planks_silver;
	public static Block oak_planks_cyan;
	public static Block oak_planks_purple;
	public static Block oak_planks_blue;
	public static Block oak_planks_brown;
	public static Block oak_planks_green;
	public static Block oak_planks_red;
	public static Block oak_planks_black;

	public static Block spruce_planks_white;
	public static Block spruce_planks_orange;
	public static Block spruce_planks_magenta;
	public static Block spruce_planks_light_blue;
	public static Block spruce_planks_yellow;
	public static Block spruce_planks_lime;
	public static Block spruce_planks_pink;
	public static Block spruce_planks_gray;
	public static Block spruce_planks_silver;
	public static Block spruce_planks_cyan;
	public static Block spruce_planks_purple;
	public static Block spruce_planks_blue;
	public static Block spruce_planks_brown;
	public static Block spruce_planks_green;
	public static Block spruce_planks_red;
	public static Block spruce_planks_black;

	public static Block birch_planks_white;
	public static Block birch_planks_orange;
	public static Block birch_planks_magenta;
	public static Block birch_planks_light_blue;
	public static Block birch_planks_yellow;
	public static Block birch_planks_lime;
	public static Block birch_planks_pink;
	public static Block birch_planks_gray;
	public static Block birch_planks_silver;
	public static Block birch_planks_cyan;
	public static Block birch_planks_purple;
	public static Block birch_planks_blue;
	public static Block birch_planks_brown;
	public static Block birch_planks_green;
	public static Block birch_planks_red;
	public static Block birch_planks_black;
	
	public static Block jungle_planks_white;
	public static Block jungle_planks_orange;
	public static Block jungle_planks_magenta;
	public static Block jungle_planks_light_blue;
	public static Block jungle_planks_yellow;
	public static Block jungle_planks_lime;
	public static Block jungle_planks_pink;
	public static Block jungle_planks_gray;
	public static Block jungle_planks_silver;
	public static Block jungle_planks_cyan;
	public static Block jungle_planks_purple;
	public static Block jungle_planks_blue;
	public static Block jungle_planks_brown;
	public static Block jungle_planks_green;
	public static Block jungle_planks_red;
	public static Block jungle_planks_black;
	
	public static Block acacia_planks_white;
	public static Block acacia_planks_orange;
	public static Block acacia_planks_magenta;
	public static Block acacia_planks_light_blue;
	public static Block acacia_planks_yellow;
	public static Block acacia_planks_lime;
	public static Block acacia_planks_pink;
	public static Block acacia_planks_gray;
	public static Block acacia_planks_silver;
	public static Block acacia_planks_cyan;
	public static Block acacia_planks_purple;
	public static Block acacia_planks_blue;
	public static Block acacia_planks_brown;
	public static Block acacia_planks_green;
	public static Block acacia_planks_red;
	public static Block acacia_planks_black;
	
	public static Block big_oak_planks_white;
	public static Block big_oak_planks_orange;
	public static Block big_oak_planks_magenta;
	public static Block big_oak_planks_light_blue;
	public static Block big_oak_planks_yellow;
	public static Block big_oak_planks_lime;
	public static Block big_oak_planks_pink;
	public static Block big_oak_planks_gray;
	public static Block big_oak_planks_silver;
	public static Block big_oak_planks_cyan;
	public static Block big_oak_planks_purple;
	public static Block big_oak_planks_blue;
	public static Block big_oak_planks_brown;
	public static Block big_oak_planks_green;
	public static Block big_oak_planks_red;
	public static Block big_oak_planks_black;

	private static boolean initDone = false;

	public static void init(){
		if(initDone)return;
		
		oak_planks_white = createPlanks("oak", "white");
		oak_planks_orange = createPlanks("oak", "orange");
		oak_planks_magenta = createPlanks("oak", "magenta");
		oak_planks_light_blue = createPlanks("oak", "light_blue");
		oak_planks_yellow = createPlanks("oak", "yellow");
		oak_planks_lime = createPlanks("oak", "lime");
		oak_planks_pink = createPlanks("oak", "pink");
		oak_planks_gray = createPlanks("oak", "gray");
		oak_planks_silver = createPlanks("oak", "silver");
		oak_planks_cyan = createPlanks("oak", "cyan");
		oak_planks_purple = createPlanks("oak", "purple");
		oak_planks_blue = createPlanks("oak", "blue");
		oak_planks_brown = createPlanks("oak", "brown");
		oak_planks_green = createPlanks("oak", "green");
		oak_planks_red = createPlanks("oak", "red");
		oak_planks_black = createPlanks("oak", "black");

		spruce_planks_white = createPlanks("spruce", "white");
		spruce_planks_orange = createPlanks("spruce", "orange");
		spruce_planks_magenta = createPlanks("spruce", "magenta");
		spruce_planks_light_blue = createPlanks("spruce", "light_blue");
		spruce_planks_yellow = createPlanks("spruce", "yellow");
		spruce_planks_lime = createPlanks("spruce", "lime");
		spruce_planks_pink = createPlanks("spruce", "pink");
		spruce_planks_gray = createPlanks("spruce", "gray");
		spruce_planks_silver = createPlanks("spruce", "silver");
		spruce_planks_cyan = createPlanks("spruce", "cyan");
		spruce_planks_purple = createPlanks("spruce", "purple");
		spruce_planks_blue = createPlanks("spruce", "blue");
		spruce_planks_brown = createPlanks("spruce", "brown");
		spruce_planks_green = createPlanks("spruce", "green");
		spruce_planks_red = createPlanks("spruce", "red");
		spruce_planks_black = createPlanks("spruce", "black");

		birch_planks_white = createPlanks("birch", "white");
		birch_planks_orange = createPlanks("birch", "orange");
		birch_planks_magenta = createPlanks("birch", "magenta");
		birch_planks_light_blue = createPlanks("birch", "light_blue");
		birch_planks_yellow = createPlanks("birch", "yellow");
		birch_planks_lime = createPlanks("birch", "lime");
		birch_planks_pink = createPlanks("birch", "pink");
		birch_planks_gray = createPlanks("birch", "gray");
		birch_planks_silver = createPlanks("birch", "silver");
		birch_planks_cyan = createPlanks("birch", "cyan");
		birch_planks_purple = createPlanks("birch", "purple");
		birch_planks_blue = createPlanks("birch", "blue");
		birch_planks_brown = createPlanks("birch", "brown");
		birch_planks_green = createPlanks("birch", "green");
		birch_planks_red = createPlanks("birch", "red");
		birch_planks_black = createPlanks("birch", "black");

		jungle_planks_white = createPlanks("jungle", "white");
		jungle_planks_orange = createPlanks("jungle", "orange");
		jungle_planks_magenta = createPlanks("jungle", "magenta");
		jungle_planks_light_blue = createPlanks("jungle", "light_blue");
		jungle_planks_yellow = createPlanks("jungle", "yellow");
		jungle_planks_lime = createPlanks("jungle", "lime");
		jungle_planks_pink = createPlanks("jungle", "pink");
		jungle_planks_gray = createPlanks("jungle", "gray");
		jungle_planks_silver = createPlanks("jungle", "silver");
		jungle_planks_cyan = createPlanks("jungle", "cyan");
		jungle_planks_purple = createPlanks("jungle", "purple");
		jungle_planks_blue = createPlanks("jungle", "blue");
		jungle_planks_brown = createPlanks("jungle", "brown");
		jungle_planks_green = createPlanks("jungle", "green");
		jungle_planks_red = createPlanks("jungle", "red");
		jungle_planks_black = createPlanks("jungle", "black");

		acacia_planks_white = createPlanks("acacia", "white");
		acacia_planks_orange = createPlanks("acacia", "orange");
		acacia_planks_magenta = createPlanks("acacia", "magenta");
		acacia_planks_light_blue = createPlanks("acacia", "light_blue");
		acacia_planks_yellow = createPlanks("acacia", "yellow");
		acacia_planks_lime = createPlanks("acacia", "lime");
		acacia_planks_pink = createPlanks("acacia", "pink");
		acacia_planks_gray = createPlanks("acacia", "gray");
		acacia_planks_silver = createPlanks("acacia", "silver");
		acacia_planks_cyan = createPlanks("acacia", "cyan");
		acacia_planks_purple = createPlanks("acacia", "purple");
		acacia_planks_blue = createPlanks("acacia", "blue");
		acacia_planks_brown = createPlanks("acacia", "brown");
		acacia_planks_green = createPlanks("acacia", "green");
		acacia_planks_red = createPlanks("acacia", "red");
		acacia_planks_black = createPlanks("acacia", "black");

		big_oak_planks_white = createPlanks("big_oak", "white");
		big_oak_planks_orange = createPlanks("big_oak", "orange");
		big_oak_planks_magenta = createPlanks("big_oak", "magenta");
		big_oak_planks_light_blue = createPlanks("big_oak", "light_blue");
		big_oak_planks_yellow = createPlanks("big_oak", "yellow");
		big_oak_planks_lime = createPlanks("big_oak", "lime");
		big_oak_planks_pink = createPlanks("big_oak", "pink");
		big_oak_planks_gray = createPlanks("big_oak", "gray");
		big_oak_planks_silver = createPlanks("big_oak", "silver");
		big_oak_planks_cyan = createPlanks("big_oak", "cyan");
		big_oak_planks_purple = createPlanks("big_oak", "purple");
		big_oak_planks_blue = createPlanks("big_oak", "blue");
		big_oak_planks_brown = createPlanks("big_oak", "brown");
		big_oak_planks_green = createPlanks("big_oak", "green");
		big_oak_planks_red = createPlanks("big_oak", "red");
		big_oak_planks_black = createPlanks("big_oak", "black");

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

	private static Block createPlanks(String type, String color){
		return addBlock(new PaintedBlock(Material.WOOD),type+"_planks_"+color);
	}
	
	public static void registerItemRenders(FMLInitializationEvent event){
		for(String name : allBlocks.keySet()){
			if(allBlocks.get(name) instanceof BlockDoor) continue;// do not add door blocks
			Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
			.register(net.minecraft.item.Item.getItemFromBlock(allBlocks.get(name)), 0, 
				new ModelResourceLocation(PaintedPlanks.MODID+":"+name, "inventory"));
		}
	}	
}
