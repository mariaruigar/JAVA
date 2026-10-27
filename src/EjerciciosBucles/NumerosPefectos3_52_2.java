package EjerciciosBucles;

import java.util.Scanner;

public class NumerosPefectos3_52_2 {

	public static void main(String[] args) {
		//Un numero perfecto es en el cual todos sus divisores al multiplicarlos da el mismo número
		System.out.print("Dime un número y te digo si es perfecto o no: ");
		Scanner sc = new Scanner(System.in);
		int numero= sc.nextInt();
		
		//Si estamos aqui yo se que el bucle se va a ejecutar 'numero' veces
		int sumaDivisores=0;
		for (int i=1; i<=numero;i++) {
			if (numero%i==0) {
				//Significa que i es divisor de n
				System.out.println("Divisor encontrado " + i);
				sumaDivisores=sumaDivisores+i;
				
			}		

		}
		//Aqui hemos encontrado los divisores
		if (numero==sumaDivisores) {
			//Significa que i es divisor de n
			System.out.println("Divisor encontrado" + numero + "\n");
			
		}
		sc.close();
}
}