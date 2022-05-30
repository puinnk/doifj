package Exercises;
import java.util.Arrays;
import java.util.Scanner;

public class Ex_N26 {
	public static void ExN26() {
		System.out.println("Задание 26");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите количество рядов");
		int n = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Введите количество столбцов");
		int m = scanner.nextInt();
		scanner.nextLine();
		
		
		int[][] matrix = new int[n][m];
		
		int accum = 0;
		int adder = 1;
		
		for (int i = 0;i < n;i++) {
			for (int j = 0;j<m;j++) {
				matrix[i][j] = (i * 10) + accum;
				accum +=adder;
			}
			
			if (i % 2 == 0) {
				accum--;
			} else {
				accum++;
			}
			adder *= -1;
		}
		
		// чисто для вывода :)
		for(int i = 0;i<n;i++) {
			System.out.println(Arrays.toString(matrix[i]));
		}
		scanner.close();
	}
}