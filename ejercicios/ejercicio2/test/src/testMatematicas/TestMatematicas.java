package testMatematicas;

import matematicas.Estadistica;
import matematicas.Geometria;

import java.util.Scanner;

public class TestMatematicas {
    public static void main(String[] args) {
        Estadistica estadistica = new Estadistica(new int[]{1,2,3,4,5});
        System.out.printf("Valor medio %.2f, varianza %.2f y desviación típica %.2f%n",
                estadistica.calcularValorMedio(), estadistica.calcularVarianza(),
                estadistica.calcularDesviacionTipica());
        System.out.println("Introduce el lado");
        Scanner scanner = new Scanner(System.in);
        int lado = scanner.nextInt();
        scanner.close();
        System.out.printf("El área del triangulo isosceles y rectángulo de lado %d vale %.2f%n",
                lado, Geometria.calcularAreaTriangulo(lado, lado));
        System.out.printf("El área del cuadrado de lado %d vale %d%n",
                lado, Geometria.calcularAreaCuadrado(lado));
        System.out.printf("El área del hexágono de lado %d vale %.2f%n",
                lado, Geometria.calcularAreaHexagono(lado));
        System.out.printf("El área del pentágono de lado %d vale %.2f%n",
                lado, Geometria.calcularAreaPentagono(lado));
    }
}
