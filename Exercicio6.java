package exercicio;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		int x, y, z;
		
		System.out.println ("Digite a primeira nota com valor m�ximo 2");
		
		x = leitor.nextInt();
		if (x>2) System.out.println ("Erro");
		
		System.out.println ("Digita a segunda nota com valor m�ximo 3");
		if (x>3) System.out.println ("Erro");
		
		
		y = leitor.nextInt();
		
		System.out.println ("Digite a terceira nota com valor m�ximo 5");
		if (x>5) System.out.println ("Erro");
		z = leitor.nextInt();
		
		
		if  ( (x+y+z) >= 7 ) 
		{ 
		  System.out.println ("Aprovado");

		}
		else {
          System.out.println ("Reprovado");
			
		}
			
			
		
		
		
	}

}
