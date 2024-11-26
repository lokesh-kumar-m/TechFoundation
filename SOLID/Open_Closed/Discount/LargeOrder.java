package SOLID.Open_Closed.Discount;

import SOLID.Open_Closed.Builder.Quotation;

public class LargeOrder implements IDiscount {
    private int discount = 0;

    @Override
    public void validateDiscount(Quotation quotation) {
        double orderVal = quotation.getOrderValue();
        if (orderVal > 500000 && orderVal < 1000000) {
            discount = 5;
        } else if (orderVal > 1000000) {
            discount = 10;
        }
        String tempDisc=quotation.getDiscountsApplied()==null?"":quotation.getDiscountsApplied();
        double originalPrice = orderVal;
        double tempPrice = quotation.getDiscountedPrice()!=0?quotation.getDiscountedPrice():originalPrice;
        double offerPrice = tempPrice - (tempPrice * discount) / 100;
        quotation.setDiscountedPrice(offerPrice);
        quotation.setDiscountPercentage(quotation.getDiscountPercentage() + discount);
        quotation.setDiscountsApplied(tempDisc+"Large Order ");
    }

}
