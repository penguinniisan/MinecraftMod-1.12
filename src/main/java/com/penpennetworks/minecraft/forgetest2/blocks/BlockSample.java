package com.penpennetworks.minecraft.forgetest2.blocks;

import com.penpennetworks.minecraft.forgetest2.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockSample extends Block {

    public BlockSample(){
        super( Material.IRON );
        BlockForgeTest2.setBlockName(this, Reference.ForgeTestBlocks.SAMPLE_BLOCK.getRegistryName() );
    }

}
