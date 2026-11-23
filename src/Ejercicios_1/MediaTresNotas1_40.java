package Ejercicios_1;

import java.util.Scanner;

public class MediaTresNotas1_40 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime la primera nota:");
		double nota1=sc.nextDouble();
		System.out.println("Dime la segunda nota: ");
		double nota2=sc.nextDouble();
		System.out.println("Dime la tercera nota: ");
		double nota3=sc.nextDouble();
		double notatotal= (nota1+nota2+nota3)/3;
		System.out.printf("La media de tu nota es: %.1f%n", notatotal);
				

	}

}
