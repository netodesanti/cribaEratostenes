package cribaeratostenes;

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
			marcarNumerosNoPrimos(primo);
			
			//Creación de arreglo final
			int[] primos = new int[numeroDePrimos(dim, primo)];
			
			//Retorna arreglo
			return arregloPrimos(primos, primo);
		} else {
			return new int[0];
		}
		
	}

	//Marca los números no primos como false
	private static boolean[] marcarNumerosNoPrimos(boolean[] primo) {
		for (i = 2; i< Math.sqrt(dim) + 1; i++){
			if (primo[i]){
				for (j = 2*i; j < dim; j+=i){
					primo[j] = false;
				}
			}
		}
		
		return primo;
		
	}

	//Devuelve el arreglo final
	private static int[] arregloPrimos(int[] pArregloFinal, boolean[] pArregloBool) {
		for (i = 0,j=0; i < dim; i++){
			if (pArregloBool[i])
				pArregloFinal[j++] = i;
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
