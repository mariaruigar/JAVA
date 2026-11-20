package Ejercicios_1;

import java.util.Scanner;

public class SiempreDaCero1_18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double f = sc.nextDouble();
		double c = (f-32)*5/9;
		System.out.println(f + "ºF son " + c + "ºC");
//La formula estaba al revés f-32 esta dividiendo y no multiplicando.
	}

}
