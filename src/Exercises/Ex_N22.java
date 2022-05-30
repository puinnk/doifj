package Exercises;
import java.util.Scanner;

public class Ex_N22 {
	public static void ExN22() {
		System.out.println("������� 22");
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
		String winners = "";
		
		for (int i = 0;i<n;i++) {
			int temp = 0;
			for (int j = 0;j<m;j++) {
				temp += matrix[i][j];
			}
			if (temp > max) {
				max = temp;
				counter = 1;
				winners = i + " ";
			} else if (temp == max) {
				counter++;
				winners += i + " ";
			}
		}
		
		System.out.println("���������� ��������: " + counter);
		System.out.println("������ ��������:");
		
		String[] winnersArr = winners.split(" ");
		for (int i = 0;i<winnersArr.length;i++) {
			System.out.println(winnersArr[i]);
		}
		
		scanner.close();
	}
}