package com;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Calculator c=new CalculatorImpl();

		while(true) {
			System.out.println("1:Addition\n2:Subtraction\n3:Multiplication");
			System.out.println("4:Division\n5:Exit");
			System.out.println("Enter Choice:");

			int choice= scan.nextInt();

			int a=0;
			int b=0;

			if(choice>=1 && choice<=4) {
				System.out.println("Enter 2 Number");
				a= scan.nextInt();
				b= scan.nextInt();
			}

			switch(choice) {
			case 1:
				System.out.println("Sum of "+a+" & "+b+" is "+c.add(a,b));
				break;

			case 2:
				System.out.println("sub of "+a+" & "+b+" is "+c.sub(a,b));
				break;

			case 3:
				System.out.println("mul of "+a+" & "+b+" is "+c.mul(a,b));
				break;

			case 4:
				int result = c.div(a,  b);
				if(result != -1 ) {
					System.out.println("div of "+a+" & "+b+" is "+c.div(a,b));
				}
				else {
					System.out.println("Cannot Perform Division");
				}
				break;

			case 5:
				System.out.println("Thank You");
				System.exit(0);

			default:
				System.out.println(c.displayErrorMessage());
			}
			System.out.println("--------------------------------------------");
		}

	}
}
