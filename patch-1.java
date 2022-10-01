/**
 * @author Daw120
 * 
 * 7. Un biólogo está realizando un estudio de distintas especies de invertebrados y 
necesita una aplicación que le ayude a contabilizar el número de patas que 
tienen en total todos los animales capturados durante una jornada de trabajo. 
Para ello, te han solicitado que escribas una aplicación a la que hay que
proporcionar:

    • El número de hormigas capturadas (6 patas)
    • El número de arañas capturadas (8 patas)
    • El número de cochinillas capturadas (14 patas)

    La aplicación debe mostrar el número total de patas

 */
package com.solomongo.ejercicio7_hoja3;
import javax.swing.JOptionPane;
public class Ejercicio7_Hoja3 {
    public static void main(String[] args) {
   
      String AranasCaptura;
      String HormigasCaptura;
      String CochiseCaptura;    
       int Aranas;
       int Hormigas;
       int Cochise;
       int totalCapturas;
       int totalPatas;
       
       AranasCaptura=JOptionPane.showInputDialog("Mete Aranas capturadas:");
         Aranas=Integer.parseInt(AranasCaptura);
            System.out.printf("\n\tEl numero de Aranas es: "+Aranas); 
         
       HormigasCaptura=JOptionPane.showInputDialog("Mete Hormigas capturadas:");
         Hormigas=Integer.parseInt(HormigasCaptura);
            System.out.printf("\n\tEl numero de Hormigas es: "+Hormigas); 
          
       CochiseCaptura=JOptionPane.showInputDialog("Mete Cochise capturadas:");
         Cochise=Integer.parseInt(CochiseCaptura);
            System.out.printf("\n\tEl numero de Cochises es: "+Cochise); 
     
            totalPatas=(Aranas*8+Hormigas*6+Cochise*4);
            totalCapturas=(Aranas+Hormigas+Cochise);
            System.out.printf("\n\n\tEl numero de capturas fue de: "+totalCapturas+",\n\t(con un total de: "+totalPatas+" patas..)\n");
         
    }
}
