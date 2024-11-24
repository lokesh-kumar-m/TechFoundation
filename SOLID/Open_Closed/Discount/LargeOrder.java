package SOLID.Open_Closed.Discount;

public class LargeOrder implements IDiscount{
    private int discount=0;

    @Override
    public void evaluateDiscount(Quotation quotation) {
        int studentCount=0;
        double orderVal=quotation.getOrderValue();
        for(Integer count: quotation.getProducts().values()){
            studentCount+=count;
        }
        if(orderVal>500000&&orderVal<1000000){
            discount=5;
        }
        else if(orderVal>1000000){
            discount=10;
        }    
        if(studentCount>0){
            double originalPrice= orderVal;
            double discount;
                        double offerPrice=originalPrice-(originalPrice*discount)/100;
            quotation.setDiscountedPrice(offerPrice);
            quotation.setDiscountPercentage(quotation.getDiscountPercentage()+discount);
        }
    }
    
}
