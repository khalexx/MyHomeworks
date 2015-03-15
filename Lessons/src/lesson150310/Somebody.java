package lesson150310;

public class Somebody {

	private String name;
	
	public Somebody(String name) {
		this.name = name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void ping() {
		System.out.println("Pong from " + name);
	}
	
	public static void main(String[] args) {
		
		Somebody personA = new Somebody("Pete");
		personA.ping();
		
		Somebody personB = personA;
		personB.ping();
		
		personA.setName("John");
		
		personB.ping();
		
		personA = null;
		
		personB.ping();
		
		personB = null;
		
		
	}
	
}
