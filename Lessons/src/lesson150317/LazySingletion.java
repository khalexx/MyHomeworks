package lesson150317;

public class LazySingletion {
	
	private static LazySingletion instance;
	
	private LazySingletion() {
	}
	
	public LazySingletion get() {
		if (instance == null) {
			instance = new LazySingletion(); // lazy instantiation
		}
		return instance;
	}

}
