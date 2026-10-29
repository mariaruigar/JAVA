package EjerciciosBucles;

import java.util.Scanner;

public class Cuadrado3_62 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime la altura de un cuadrado y te lo pinto:");
		
		int n=sc.nextInt();
		//Bucle exterior para las filas
		for(int i=1;i<=n;i++) {
			//bucle interior para las columnas
			//Que es donde pinto
			for(int j=1; j<=n; j++) {
			System.out.print("* ");
		}
		System.out.println();
	}
	

}
}