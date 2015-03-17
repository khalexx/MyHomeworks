package lesson150317.other;

import lesson150317.Singleton;

public class UseSingleton {

	public static void main(final String[] args) {
		
		System.out.println("start");
		
		Singleton singleton;
		
		singleton = Singleton.get();
		
		System.out.println("finish");
		
	}
	
}
