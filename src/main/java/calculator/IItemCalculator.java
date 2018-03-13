package calculator;

import model.IItem;

/**
 * Created by danos on 13/03/2018.
 */
public interface IItemCalculator {
    Float itemPrice = 0.0f;
    /**
     * This method is responsible for adding an item to be calculated for cost
     * @param iItem A product item
     */
    public void addItem(IItem iItem);

    /**
     * This method is responsibility for calculating the cost of the items
     * @return The combined cost of all items
     */
    public Float calculateCost();
}
