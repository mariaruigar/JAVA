package EjerciciosBucles;

import java.util.Scanner;

public class Triangulo_rectangulo_3_63 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Dime la altura de un triángulo rectángulo y te lo dibujo:");
		int n =sc.nextInt();
		
		
		//Hacemos doble bucle for con un acumulador
		for(int fila=1; fila<=n; fila++) {
			
			for (int columna=1; columna<=fila; columna++) {
				 
				System.out.print("*  ");
		
		}
			System.out.println(" ");
		
		}
		System.out.println("  ");
}
}
