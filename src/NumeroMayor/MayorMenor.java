/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NumeroMayor;

/**
 *
 * @author PabloJavier
 */
public class MayorMenor {

    public static void main(String[] args) {
        int[] lstNumeros = {1, 5, 40, 0, 45, 323, 524, 124, 76};
        int numMayor = lstNumeros[0];
        int numMenor = lstNumeros[0];
        //numero mayor
//        for (int i = 0; i < lstNumeros.length; i++) {
//            if (numMayor < lstNumeros[i]) {
//                numMayor = lstNumeros[i];
//            }
//        }
//        Numero menor
//        for (int i = 0; i < lstNumeros.length; i++) {
//            if(numMenor> lstNumeros[i]){
//                numMenor= lstNumeros[i];
//            }
//        }
//        System.out.println("El nmero mayor es " +  numMayor);
//        System.out.println("El numero menor es " + numMenor);

        

        for (int i = 0; i < lstNumeros.length; i++) {
            System.out.println(lstNumeros[i]);
            if (lstNumeros[i] % 2 == 0) {
                lstNumeros[i] = 0;
            }

        }
        for (int num : lstNumeros) {
            System.out.println(num);
        }

//        System.out.println("El nmero mayor es " + numMayor);
    }

}
