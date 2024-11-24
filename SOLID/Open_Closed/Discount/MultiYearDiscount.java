package SOLID.Open_Closed.Discount;

public class MultiYearDiscount implements IDiscount{
    private int discount=5;

    @Override
    public void evaluateDiscount(Quotation quotation) {
        int studentCount=0;
        for(Integer count: quotation.getProducts().values()){
            studentCount+=count;
        }    
        if(studentCount>0 && quotation.getContract()>2){
            double originalPrice= quotation.getOrderValue();
            double offerPrice=originalPrice-(originalPrice*discount)/100;
            quotation.setDiscountedPrice(offerPrice);
            quotation.setDiscountPercentage(quotation.getDiscountPercentage()+discount);
        }
    }
}
