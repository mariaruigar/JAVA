package Ejercicios;

public class BucleFor {

	public static void main(String[] args) {
		//Escribir del 1 al 10 con for
		
		//El bucle for tiene 3 partes
		//La de la izquierda (asignacion) se ejecuta solo una vez y al llegar al for
		//La parte del medio (condicionb) se ejecuta una vez en cada pasada del bucle
		//La parte del final (incremento) se ejecuta al finalizar cada pasada del bucle
		System.out.print("\n");
		for(int i=1; i<=10;i++) {
			System.out.println(i + " ");
			
		}
//La variable i es local al bucle, no existe fuera
		//System.out.println(i + " ");
		//Podemos contar al reves
		System.out.print("\n");
		for(int i=10; i>0; i--) {
			System.out.print(i + " ");
		}
			//NO hace4 falta que vayamos de uno enb uno
		System.out.print("\n");
		for(int i=10; i>0; i-=2) {
			System.out.print(i + " ");
		}
			
			
		
	}

}
