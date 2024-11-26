package SOLID.Open_Closed.Discount;

import SOLID.Open_Closed.Builder.Quotation;

public interface IDiscount {
    public void validateDiscount(Quotation quotation);
}
