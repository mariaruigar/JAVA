package Ejercicios_4;

public class OrdenLlamada4_2 {
	static void a() {
		System.out.println("a: empieza");
		b();
		System.out.println("a: termina");
	}

	static void b() {
		System.out.println("b");
	}

	public static void main(String[] args) {
		System.out.println("main: empieza");
		a();
		b();
		System.out.println("main: termina");
	}
}
//La respuesta sera 1.-main empieza 2.-a empieza 3.-a termina 4.-main termina
//Empezamos simepre por el main y luego se aplica lo que va dentro del main 
//Recurriendo a los statics que haya mencionados dentro del main pero que esté fuera.