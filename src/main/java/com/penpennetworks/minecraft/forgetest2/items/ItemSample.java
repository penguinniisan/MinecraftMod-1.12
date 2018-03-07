package com.penpennetworks.minecraft.forgetest2.items;

import com.penpennetworks.minecraft.forgetest2.Reference;
import net.minecraft.item.Item;

public class ItemSample extends Item {

    public ItemSample(){
        setUnlocalizedName(Reference.ForgeTestItems.SAMPLE_ITEM.getUnlocalizedName());
        setRegistryName(Reference.ForgeTestItems.SAMPLE_ITEM.getRegistryName());
    }

}
