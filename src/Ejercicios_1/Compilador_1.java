package Ejercicios_1;

import java.util.Scanner;

public class Compilador_1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//a
		 int x = 5;
		System.out.println(x); //faltaba el ;
		//b
		 String Nombre = sc.nextLine(); 
		 System.out.println("Hola " + Nombre); //nombre falta la mayúscula.
		 //c
		 double precio = 3.5; //int en vez de double
		 //d
		 int total=0; //Faltaba poner el valor en la variable.
		 System.out.println(total); 
	}

}
