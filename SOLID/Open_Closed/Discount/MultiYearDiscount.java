package SOLID.Open_Closed.Discount;

public class MultiYearDiscount implements IDiscount{
    private int discount=5;

    @Override
    public void validateDiscount(Quotation quotation) {
        int studentCount=0;
        for(Integer count: quotation.getProducts().values()){
            studentCount+=count;
        }    
        if(studentCount>100 && quotation.getContract()>2){
            String tempDisc=quotation.getDiscountsApplied()==null?"":quotation.getDiscountsApplied();
            double originalPrice= quotation.getOrderValue();
            double tempPrice =  quotation.getDiscountedPrice()!=0?quotation.getDiscountedPrice():originalPrice;
            double offerPrice = tempPrice - (tempPrice * discount) / 100;
            quotation.setDiscountedPrice(offerPrice);
            quotation.setDiscountPercentage(quotation.getDiscountPercentage()+discount);
            quotation.setDiscountsApplied(tempDisc+"Multi-Year ");
        }
    }
}
