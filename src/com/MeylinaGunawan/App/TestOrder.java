/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.MeylinaGunawan.App;

import com.MeylinaGunawan.Order;
import com.MeylinaGunawan.OrderItem;
import com.MeylinaGunawan.Product;

/**
 *
 * @author user
 */
public class TestOrder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Product iceCream = new Product("Magnum", 8000.0);
        Product Indomie = new Product("Indomie Goreng", 2500.0);
        Product cocaCola = new Product("Coca Cola", 4500.0);
        //Kasir menghitung dan menginput barang yang dibeli
        //disimpan dalam order
        OrderItem icItem = new OrderItem(iceCream, 5);
        icItem.setDiscount(0.15);
        OrderItem indomieItem = new OrderItem(Indomie, 20);
        OrderItem ccItem = new OrderItem(cocaCola, 4);
        
        OrderItem[] items = {icItem, indomieItem, ccItem};
        //seluruh item di proses dalam mesin kasir
        Order order = new Order();
        order.setOrderItems(items);
        
        double totalBelanja = order.calculateTotalOrder();
        System.out.printf("Total Belanja \t\t: %,.2f \n", totalBelanja);
        double totalAfterDiscount = order.calculateTotalOrderWithDiscount();
        System.out.printf("Total Setelah Diskon \t: %,.2f \n", order.getHargaTotal());
        
        System.out.println("------------------------------------");
        System.out.printf("Anda hemat \t\t:   %,.2f \n", totalBelanja - totalAfterDiscount);
        double hargaSetelahPPN = order.getNilaiPPN();
        System.out.printf("PPN sebesar 10 Persen \t:  %,.2f \n", hargaSetelahPPN );
        System.out.printf("Total Setelah diskon \t: %,.2f \n", totalAfterDiscount);
    }
    
}
