package Exercises;
import java.util.Arrays;
import java.util.Scanner;

public class Ex_N25 {
	public static void ExN25() {
		System.out.println("«адание 25");
		Scanner scanner = new Scanner(System.in);
		System.out.println("¬ведите размер матрицы");
		int n = scanner.nextInt();
		scanner.nextLine();
		int size = 2*n+1;
		
		int[][] matrix = new int[size][size];
		
		int X = n;
		int Y = n;
		int counter = 0;
		int step = 1;
		
		matrix[X][Y] = counter;
		
		// цикл на заполнение по спирали
		for (int i = 0;i<n;i++) {
			// вверх
			for (int j = 1;j<=step;j++) {
				counter++;
				X--;
				matrix[X][Y] = counter;
			}
			// влево
			for (int j = 1;j<=step;j++) {
				counter++;
				Y--;
				matrix[X][Y] = counter;
			}
			step++;
			// вниз
			for (int j = 1;j<=step;j++) {
				counter++;
				X++;
				matrix[X][Y] = counter;
			}
			// вправо
			for (int j = 1;j<=step;j++) {
				counter++;
				Y++;
				matrix[X][Y] = counter;
			}
			step++;
			
		}
		// заполнение остатка спирали
		for (int i = 0;i<step-1;i++) {
			counter++;
			X--;
			matrix[X][Y] = counter;
		}
		
		

		// чисто дл€ вывода :)
		for(int i = 0;i<size;i++) {
			System.out.println(Arrays.toString(matrix[i]));
		}
		
		
		scanner.close();
	}
}