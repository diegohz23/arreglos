import java.util.Scanner;
public class arreglos{
    public static void main(String[] args) {
        double[] calificaciones = new double[5];        
        Scanner sc = new Scanner(System.in);
        for (int i=0; i<calificaciones.length; i++){
            System.out.println("Escribe calificacion [" + i + "]:");
            calificaciones [i] = sc.nextDouble();
        }
        //No se imprime el contenido de las casillas del arreglo
        //solo se imprime la direccion de memoria de donde empieza el arreglo
        //System.out.println("calificaciones : " + calificaciones);

        //Impresion usando el for extendido
        System.out.println("Contenido de arreglo de calificaciones:");
        for ( double calificacion : calificaciones)
            System.out.println(calificacion);

        System.out.println("Contenido de calificaciones: ");
        //Impresion con el for tradicional
        for ( int i=0; i<calificaciones.length; i++)
        System.out.println(calificaciones[i]);
        sc.close();
    }
}