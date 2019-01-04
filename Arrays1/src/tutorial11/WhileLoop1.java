package tutorial11;

import java.util.Scanner;

public class WhileLoop1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int pin=0;
		while(pin!=1101) {
			System.out.print("Enter the pin:");
			pin=scan.nextInt();
			if(pin==1101) {
				System.out.println("You may proceed");
			}
			else {
				System.out.println("Try again");
			}
		}

	}



	}


