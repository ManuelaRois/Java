package conceptos_basicos;

import java.util.Scanner;

public class cls_Promedio {

    private static int i;

    /* Realice un algoritmo que permita capturar las 5 calificaciones de una materia de una cantidad X de estudiantes,
donde las notas van en un formato  float. indicar cual es la nota final de los estudiantes y el promedio
de nota del curso total. 
Condiciones (pedir el nombre de la materia) (promedio total del alumno x en el curso x)
1. la primera nota vale 20%
2. la segunda nota vale 30%
3. la tercera nota vale 15%
4. la cuarta nota vale el 20%
5. pedir los datos del estudiante como ID, nombre y las cinco notas 
6. Imprimir el listado de estudiantes con sus datos
7. imprimir la nota definitiva de cada estudiante
8. imprimir el promedio de las calificaciones de los X estudiantes
     */
    public static void main(String[] args) {

        // Heramienta de captura de datos
        Scanner scan = new Scanner(System.in);

        //Declaracion de las variables que necesito 
        String NombreDocente, NombreMateria;
        NombreDocente = NombreMateria = "";

        int CantidadEst = 0;

        //lectura de los datos iniciales 
        System.out.println("BIENVENIDOS AL INSTITUTO TODOSPIERDEN");
        System.out.println("-------------------------------------");

        System.out.println("Nombre de docente del curso:");
        NombreDocente = scan.nextLine();

        System.out.println("Nombre de la materia del curso:");
        NombreMateria = scan.nextLine();

        System.out.println("Cantidad de estudiantes matriculados:");
        CantidadEst = scan.nextInt();

        //Datos de los estudiantes
        //declaracion de vectores organicos 
        //Tipodedato[], nombrevariable = new Tipodedato [cantidad]
        String[] IDest = new String[CantidadEst];
        String[] Nomest = new String[CantidadEst];
        float[] Cal1_20 = new float[CantidadEst];
        float[] Cal2_30 = new float[CantidadEst];
        float[] Cal3_15 = new float[CantidadEst];
        float[] Cal4_15 = new float[CantidadEst];
        float[] Cal5_20 = new float[CantidadEst];

        System.out.println("------------------------");
        System.out.println("DATOS DE LOS ESTUDIANTES");

        //ESTRUCTURA DEL CICLO FOR 
        //for (i=0;i<=10;i++)
        for (int i = 0; i < CantidadEst; i++) { // Usar < en lugar de <=
            System.out.println("------------ *** -----------");

            // Leer ID
            System.out.println("ID Estudiante " + (i + 1));
            IDest[i] = scan.next();
            scan.nextLine(); // Limpiar el buffer después de next()

            // Leer Nombre COMPLETO
            System.out.println("Nombre completo del estudiante " + (i + 1));
            Nomest[i] = scan.nextLine(); // Usar nextLine() para capturar espacios

            // Leer notas
            System.out.println("Calificacion del 20% - Est" + (i + 1));
            Cal1_20[i] = scan.nextFloat();

            System.out.println("Calificacion del 30% - Est" + (i + 1));
            Cal2_30[i] = scan.nextFloat();

            System.out.println("Calificacion del 15% - Est" + (i + 1));
            Cal3_15[i] = scan.nextFloat();

            System.out.println("Calificacion del 15% - Est" + (i + 1));
            Cal4_15[i] = scan.nextFloat();

            System.out.println("Calificacion del 20% - Est" + (i + 1));
            Cal5_20[i] = scan.nextFloat();
        }
        //procesamiento de la informacion
        //nota definitiva y pro medio del curso
        float[] Definitiva = new float[CantidadEst];
        float Promedio = 0; // esta variable se utiliza como acumulador 
            
            
            
        
             {
    
                Definitiva[i] = (Cal1_20[i] * 0.20f) + (Cal2_30[i] + 0.30f) + (Cal3_15[i]* 0.15f) + (Cal4_15[i] * 0.15f) + (Cal5_20[i] * 0.20f
            );
          //Promedio = Promedio + Definitiva[i];
            Promedio += Definitiva[i];
        }

        Promedio = (Promedio / CantidadEst);

        //Resultados de las operaciones realizadas
        System.out.println("--------------------------------");
        System.out.println("----------RESULTADOS-----------");

        System.out.println("Datos del GRUPO; ");
        System.out.println("Nombre de docente del curso:");
        System.out.println("Nombre de la materia del curso:");
        System.out.println("Cantidad de estudiantes matriculados:");
        System.out.println("PROMEIDO TOTAL DEL GRUPO:" + Promedio);

        System.out.println("-----------------------------------");
        String Cadena = "";
        for (int i = 0; i < CantidadEst; i++) {
            Cadena += "-------ESTUDIANTE" + (i + 1) + "--------"
                    + "ID: " + IDest[i] + "\n" 
                    + "Nombre Completo:" + Nomest[i] + "\n"
                    + "Calificacion 1: " + Cal1_20[i] + "\n"
                    + "Calificacion 2: " + Cal2_30[i] + "\n"
                    + "Calificacion 3: " + Cal3_15[i] +  "\n"
                    + "Calificacion 4:" + Cal4_15[i] + "\n"
                    + "Calificacion 5:" + Cal5_20[i] + "\n";
        }

    }
}
