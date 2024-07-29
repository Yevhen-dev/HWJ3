package taskTwo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println( "Type number and get your multiplication table for this number:" );
		int num = sc.nextInt();
		
		for( int i = 1; i <= 10; i++ ) {
			System.out.println( num + " * " + i + " = " + ( num * i ) );
		}

	}

}
