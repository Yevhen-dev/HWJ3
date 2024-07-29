package taskFour;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println( "Type height of figure:" );
		int h = sc.nextInt();
		
		String s = "*";
		
        for (int i = 1; i <= h * 2 - 1; i++){
        	System.out.println(s);
        	if( i < h ) {
        		s = s + "*";
        	} else {
        		s = s.substring(0, s.length() - 1);
        	}
        	
        }
		

	}

}
