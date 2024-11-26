package SOLID.Open_Closed.Example.Discount;

import SOLID.Open_Closed.Example.Builder.Quotation;

public interface IDiscount {
    public void validateDiscount(Quotation quotation);
}
