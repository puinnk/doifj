package Exercises;
import java.util.HashSet;
import java.util.Scanner;

public class Ex_N11 {
	public static void ExN11() {
		System.out.println("������� 11");
		Scanner scanner = new Scanner(System.in);
		System.out.println("������� ���������� ���������");
		double x = scanner.nextDouble();
		scanner.nextLine();
		System.out.println("������� �������� ����� ������");
		
		String data = scanner.nextLine();
		String[] strArr = data.split(" ");
		
		HashSet<String> hashSet = new HashSet<String>();
		for(int i = 0;i < x;i++) {
			hashSet.add(strArr[i]);
		}
		
		
		System.out.println(hashSet.size());

		scanner.close();
	}
}