package libreria.subcarpeta;

public class Test1 {

    public static void main(String[] args) {
        Numero numero = new Numero(6);
        Palabra palabra = new Palabra("contenido");
        System.out.printf("El valor del nº es %d%n", numero.getValor());
        System.out.printf("El contenido del la palabra %S%n", palabra.getContenido());
    }
}
