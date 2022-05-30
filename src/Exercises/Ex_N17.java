package Exercises;
import java.util.Scanner;

public class Ex_N17 {
	public static void ExN17() {
		System.out.println("Задание 17");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите количество элементов");
		int x = scanner.nextInt();
		scanner.nextLine();
		
		int[][] matrix = new int[x][x];
		
		for (int i = 0;i < x;i++) {
			System.out.println("Введите ряд значений");
			String[] line = scanner.nextLine().split(" ");
			for (int j = 0;j<x;j++) {
				matrix[i][j] = Integer.parseInt(line[j]);
			}
		}
		String answer = "Yes";
		for (int i = 0;i<x;i++) {
			for (int j = 0;j<x;j++) {
				if (i < j) {
					if (matrix[i][j] != matrix[j][i]) {
						answer = "NO";
					}
				}
			}
		}
		
		System.out.println(answer);
		scanner.close();
	}
}