package Exercises;
import java.util.Scanner;

public class Ex_N19 {
	public static void ExN19() {
		System.out.println("������� 19");
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
		String maxIndex = "0 0";
		
		for (int i = 0;i < n;i++) {
			for (int j = 0;j < m;j++) {
				if (matrix[i][j] > max) {
					max = matrix[i][j];
					maxIndex = i + " " + j;
				}
			}
		}
		System.out.println("�������� ����� = " + max);
		System.out.println("� ������� � �������� ��� ��������� " + maxIndex);
		
		scanner.close();
	}
}