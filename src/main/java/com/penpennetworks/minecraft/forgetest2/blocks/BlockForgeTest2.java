package com.penpennetworks.minecraft.forgetest2.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.util.ResourceLocation;

import java.util.Objects;

public class BlockForgeTest2 extends Block {

    public BlockForgeTest2( final Material material, final MapColor mapColor, final String blockName ){
        super( material, mapColor );
        setBlockName(this, blockName );
    }

    public BlockForgeTest2( final Material material, final String blockName ){
        this( material, material.getMaterialMapColor(), blockName );
    }

    public static void setBlockName( final Block block, final String blockName ){
        block.setRegistryName(blockName);
        final ResourceLocation registryName = Objects.requireNonNull(block.getRegistryName());
        block.setUnlocalizedName(registryName.toString());
    }

}
