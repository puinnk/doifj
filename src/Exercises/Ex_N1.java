package Exercises;
import java.util.Scanner;

public class Ex_N1 {
	public static void ExN1() {
		System.out.println("������� 1");
		Scanner scanner = new Scanner(System.in);
		System.out.println("������� ���������� ���������");
		int x = scanner.nextInt();
		scanner.nextLine();
		System.out.println("������� �������� ����� ������");
		
		String data = scanner.nextLine();
		String[] strArr = data.split(" ");
		
		
		for (int i = 0;i < x;i += 2) {
			System.out.print(strArr[i] + " ");
		}
		System.out.print("\n");

		scanner.close();
	}
}
