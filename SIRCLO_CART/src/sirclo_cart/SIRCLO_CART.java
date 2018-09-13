/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sirclo_cart;

/**
 *
 * @author Talenta
 */
public class SIRCLO_CART {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Produk keranjang = new Produk();

        keranjang.tambahProduk("Topi Putih", 2);

        keranjang.tambahProduk("Kemeja Hitam", 3);

        keranjang.tambahProduk("Sepatu Merah", 1);
        keranjang.tambahProduk("Sepatu Merah", 4);
        keranjang.tambahProduk("Sepatu Merah", 2);
        
        keranjang.hapusProduk("Kemeja Hitam");
//        
//        keranjang.hapusProduk("Baju Hijau");
        
        keranjang.tampilkanCart();
    }
    
}
//