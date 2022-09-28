/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja3.hoja3;

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author xboxr
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /*7. Un biólogo está realizando un estudio de distintas especies de invertebrados y
necesita una aplicación que le ayude a contabilizar el número de patas que
tienenen total todos los animales capturados durante una jornada de trabajo.
Para ello, te han solicitado que escribas una aplicación a la que hay que
proporcionar:
• El número de hormigas capturadas (6 patas)
• El número de arañas capturadas (8 patas)
• El número de cochinillas capturadas (14 patas)
La aplicación debe mostrar el número total de patas.*/
    
   Scanner entrada=new Scanner(System.in); 
   System.out.println("Introduce el numero de hormigas capturadas: ");
   int hormigas=entrada.nextInt();
   int patash=hormigas*6;
   
   System.out.println("Introduce el numero de arañas capturadas: ");
   int aranas=entrada.nextInt();
   int patasa=aranas*8;
   
   System.out.println("Introduce el numero de cochinillas capturadas: ");
   int coch=entrada.nextInt();
   int patasc=coch*14;
   
   int total= patash+patasa+patasc;
   System.out.println("El numero total de PATAS es: "+ total);
    }
    
}
