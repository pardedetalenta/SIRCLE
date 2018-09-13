/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sirclo_fivaa;

import java.util.Scanner;

/**
 *
 * @author Talenta
 */
public class SIRCLO_FIVAA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i, j,k, input, angka = 1;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Masukkan Angka: ");
        
        input = sc.nextInt();
       
        for(i=input-1;i>=0;i--){
            for(j=input+1;j>=-1;j--){
                if(j>=input){
                    System.out.print(i);
                } if(j<input && j<i){
                    System.out.print(i+2);
                }
            }
            System.out.println();
            
        }
            
    }
}
