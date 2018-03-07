package com.penpennetworks.minecraft.forgetest2;

public class Reference {

    // Mod Information
    public static final String MOD_ID           = "forgetest2";
    public static final String VERSION          = "0.0.1";
    public static final String NAME             = "ForgeTest2";
    public static final String ACCEPTED_VERSION = "[1.12.2]";

    // Proxy
    public static final String CLIENT_PROXY_CLASS = "com.penpennetworks.minecraft.forgetest2.proxy.ClientProxy";
    public static final String SERVER_PROXY_CLASS = "com.penpennetworks.minecraft.forgetest2.proxy.ServerProxy";

    // Blocks registry name
    public static enum ForgeTestBlocks {

        SAMPLE_BLOCK("sampleblock");

        private String registryName;

        ForgeTestBlocks( String registryName ){
            this.registryName = registryName;
        }

        public String getRegistryName(){
            return this.registryName;
        }

    }

    public static enum ForgeTestItems {

        SAMPLE_ITEM("sampleitem","sampleitem");

        private String unlocalizedName;
        private String registryName;

        ForgeTestItems( String unlocalizedName, String registryName ){
            this.unlocalizedName = unlocalizedName;
            this.registryName    = registryName;
        }

        public String getUnlocalizedName(){
            return this.unlocalizedName;
        }

        public String getRegistryName(){
            return this.registryName;
        }

    }

}
