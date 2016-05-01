package paintedplanks.blocks;

import net.minecraft.block.Block;
//import net.minecraft.block.BlockColored;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
//import net.minecraft.item.EnumDyeColor;

public class PaintedBlock extends Block {

	public PaintedBlock(Material materialIn) {
		super(materialIn);
//        this.setDefaultState(this.blockState.getBaseState().withProperty(COLOR, EnumDyeColor.WHITE));
        this.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
//		this.setMaterial(Material.WOOD);
		this.setHardness(2.0F);
		this.setResistance(5.0F);
		this.setSoundType(SoundType.WOOD);
	}
}
