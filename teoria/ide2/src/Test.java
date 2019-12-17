import libreria.subcarpeta.Numero;
import libreria.subcarpeta.Palabra;

public class Test {
    public static void main(String[] args) {
        Numero numero = new Numero(8);
        Palabra palabra = new Palabra("palabra");
        System.out.printf("El contenido del nº es %d%n", numero.getValor());
        System.out.printf("El contenido de la palabra es %s%n", palabra.getContenido());
    }
}
