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
            int y = random.nextInt(5);
            if(x == 0 && y == 0)continue;
            if(x == 4 && y == 4)continue;
            if(matriz[x][y] != ' ')continue;
            
            if(D < 3){
                matriz[x][y] = 'D';
                D++;
            }else if(M < 3){
                matriz[x][y] = 'M';
                M++;
            }else if(L < 3){
                matriz[x][y] = 'L';
                L++;
            }
        }
        matriz[0][0] = 'E';
        int pos = 0;
        int tiempo = 0;
        
        while(tiempo < 60 && pos < 24){
            int dado = random.nextInt(5)+1;
            tiempo += random.nextInt(10)+1;
            
            int nuevaPos = pos + dado;
            if(nuevaPos > 24) nuevaPos = 24;
            
            int fila = nuevaPos/5;
            int columna = nuevaPos % 5;
            char casilla = matriz[fila][columna];
            
            if(casilla == 'D'){
                System.out.println("Mia te detuvo");
            }else{
                if (casilla == 'M') nuevaPos += 1;
                if(casilla == 'L') nuevaPos += 3;
            }
        }
    }
}
