/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Date;

/**
 *
 * @author DO THANH TRUNG
 */
public class Order {

    private int orderID;
    private int customerID;
    private int productID;
    private String orderDate;
    private double totalMoney;
    private String address;
    private String phoneNumber;
    private int quantity;

    public Order() {
    }

    public Order(int orderID, int customerID, int productID, String orderDate, double totalMoney, String address, String phoneNumber, int quantity) {
        this.orderID = orderID;
        this.customerID = customerID;
        this.productID = productID;
        this.orderDate = orderDate;
        this.totalMoney = totalMoney;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.quantity = quantity;
    }

    public Order(int customerID, int productID, double totalMoney, String address, String phoneNumber, int quantity) {
        this.customerID = customerID;
        this.productID = productID;
        this.totalMoney = totalMoney;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.quantity = quantity;
    }

    public Order(int orderID, int customerID, int productID, String orderDate, double totalMoney, String address, String phoneNumber) {
        this.orderID = orderID;
        this.customerID = customerID;
        this.productID = productID;
        this.orderDate = orderDate;
        this.totalMoney = totalMoney;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    
    
    
    public Order(int orderID, int customerID, int productID, double totalMoney, String address, String phoneNumber) {
        this.orderID = orderID;
        this.customerID = customerID;
        this.productID = productID;
        this.orderDate = orderDate;
        this.totalMoney = totalMoney;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    
    
    public Order(int customerID, int productID, double totalMoney, String address, String phoneNumber) {
        this.customerID = customerID;
        this.productID = productID;
        this.totalMoney = totalMoney;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public double getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(double totalMoney) {
        this.totalMoney = totalMoney;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Order{" + "orderID=" + orderID + ", customerID=" + customerID + ", productID=" + productID + ", orderDate=" + orderDate + ", totalMoney=" + totalMoney + ", address=" + address + ", phoneNumber=" + phoneNumber + ", quantity=" + quantity + '}';
    }
    
    


    

}
