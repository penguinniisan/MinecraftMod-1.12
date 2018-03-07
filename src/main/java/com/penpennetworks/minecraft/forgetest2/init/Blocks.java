package com.penpennetworks.minecraft.forgetest2.init;

import com.penpennetworks.minecraft.forgetest2.Reference;
import com.penpennetworks.minecraft.forgetest2.blocks.BlockSample;
import com.google.common.base.Preconditions;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;
import net.minecraftforge.registries.IForgeRegistry;

import java.util.HashSet;
import java.util.Set;

@ObjectHolder( Reference.MOD_ID )
public class Blocks {

    public static final BlockSample BLOCK_SAMPLE = new BlockSample();

    @EventBusSubscriber( modid = Reference.MOD_ID )
    public static class RegistrationHandler {

        public static final Set<ItemBlock> ItemBlocks = new HashSet<>();

        @SubscribeEvent
        public static void registerBlocks( final RegistryEvent.Register<Block> event ){

            final Block[] blocks = {
                BLOCK_SAMPLE
            };

            final IForgeRegistry<Block> registry = event.getRegistry();
            registry.registerAll(blocks);

            registerTileEntities();
        }

        @SubscribeEvent
        public static void registerItemBlocks(final RegistryEvent.Register<Item> event) {
            final ItemBlock[] items = {
                new ItemBlock( BLOCK_SAMPLE )
            };

            final IForgeRegistry<Item> registry = event.getRegistry();
            for( final ItemBlock item : items ){
                final Block block = item.getBlock();
                final ResourceLocation registryName = Preconditions.checkNotNull( block.getRegistryName(), "Block %s has null registry name", block );
                registry.register( item.setRegistryName(registryName) );
                ItemBlocks.add(item);
            }

        }

        private static void registerTileEntities(){
        }

    }

}
