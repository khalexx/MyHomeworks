package lesson150303;

public class SwitchExample {

	public static void main(String[] args) {

		int i = 5;

		switch (i) {

		case 1:
			System.out.println("one");
			break;
		case 2:
		case 5:
		case 10:
			System.out.println("not one");
			break;
		default:
			System.out.println("something unusual");

		}

	}

}
