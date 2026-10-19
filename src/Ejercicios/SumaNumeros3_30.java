package Ejercicios;

import java.util.Scanner;

public class SumaNumeros3_30 {

	public static void main(String[] args) {
	
		Scanner sc= new Scanner(System.in);
		//Pedimos un numero y tenemos que mostrar su suma 
		System.out.print("Dime un numero y te muestro su suma");
		int i = sc.nextInt();
		while(i<=sc.nextInt()) {
			System.out.print(i + " ");
			i++;
		}

	}

}
