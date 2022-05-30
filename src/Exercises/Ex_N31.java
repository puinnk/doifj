package Exercises;
import java.util.Scanner;

public class Ex_N31 {
	public static void ExN31 () {
		System.out.println("Задание 31");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите число");
		int n = scanner.nextInt();
		scanner.nextLine();
		// по условиям задачи n > 1 && n < 366 поэтому проверки не делаю
		int month = 1;
		int days = n;
		
		int[] monthArr = {31,28,31,30,31,30,31,31,30,31,30,31};
		for (int i = 0;i<monthArr.length;i++) {
			if (days > monthArr[i]) {
				month++;
				days -= monthArr[i];
			} else {
				break;
			}
		}
		System.out.println(days+" "+month);
		
		
		scanner.close();
	}
}