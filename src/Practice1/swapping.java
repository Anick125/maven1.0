package Practice1;

import java.util.Scanner;

public class swapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		
		Scanner in = new Scanner (System.in);
			
			System.out.println("10");
		int a = in.nextInt();
		System.out.println("20");
		int b = in.nextInt();
		System.out.println("before swapping a = "+a+", and b ="+b );
		int x =a;
		a = b;
		b = x;
		System.out.println("After swapping a = "+a+" and b = "+b);
				
	}

}
