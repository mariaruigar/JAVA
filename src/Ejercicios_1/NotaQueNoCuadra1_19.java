package Ejercicios_1;

import java.util.Scanner;

public class NotaQueNoCuadra1_19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double n1 = sc.nextDouble(); 
		double n2 = sc.nextDouble(); 
		double n3 = sc.nextDouble();
		 double media = (n1 + n2+ n3)/ 3; 
		 System.out.println("Media: " + media);
sc.close();
	}

}
//Hay que transformar todos los int en doubles por si hay en el futuro un numero con
//decimales, y luego  a la hora de hacer la operacion en media hay que poner paréntesis antes
//de multiplicar por que si no divide¡ entre 3 solo el ultimo numero.