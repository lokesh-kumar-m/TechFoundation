package SOLID.Open_Closed.Discount;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class QuotationEvaluator {
    private List<IDiscount> availabeDiscounts;
    private HashMap<String,Integer> productMap;
    private Quotation quotation;

    public QuotationEvaluator(Quotation quotation){
        this.quotation=quotation;
        productMap=new HashMap<>();
        availabeDiscounts=new ArrayList<>();
        if(quotation.getStudentCountA()!=0){
            productMap.put("ASSET", quotation.getStudentCountA());
        }
        if(quotation.getStudentCountC()!=0){
            productMap.put("CARES", quotation.getStudentCountC());
        }
        if(quotation.getStudentCountMs()!=0){
            productMap.put("Mindspark", quotation.getStudentCountMs());
        }
        quotation.setProducts(productMap);
        availabeDiscounts.add(new MultiYearDiscount());
        availabeDiscounts.add(new LargeOrder());
    }

    public void evaluate() {
       for (IDiscount disc : availabeDiscounts) {
            disc.validateDiscount(quotation);
       }
    }

}
