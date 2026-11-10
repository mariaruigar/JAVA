package EjerciciosMétodos;

import java.util.Scanner;

public class PrimoMetodos4_47 {
	public static boolean esPrimo(int numero) {
		for(int i=2; i<numero; i++) {
			if(numero%i==0) {
				return false;
			}
		}
		return true;
	}
	
	static int contarPrimos(int desde, int hasta) {
		int numPrimos=0;
		for(int i=desde; i<=hasta; i++) {
			if(esPrimo(i)) {
				numPrimos++;
			}
		}
			return numPrimos;
				
	}
	static int siguientePrimo(int numero) {
		while(true) {
			if (esPrimo(++numero)) {
				return numero;
			}
			
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
			if(esPrimo(num)) {
				System.out.println("Es primo");
				
				
			}else {
				System.out.print("No es primo");
	}
			System.out.println("Dame dos números y te digo todos los primos que hay entre ellos.");
			System.out.println("Hay " + contarPrimos(9,71) + " números primos " + " entre 9 y 71");
			
			System.out.println("Su siguiente primo es: " + siguientePrimo(num));
sc.close();
}
}