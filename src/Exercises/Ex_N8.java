package Exercises;
import java.util.Arrays;
import java.util.Scanner;

public class Ex_N8 {
	public static void ExN8() {
		System.out.println("������� 8");
		Scanner scanner = new Scanner(System.in);
		System.out.println("������� ���������� ���������");
		double x = scanner.nextDouble();
		scanner.nextLine();
		System.out.println("������� �������� ����� ������");
		
		String data = scanner.nextLine();
		String[] strArr = data.split(" ");
		System.out.println(Arrays.toString(strArr));
		
		for (int i = 1;i<x;i+=2) {
			String temp = strArr[i-1];
			strArr[i-1] = strArr[i];
			strArr[i] = temp;
		}
		
		
		System.out.println(Arrays.toString(strArr));

		scanner.close();
	}
}