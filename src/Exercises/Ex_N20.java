package Exercises;
import java.util.Scanner;

public class Ex_N20 {
	public static void ExN20() {
		System.out.println("������� 20");
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
		int sum = 0;
		boolean sumFlag = false;
		boolean checkSum = false;
		String maxIndex = "0";
		
		for (int i = 0;i < n;i++) {
			sumFlag = false;
			checkSum = false;
			int temp = 0;
			for (int j = 0;j < m;j++) {
				temp += matrix[i][j];
				if (matrix[i][j] > max) {
					max = matrix[i][j];
					maxIndex = i + " ";
					sumFlag = true;
				} else if (matrix[i][j] == max) {
					checkSum = true;
				}
				
			}
			if (sumFlag) {
				sum = temp;
			} else if (checkSum) {
				if (temp > sum) {
					maxIndex = i + " ";
					sum = temp;
				}
			}
		}
		System.out.println("������������ ������ = " + max);
		System.out.println("����� ����� � ���������� = " + sum);
		System.out.println("����� ���������� " + maxIndex);
		
		scanner.close();
	}
}