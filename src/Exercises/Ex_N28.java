package Exercises;
import java.util.Arrays;
import java.util.Scanner;

public class Ex_N28 {
	public static void ExN28() {
		System.out.println("������� 28");
		Scanner scanner = new Scanner(System.in);
		System.out.println("������� ���������� �����");
		int n = scanner.nextInt();
		scanner.nextLine();
		System.out.println("������� ���������� ��������");
		int m = scanner.nextInt();
		scanner.nextLine();
		System.out.println("������� ���������� ���");
		int mines = scanner.nextInt();
		scanner.nextLine();
		String[][] matrix = new String[n][m];
		
		// !!!!!!!  � ���� �� ��� � �������, �������� ����������� � 0, � �� � 1
		
		// �������� ����������� ������� 0
		for (int i = 0;i<n;i++) {
			for (int j = 0;j<m;j++) {
				matrix[i][j] = "0";
			}
		}
		
		// ����� ���� � ����� �������� ������ ���� +1 �� �������� �������
		for (int i = 0;i < mines;i++) {
			System.out.println("������� ������ ����");
			String mineData = scanner.nextLine();
			int mineX = Integer.parseInt(mineData.split(" ")[0]);
			int mineY = Integer.parseInt(mineData.split(" ")[1]);
			matrix[mineX][mineY] = "*";
			
			// ������ ��������� ������ ����
			int[][] arrAddOnes = {{mineX-1,mineY},{mineX-1,mineY+1},{mineX,mineY+1},{mineX+1,mineY+1},{mineX+1,mineY},{mineX+1,mineY-1},{mineX,mineY-1},{mineX-1,mineY-1}};
			
			for (int j=0;j<arrAddOnes.length;j++) {
				// �������� �� ������� ��������� �� �������
				if ((arrAddOnes[j][0]>=0&&arrAddOnes[j][1]>=0) && (arrAddOnes[j][0]<n&&arrAddOnes[j][1]<m)){
					// �������� �� ���� �� ����������
					if (matrix[arrAddOnes[j][0]][arrAddOnes[j][1]] != "*") {
						matrix[arrAddOnes[j][0]][arrAddOnes[j][1]] = Integer.parseInt(matrix[arrAddOnes[j][0]][arrAddOnes[j][1]]) + 1 + "";
					}
				}
			}
		}
		
		
		
		// ����� ��� ������ :)
		for(int i = 0;i<n;i++) {
			System.out.println(Arrays.toString(matrix[i]));
		}
		scanner.close();
	}
}