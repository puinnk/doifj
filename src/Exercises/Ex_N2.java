package Exercises;
import java.util.Scanner;

public class Ex_N2 {
	public static void ExN2() {
		System.out.println("Задание 2");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите количество элементов");
		int x = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Введите элементы через пробел");
		
		String data = scanner.nextLine();
		String[] strArr = data.split(" ");
		
		
		for (int i = 0;i < x;i++) {
			if (Integer.parseInt(strArr[i]) % 2 == 0) {
				System.out.print(strArr[i] + " ");
			}
		}
		System.out.print("\n");

		scanner.close();
	}
}