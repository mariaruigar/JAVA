package EjerciciosMétodos;

import java.util.Scanner;



public class LongitudPassword5_31 {

	
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe tu contraseña: ");
		String pass= sc.nextLine();
		
		if(pass.length()<8) {
			System.out.println("Tu contraseña es corta " + " faltan " + (8-pass.length()) + " caractéres.");
		}
sc.close();
	}

}
