package Exercises;
import java.util.Scanner;

public class Ex_N18 {
	public static void ExN18() {
		System.out.println("������� 18");
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
		int maxIndex = 0;
		
		for (int i = 0;i < n;i++) {
			int tempPoints = 0;
			for (int j = 0;j < m;j++) {
				tempPoints += matrix[i][j];
			}
			if(tempPoints > max) {
				max = tempPoints;
				maxIndex = i;
			}
		}
		System.out.println("�������� ����� = " + max);
		System.out.println("� ������ ��� ������� " + maxIndex);
		
		scanner.close();
	}
}