package taskOne;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		long result = 1;

		Scanner sc = new Scanner(System.in);

		System.out.println("Type number, number > 4 and number < 16:");
		int n = sc.nextInt();
		
		if( n < 4 || n > 16 ) {
			System.out.println("Type correct number");
		} else {
			for( int i = 1; i <= n; i++ ) {
				result *= i;
			}
		}
		
		System.out.println(n + "! = " + result);
	}

}
