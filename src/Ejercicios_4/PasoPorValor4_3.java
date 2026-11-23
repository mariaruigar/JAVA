package Ejercicios_4;

public class PasoPorValor4_3 {
	static  int  doblar(int x) {
		x = x * 2;
		System.out.println("Dentro: " + x);
		return x;
	}

	public static void main(String[] args) {
		int x = 5;
		doblar(x);
		System.out.println("Fuera: " + doblar(x));
	}
}
//Dentro del static doblar será 10 y fuera será 5 porque fuera del bucle en el main
//Simplemente se memnciona y el void nunca va a devolver nada