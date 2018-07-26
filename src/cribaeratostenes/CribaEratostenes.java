package cribaeratostenes;

import java.util.Arrays;

public class CribaEratostenes {

	public static int[] generaCriba(int numMax){
		int i,j;
	
		if (numMax >= 2){
			int dim = numMax+1;
			boolean[] primo = new boolean[dim];
			
			Arrays.fill(primo, Boolean.TRUE);
			
			primo[0] = primo[1] = false;
			
			//Marca números no primos como false
			for (i = 2; i< Math.sqrt(dim) + 1; i++){
				if (primo[i]){
					for (j = 2*i; j < dim; j+=i){
						primo[j] = false;
					}
				}
			}
			
			int[] primos = new int[numeroDePrimos(dim, primo)];
			for (i = 0,j=0; i < dim; i++){
				if (primo[i])
					primos[j++] = 1;
			}
			
			return primos;
		} else {
			return new int[0];
		}
		
	}

	//Cuenta número de primos
	private static int numeroDePrimos(int dim, boolean[] primo) {
		int i;
		int cuenta = 0;
		for (i = 0; i < dim; i++){
			if (primo[i])
				cuenta++;
		}
		return cuenta;
	}
}
