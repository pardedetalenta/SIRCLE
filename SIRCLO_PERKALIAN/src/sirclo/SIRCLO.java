/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sirclo;

import java.util.Scanner;

/**
 *
 * @author Talenta
 */
public class SIRCLO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan Angka: ");
        int input1 = sc.nextInt();
        System.out.println("Masukkan Angka: ");
        int input2 = sc.nextInt();
        System.out.println(perkalian(input1,input2));
        
        
    }

    private static int perkalian(int angka1, int angka2) {
        int hasil = 0;
        for(int i = 1; i<=angka2; i++){
        hasil = hasil + angka1;
        }
        return hasil;
    } 
}
