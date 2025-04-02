
package conceptos_basicos;

import java.io.InputStream;

public class clsOperaciones {
    
    public static void main(String[] args) {
        /*
        realice un algoritmo que permita calcular 
        las operaciones basicas matematicas con 4 valores
        que se le solicitan al usuario 
        */
     
        // Herramientas para la lectura de datos
        Scanner sn = new Scanner(System.in);
        //declaracion de variables / o asignacion de espacios de memoria
        int num1, num2, num3, num4, suma, resta, multi;
        num1 = num2 = num3 = num4 = suma = resta = multi  = 0;
        float divi = 0;
        
        //Recoleccion de los datos / lectura
        System.out.println("BIENVENIDOS AL SISTEMA NUMERICO");
        System.out.println("---------------------------------");
        
        System.out.println("valor del primer numero");
        num1 = sn.nextInt();
        
        System.out.println("valor del segundo numero");
        num2 = sn.nextInt();
        
        System.out.println("valor del tercer numero");
        num3 = sn.nextInt();
        
        System.out.println("valor del cuarto numero");
        num4 = sn.nextInt();

    
        //procesameinto de los datos y calculo de las operaciones
        suma = num1 + num2 + num3 + num4;
        resta = num1 - num2 - num3 - num4;
        multi = num1 * num2 * num3 * num4;
        divi = (float) num1 / num2 / num3 / num4;
        
        //impresion de los resultados
        System.out.println("------------------------");
        System.out.println("RESULTADOS");
        System.out.println("SUMA -->" + suma);
        System.out.println("RESTA -->" + resta);
        System.out.println("MULTIPLICACION -->" + multi);
        System.out.println("DIVISION -->" + divi);
    }
 
    private static class Scanner {

        public Scanner(InputStream in) {
        }

        private int nextInt() {
            throw new UnsupportedOperationException("Not supported yet."); 
        }
    }
}

