package Ejercicios;

import java.util.Scanner;

public class CocienteResto1_34 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Se pueden declarar varias variables en la misma linea
		int num1, num2;
		
		System.out.print("Dame el primer numero: ");
		num1 = sc.nextInt();
		System.out.print("Dame el segundo número: ");
		num2 = sc.nextInt();
		
		int cocienteEntero=num1/num2;
		double cocienteReal=(double)num1/num2;
		
		//El operador MODULO de JAVA es el simbolo %
		int resto=num1%num2;
		System.out.println("El cociente es: " + cocienteEntero  + " y el resto es: " + resto);
		System.out.println("EL cociente real es: " + cocienteReal);
		
		
		
		
		
		
	
		
 sc.close();
	}

}
