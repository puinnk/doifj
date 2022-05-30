package Exercises;
import java.util.Scanner;

public class Ex_N18 {
	public static void ExN18() {
		System.out.println("Задание 18");
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
		System.out.println("Максимум очков = " + max);
		System.out.println("У игрока под номером " + maxIndex);
		
		scanner.close();
	}
}