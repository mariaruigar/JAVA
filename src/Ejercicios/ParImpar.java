package Ejercicios;

import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	
	System.out.print("Dame un numero y te digo si e spar o impar :");
	int num= sc.nextInt();
	if (num%2==0) {
		System.out.println("Es par.");
		
	} else {
		System.out.println("Es impar.");
	}
		
	sc.close();

	}

}
