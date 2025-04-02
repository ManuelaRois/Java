package conceptos_basicos;

import java.util.Scanner;

public class Lectura_Datos {
    
    public static void main (String [] args) {

        Scanner sn = new Scanner(System.in); 

        String Nombre = ""; 
        int edad = 0;
        float peso = 0;
        double salario = 0;
        
        
     
      System.out.println("Ingrese el nombre");
      Nombre = sn.nextLine();  

      System.out.println("Ingrese la edad");
      edad = sn.nextInt();
sn.nextLine(); 

System.out.println("Ingrese el peso");
peso = sn.nextFloat();
sn.nextLine(); // Consumir el salto de línea después de nextFloat()

System.out.println("Ingrese el salario");
salario = sn.nextDouble();
sn.nextLine(); // Consumir el salto de línea después de nextDouble()


        System.out.println("------------"); 

        System.out.println("Nombre del usuario: " + Nombre); 
        
        sn.close(); // Para cerrar el scanner y evitar fugas de recursos
    }
}
