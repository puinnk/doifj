package Exercises;
import java.util.Scanner;

public class Ex_N33 {
	public static void ExN33 () {
		System.out.println("Задание 33");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите дату dd mm yyyy");
		String date = scanner.nextLine();

		int day = Integer.parseInt(date.split(" ")[0]);
		int month = Integer.parseInt(date.split(" ")[1]);
		int year = Integer.parseInt(date.split(" ")[2]);
		year -=1;
		int[] monthArr = {31,28,31,30,31,30,31,31,30,31,30,31};		
		boolean high = year % 400 == 0 ? true : year % 100 != 0 && year % 4 == 0 ? true : false;
		
		int totalDays = year * 365;
		
		for (int i = 0;i<month - 1;i++) {
			totalDays += monthArr[i];
		}
		totalDays += day;
		int updays = (year / 400) + (year / 4) -(year / 100);
		totalDays +=updays;

		System.out.println(totalDays);
		
		
		scanner.close();
	}
}