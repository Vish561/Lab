package basics;

import java.util.Scanner;

public class calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first no");
		int x = sc.nextInt();
		System.out.println("Enter the second no");
		int y = sc.nextInt();
		
		do {
			System.out.println("Enter your choice");
			System.out.println("1. Addition\n2. Substraction\n3. Multiplication\n4. Division\n5. Exit");
			int choice = sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Addition for "+ x +" and "+y+" is "+ x+y);
				break;
			case 2:
				System.out.println("Substraction for "+ x +" and "+y+" is "+ (x-y));
				break;
			case 3:
				System.out.println("Multiplication for "+ x +" and "+y+" is "+ x*y);
				break;
			case 4:
				System.out.println("Division for "+ x +" and "+y+" is "+ x/y);
				break;
			case 5:
				System.exit(choice);
			default:
				System.out.println("Wrong input");
			}
			System.out.println();
		}while(true);
	}

}
