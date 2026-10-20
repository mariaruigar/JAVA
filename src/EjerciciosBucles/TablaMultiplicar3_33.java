package EjerciciosBucles;

import java.util.Scanner;

public class TablaMultiplicar3_33 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime un número y te digo su tabla de multiplicar");
		int num = sc.nextInt();
		
		//Lo hacemos cxon el bucle for ya que es un acumulador como es una multiplicacion empezamos con el 1.
		for(int i=1; i<=10; i++) {
			System.out.printf("%d x %d = %d %n", num, i, num * i);
		}

	}

}
