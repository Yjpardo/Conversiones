/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversiones;
import java.util.Scanner;
/**
 *
 * @author D E L L
 */
public class Conversiones {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Conversiones de medidas de longitud
        System.out.println("***conversiones de metroa centrimetros, kilometros, pies, pulgadas***");
        Scanner leer = new Scanner (System.in);
        
        //conversion de metros a centrimetros
        
        double v1,converse;
        System.out.println("Cantidad de metros a cm");
        v1 = leer.nextInt();
        converse = (v1 * 100);
        System.out.println("en centrimetros es:" +converse);
        
        //Conversion de metros a kilometros
        
        double v2,converse2;
        System.out.println("cantidad de metros a km");
        v2 = leer.nextInt();
        converse2 = (v2 /1000);
        System.out.println("en kilometros es :" +converse2);
        
        //Conversion de metros a pies
        
        double v3,converse3;
        System.out.println("cantidad de metros a ft");
        v3 = leer.nextInt();
        converse3 = (v3 * 20.8084);
        System.out.println("en pies es :" +converse3);
        
        //Conversion de metros a pulgadas
        
        double v4,converse4;
        System.out.println("cantidad de metros a in");
        v4 = leer.nextInt();
        converse4 = (v3 * 39.3701);
        System.out.println("en pulgadas es :" +converse4);
        
        
        
    }
    
}
