package Exercises;
import java.util.Scanner;

public class Ex_N19 {
	public static void ExN19() {
		System.out.println("Задание 19");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите количество рядов");
		int n = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Введите количество столбцов");
		int m = scanner.nextInt();
		scanner.nextLine();
		
		int[][] matrix = new int[n][m];
		// формирование массива
		for (int i = 0;i < n;i++) {
			System.out.println("Введите строку данных");
			String[] lineArr = scanner.nextLine().split(" ");
			for (int j = 0;j < m;j++) {
				matrix[i][j] = Integer.parseInt(lineArr[j]);
			}
		}
		
		// решение задачи
		
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
		System.out.println("Максимум очков = " + max);
		System.out.println("в таблице с индексом под индексами " + maxIndex);
		
		scanner.close();
	}
}