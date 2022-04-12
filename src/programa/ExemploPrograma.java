package programa;

import java.util.Scanner;

import classes.Divisao;
import classes.Multiplicacao;
import classes.Soma;
import classes.Subtracao;
import interfaces.ICalculadora;

public class ExemploPrograma {	
	
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		int opc = 0;
		while(opc != 5) {
			System.out.println("Digite a operação que deseja ? [1 - Soma, 2 - Subtracao, 3 - Multiplicacao, 4 - Divisao, 5 - Sair");
			opc = scan.nextInt();
			ICalculadora calculadora = null;
			if(opc == 1 ) {
				calculadora = new Soma();
			} else if (opc == 2) {
				calculadora = new Subtracao();
			}else if (opc == 3) {
				calculadora = new Multiplicacao();
			}else if (opc == 4) {
				calculadora = new Divisao();
			}
			if(calculadora != null) {
				System.out.println("Digite 2 valores:");
				Integer n1 = scan.nextInt(); 
				Integer n2 = scan.nextInt();
				Integer result = calculadora.calcula(n1, n2);
				System.out.println(result);
			}
		}
		scan.close();
	}
}
