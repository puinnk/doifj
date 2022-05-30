package Exercises;
import java.util.Scanner;

public class Ex_N32 {
	public static void ExN32 () {
		System.out.println("«адание 32");
		Scanner scanner = new Scanner(System.in);
		System.out.println("¬ведите дату d m y");
		String date = scanner.nextLine();

		int day = Integer.parseInt(date.split(" ")[0]);
		int month = Integer.parseInt(date.split(" ")[1]);
		int year = Integer.parseInt(date.split(" ")[2]);
		int[] monthArr = {31,28,31,30,31,30,31,31,30,31,30,31};		
		boolean high = year % 400 == 0 ? true : year % 100 != 0 && year % 4 == 0 ? true : false;
		if (high) {monthArr[1]++;}
		// перевожу мес€ца в дни
		int totalDays = day;
		for (int i = 0;i<month - 1;i++) {
			totalDays += monthArr[i];
		}
		
		totalDays+=2;
		
		int monthAns = 1;
		
		// формирую ответ
		for (int i = 0;i<monthArr.length;i++) {
			if (totalDays > monthArr[i]) {
				monthAns++;
				totalDays -= monthArr[i];
			} else {
				break;
			}
		}
		// проверка на новый год
		if (monthAns > 12) {
			monthAns = 1;
			year++;
		}
		System.out.println(totalDays+" "+monthAns+" "+year);
		
		
		scanner.close();
	}
}