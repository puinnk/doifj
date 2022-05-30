package Exercises;
import java.util.Scanner;
import java.util.Arrays;

public class Ex_N15 {
	public static void ExN15() {
		System.out.println("Задание 15");
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Введите данные через пробел");
		String data = scanner.nextLine();
		String[] strArr = data.split(" ");
		// создаю int массив
		int[] intArr = new int[strArr.length];
		for (int i = 0; i <strArr.length;i++) {
			intArr[i] = Integer.parseInt(strArr[i]);
		}
		
		int[] finalArr = recursion(intArr);
		int Answer = strArr.length - finalArr.length;

		System.out.println(Arrays.toString(finalArr));
		System.out.println(Answer);
		scanner.close();
	}
	
	
	
	
	// проверка нужно ли менять массив
	public static boolean checkArr(int[]Arr) {
		if(Arr.length < 2) {
			return false;
		}
		for (int i = 0; i < Arr.length - 2;i++) {
			if (Arr[i] == Arr[i + 1] && Arr[i] == Arr[i + 2]) {
				return true;
			}
		}
		return false;
	}
	// меняю массив
	public static int[] changeArr(int[]Arr) {
		int counter = 1;
		String indexString = "";
		int StartIndex = 0;
		
		// добавляю индексы последовательных одинаковых элементов 
		for(int i = 1;i<Arr.length;i++) {
			if (Arr[i] == Arr[i - 1] && i+1 != Arr.length) {
				counter++;
			} else {
				if (counter > 2 && i+1 != Arr.length) {
					for (int j = StartIndex;j <i;j++) {
						indexString += j + " ";
					}
				} else if (counter >= 2) {
					//такая система из-за проблем с последним элементом массива
					if (Arr[i]== Arr[i - 1]) {
						for (int j = StartIndex;j<=i;j++) {
							indexString += j + " ";
						}
					} else if (counter != 2) {
						for (int j = StartIndex;j <i;j++) {
							indexString += j + " ";
						}
					}
				}
				StartIndex = i;
				counter = 1;
			}
		}
		
		
		// создаю строку без последовательных одинаковых элементов найденых за этот цикл
		String[] strArrIndexes = indexString.split(" ");
		String answerToSplit = "";
		for (int i = 0;i < Arr.length;i++) {
			if (Arrays.asList(strArrIndexes).contains(Integer.toString(i))) {
				// nothing :)
			} else {
				answerToSplit += Arr[i] + " ";
			}
		}
		// создаю массив из строки и далее новый масив int
		String[] ansSplited = answerToSplit.split(" ");
		int[] arrToReturn = new int[ansSplited.length];	
		
			if (answerToSplit.length() != 0) {
				for (int i = 0; i <ansSplited.length;i++) {
					arrToReturn[i] = Integer.parseInt(ansSplited[i]);
				}
			} else {
				arrToReturn = null;
			}
			
		
		return arrToReturn;	
	}
	
	// рекурсия 
	public static int[] recursion (int[]Arr) {
		
		if (checkArr(Arr)) {
			Arr = changeArr(Arr);
			if (Arr != null) {
				Arr = recursion(Arr);
			}
		}

		return Arr;
		
	}
}
