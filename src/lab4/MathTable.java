package lab4;

import java.util.Scanner;

public class MathTable {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		boolean goAgain = true;
		
		while (goAgain) {
			int squared1;
			int cubed1;
			int input1;
			
			System.out.println("Please enter an intiger");
			input1 = scnr.nextInt();
			
			System.out.printf("%-10s %-10s %-10s", "Number", "Squared", "Cubed");
			System.out.println("");
			System.out.printf("%-10s %-9s %-9s", "=====", "=====", " =====");
			System.out.println("");
			
			for (int i = 0; i <= input1; i++) {
				
				squared1 = i * i;
				cubed1 = i * i * i;
				
				System.out.printf("%-10d %-10d %-10d", i, squared1, cubed1);
				System.out.println("");
				}
			
			System.out.println("Would you like to continue (y/n)");
			goAgain = scnr.next().toLowerCase().startsWith("y");
			}
		
		System.out.println("Have a nice day.");
		scnr.close();
		
		System.out.printf("%5s %5s %5s %5s %5s %5s", " "," ","1","2","3","4");
		System.out.println("");
		System.out.printf("%5s %5s %5s %5s %5s %5s", " ","|","=","=","=","=");
		System.out.println("");
		System.out.printf("%5s %5s %5s %5s %5s %5s", "1","|","1","2","3","4");
		System.out.println("");
		System.out.printf("%5s %5s %5s %5s %5s %5s", "2","|","2","4","6","8");
		System.out.println("");
		System.out.printf("%5s %5s %5s %5s %5s %5s", "3","|","3","6","9","12");
		System.out.println("");
		System.out.printf("%5s %5s %5s %5s %5s %5s", "4","|","4","8","12","16");
		}
}
