package Ejercicios;

import java.util.Scanner;

public class DiasDelMes {

	public static void main(String[] args) {
		int mes;
		int anio=0;
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Dime un mes del 1 al 12 y te digo cúantos días tiene ese mes: ");
		mes = sc.nextInt();
		if (mes==2) {
			System.out.print("Febrero es un mes complicado de que año hablamos?");
			anio= sc.nextInt();
		}
		
		switch(mes) {
			case 1,3,5,7,8,10,12:
				System.out.print("Tiene 31 días");
			break;
			case 4,6,9,11:
				System.out.print("Tiene 30 días");
			break;
			case 2:
				if (anio%400==0 || ((anio%4==0)&&!(anio%100==0))) {
				System.out.println("Es bisiesto. Tiene 29 días");
				} else {
				System.out.println("No es bisiesto. Tiene 28 días");

			}
			break;	
		
			default:
				System.out.print("Mes no válido");
				break;
		
			
		}		
sc.close();
	}

}
