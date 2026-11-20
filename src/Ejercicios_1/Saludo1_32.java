package Ejercicios_1;

import java.util.Scanner;

public class Saludo1_32 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime tu nombre y apellido");
		String nombre= sc.next();
		String apellido= sc.next();
		System.out.println("Hola " + nombre + "." + " Tu apellido es " + apellido);

	}

}
