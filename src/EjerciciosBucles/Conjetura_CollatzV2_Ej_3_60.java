package EjerciciosBucles;

import java.util.Scanner;

public class Conjetura_CollatzV2_Ej_3_60 {

	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		//System.out.print("DAme un número: ");
		int numeroConPasos=1;
		//int numeroOriginal=numero;
		//Contador de pasos
		int mayorNumPasos=0;
	for(int i=1; i<1000; i++) {
		//En cada pasada del bucle, guardo el numero CUIDADO 
		int numPasos=0;
		int numero=i;
		while(numero!=1) {
			if (numero%2==0) {
				//es par 
				
				numero=numero/2;
				
			}else {
				//es impar
				
				numero=numero*3+1;
				
				
			}
			//Esta línea se ejecuta siempre vaya por el if o por el else
			numPasos++;
		}
		//Comprobar si es el que mas pasos da 
		//Vamos a ver si este numero tiene el record de pasos.
		if(numPasos>mayorNumPasos) {
			System.out.println("NUevoRecord!! el número " + i+ "es el ");
		

	
	//sc.close();
	}
	System.out.printf("El número %d es el que necesita" + "pasos, concretamente %d", numConPasos, mayorNumPasos);
	}
}
