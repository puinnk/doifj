package Exercises;
import java.util.Scanner;

public class Ex_N10 {
	public static void ExN10() {
		System.out.println("������� 10");
		Scanner scanner = new Scanner(System.in);
		System.out.println("������� ���������� ���������");
		double x = scanner.nextDouble();
		scanner.nextLine();
		System.out.println("������� �������� ����� ������");
		
		String data = scanner.nextLine();
		String[] strArr = data.split(" ");
		
		int max = Integer.parseInt(strArr[0]);
		
		for (int i = 1;i<x;i++) {
			int temp = Integer.parseInt(strArr[i]);
			max = Math.max(max, temp);
		}
		
		
		System.out.println(max);

		scanner.close();
	}
}