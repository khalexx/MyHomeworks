package Homeworks;

import java.util.Scanner;

public class GuessTheNumber {
	
	public static void main(String[] args) {
		
		int usernum = 0;
		int upbord = 101;
		int lowbord = 1;
		int guess = (upbord + lowbord) / 2;
		String strnum;
		
		Scanner req = new Scanner(System.in);
		System.out.println("Загадайте число от 1 до 100 и введите его, я не буду смотреть что вы ввели,");
		System.out.println("но угадаю это число максимум с 7 попыток.");
		while (usernum<1 || usernum>100) {
			strnum=req.nextLine();
			usernum=Integer.parseInt(strnum);
			if (usernum<1 && usernum>100) {
				System.out.println("От 1 до 100;)");
			}
			
		}
		
		
		for(int i = 0;i < 7;i++) {
				String answer="";
				System.out.printf("Ваше число %d? Если да, напишите \"yes\", если нет\n",guess);
				System.out.println("напишите больше -\"greater\" оно, или меньше\"less\"");
				answer=req.nextLine();
				if (answer.equals("больше")) {
					lowbord=guess;
				} else if (answer.equals("меньше")) {
					upbord = guess;
				} else if (answer.equals("да")) {
					System.out.printf("Угадал с %d попытки.",(i+1));
					break;
				} else {
					i--;
				}
				if (guess==usernum) {
					System.out.println("Таки угадал, вы меня пытаетесь обмануть...");
					break;
				}
				guess = (upbord + lowbord) / 2;
			};
	}
	
}
