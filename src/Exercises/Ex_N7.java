package Exercises;
import java.util.Arrays;
import java.util.Scanner;

public class Ex_N7 {
	public static void ExN7() {
		System.out.println("Задание 7");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите количество элементов");
		double x = scanner.nextDouble();
		scanner.nextLine();
		System.out.println("Введите элементы через пробел");
		
		String data = scanner.nextLine();
		String[] strArr = data.split(" ");
		System.out.println(Arrays.toString(strArr));
		
		for (int i = 0;i<Math.ceil(x / 2);i++) {
			String temp = strArr[i];
			strArr[i] = strArr[strArr.length - i - 1];
			strArr[strArr.length - i - 1] = temp;
		}
		
		
		System.out.println(Arrays.toString(strArr));

		scanner.close();
	}
}