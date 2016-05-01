package paintedplanks;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
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
	public static PaintedPlanks INSTANCE = null;
    public static final String MODID = "paintedplanks";
    public static final String NAME = "Painted Planks";
    public static final String VERSION = "1.0.0";
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
    	INSTANCE = this;

    	// TODO: load config
    	Configuration config = new Configuration(event.getSuggestedConfigurationFile());
    	config.load();

    	config.save();
    	
		paintedplanks.init.Blocks.init();
		paintedplanks.init.Items.init();

		if(event.getSide() == Side.CLIENT){
			clientPreInit(event);
		}
		if(event.getSide() == Side.SERVER){
			serverPreInit(event);
		}
    }

	@SideOnly(Side.CLIENT)
	private void clientPreInit(FMLPreInitializationEvent event){
		// client-only code
	}
	@SideOnly(Side.SERVER)
	private void serverPreInit(FMLPreInitializationEvent event){
		// server-only code
	}

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
		paintedplanks.init.Recipes.init();

		if(event.getSide() == Side.CLIENT){
			clientInit(event);
		}
		if(event.getSide() == Side.SERVER){
			serverInit(event);
		}
    }

	@SideOnly(Side.CLIENT)
	private void clientInit(FMLInitializationEvent event){
		// client-only code
		paintedplanks.init.Items.registerItemRenders(event);
		paintedplanks.init.Blocks.registerItemRenders(event);
	}
	@SideOnly(Side.SERVER)
	private void serverInit(FMLInitializationEvent event){
		// server-only code
	}

    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
		if(event.getSide() == Side.CLIENT){
			clientPostInit(event);
		}
		if(event.getSide() == Side.SERVER){
			serverPostInit(event);
		}

    }

	@SideOnly(Side.CLIENT)
	private void clientPostInit(FMLPostInitializationEvent event){
		// client-only code
	}
	@SideOnly(Side.SERVER)
	private void serverPostInit(FMLPostInitializationEvent event){
		// server-only code
	}
}
