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
public class Supplier {

    private int supplierID;
    private String companyName;
    private String contactName;
    private String address;
    private String city;
    private String postalCode;
    private String phone;
//    private String homePage;

    public Supplier() {
    }

//    public Supplier(int supplierID, String companyName, String contactName, String address, String city, String postalCode, String phone, String homePage) {
//        this.supplierID = supplierID;
//        this.companyName = companyName;
//        this.contactName = contactName;
//        this.address = address;
//        this.city = city;
//        this.postalCode = postalCode;
//        this.phone = phone;
//        this.homePage = homePage;
//    }
    public Supplier(int supplierID, String companyName, String contactName, String address, String city, String postalCode, String phone) {
        this.supplierID = supplierID;
        this.companyName = companyName;
        this.contactName = contactName;
        this.address = address;
        this.city = city;
        this.postalCode = postalCode;
        this.phone = phone;
    }

    public int getSupplierID() {
        return supplierID;
    }

    public void setSupplierID(int supplierID) {
        this.supplierID = supplierID;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

//    public String getHomePage() {
//        return homePage;
//    }
//
//    public void setHomePage(String homePage) {
//        this.homePage = homePage;
//    }
}
