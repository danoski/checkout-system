package calculator;

import model.IItem;

import java.util.List;

/**
 * Created by danos on 13/03/2018.
 */
public interface ICostCalculator {

    void addItemCalculator(String itemName, IItemCalculator iItemCalculator);

    Float calculateCostOfItems(List<IItem> iItems);
}
