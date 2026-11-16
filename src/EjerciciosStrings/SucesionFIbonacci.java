package EjerciciosStrings;

import java.util.Scanner;

public class SucesionFIbonacci {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner (System.in);
		System.out.println("¿Qué término de la sucxesión de Fibonacci necesitas)");
		long termino=sc.nextInt();
		
		long ultimo= 1;
		long penultimo = 0;
		System.out.println(penultimo + "," + ultimo + ",");
		//Calcular los términos que me pidan
		//LOs dos primeros ya los tenemos, siempre son los mismos
		for(int i=3; i<=termino; i++) {
			long siguiente=ultimo+penultimo;
			System.out.print(siguiente + ", ");
			penultimo=ultimo;
			ultimo=siguiente;
		
	
		}

	}

}
