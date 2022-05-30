package Exercises;
import java.util.Arrays;
import java.util.Scanner;

public class Ex_N28 {
	public static void ExN28() {
		System.out.println("«адание 28");
		Scanner scanner = new Scanner(System.in);
		System.out.println("¬ведите количество р€дов");
		int n = scanner.nextInt();
		scanner.nextLine();
		System.out.println("¬ведите количество столбцов");
		int m = scanner.nextInt();
		scanner.nextLine();
		System.out.println("¬ведите количество мин");
		int mines = scanner.nextInt();
		scanner.nextLine();
		String[][] matrix = new String[n][m];
		
		// !!!!!!!  у мен€ не как в примере, координа начинаютьс€ с 0, а не с 1
		
		// заполн€ю изначальную матрицу 0
		for (int i = 0;i<n;i++) {
			for (int j = 0;j<m;j++) {
				matrix[i][j] = "0";
			}
		}
		
		// ввожу мины и сразу добавл€ю вокруг мины +1 на соседних клетках
		for (int i = 0;i < mines;i++) {
			System.out.println("¬ведите данные мины");
			String mineData = scanner.nextLine();
			int mineX = Integer.parseInt(mineData.split(" ")[0]);
			int mineY = Integer.parseInt(mineData.split(" ")[1]);
			matrix[mineX][mineY] = "*";
			
			// массив координат вокруг мины
			int[][] arrAddOnes = {{mineX-1,mineY},{mineX-1,mineY+1},{mineX,mineY+1},{mineX+1,mineY+1},{mineX+1,mineY},{mineX+1,mineY-1},{mineX,mineY-1},{mineX-1,mineY-1}};
			
			for (int j=0;j<arrAddOnes.length;j++) {
				// проверка на наличие координат на матрице
				if ((arrAddOnes[j][0]>=0&&arrAddOnes[j][1]>=0) && (arrAddOnes[j][0]<n&&arrAddOnes[j][1]<m)){
					// проверка на мину на координате
					if (matrix[arrAddOnes[j][0]][arrAddOnes[j][1]] != "*") {
						matrix[arrAddOnes[j][0]][arrAddOnes[j][1]] = Integer.parseInt(matrix[arrAddOnes[j][0]][arrAddOnes[j][1]]) + 1 + "";
					}
				}
			}
		}
		
		
		
		// чисто дл€ вывода :)
		for(int i = 0;i<n;i++) {
			System.out.println(Arrays.toString(matrix[i]));
		}
		scanner.close();
	}
}