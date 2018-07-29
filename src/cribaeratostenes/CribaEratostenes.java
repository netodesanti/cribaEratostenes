package cribaeratostenes;

import java.util.ArrayList;
import java.util.Arrays;

public class CribaEratostenes {

	public static int i, j;
	public static int dim;
	
	public static int[] generaCriba(int numMax){
		if (numMax >= 2){
			dim = numMax+1;
			boolean[] primo = new boolean[dim];
			
			//Llena el arreglo de valores true
			Arrays.fill(primo, Boolean.TRUE);
			
			//Define el 0 y el 1 como falsos
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
			
			return arregloPrimos(primos, primo);
		} else {
			return new int[0];
		}
		
	}

	private static int[] arregloPrimos(int[] pArregloFinal, boolean[] pArregloBool) {
		for (i = 0,j=0; i < dim; i++){
			if (pArregloBool[i])
				pArregloFinal[j++] = 1;
		}
		return pArregloFinal;
	}

	//Cuenta número de primos
	private static int numeroDePrimos(int dim, boolean[] primo) {
		int cuenta = 0;
		for (i = 0; i < dim; i++){
			if (primo[i])
				cuenta++;
		}
		return cuenta;
	}
}
