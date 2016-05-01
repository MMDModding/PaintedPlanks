package paintedplanks;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;

@Mod(
		modid = PaintedPlanks.MODID,
		name = PaintedPlanks.NAME,
		version = PaintedPlanks.VERSION,
		dependencies = "required-after:Forge@[12.16.0.1865,)",
		acceptedMinecraftVersions = "1.9",
//		certificateFingerprint = "",
		updateJSON = "https://raw.githubusercontent.com/jriwanek/PaintedPlanks/master/update.json")
public class PaintedPlanks
{
    public static final String MODID = "paintedplanks";
    public static final String NAME = "Painted Planks";
    public static final String VERSION = "1.0.0";
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
    }
}
