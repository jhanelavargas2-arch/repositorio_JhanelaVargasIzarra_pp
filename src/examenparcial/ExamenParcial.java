package examenparcial;
//Paquete de datos e/s datos por consola
import java.util.Scanner;
public class ExamenParcial {
    //Método principal
    public static void main(String[] args) {
        //Declaración de variables
        String empleado;
        double ht,th,sb,d,sn;
        //Creando el objeto de lectura
        Scanner lectura=new Scanner(System.in);
        //Entrada de datos
        System.out.println("Nombre de empleado: ");
        empleado=lectura.next();
        System.out.println("Horas trabajadas: ");
        ht=lectura.nextDouble();
        System.out.println("Tarifa por hora: ");
        th=lectura.nextDouble();
        //Proceso de datos
        sb=ht*th;
        d=sb*0.13;
        sn=sb-d;
        //Salida de datos
        System.out.println("Sueldo bruto: "+sb);
        System.out.println("Descuento: "+d);
        System.out.println("Sueldo neto: "+sn);
    }//Fin del método    
}//Fin del programa
