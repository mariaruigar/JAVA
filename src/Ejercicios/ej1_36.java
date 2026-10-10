package Ejercicios;

import java.util.Scanner;

public class ej1_36 {

	public static void main(String[] args) {
	//Declaramos el escáner
	Scanner sc= new Scanner (System.in);
	 //Declaramos las variables
	 double num1;
	 //Pedimos el radio de un círclo y queremos saber el área del circulo y la longitud de circunferencia.
	 System.out.print("Dame el radio del círculo: ");
	 num1=sc.nextDouble();
	 
	 //area del ciculo:
	 double area= Math.PI*(num1*num1);
	 //calculamso la longitud de la circunferencia
	 double longitud= 2*Math.PI*num1;
	 
	 //Damos los resultados
	 System.out.println("El área del círculo es: " + area);
	 System.out.println("La longitud del círculo es: " + longitud);
	 
	 sc.close();
	 
	 
	 
	 

	}

}
