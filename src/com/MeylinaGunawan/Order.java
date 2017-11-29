/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.MeylinaGunawan;

/**
 *
 * @author user
 */
public class Order {

    private OrderItem[] orderItems;
    private double PPN = 0.1;
    private double nilaiPPN = 0.0;
    private double hargaTotal = 0.0;

    public double calculateTotalOrder() {
        double totalOrder = 0.0;
        for (OrderItem orderItem : orderItems) {
            totalOrder += orderItem.calculateItemTotalPrice();
        }
        this.setHargaTotal(totalOrder =+ totalOrder);
        this.setNilaiPPN(totalOrder * this.getPPN());
        totalOrder = totalOrder + this.getNilaiPPN();
        return totalOrder;
    }

    public double calculateTotalOrderWithDiscount() {
        double totalOrder = 0.0;
        for (OrderItem orderItem : orderItems) {
            totalOrder += orderItem.calculateTotalPriceAfterDiscount();
        }
        this.setHargaTotal(totalOrder =+ totalOrder);
        this.setNilaiPPN(totalOrder * this.getPPN());
        totalOrder = totalOrder + this.getNilaiPPN();
        return totalOrder;
    }

    /**
     * @return the orderItems
     */
    public OrderItem[] getOrderItems() {
        return orderItems;
    }

    /**
     * @param orderItems the orderItems to set
     */
    public void setOrderItems(OrderItem[] orderItems) {
        this.orderItems = orderItems;
    }

    /**
     * @return the PPN
     */
    public double getPPN() {
        return PPN;
    }

    /**
     * @param PPN the PPN to set
     */
    public void setPPN(double PPN) {
        this.PPN = PPN;
    }

    /**
     * @return the hargaSetelahPPN
     */
    public double getNilaiPPN() {
        return nilaiPPN;
    }

    /**
     * @param hargaSetelahPPN the hargaSetelahPPN to set
     */
    public void setNilaiPPN(double nilaiPPN) {
        this.nilaiPPN = nilaiPPN;
    }

    /**
     * @return the hargaTotal
     */
    public double getHargaTotal() {
        return hargaTotal;
    }

    /**
     * @param hargaTotal the hargaTotal to set
     */
    public void setHargaTotal(double hargaTotal) {
        this.hargaTotal = hargaTotal;
    }
}
