package com.penpennetworks.minecraft.forgetest2;

import com.penpennetworks.minecraft.forgetest2.proxy.ICommonProxy;
import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod( modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION, acceptedMinecraftVersions = Reference.ACCEPTED_VERSION )
public class ForgeTestCore {

    // Proxy
    @SidedProxy( clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS )
    private static ICommonProxy proxy;

    // Logger
    private static Logger logger;

    // Events
    @EventHandler
    public void preInit( FMLPreInitializationEvent event ){
        logger = event.getModLog();

        proxy.preInit(event);
    }

    @EventHandler
    public void init( FMLInitializationEvent event ){
        logger.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());

        proxy.init(event);
    }

    @EventHandler
    public void postInit( FMLPostInitializationEvent event ){
        proxy.postInit(event);
    }

}
