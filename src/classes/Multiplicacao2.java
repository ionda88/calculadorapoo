package classes;

import interfaces.ICalculadora;

public class Multiplicacao2 implements ICalculadora {

	@Override
	public Integer calcula(Integer n1, Integer n2) {
		return n1 * n2;
	}

	@Override
	public Float calcula(Float n1, Float n2) {
		return n1 * n2;
	}

	@Override
	public Double calcula(Double n1, Double n2) {
		return n1 * n2;
	}

	@Override
	public Integer calcula(Integer[] numeros) {
		Integer result = numeros[0];
		for(int i = 1; i< numeros.length; i++) {
			result = result * numeros[i];
		}
		return result;
		
	}

	@Override
	public Float calcula(Float[] numeros) {
		Float result = numeros[0];
		for(int i = 1; i< numeros.length; i++) {
			result = result * numeros[i];
		}
		return result;
	}

	@Override
	public Double calcula(Double[] numeros) {
		Double result = numeros[0];
		for(int i = 1; i< numeros.length; i++) {
			result = result * numeros[i];
		}
		return result;
	}

}