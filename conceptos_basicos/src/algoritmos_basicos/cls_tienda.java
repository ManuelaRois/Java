package algoritmos_basicos;

import javax.swing.JOptionPane;

public class cls_tienda {
 /* realice un algoritmo que permita captura el v alor de venta de un almacen junto con un color de bolita.
aplique el descuento segun su bola. Imprima el total a pagar y el valor descontado de su factura.

Condiciones 
Bolita Verde -  0%
Bolita Roja -  20%
Bolita Amarilla - 40% 
Bolita Azul - 60%
Bolita Morada - 100%  

*/

   
    public static void main (String [] args ) {
        
      JOptionPane.showMessageDialog(null, "BIENVENIDOS AL SISTEMA / TIENDA GHIBLI ");

      //Variables para el sistema 
      String IDCli= "", NombreCli= "";
      double ValorCompra = 0; 
      int Bolita = 0;
      
      
      //LECTURA DE LOS DATOS 
      NombreCli = JOptionPane.showInputDialog("¿Cual es tu nombre?");
      IDCli = JOptionPane.showInputDialog("Dame tu ID");
      ValorCompra = Double.parseDouble(JOptionPane.showInputDialog ("¿Cual es el valor de tu compra"));
     Bolita = Integer.parseInt(JOptionPane.showInputDialog ("¿Cual es el color de tu bolita?\n" 
     + "1. Verde" 
     + "2. Rojo" 
     + "3.Amarilla" 
     + "4.Azul" 
     + "5. Morada "));
      
    double TotalPago = 0, Descuento = 0; 
    
    switch (var) {
        case val:
            
            break;
        default:
            throw new AssertionError();
    }
      
    }

}
