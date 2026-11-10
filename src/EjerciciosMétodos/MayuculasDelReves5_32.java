package EjerciciosMétodos;

import java.util.Scanner;

public class MayuculasDelReves5_32 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime una frase y te la mostraré en mayúsculas y escrita al revés.");
		String palabra = sc.nextLine();
		
		//Antes de recorrer el string lo pasamos a mayúsculas
		String palabraMayusculas = palabra.toUpperCase();
		//Tengo que recorrer el string al reves 
		for(int i=palabra.length()-1; i>=0; i--) {
			System.out.print(palabraMayusculas.charAt(i));
		}
		
		
		

	}

}
