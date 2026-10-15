package Ejercicios;

import java.util.Scanner;

public class PseintJava2_27 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime dos numeros y te digo cuál es el mayor o si son iguales");
		int a = sc.nextInt();
		int b =  sc.nextInt();
		
		if (a>b) {
			System.out.print(a + " es mayor que " + b);
		} else  {
			if (a<b) {
				System.out.print(b + " es mayor que " + a);
			} else 
				System.out.print("Son iguales");
		}
sc.close();
	}

}
