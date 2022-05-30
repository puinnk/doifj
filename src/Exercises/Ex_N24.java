package Exercises;
import java.util.Arrays;
import java.util.Scanner;

public class Ex_N24 {
	public static void ExN24() {
		System.out.println("������� 24");
		Scanner scanner = new Scanner(System.in);
		System.out.println("������� ���������� �����");
		int n = scanner.nextInt();
		scanner.nextLine();
		System.out.println("������� ���������� ��������");
		int m = scanner.nextInt();
		scanner.nextLine();
		
		int[][] matrix = new int[n][m];
		
		if (n != 0 && m != 0) {
			// �������� ������� 1 � ����������� � 0 � x ��� y
			
			for (int i = 0;i<1;i++) {
				for (int j = 0;j<m;j++) {
					matrix[i][j] = 1;
				}
			}
			for (int i = 0;i<n;i++) {
				for (int j = 0;j<1;j++) {
					matrix[i][j] = 1;
				}
			}
			// �������� ���������� �������
			for (int i = 1;i<n;i++) {
				for (int j = 1;j<m;j++) {
					int left = matrix[i][j-1];
					int upper = matrix[i-1][j];
					matrix[i][j] = left + upper;
				}
			}
			// ����� ��� ������ :)
			for(int i = 0;i<n;i++) {
				System.out.println(Arrays.toString(matrix[i]));
			}
		} else {
			System.out.println("������, ����� 0");
		}
		
		
		scanner.close();
	}
}