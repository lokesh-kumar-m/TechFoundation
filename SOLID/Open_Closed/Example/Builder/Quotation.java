package SOLID.Open_Closed.Example.Builder;

import java.util.HashMap;

public class Quotation {
    private String Id;
    private int contract;
    private HashMap<String,Integer> products;
    private double orderValue;
    private double discountedPrice;
    private double discountPercentage;
    private String name;
    private String email;
    private String phone;
    private int studentCountA;
    private int studentCountC;
    private int studentCountMs;
    private String discountsApplied;

    public String getId() {
        return Id;
    }
    public void setId(String id) {
        Id = id;
    }
    public int getContract() {
        return contract;
    }
    public void setContract(int contract) {
        this.contract = contract;
    }
    public HashMap<String, Integer> getProducts() {
        return products;
    }
    public void setProducts(HashMap<String, Integer> products) {
        this.products = products;
    }
    public double getOrderValue() {
        return orderValue;
    }
    public void setOrderValue(double orderValue) {
        this.orderValue = orderValue;
    }
    public double getDiscountPercentage() {
        return discountPercentage;
    }
    public void setDiscountPercentage(double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }
    public double getDiscountedPrice() {
        return discountedPrice;
    }
    public void setDiscountedPrice(double discountedPrice) {
        this.discountedPrice = discountedPrice;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public int getStudentCountA() {
        return studentCountA;
    }
    public void setStudentCountA(int studentCountA) {
        this.studentCountA = studentCountA;
    }
    public int getStudentCountC() {
        return studentCountC;
    }
    public void setStudentCountC(int studentCountC) {
        this.studentCountC = studentCountC;
    }
    public int getStudentCountMs() {
        return studentCountMs;
    }
    public void setStudentCountMs(int studentCountMs) {
        this.studentCountMs = studentCountMs;
    }
    public String getDiscountsApplied() {
        return discountsApplied;
    }
    public void setDiscountsApplied(String discountsApplied) {
        this.discountsApplied = discountsApplied;
    }
}
