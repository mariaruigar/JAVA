package CadenasDeCaracteres;

import java.util.Scanner;

public class EjemploString {

	public static void main(String[] args) {
		//El entero e sun tipo básico, no sabe hacer casi nada 
		//Si pulso el . eclipse no me sugiere nada
		int numero=5;
		//numero.
		
		//El escáner es un objeto, no un tipo básico
		//Los objetos se inicializan con el operador new
		//Scanner sc = new Scanner(System.in);
		//El escaner sabe hacer cosas
		//Por ejemplo nextInt
		//numero=sc.nextInt();
		
		//El string no es un tipo básico. el String sabe hacer cosas
		//Es un poco especial, podemos inicializar strings sin poner new
		String nombre= "María";
		System.out.print("Me llamo " + nombre + ", eso son " + nombre.length() + " letras");
		
		for(int i=0; i<nombre.length(); i++) {
			char caracter=nombre.charAt(i);
			System.out.println(caracter);
		}
	}

}
