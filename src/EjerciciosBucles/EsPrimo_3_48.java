package EjerciciosBucles;

import java.util.Scanner;

public class EsPrimo_3_48 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime un número y te digo si es primo o no.");
		int num=sc.nextInt();
		//Para saber que es primo solo tiene que ser divisible entre 1 y él mismo entonces usamos un if...else
		
		boolean esPrimo=true;
	;
		//Nos saltamos el 1 y el propio numero
		for(int i=2; i<num;i++) {
		//CXomprubeo si ese numero es divisor
			if(num%i==0) {
				//SI entro aqui i  es divisor de numero
				esPrimo=false;
				
			}
			
		}
		if(esPrimo) {
			System.out.println("Es primo");
			
			
		}else {
			System.out.print("No es primo");
		}

	}

}
