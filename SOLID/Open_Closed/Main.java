package SOLID.Open_Closed;

import SOLID.Open_Closed.Builder.QuotationBuilder;
import SOLID.Open_Closed.Builder.Quotation;

public class Main {
    public static void main(String[] args) {
        Quotation quotation=new QuotationBuilder()
                                .setName("New School")
                                .setEmail("International@school.in")
                                .setPhone("1234567890")
                                .setContract(2)
                                .setId("IN-20223564")
                                .setOrderValue(510000)
                                .setStudentCountA(50)
                                .setStudentCountC(100)
                                .setStudentCountMs(60)
                                .build();

        QuotationEvaluator quotationEvaluator=new QuotationEvaluator(quotation);
        quotationEvaluator.evaluate();
        System.out.println("Order: " +quotation.getProducts());
        System.out.println("Original Price: "+quotation.getOrderValue());
        System.out.println("Offer Price:" +quotation.getDiscountedPrice());
        System.out.println("Discounts Applied: "+ quotation.getDiscountsApplied());
        System.out.println("Discount % "+quotation.getDiscountPercentage());
    }    
}
