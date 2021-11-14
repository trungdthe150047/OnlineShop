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
public class Product {

    private int productID;
    private String productName;
    private Supplier supplier;
    private int quantity;
    private double price;
    private int numberOfImport;
    private int numberOfSell;
    private String imagePath;
    private Category category;
    private String description;

    public Product() {
    }

    public Product(int productID, String productName, Supplier supplier, int quantity, double price, int numberOfImport, int numberOfSell, String imagePath, Category category, String description) {
        this.productID = productID;
        this.productName = productName;
        this.supplier = supplier;
        this.quantity = quantity;
        this.price = price;
        this.numberOfImport = numberOfImport;
        this.numberOfSell = numberOfSell;
        this.imagePath = imagePath;
        this.category = category;
        this.description = description;
    }

    public Product(int productID, String productName, Supplier supplier, int quantity, double price, int numberOfImport, String imagePath, Category category, String description) {
        this.productID = productID;
        this.productName = productName;
        this.supplier = supplier;
        this.quantity = quantity;
        this.price = price;
        this.numberOfImport = numberOfImport;;
        this.imagePath = imagePath;
        this.category = category;
        this.description = description;
    }

    public Product(String productName, Supplier supplier, int quantity, double price, int numberOfImport, String imagePath, Category category, String description) {
        this.productName = productName;
        this.supplier = supplier;
        this.quantity = quantity;
        this.price = price;
        this.numberOfImport = numberOfImport;
        this.imagePath = imagePath;
        this.category = category;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
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

    public int getNumberOfImport() {
        return numberOfImport;
    }

    public void setNumberOfImport(int numberOfImport) {
        this.numberOfImport = numberOfImport;
    }

    public int getNumberOfSell() {
        return numberOfSell;
    }

    public void setNumberOfSell(int numberOfSell) {
        this.numberOfSell = numberOfSell;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

}
