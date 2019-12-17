package fechas;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Fecha {
    public static LocalDate crearFecha(){
        int mes = 0, dia = 0, anno = 0, diaMax = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Introduce el mes:");
            mes = sc.nextInt();
        } while (mes < 1 || mes > 12);

        do {
            System.out.println("Introduce año");
            anno = sc.nextInt();
        } while (anno < 1900 || anno > 4000);

        switch (mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                diaMax = 31;
                break;
            case 2:
                if (anno % 4 == 0)
                    diaMax = 29;
                else
                    diaMax = 28;
                break;
            default:
                diaMax = 30;
        }



        do {
            System.out.println("Introduce día del mes");
            dia = sc.nextInt();
        } while (dia < 1 || dia > diaMax );



        sc.close();
        return LocalDate.of(anno, mes, dia);
    }

    public static LocalDate obtenerFechaActual (){
        return LocalDate.now();
    }

    public static String mostrarFechaFormatoLocal(LocalDate fecha){
        DateTimeFormatter fechaFormateada = DateTimeFormatter.ofPattern("dd-LL-yyyy");
        return fechaFormateada.format(fecha);
    }

    public static int obtenerAnnosEntreDosFechas(LocalDate fecha1, LocalDate fecha2){
        Period period = Period.between(fecha1, fecha2);
        return period.getYears();
    }

    public static void main(String[] args) {
       // System.out.println(Fecha.obtenerFechaActual());
      //  System.out.println(Fecha.crearFecha());
       // System.out.println(Fecha.mostrarFechaFormatoLocal(Fecha.crearFecha()));
        System.out.println(Fecha.obtenerAnnosEntreDosFechas(Fecha.crearFecha(),
                Fecha.obtenerFechaActual()));
    }
}
