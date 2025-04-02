package conceptos_basicos;

import java.util.Scanner;

public class cls_discoteca {

    /* 
    realice un algoritmo que permita preguntar la entrada de la discoteca 
    cual es el año de nacimiento de una poersona y me permita el ingreso o no 
    dependiendo de que sea mayor de 21 años de edad.
     */

    public static void main(String[] args) {

        //instancia para recoger datos
        Scanner sn = new Scanner(System.in);

        //declaracion de las variables
        int birthyear = 0;
        int age = 0;
        String name = "";
        int actyear = 2025;

        String question = "Y";

        while (question.equalsIgnoreCase("Y"));
        {

            //recoleccion de los datos 
            System.out.println("...:: PARTY WAY ::...");
            System.out.println("----------------------");
            System.out.println(" give me your name: ");
            name = sn.next();

            System.out.println(" give me your birthyear: ");
            birthyear = sn.nextInt();

            //Procesamiento de la informacion
            age = actyear - birthyear;

            if (age >= 21) {
                System.out.println("...:: WELCOME TO THE PARTY WAY::...");
            } else {
                System.out.println("...:: SORRY, YOU ARE NOT ALLOWED NO ENTER :( ::...");
            }
            System.out.println("Another user? Y/N");
            question = sn.next();

        }
    }
}
