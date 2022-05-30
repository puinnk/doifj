package Exercises;
import java.util.Arrays;
import java.util.Scanner;

public class Ex_N29 {
	public static void ExN29() {
		System.out.println("������� 29");
		Scanner scanner = new Scanner(System.in);
		System.out.println("������� ���������� �����");
		int n = scanner.nextInt();
		scanner.nextLine();
		System.out.println("������� ���������� ��������");
		int m = scanner.nextInt();
		scanner.nextLine();
		
		int[][] matrix = new int[n][m];
		// ���������� ������� ����������������� �������
		int counter = 1;
		for (int i = 0;i<n;i++) {
			for (int j = 0;j<m;j++) {
				matrix[i][j] = counter;
				counter++;
			}
		}
		int[][] newMatrix = new int[m][n];
		// "�����������" �������
		for (int i = 0;i<m;i++) {
			for (int j = 0;j<n;j++) {
				newMatrix[i][j] = matrix[n-1-j][i];
			}
		}
		// ����� ��� ������ :)
		for(int i = 0;i<n;i++) {
			System.out.println(Arrays.toString(matrix[i]));
		}
		System.out.println();
		for(int i = 0;i<m;i++) {
			System.out.println(Arrays.toString(newMatrix[i]));
		}
		scanner.close();
	}
}