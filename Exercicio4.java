package exercicio;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		double x, y;
		
		System.out.println ("Digite dois números");
		
		x = leitor.nextDouble();
		y = leitor.nextDouble();
		
		
		if  ( (x>y) )
		{ 
		  System.out.println (x);
		  System.out.println (y);
		}
		else {
          System.out.println (y);
          System.out.println (x);
			
		}
			
			
		
		
		
	}

}
