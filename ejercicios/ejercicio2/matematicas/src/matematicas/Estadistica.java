package matematicas;

public class Estadistica {
    private int[] coleccionValores;

    public Estadistica(int[] coleccionValores) {
        this.coleccionValores = coleccionValores;
    }

    public double calcularValorMedio(){
        int suma = 0; //recoger la suma de los valores de la colección
        for (int i = 0; i < coleccionValores.length; i++) {
            //System.out.println("Valor " + i + " " + coleccionValores[i]);
            suma += coleccionValores[i];
        }
        return 1.0 * suma / coleccionValores.length;
    }
    public double calcularVarianza(){
        double suma = 0.0;
        for (int i = 0; i < coleccionValores.length; i++) {
            suma += Math.pow(coleccionValores[i] - calcularValorMedio(), 2);
        }
        return   suma / coleccionValores.length;
    }
    public double calcularDesviacionTipica(){
        return Math.sqrt(calcularVarianza());
    }

   /* public static void main(String[] args) {
        int[] coleccion = {1, 2 , 3, 4, 5, 5, -9 , 2, 10_000};
        Estadistica estadistica = new Estadistica(coleccion);
        System.out.println(estadistica.calcularValorMedio() + " valor medio");
        System.out.println(estadistica.calcularVarianza() + " valor de la varianza");
        System.out.println(estadistica.calcularDesviacionTipica() + " valor de la desviacion típica");
    }*/
}
