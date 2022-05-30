package Exercises;
import java.util.Scanner;

public class Ex_N20 {
	public static void ExN20() {
		System.out.println("Задание 20");
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
		System.out.println("Максимальный бросок = " + max);
		System.out.println("Всего очков в победителя = " + sum);
		System.out.println("Номер победителя " + maxIndex);
		
		scanner.close();
	}
}