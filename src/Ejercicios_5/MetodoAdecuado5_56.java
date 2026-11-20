package Ejercicios_5;

public class MetodoAdecuado5_56 {

	public static void main(String[] args) {
		//a
		String s = "programación";
		boolean empieza =s.length() >= 3 && s.charAt(0) == 'p' && s.charAt(1) == 'r' && s.charAt(2) == 'o';
		System.out.println(empieza);
		//El método ya hace eso es startswith
		 empieza=s.startsWith("pro");
		 System.out.println(empieza);

	}

}
