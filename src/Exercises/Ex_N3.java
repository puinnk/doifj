package Exercises;
import java.util.Scanner;

public class Ex_N3 {
	public static void ExN3() {
		System.out.println("������� 3");
		Scanner scanner = new Scanner(System.in);
		System.out.println("������� ���������� ���������");
		int x = scanner.nextInt();
		scanner.nextLine();
		System.out.println("������� �������� ����� ������");
		
		String data = scanner.nextLine();
		String[] strArr = data.split(" ");
		
		int counter = 0;
		
		
		for (int i = 0;i < x;i++) {
			if (Integer.parseInt(strArr[i]) > 0) {
				counter++;
			}
		}
		System.out.println(counter);

		scanner.close();
	}
}