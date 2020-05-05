package exercicio;

import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		double x, y;
		
	    System.out.println ("Digite o valor do produto");
	    x = leitor.nextDouble();
	    
	    if (x<=20) 
	    {
	    y = x+( (x*45)/100 );
	    }
	    else  
	    {
	    y = x+( (x*30)/100 );
	    }
	    System.out.print ("Valor de revenda é "+y);
	}

}
