package mods.polyblockz.common;


@Mod
(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION_NUMBER)
@NetworkMod
(clientSideRequired = true, serverSideRequired = true, channels = { Reference.CHANNEL_NAME })

public class PolyBlockz
{
        public static CreativeTabs tabPolyBlockzBlocks = new CreativeTab_PolyBlockz_Skills
                        (CreativeTabs.getNextID(), "PolyBlockz_Skills");
                        
        /*
         *
         */
         
        public static final String MOD_ID = "polyblockz_skills";
        public static final String MOD_NAME = "Poly Block'z - Skills by Polygong";
        public static final String VERSION_NUMBER = "Alpha v0.0.1_060114";
        public static final String SERVER_PROXY_CLASS = "common.CommonProxy";
        public static final String CLIENT_PROXY_CLASS = "client.ClientProxy";
        public static final String CHANNEL_NAME = MOD_ID;


        @SidedProxy
        (clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
        public static CommonProxy proxy;
        
        @Instance
        (Reference.MOD_ID)
        public static PolyBlockz_Skills instance;

        @EventHandler
        public void Load(FMLPreInitializationEvent Eevent)
        {
            -
        }

        
        @Init
        public void load(FMLInitializationEvent event)
        {
            -
        }
}
