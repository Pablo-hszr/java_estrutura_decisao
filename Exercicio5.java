package exercicio;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		int x;
		
		System.out.println ("Digite um numero");
		
		x = leitor.nextInt();
		
		
		if  ( (x%2) == 0)
		{ 
		  System.out.println ("par");

		}
		else {
          System.out.println ("ímpar");
			
		}
			
			
		
		
		
	}

}
