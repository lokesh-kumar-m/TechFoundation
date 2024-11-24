package SOLID.Open_Closed.Discount;

import java.util.HashMap;

public class QuotationBuilder {
    private Quotation quotation;

    public QuotationBuilder(){
        this.quotation=new Quotation();
    }

    public QuotationBuilder setId(String id) {
        quotation.setId(id);
        return this;
    }
    public QuotationBuilder setContract(int contract) {
        quotation.setContract(contract);
        return this;
    }
    public QuotationBuilder setProducts(HashMap<String, Integer> products) {
        quotation.setProducts(products);
        return this;
    }
    public QuotationBuilder setOrderValue(double orderValue) {
        quotation.setOrderValue(orderValue);
        return this;
    }
    public QuotationBuilder setDiscountPercentage(double discountPercentage) {
        quotation.setDiscountPercentage(discountPercentage);
        return this;
    }
    public QuotationBuilder setName(String name) {
        quotation.setName(name);
        return this;
    }
    public QuotationBuilder setEmail(String email) {
        quotation.setEmail(email);
        return this;
    }
    public QuotationBuilder setPhone(String phone) {
        quotation.setPhone(phone);
        return this;
    }
    public QuotationBuilder setDiscountedPrice(double discountedPrice){
        quotation.setDiscountedPrice(discountedPrice);
        return this;
    }
    public Quotation build(){
        return quotation;
    }
}
