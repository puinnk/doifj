package Exercises;
import java.util.Scanner;

public class Ex_N4 {
	public static void ExN4() {
		System.out.println("������� 4");
		Scanner scanner = new Scanner(System.in);
		System.out.println("������� ���������� ���������");
		int x = scanner.nextInt();
		scanner.nextLine();
		System.out.println("������� �������� ����� ������");
		
		String data = scanner.nextLine();
		String[] strArr = data.split(" ");
		
		int counter = 0;
		
		
		for (int i = 1;i < x;i++) {
			if (Integer.parseInt(strArr[i]) > Integer.parseInt(strArr[i - 1])) {
				counter++;
			}
		}
		System.out.println(counter);

		scanner.close();
	}
}