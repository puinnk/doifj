package Exercises;
import java.util.Arrays;
import java.util.Scanner;

public class Ex_N23 {
	public static void ExN23() {
		System.out.println("������� 23");
		Scanner scanner = new Scanner(System.in);
		System.out.println("������� ���������� �����");
		int n = scanner.nextInt();
		scanner.nextLine();
		System.out.println("������� ���������� ��������");
		int m = scanner.nextInt();
		scanner.nextLine();
		
		int[][] matrix = new int[n][m];
		int x = 0;
		int y = 0;
		
		for (int i = 0; i < n * m;i++) {
			if (y >= m) {
				x++;
				y = 0;
			}
			matrix[x][y] = x * y;
			y++;
		}
		
		
		// ����� ��� ������ :)
		for(int i = 0;i<n;i++) {
			System.out.println(Arrays.toString(matrix[i]));
		}
		
		
		scanner.close();
	}
}