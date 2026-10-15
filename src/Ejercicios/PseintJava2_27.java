package Ejercicios;

import java.util.Scanner;

public class PseintJava2_27 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime dos numeros y te digo cuál es el mayor o si son iguales");
		System.out.println("Dime el primer número");
		int a = sc.nextInt();
		System.out.println("Dime el segundo número");
		int b =  sc.nextInt();
		
		if (a>b) {
			System.out.print(a + " es mayor que " + b);
		} else  {
			if (a<b) {
				System.out.print(b + " es mayor que " + a);
			} else 
				System.out.print("Son iguales");
		}
		
		//Solución más elegante if-else-if
		if (a>b) {
			System.out.print(a + " es mayor que " + b);
		}else if(a<b) {		
			System.out.print(b + " es mayor que " + a);
		}else
			System.out.print("Son iguales");
sc.close();
	}

}
