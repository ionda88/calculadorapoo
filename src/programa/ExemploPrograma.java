package programa;

import java.util.ArrayList;
import java.util.List;
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
			System.out.println("Digite a operação que deseja ? [1 - Soma, 2 - Subtracao, 3 - Multiplicacao, 4 - Divisao, 5 - Sair]");
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
			} else if (opc != 5){
				System.out.println("Operacao Invalida!");
			}
			if(calculadora != null) {
				System.out.println("Digite 2 valores:");
				Double n1 = scan.nextDouble(); 
				Double n2 = scan.nextDouble();
				int arrayOuNao = 0;
				while(arrayOuNao != 1 && arrayOuNao != 2) {
					System.out.println("Deseja digitar mais valores? [1-sim 2-nao]");
					arrayOuNao = scan.nextInt();
				}
				if(arrayOuNao == 1) {
					List<Double> listaDouble = new ArrayList<Double>();
					listaDouble.add(n1);
					listaDouble.add(n2);
					while(true) {
						System.out.println("Digite um número: [Para finalizar digite 69420]");
						Double entrada = scan.nextDouble();
						if(entrada.equals(69420.0)) {
							break;
						}
						listaDouble.add(entrada);
					}
					Boolean temDouble = false;
					for(Double d : listaDouble) {
						if(d % 1 != 0) {
							temDouble = true;
							break;
						}
					}
					Object result = 0.0;
					if(temDouble) {
						Double[] arr = listaDouble.toArray(new Double[listaDouble.size()]);
						result = calculadora.calcula(arr);
					} else {
						Integer[] arr = new Integer[listaDouble.size()];
						for(int i = 0; i < listaDouble.size(); i++) {
							arr[i] = listaDouble.get(i).intValue();
						}
						result = calculadora.calcula(arr);
					}
					System.out.println(result);
				} else {
					Object result = 0.0;
					if(n1 % 1 == 0 && n1 % 2 == 0) {
						result = calculadora.calcula(n1.intValue(), n2.intValue());
					} else {
						result = calculadora.calcula(n1, n2);
					}
				
				
				System.out.println(result);
				}
			}
		}
		scan.close();
	}
}
