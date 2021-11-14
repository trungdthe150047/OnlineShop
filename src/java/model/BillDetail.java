/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author DO THANH TRUNG
 */
public class BillDetail {
    private int productID;
    private int orderID;
    private int quantity;
    private double price;
    private double totalMoney;

    public BillDetail() {
    }

    public BillDetail(int productID, int orderID, int quantity, double price, double totalMoney) {
        this.productID = productID;
        this.orderID = orderID;
        this.quantity = quantity;
        this.price = price;
        this.totalMoney = totalMoney;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(double totalMoney) {
        this.totalMoney = totalMoney;
    }

    @Override
    public String toString() {
        return "BillDetail{" + "productID=" + productID + ", orderID=" + orderID + ", quantity=" + quantity + ", price=" + price + ", totalMoney=" + totalMoney + '}';
    }

    
}
