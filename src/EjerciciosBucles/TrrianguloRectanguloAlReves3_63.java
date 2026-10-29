package EjerciciosBucles;

import java.util.Scanner;

public class TrrianguloRectanguloAlReves3_63 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Dime la altura de un triángulo rectángulo y te lo dibujo:");
		int n =sc.nextInt();
		
		
		//Hacemos doble bucle for con un acumulador
		for(int columna=1; columna<=n; columna++) {
			
			for (int fila=1; fila<=columna; fila++) {
				 
				System.out.print("* ");
		
		}
			System.out.println(" ");
		
		}
		System.out.println("");
}


	}


