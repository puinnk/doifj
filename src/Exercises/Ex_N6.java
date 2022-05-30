package Exercises;
import java.util.Scanner;

public class Ex_N6 {
	public static void ExN6() {
		System.out.println("Задание 6");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите количество элементов");
		int x = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Введите элементы через пробел");
		
		String data = scanner.nextLine();
		String[] strArr = data.split(" ");
		
		int counter = 0;
	
		for (int i = 1;i <(x - 1);i++) {
			int a = Integer.parseInt(strArr[i-1]);
			int b = Integer.parseInt(strArr[i]);
			int c = Integer.parseInt(strArr[i+1]);
			if (b > a && b > c) {
				counter++;
			}
		}
		System.out.println(counter);

		scanner.close();
	}
}