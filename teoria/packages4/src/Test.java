import libreria.subcarpeta.Numero;
import libreria.subcarpeta.Palabra;

public class Test {
    public static void main(String[] args) {
        Numero numero = new Numero(9);
        Palabra palabra = new Palabra("palabra");
        System.out.printf("El valor de nº es %d%n", numero.getValo());
        System.out.printf("El contenido de la palabra %s%n", palabra.getContenido());
    }
}
