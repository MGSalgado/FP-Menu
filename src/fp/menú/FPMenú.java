/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fp.menú;
import java.util.*;
/**
 *
 * @author alumno
 */
public class FPMenú {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("La opción elegida es: "+ menu());   // TODO code application logic here
    }
    public static int menu (){
        Scanner entrada = new Scanner(System.in);
        int opcion;
        do{
            System.out.println("****      Cálculo de áreas    ****");
            System.out.println("**** Menú: ****");
            System.out.println("Introduzca la opción deseada:");
            System.out.println("1. Área de cuadrados");
            System.out.println("2. Área de círculos");
            System.out.println("3. Área de triángulos");
            System.out.println("0. Salir");
            opcion = entrada.nextInt();       
          }while (opcion>3 || opcion <0);
        return opcion;
    }
    
    public static float calculaAreas (int op){
        float area;
        switch (op){
            case 1: 
                area = areaCuadrado();
                break;
            case 2:
                area = areaCirculo();
                break;
            case 3:
                area = areaTriangulo();
                break;
            default:
                mensajesalida();
        }
        return area;
    }
}
