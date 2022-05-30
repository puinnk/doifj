import java.util.Scanner;
import Exercises.*;
public class Arrays {

	public static void main(String[] args) {
		System.out.println("Введите номер задания(1-33)");
		Scanner scanner = new Scanner(System.in);
		int exToCheck = scanner.nextInt();
		scanner.nextLine();
		
		
		switch (exToCheck) {
		case 1:Ex_N1.ExN1();
		break;
		case 2:Ex_N2.ExN2();
		break;
		case 3:Ex_N3.ExN3();
		break;
		case 4:Ex_N4.ExN4();
		break;
		case 5:Ex_N5.ExN5();
		break;
		case 6:Ex_N6.ExN6();
		break;
		case 7:Ex_N7.ExN7();
		break;
		case 8:Ex_N8.ExN8();
		break;
		case 9:Ex_N9.ExN9();
		break;
		case 10:Ex_N10.ExN10();
		break;
		case 11:Ex_N11.ExN11();
		break;
		case 12:Ex_N12.ExN12();
		break;
		case 13:Ex_N13.ExN13();
		break;
		case 14:Ex_N14.ExN14();
		break;
		case 15:Ex_N15.ExN15();
		break;
		case 16:Ex_N16.ExN16();
		break;
		case 17:Ex_N17.ExN17();
		break;
		case 18:Ex_N18.ExN18();
		break;
		case 19:Ex_N19.ExN19();
		break;
		case 20:Ex_N20.ExN20();
		break;
		case 21:Ex_N21.ExN21();
		break;
		case 22:Ex_N22.ExN22();
		break;
		case 23:Ex_N23.ExN23();
		break;
		case 24:Ex_N24.ExN24();
		break;
		case 25:Ex_N25.ExN25();
		break;
		case 26:Ex_N26.ExN26();
		break;
		case 27:Ex_N27.ExN27();
		break;
		case 28:Ex_N28.ExN28();
		break;
		case 29:Ex_N29.ExN29();
		break;
		case 30:Ex_N30.ExN30();
		break;
		case 31:Ex_N31.ExN31();
		break;
		case 32:Ex_N32.ExN32();
		break;
		case 33:Ex_N33.ExN33();
		break;
		
		default: System.out.println("Нету такого задания");
		break;
		}
		scanner.close();
		System.out.println("Программа отработала");
		
	}

}
