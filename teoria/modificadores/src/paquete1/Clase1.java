package paquete1;

public class Clase1 {
    private static int variablePrivada = 1;
    public  static  int variablePublica = 2;
    static int variableAmistosa = 3;
    protected static  int variableProtected = 4;

    public int sumar(){
        return variablePrivada + variablePublica +
                variableAmistosa + variableProtected;
    }
}
