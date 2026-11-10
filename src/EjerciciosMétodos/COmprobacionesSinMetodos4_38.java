package EjerciciosMétodos;

import java.util.Scanner;

public class COmprobacionesSinMetodos4_38 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Dame dos numeros: ");
		int a= sc.nextInt();
		int b= sc.nextInt();
		
		if (a%2==0) {
			System.out.print("El numero " + a + " es par.");
		}else {
			System.out.print("El número " + a + " es impar.");
		}
		//Lo mismo pero con el operador ternario.
		
		//String parOImpar= a%2==0 ? "par" : "impar";
		if (a>=0) {
			System.out.print(" el número " + a + " es positivo");
					
		}else {
			System.out.print("El número " + a + " es negativo");
		}
		if (a%b==0 || b%a==0) {
			System.out.print(a + "y" + b + " son múltiplos");
		}else {
			System.out.print(a + "y" + b + " no son múltiplos.");
		}
	}

}
