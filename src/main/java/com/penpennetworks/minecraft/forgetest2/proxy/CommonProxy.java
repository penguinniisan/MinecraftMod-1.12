package com.penpennetworks.minecraft.forgetest2.proxy;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public interface CommonProxy {

    void preInit( FMLPreInitializationEvent event );
    void init( FMLInitializationEvent event );
    void postInit(FMLPostInitializationEvent event );

}
