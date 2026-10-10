package Ejercicios;

import java.util.Scanner;

public class ej1_35 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2;
		//El área de un rectangulo es base x altura, por lo tanto pedimos primero las dos cifras.
		System.out.println("Dame la base del rectángulo: ");
		num1= sc.nextInt();
		System.out.println("Dame la altura del rectangulo: ");
		num2= sc.nextInt();
		
		//Realizamos la operación del área
		double Área=num1*num2;
		double Perímetro= 2*(num1+ num2);
		
		//Damos la solución
		System.out.println("El área del rectángulo es: " + Área);
		System.out.println("El perímetro del rectángulo es: " + Perímetro);
		
	sc.close();

	}

}
