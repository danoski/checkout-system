package calculator;

import model.IItem;

import javax.swing.text.html.HTMLDocument;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * Created by danos on 13/03/2018.
 */
public class CostCalculator implements ICostCalculator {
    private Map<String, IItemCalculator> iItemCalculatorMap = new HashMap();

    public void addItemCalculator(String itemName, IItemCalculator iItemCalculator) {
        this.iItemCalculatorMap.put(itemName, iItemCalculator);
    }

    public Float calculateCostOfItems(List<IItem> iItems) {
        Float totalCost = 0.0f;
        for (IItem iItem : iItems) {
            IItemCalculator iItemCalculator = iItemCalculatorMap.get(iItem.getName());
            if (iItemCalculator != null) {
                iItemCalculator.addItem(iItem);
            }
        }

        //calculate cost of all items
        Iterator iter = this.iItemCalculatorMap.keySet().iterator();
        while (iter.hasNext()) {
            String key = (String)iter.next();
            totalCost += this.iItemCalculatorMap.get(key).calculateCost();
        }
        return totalCost;
    }



}
