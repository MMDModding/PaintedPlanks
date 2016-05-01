package paintedplanks.init;

public class Recipes {

	private static boolean initDone = false;

	public static void init(){
		if(initDone)return;
		initDone = true;
	}

}
