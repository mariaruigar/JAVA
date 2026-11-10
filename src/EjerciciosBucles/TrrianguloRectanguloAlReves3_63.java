package EjerciciosBucles;

import java.util.Scanner;

public class TrrianguloRectanguloAlReves3_63 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Dime la altura de un triángulo rectángulo y te lo dibujo:");
		int n =sc.nextInt();
		
		
		//Hacemos doble bucle for con un acumulador
		for(int i=1; i<=n; i++) {
			
			for (int j=1; j<=n-i; j++) {
				 
				System.out.print(" ");
		
		}
			for (int k=1; k<=i; k++) {
			System.out.print("*");
		
		}
		System.out.println();
}


	}
}

