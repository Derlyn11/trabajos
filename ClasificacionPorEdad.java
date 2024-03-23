import java.util.Scanner;

public class ClasificacionPorEdad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int sumaEdadesMayores = 0;
        int cantidadMayores = 0;
        int sumaEdadesMenores = 0;
        int cantidadMenores = 0;
        
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese la edad de la persona " + (i + 1) + ": ");
            int edad = scanner.nextInt();
            
            if (edad >= 18) {
                sumaEdadesMayores += edad;
                cantidadMayores++;
            } else {
                sumaEdadesMenores += edad;
                cantidadMenores++;
            }
        }
        
        double promedioMayores = cantidadMayores > 0 ? (double) sumaEdadesMayores / cantidadMayores : 0;
        double promedioMenores = cantidadMenores > 0 ? (double) sumaEdadesMenores / cantidadMenores : 0;
        
        System.out.println("\nResumen:");
        System.out.println("Personas mayores de edad: " + cantidadMayores);
        System.out.println("Suma de edades de personas mayores: " + sumaEdadesMayores);
        System.out.println("Promedio de edades de personas mayores: " + promedioMayores);
        System.out.println("\nPersonas menores de edad: " + cantidadMenores);
        System.out.println("Suma de edades de personas menores: " + sumaEdadesMenores);
        System.out.println("Promedio de edades de personas menores: " + promedioMenores);
        
        scanner.close();
    }
}


