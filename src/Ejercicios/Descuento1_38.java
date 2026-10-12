package Ejercicios;

import java.util.Scanner;

public class Descuento1_38 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	//Declaramos la variable
	final double Descuento=0.15;
	double num1;
	//Pedimos el precio y le aplicamos el 15% de descuento de IVA y damos el precio total con el descuento aplicado.
	System.out.print("Dame el precio y te digo el descuento y el total con descuento");
	num1=sc.nextFloat();
	
	//Calculamos el IVA
	double TotalDescuento= num1*Descuento;
	//Restamos el descuento al precio y obtenemos el precio total
	double precioTotal= num1-TotalDescuento;
	
	System.out.printf("El descuento es: %.2f%n", TotalDescuento);
	System.out.printf("El precio total es: %.2f%n", precioTotal);
	
	sc.close();
	}

}
