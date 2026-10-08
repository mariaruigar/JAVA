package Ejercicios;

import java.util.Scanner;

public class ej1_33 {

	public static void main(String[] args) {
		//Escaner para leer el teclado IMPORTAR EL ESCANER!!! 
		Scanner scanner = new Scanner(System.in);
		
		//Definimos el numero entero con el escaner y al hacer las operaciones cuidado con los operandos!!!!!!
		//SE PUEDEN DECLARAR VARIAS VARIABLES EN LÑA MISMA LINEA
		int numeroEstandar = scanner.nextInt();
		int numeroEstandar2 = scanner.nextInt();
		
		
		//Pedir los numeros al usuario
		System.out.print("Dame el primer numero: ");
		numeroEstandar = scanner.nextInt();
		System.out.print("Dame el segundo número: ");
		numeroEstandar2 = scanner.nextInt();
		
		
		
		int suma= (numeroEstandar + numeroEstandar2);
		int resta= numeroEstandar - numeroEstandar2;
		int producto= numeroEstandar * numeroEstandar2;
		
		//Suma,resta y multiplicación
		System.out.println("suma: " + (suma));
		System.out.println("resta: " + (resta));
		System.out.println("producto: " + (producto));
		
		
		//CERRAR EL LECTOR
		scanner.close();
		
		

	}
}
