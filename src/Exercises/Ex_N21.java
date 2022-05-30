package Exercises;
import java.util.Scanner;

public class Ex_N21 {
	public static void ExN21() {
		System.out.println("������� 21");
		Scanner scanner = new Scanner(System.in);
		System.out.println("������� ���������� �����");
		int n = scanner.nextInt();
		scanner.nextLine();
		System.out.println("������� ���������� ��������");
		int m = scanner.nextInt();
		scanner.nextLine();
		
		int[][] matrix = new int[n][m];
		// ������������ �������
		for (int i = 0;i < n;i++) {
			System.out.println("������� ������ ������");
			String[] lineArr = scanner.nextLine().split(" ");
			for (int j = 0;j < m;j++) {
				matrix[i][j] = Integer.parseInt(lineArr[j]);
			}
		}
		
		// ������� ������
		
		int max = 0;
		int counter = 0;
		
		for (int i = 0;i<n;i++) {
			int temp = 0;
			for (int j = 0;j<m;j++) {
				temp += matrix[i][j];
			}
			if (temp > max) {
				max = temp;
				counter = 1;
			} else if (temp == max) {
				counter++;
			}
		}
		
		System.out.println(counter);
		
		scanner.close();
	}
}