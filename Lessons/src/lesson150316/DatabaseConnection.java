package lesson150316;

public class DatabaseConnection {

	private static final int MAX_CONNECTIONS = 3;
	private static int Counter;
	
	public static DatabaseConnection create() {
		if (Counter >= 3) {
			return null;
		}
		return new DatabaseConnection();
	}
	
	{
		Counter++;
	}
	
	private DatabaseConnection() {
	}
	
	static public void freeAny() {
		Counter--;
	}
	
	public void free() {
		Counter--;
	}
	
	
	
}
