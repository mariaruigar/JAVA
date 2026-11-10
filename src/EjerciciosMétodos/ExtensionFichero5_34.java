package EjerciciosMétodos;

import java.util.Scanner;

public class ExtensionFichero5_34 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime un fichero con su extensión y te separo el nombre del fichero y la extensión.");
		String fichero=sc.nextLine();
		
		//Para saber la extension de un fichero tengo que buscar el .
		int posUltimoPunto= fichero.lastIndexOf(".");
		
		System.out.println(fichero.substring(0, posUltimoPunto));
		System.out.println(fichero.substring(posUltimoPunto + 1));
		
		}
		
		

	}