package Exercises;
import java.util.Scanner;

public class Ex_N12 {
	public static void ExN12() {
		System.out.println("Задание 12");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите количество элементов");
		int x = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Введите элементы через пробел");
		String data = scanner.nextLine();
		
		String[] strArr = data.split(" ");
		
		System.out.println("Введите новый элемент");
		int newHeight = scanner.nextInt();
		scanner.nextLine();
		
		int answer = 0;
		
		
		for(int i = 0;i <x;i++) {
			if (newHeight > Integer.parseInt(strArr[i])) {
				answer = i+1;
				break;
			}
			if (i + 1 >= x && answer == 0) {
				answer = x+1;
			}
		}
		
		
		System.out.println(answer);

		scanner.close();
	}
}