
package EjerciciosBucles;

import java.util.Scanner;

public class cuadrado2_3_62 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime la altura de un cuadrado y te lo pinto hueco:");

		int n=sc.nextInt();

		//Bucle exterior para las filas
		for(int i=1;i<=n;i++) {

			//bucle interior para las columnas
			//Que es donde pinto
			for(int j=1; j<=n; j++) {
				//Si estamos en la primera o última final o columna hay *
				//y lo mismo en las columnas
				if(i==1 || i==n || j==1 || j==n) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println(" ");
		}

	}
}
