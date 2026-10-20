package Ejercicios;

import java.util.Random;
import java.util.Scanner;

public class PiedraPapelTijera2_60 {

	public static final int PIEDRA=1;
	public static final int PAPEL=2;
	public static final int TIJERA=3;
	public static void main(String[] args) {
		
		
		System.out.println("Elige:");
		System.out.println("1.-Piedra");
		System.out.println("2.-Papel");
		System.out.println("3.-Tijera");
		Scanner sc = new Scanner(System.in);
		Random rand =new Random();
		int usuario=sc.nextInt();
		if (usuario==1) {
			System.out.println("Has elegido piedra.");
			
		}else if (usuario==2) {
			System.out.println("Has elegido papel.");
			
		}else if (usuario==3) {
			System.out.println("Has elegido tijera.");
		}
		System.out.println("Has elegido " + usuario);
		
		//Genera un numero entre 0 y 2
		int ordenador = rand.nextInt();
		ordenador++;
	
		//Sumando uno, genera entre 1 y 3
		System.out.println(ordenador);
		
	// Aqui realmente estamos repietiendo codigo pero realmente no sabemos como no repetir en este caso
		if (ordenador==1) {
			System.out.println("El ordenador ha elegido piedra");
			
		}else if (ordenador==2) {
			System.out.println("El ordenador ha elegido papel");
			
		}else if (ordenador==3) {
			System.out.println("EL ordenador ha elegido tijera");
		}else  {
			System.out.println("Hay un error");
		}
		
		//REGLAS 
		//EL PAPEL GANA A LA PIEDRA
		//LA PIEDRA GANA A LA TIJERA
		//LA TIJERA GANA AL PAPEL
	//	 if(usuario==PIEDRA,TIJERA,PAPEL && ordenador==TIJERA,PAPEL,PIEDRA){
	//		 System.out.print("Has ganado");
	//	 }else if (usuario==TIJERA, PAPEL,PIEDRA && ordenador== PIEDRA, PAPEL,PIEDRA){
			 
	//	 }else (usuario==PIEDRA,PAPEL,TIJERA && ordenador==PIEDRA,PAPEL,TIJERA)
		
		if ((usuario==PIEDRA) && (ordenador==TIJERA) || (usuario==TIJERA) && (ordenador==PAPEL) || (usuario==PAPEL) && (ordenador==PIEDRA)) {
			System.out.println("Has ganado!");
		}else if 
		
	}

}
