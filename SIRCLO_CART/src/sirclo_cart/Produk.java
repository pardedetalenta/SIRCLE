/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sirclo_cart;

import java.util.ArrayList;

/**
 *
 * @author Talenta
 */
public class Produk {

    String kodeProduk;
    int kuantitas;

    static ArrayList<Produk> ListProduk = new ArrayList<Produk>();

    public Produk() {
    }

    public Produk(String kodeProduk, int kuantitas) {
        this.kodeProduk = kodeProduk;
        this.kuantitas = kuantitas;
    }

    public String getKodeProduk() {
        return kodeProduk;
    }

    public void setKodeProduk(String kodeProduk) {
        this.kodeProduk = kodeProduk;
    }

    public int getKuantitas() {
        return kuantitas;
    }

    public void setKuantitas(int kuantitas) {
        this.kuantitas = kuantitas;
    }

    void tambahProduk(String kodeProduk, int kuantitas) {
        int i = 0;
        if (ListProduk.size() == 0) {
            Produk produk = new Produk();
            produk.setKodeProduk(kodeProduk);
            produk.setKuantitas(kuantitas);
            ListProduk.add(produk);
        } else {
            for (i = 0; i < ListProduk.size(); i++) {
                if (ListProduk.get(i).getKodeProduk().equalsIgnoreCase(kodeProduk)) {
                    int a = ListProduk.get(i).getKuantitas();
                    Produk produk = new Produk();
                    produk.setKodeProduk(kodeProduk);
                    produk.setKuantitas(kuantitas + a);
                    ListProduk.add(produk);
                    ListProduk.remove(i);
                } else {
                    Produk produk = new Produk();
                    produk.setKodeProduk(kodeProduk);
                    produk.setKuantitas(kuantitas);
                    ListProduk.add(produk);
                    
                    
                }
            }
        }
    }

    public void hapusProduk(String kodeProduk) {
        int i = 0;
        while (i < ListProduk.size()) {

            if (ListProduk.get(i).kodeProduk.equalsIgnoreCase(kodeProduk)) {
                ListProduk.remove(i);
            }
            i = i + 1;
        }//End of while loop.
    }

    String tampilkanProduk() {
        String produk = kodeProduk + " (" + kuantitas + ")";
        return produk;
    }

    public void tampilkanCart() {
        if (ListProduk.size() == 0) {
            System.out.println("Cart is Empty");
        } else {
            for (int i = 0; i < ListProduk.size(); i++) {
                System.out.println(ListProduk.get(i).tampilkanProduk());
            }//End of For Loop.			
        }
    }

}
