package Exercises;
import java.util.Scanner;

public class Ex_N5 {
	public static void ExN5() {
		System.out.println("������� 5");
		Scanner scanner = new Scanner(System.in);
		System.out.println("������� ���������� ���������");
		int x = scanner.nextInt();
		scanner.nextLine();
		System.out.println("������� �������� ����� ������");
		
		String data = scanner.nextLine();
		String[] strArr = data.split(" ");
		
		String answer = "NO";
	
		for (int i = 1;i < x;i++) {
			int a = Integer.parseInt(strArr[i]);
			int b = Integer.parseInt(strArr[i-1]);
			boolean sameSign = ((a > 0 && b > 0) || (a < 0 && b < 0)) ? true : false;
			if (sameSign) {
				answer = "YES";
			}
		}
		System.out.println(answer);

		scanner.close();
	}
}