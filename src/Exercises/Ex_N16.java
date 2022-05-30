package Exercises;
import java.util.Arrays;
import java.util.Scanner;

public class Ex_N16 {
	public static void ExN16() {
		System.out.println("Задание 16");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите количество элементов");
		int x = scanner.nextInt();
		scanner.nextLine();
		
		int[][] matrix = new int[x][x];
		
		for (int i = 0;i<x;i++) {
			for (int j = 0;j<x;j++) {
				matrix[i][j] = (i + j < x - 1) ? 0 : (i + j == x - 1) ? 1 : 2;
			}
		}
		
		for (int i = 0;i < x;i++) {
			System.out.println(Arrays.toString(matrix[i]));
		}
		scanner.close();
	}
}