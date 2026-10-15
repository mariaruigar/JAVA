package Ejercicios;

import java.util.Scanner;

public class Bisiesto {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Dime un año y te digo si es bisiesto o no.");
		int a= sc.nextInt();
		
		if (a%4==0) {
			//Voy por el buen camino para se bisiesto
			if(a%400==0) {
				System.out.println("Es bisiesto.");
			}else {
				//Aqui es divisible entre 4, pero no entre 400
				if (a%100==0) {
					System.out.println("No es bisiesto.");
				}else {
					System.out.println("Es bisiesto.");
				}
			}
			
		}else {
			//Si no es divisible entre 4 no es bisiesto
			System.out.println("No es bisiesto");
		}

		//Opción corta
		if (a%400==0 || ((a%4==0)&&!(a%100==0))) {
			System.out.println("Es bisiesto.");
		} else {
			System.out.println("No es bisiesto.");
		
		}
		
		
		
		
		sc.close();



	}

}
