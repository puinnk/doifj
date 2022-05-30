package Exercises;
import java.util.Arrays;
import java.util.Scanner;

public class Ex_N27 {
	public static void ExN27() {
		System.out.println("Задание 27");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите количество рядов");
		int n = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Введите количество столбцов");
		int m = scanner.nextInt();
		scanner.nextLine();
		
		
		int[][] matrix = new int[n][m];
		int diag = n + m - 1;
		int inLine = 0;
		int counter = 0;
		int dataCounter = 0;
		boolean upInLineFlag = true;
		
		for (int i = 0;i<diag;i++) {
			if (i + n - 1 >= diag) {
				upInLineFlag = false;
			}
			if (upInLineFlag) {
				inLine++;
			} else {
				inLine--;
				counter++;
			}
			if (inLine > n) {
				inLine--;
			}
			
			for (int j = 0;j<inLine;j++) {
				matrix[j + counter][i - j - counter] = dataCounter;
				dataCounter++;
			}
			
			
		}
		
		// чисто для вывода :)
		for(int i = 0;i<n;i++) {
			System.out.println(Arrays.toString(matrix[i]));
		}
		scanner.close();
	}
}