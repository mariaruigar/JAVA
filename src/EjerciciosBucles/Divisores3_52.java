package EjerciciosBucles;

import java.util.Scanner;

public class Divisores3_52 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Dame un numero y te muestro sus divisores");
		int numero= sc.nextInt();
		
		//Si estamos aqui yo se que el bucle se va a ejecutar 'numero' veces
		for (int i=1; i<=numero;i++) {
			if (numero%i==0) {
				//Significa que i es divisor de n
				System.out.println("Divisor encontrado " + i);
				
				
			}
		}

	}

}
