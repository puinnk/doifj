package Exercises;
import java.util.Arrays;
import java.util.Scanner;

public class Ex_N9 {
	public static void ExN9() {
		System.out.println("Задание 9");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите количество элементов");
		double x = scanner.nextDouble();
		scanner.nextLine();
		System.out.println("Введите элементы через пробел");
		
		String data = scanner.nextLine();
		String[] strArr = data.split(" ");
		System.out.println(Arrays.toString(strArr));
		
		String Saved = strArr[0];
		
		for (int i = 1;i<x;i++) {
			String temp = Saved;
			Saved = strArr[i];
			strArr[i] = temp;
		}
		strArr[0] = Saved;
		
		
		System.out.println(Arrays.toString(strArr));

		scanner.close();
	}
}