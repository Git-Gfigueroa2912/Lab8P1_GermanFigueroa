/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab8p1_germanfigueroa;

import java.security.SecureRandom;
import java.util.Scanner;

/**
 *
 * @author gafm2
 */
public class Lab8P1_GermanFigueroa {
       public static Scanner entrada = new Scanner(System.in);
    
    public static void main(String[] args) {
        int opcion = 0;
        do{
            System.out.println("BIENVENIDO AL MENU");
            System.out.println("1. Escape de UNITEC");
            System.out.println("0. Salir");
            System.out.println("Ingrese una opcion: ");
            opcion = entrada.nextInt();
            entrada.nextLine();
            
            switch(opcion){
                
                case 1:
                    System.out.println("Escape de UNITEC");
                    jugarEscape();
                    break;
                    
                case 0:
                    System.out.println("Saliendo del programa");
                    break;
                    
                default:
                    System.out.println("Opcion invalida");
            }
        }while (opcion != 0);
    }
    public static void jugarEscape(){
        SecureRandom random = new SecureRandom();
        char[][] matriz = new char[5][5];
        
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                matriz[i][j] = ' ';
            }
        }
        int D = 0;
        int M = 0;
        int L = 0;
        
        while(D < 3 || M < 3 || L < 3){
            int x = random.nextInt(5);
        }
    }
}
