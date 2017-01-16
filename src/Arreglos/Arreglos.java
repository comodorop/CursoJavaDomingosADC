/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arreglos;

import java.util.ArrayList;

/**
 *
 * 
 * @author PabloJavier
 */
public class Arreglos {

    public static void main(String[] args) {

        int califaciones[] = new int[6];
        califaciones[0] = 23;
        califaciones[1] = 2;
        califaciones[2] = 9;
        califaciones[3] = 10;
        califaciones[4] = 32;
        califaciones[5] = 32;
        int pares = 0;
        int impares = 0;
        for (int i = 0; i < califaciones.length; i++) {
            if(califaciones[i] %2==0){
                pares++;
            }
            else{
                impares ++ ; 
            }
        }
        System.out.println("Numeros pares son "+ pares);
        System.out.println("Numero impares son "+ impares);

    }

}
