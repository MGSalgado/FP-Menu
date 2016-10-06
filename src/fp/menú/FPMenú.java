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
        int m;
        float a;
        m=menu();
        a=calculaAreas(m);
        muestraResultado(a,m);
        
        
        //muestraResultado(calculaAreas(menu()));
        
        
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
                mensajeSalida();
                area=0;
        }
        return area;
    }
    public static float areaCuadrado(){    
        float area, ladoCuadrado;
        Scanner lado = new Scanner (System.in);
        ladoCuadrado = lado.nextFloat();
        area = ladoCuadrado*ladoCuadrado;
        return area;
    }
    
    public static float areaCirculo(){
        double radio;
        double area1;
        Scanner radioC = new Scanner (System.in);
        radio = radioC.nextFloat();
        area1 = (3.1416*radio*radio)/2;
        float area = (float) area1;
        return area;
    }
    
    public static float areaTriangulo(){
        float area, base, altura;
        Scanner baseT = new Scanner (System.in);
        base = baseT.nextFloat();
        Scanner alturaT = new Scanner (System.in);
        altura = alturaT.nextFloat();
        area = base*altura/2;
        return area;
    }
    
    public static void mensajeSalida(){
        System.out.println("Programa terminado");
    }
    
    public static void muestraResultado (float area){
        System.out.println("el area es " + area);
    
    }
    public static void muestraResultado(float area, int r){
        String figura;
        if (r == 1) { figura = "Cuadrado";
        }else{
            if (r == 2) {figura = "Circulo";
            }else{
                figura = "Triangulo";
        }
        }
        
        System.out.println("el area del "+ figura + "es igual a: "+ area);
        
    }
}
