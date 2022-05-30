package Exercises;
import java.util.Arrays;
import java.util.Scanner;

public class Ex_N13 {
	public static void ExN13() {
		System.out.println("������� 13");
		Scanner scanner = new Scanner(System.in);
		System.out.println("������� ������ ����� ������");
		String data = scanner.nextLine();
		String[] strArr = data.split(" ");
		
		int N = Integer.parseInt(strArr[0]);
		int A = Integer.parseInt(strArr[1]);
		int B = Integer.parseInt(strArr[2]);
		int C = Integer.parseInt(strArr[3]);
		int D = Integer.parseInt(strArr[4]);
		
		int[] myArr = new int[N];
		// ��������� ������
		for(int i = 0;i <N;i++) {
			myArr[i] = i + 1;
		}
		// ������ �� ���������
		System.out.println(Arrays.toString(myArr));
		// ������ � ��������� A < B
		for (int i = 0; i < B - A - 1;i++) {
			int temp = myArr[i + A - 1];
			myArr[i + A - 1] = myArr[B - i - 1];
			myArr[B - i - 1] = temp;
		}
		// ������ � ��������� C < D
		for (int i = 0; i < D - C - 1;i++) {
			int temp = myArr[i + C - 1];
			myArr[i + C - 1] = myArr[D - i - 1];
			myArr[D - i - 1] = temp;
		}
		
		
		System.out.println(Arrays.toString(myArr));

		scanner.close();
	}
}