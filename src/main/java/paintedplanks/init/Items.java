package paintedplanks.init;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;

public class Items {
	
	private static boolean initDone = false;

	public static void init(){
		if(initDone)return;
		initDone = true;
	}

	public static void registerItemRenders(FMLInitializationEvent event) {
		// TODO Auto-generated method stub
		
	}

}
