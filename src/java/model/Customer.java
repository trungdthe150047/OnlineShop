/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Date;
import java.util.ArrayList;

/**
 *
 * @author DO THANH TRUNG
 */
public class Customer {

    private int customerID;
    private String account;
    private String password;
    private String customerName;
    private boolean gender;
    private String phoneNumber;
    private String email;
    private Date DOB;
    private String address;
    ArrayList<Role> roles = new ArrayList<>();

    public Customer() {
    }

    public Customer(String account, String password) {
        this.account = account;
        this.password = password;
    }

    public Customer(int customerID, String customerName, boolean gender, String phoneNumber, String email) {
        this.customerID = customerID;
        this.customerName = customerName;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public Customer(int customerID, String account, String customerName, boolean gender, String phoneNumber, String email) {
        this.customerID = customerID;
        this.account = account;
        this.customerName = customerName;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
    
    

    public Customer(String account, String customerName, boolean gender, String phoneNumber, String email) {
        this.account = account;
        this.customerName = customerName;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public Customer(String account, String password, String customerName, boolean gender, String phoneNumber, String email, Date DOB, String address) {
        this.account = account;
        this.password = password;
        this.customerName = customerName;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.DOB = DOB;
        this.address = address;
    }

    public Customer(String customerName, String phoneNumber, String email, String address) {
        this.customerName = customerName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDOB() {
        return DOB;
    }

    public void setDOB(Date DOB) {
        this.DOB = DOB;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ArrayList<Role> getRoles() {
        return roles;
    }

    public void setRoles(ArrayList<Role> roles) {
        this.roles = roles;
    }

    @Override
    public String toString() {
        return "Customer{" + "customerID=" + customerID + ", account=" + account + ", password=" + password + ", customerName=" + customerName + ", gender=" + gender + ", phoneNumber=" + phoneNumber + ", email=" + email + ", DOB=" + DOB + ", address=" + address + ", roles=" + roles + '}';
    }

    
}
