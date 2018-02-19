package calculator;

import java.util.Scanner;

public class Calc {
	
	public static void main(String []args) {
		float a,b,z;
		int i=1,n;
		Scanner num = new Scanner(System.in);
		while(i==1) {
		System.out.println("enter a value\n");
		a = num.nextInt();
		System.out.println("enter b value\n");
        b = num.nextInt();
		System.out.println("enter number\n"
				+ "1.sum\n"
				+ "2.substraction\n"
				+ "3.multiplication\n"
				+ "4.dividion\n");
		n = num.nextInt();
		
		
		switch(n) {
		
		case 1: z = a + b;
		        System.out.println("The sum of the given numbers:"+z);
		   break;
		
		case 2: z = a - b;
		        System.out.println("The substraction of the given numbers:"+z);
		   break;
		
		case 3: z = a * b;
		        System.out.println("The multiplication of the given numbers:"+z);
		   break;
		
		case 4: z = a / b;
		        System.out.println("The result of the given numbers:"+z);
		break;
		
		default : System.out.println("Enter correct number");
		
		
		
		}
		
		System.out.println("if you want to continue enter 1 \n"
				+ "else enter 0\n");
		i=num.nextInt();
		
		}
		
		
	}
	

}
