package Exercises;
import java.util.Arrays;
import java.util.Scanner;

public class Ex_N30 {
	public static void ExN30() {
		System.out.println("������� 30");
		Scanner scanner = new Scanner(System.in);
		System.out.println("������� ������ �������");
		int n = scanner.nextInt();
		scanner.nextLine();
		
		int[][] matrix = new int[n][n];
		String movement = "r";
		
		int[] moveDist = new int[n];
		
		moveDist[0] = n;
		int accum = 1;
		// ������ ������ ��������� ��������
		for (int i = 1;i<n;i++) {
			moveDist[i] = n - accum;
			if (i != 1 && i % 2 == 0) {
				accum +=2;
			}
		}
		
		int curX = 0;
		int curY = -1;
		// ������ �������
		for (int i=0;i<n;i++) {
			if (movement == "r") {
				for (int j = 0;j<moveDist[i];j++) {
					curY++;
					matrix[curX][curY] = 1;
				}
				movement = "d";
			} else if (movement == "d") {
				for (int j = 0;j<moveDist[i];j++) {

					curX++;
					matrix[curX][curY] = 1;
				}
				movement = "l";
			} else if (movement == "l") {
				for (int j = 0;j<moveDist[i];j++) {
					curY--;
					matrix[curX][curY] = 1;
				}
				movement = "u";
			} else if (movement == "u") {
				for (int j = 0;j<moveDist[i];j++) {
					curX--;
					matrix[curX][curY] = 1;
				}
				movement = "r";
			} else {
				System.out.println("������");
			}
		}
		
		
		// ����� ��� ������ :)
		for(int i = 0;i<n;i++) {
			System.out.println(Arrays.toString(matrix[i]));
		}
		System.out.println();
		// ����� ������� ��������� �������� ��� ��������
		System.out.println(Arrays.toString(moveDist));
		
		scanner.close();
	}
}