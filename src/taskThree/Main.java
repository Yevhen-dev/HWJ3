package taskThree;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println( "Type width of rectangle:" );
		int w = sc.nextInt();
		
		System.out.println( "Type height of rectangle:" );
		int h = sc.nextInt();
		
		for( int i = 0; i <= h - 1; i++ ) {
			for( int j = 0; j <= w - 1; j++ ) {
				if( i == 0 || i == h - 1 ) {
					System.out.print("*");
				} else {
					if( j == 0 || j == w-1 ) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}
		

	}

}
