package EjerciciosBucles;

import java.util.Scanner;

public class BucleDoWhile {

	public static void main(String[] args) {
		
		//Escribir hasta 10 con un bucle while
		int i = 1;
		
		
		
		while(i<10) {
				System.out.print(i + " ");
				i++; //i=i+1
				
		}
//Tenemos dos palabras reservadas break y continue
		//Vamos a pedir numeros hasta que el usuario meta un numero negativo
		Scanner sc = new Scanner(System.in);
		int num;
		//Tenemos un bucle infinito a proposito
		while(true) {
			System.out.println("Dame un número: ");
			num=sc.nextInt();
			if(num<0) {
				//Nos salimos del bucle
				break;
			}else {
				System.out.print("Número positivo, seguimos");
			}
	}
		//Continue lo que hace es saltar a la siguiente iteracion del bucle
		//Vamos a escribir  los numeros del 1 al 10, excepto los multiplos de 3
		int num2=0;
		while(num2<=10) {
			num2++;
			if (num2%3==0) {
				//Si estoy aquiu es multiplo de 3
				continue;	
			}
			System.out.println(num2 + " ");
		}
}
}
