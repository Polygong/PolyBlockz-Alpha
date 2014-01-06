package polyblockz_skills.common;


@Mod
(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION_NUMBER)
@NetworkMod
(clientSideRequired = true, serverSideRequired = false, channels = { Reference.CHANNEL_NAME })

public class PolyBlockz
{
        public static CreativeTabs tabPolyBlockzBlocks = new CreativeTab_PolyBlockz_Skills
                        (CreativeTabs.getNextID(), "PolyBlockz_Skills");
                        
        /*
         Skill System
                -Skills
                        --Unlocks
                                ---level
                                ---Block/item
                -Players
                        --Skills
                                ---Level
                                ---Exp
        
        Server
                -Player data
                
        Client
                -Own Data
                -part of Player Data
                
        Packets
                -Server to Client
                        --1. Skills update(on get exp or join)
                                ---Skill
                                ---Level
                                ---Exp
                        --2. Simple skill update (on levelup or join)
                                ---Player
                                ---Skills
                                ---Level
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
