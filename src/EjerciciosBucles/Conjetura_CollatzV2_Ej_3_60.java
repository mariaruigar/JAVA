package EjerciciosBucles;

import java.util.Scanner;

public class Conjetura_CollatzV2_Ej_3_60 {

	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		//System.out.print("DAme un número: ");
		int numero;
		//int numeroOriginal=numero;
		//Contador de pasos
		int numPasos=0;
	for(int i=1; i<1000; i++) {
		//En cada pasada del bucle, guardo el numero
		numPasos=0;
		numero=i;
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
		System.out.printf("%n El %d ha llegado a %d en %3d pasos %n", i, numero, numPasos);
		

	
	//sc.close();
	}
	}
}
