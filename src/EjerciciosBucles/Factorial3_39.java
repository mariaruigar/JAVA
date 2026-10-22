package EjerciciosBucles;

import java.util.Scanner;

public class Factorial3_39 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime un número y te digo su factorial: ");
		int fact= sc.nextInt();
		int resultado=1;
		
		for (int i=fact; i>=1; i--) {
			//Acumulador
			resultado*= i;
			
			
		}System.out.println("El resultado del factorial es: " + resultado);
		
		//Haciendo de 1,2,3,4,5
		resultado=1;
		for (int i=2; i<=fact; i++) {
			//Acumulador
			resultado= resultado * i;
			
		}System.out.println("El resultado del factorial es: " + resultado);
		
		sc.close();
	}

}
