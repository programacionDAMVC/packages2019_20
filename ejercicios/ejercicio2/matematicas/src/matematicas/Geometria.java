package matematicas;

public class Geometria {
    public static double calcularAreaTriangulo(int altura, int base){
        return base * altura / 2.0;
    }
    public static int calcularAreaCuadrado (int lado){
        return lado * lado;
    }
    public static double calcularAreaPentagono(int lado){
        return 1.72 * lado * lado;
    }
    public static double calcularAreaHexagono(int lado){
        return 2.6 * lado * lado;
    }
}
