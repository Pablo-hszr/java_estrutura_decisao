package exercicio;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		String senha;
		
        System.out.println ("Digite a senha:");
        senha=leitor.nextLine();
        
        if(senha.equals("AEDB"))
        {		
        System.out.println ("Acesso permitido");
        }
        else 
        {
        	System.out.print ("Você não tem acesso ao sistema");
        }	
		
		
		
	}

}
