package makoteyka.mod;

import makoteyka.mod.proxy.CommonProxy;
import makoteyka.mod.util.ModInfo;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = ModInfo.MODID, name = ModInfo.NAME, version = ModInfo.VERSION)
public class Main
{
    @Instance
    public static Main instance;

    @SidedProxy(clientSide =ModInfo.CLIENT, serverSide = ModInfo.COMMON)
    public static CommonProxy proxy;

    @EventHandler
    public static void preInit(FMLPreInitializationEvent event) {}
    @EventHandler
    public static void init(FMLInitializationEvent event) {}
    @EventHandler
    public static void postInit(FMLPostInitializationEvent event) {}
}

