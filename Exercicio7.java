package exercicio;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		int idade1, idade2;
		String nome1, nome2;
		
		System.out.println ("Digite um nome");
		nome1 = leitor.nextLine();
		
		System.out.println ("Digite outro nome");
		nome2 = leitor.nextLine();
		
        System.out.println ("Digite a idade do primeiro nome");
		idade1 = leitor.nextInt();
		
		System.out.println ("Digite a idade do segundo nome");
		idade2 = leitor.nextInt();
		
		
		if ( (idade1>idade2) )
		{
		System.out.println (nome1);
		System.out.println (idade1);
		}
		
		else {
	    System.out.println (nome2);
	    System.out.println (idade2);
			
		}
			
			
		
		
		
	}

}
