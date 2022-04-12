package programa;

import java.util.Scanner;

import classes.Soma;
import interfaces.ICalculadora;

public class ExemploPrograma {	
	
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a operação que deseja ? [1 - Teste]");
		int opc = scan.nextInt(); // le a entrada do terminal
		
//		Exemplo das chamadas que deverão ser feitas
		ICalculadora calculadora = new Soma();
//		ICalculadora calculadora = new Subtracao();
//		ICalculadora calculadora = new Divisao();
//		ICalculadora calculadora = new Multiplicacao();
//		
		Float result = calculadora.calcula((float)1.0, (float)2.0);
		System.out.println(result);
		scan.close();
		
	}
}
