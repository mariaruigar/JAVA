package Ejercicios;

import java.util.Scanner;

public class CalcularIVA1_37 {

	public static void main(String[] args) {
	
	
		Scanner sc= new Scanner (System.in);
	final double IVA= 0.21;
		float num1;
	
		//Pedimos el precio y le damos el IVA y el precio total
		System.out.print("Dame el precio y te digo el IVA y el precio total");
		num1=sc.nextFloat();
		
		//Sumamos el iva
		double precioConIVA= num1 * IVA;
		//Sumamos el precio total
		double precioTotal= num1 + precioConIVA;
		
		System.out.println("El IVA es: " + precioConIVA);
		System.out.println("El precio total es: " + precioTotal);
		
		sc.close();
		
		
		
		

	}

}
