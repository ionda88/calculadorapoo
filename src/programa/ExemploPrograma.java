package programa;

import java.util.Scanner;

import classes.Divisao;
import classes.Soma;
import interfaces.ICalculadora;

public class ExemploPrograma {	
	
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		int opc = 0;
		while(opc != 5) {
			System.out.println("Digite a operação que deseja ? [1 - Soma, 2 - Divisao, 5 - Sair]");
			opc = scan.nextInt(); // le a entrada do terminal
			
			if(opc == 1 ) {
				ICalculadora calculadora = new Soma();
				Float result = calculadora.calcula((float)1.0, (float)2.0);
				System.out.println(result);
	//		ICalculadora calculadora = new Subtracao();
			} else if (opc == 2) {
				ICalculadora calculadora = new Divisao();
				Float result = calculadora.calcula((float)1.0, (float)2.0);
				System.out.println(result);
			}
		}
//		ICalculadora calculadora = new Multiplicacao();
//		
		scan.close();
		
	}
}
