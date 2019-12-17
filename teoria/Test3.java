import libreria.subcarpeta.Numero;
import libreria.subcarpeta.Palabra;

public class Test3 {
	
	public static void main (String[] args) {
		
		Numero numero   = new Numero(6);
		Palabra palabra = new Palabra("contenido");
		System.out.printf("El valor del nº es %d%n", numero.getValor());
		System.out.printf("El contenido de la palabra es %s%n", palabra.getContenido());
	}
}

