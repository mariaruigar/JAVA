package Ejercicios;

import java.util.Scanner;

public class LetraDni2_55 {


		final static String LETRA="TRWAGMYFPDXBNJZSQVHLCKE";
		
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Dime tus números de dni y te digo la letra: ");
			
			int DNI= sc.nextInt();
			int resto= DNI%23;
			System.out.println(LETRA.length());
			
			System.out.println("Tu letra del DNI es: " + LETRA.charAt(resto) );
			
				
				
			}
			
			
			

	}


