package exercicio;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		double x, y;
		String sexo;
		
		System.out.println ("Digite o sexo"); 
		sexo=leitor.nextLine();
		
		System.out.println ("Digite a altura"); 
		sexo=leitor.nextLine();
		
		if(sexo.equals("masculino") )
        {
            y = (72.7altura)-58;
            System.out.println("Seu peso ideal é: "+x);
        }
        else if(sexo.equals("feminino"))
        {
            y = (62.1x)-44;
            System.out.println("Seu peso ideal é: "+x);
        }
		

}
