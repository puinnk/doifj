package Exercises;
import java.util.Scanner;
import java.util.Arrays;

public class Ex_N14 {
	public static void ExN14() {
		System.out.println("������� 14");
		Scanner scanner = new Scanner(System.in);
		System.out.println("������� ���������� ���������");
		int N = scanner.nextInt();
		scanner.nextLine();
		System.out.println("������� ������ ����� ������");
		String data = scanner.nextLine();
		String[] strArr = data.split(" ");
		System.out.println("������� ����� ������");
		int K = scanner.nextInt();
		scanner.nextLine();
		
		for (int i = 0; i < Math.abs(K);i++) {
			if (N <= 1) {break;} // ������� :)
			String tempF = strArr[0];
			// ����� ������
			if (K > 0) {
				for (int j = 1;j < N;j++) {
					String temp = strArr[j];
					strArr[j] = tempF;
					tempF = temp;
				}
				strArr[0] = tempF;
			} 
			// ����� �����
			else {
				for (int j = 0;j < N - 1;j++) {
					strArr[j] = strArr[j + 1];
				}
				strArr[strArr.length - 1] = tempF;
			}
			
		}
		System.out.println(Arrays.toString(strArr));

		scanner.close();
	}
}