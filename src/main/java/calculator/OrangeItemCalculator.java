package calculator;

import model.IItem;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by danos on 13/03/2018.
 */
public class OrangeItemCalculator implements IItemCalculator {
    private Float itemPrice = 0.0f;
    private List<IItem> iItemList = new ArrayList<IItem>();

    public OrangeItemCalculator(Float itemPrice) {
        this.itemPrice = itemPrice;
    }

    /**
     * This method is responsible for add an item to the list of items to compute
     * @param iItem A product item
     */
    public void addItem(IItem iItem) {
        this.iItemList.add(iItem);
    }

    /**
     * Calculate the cost of all the items
     * @return Float
     */
    public Float calculateCost() {
        //introduce three for price of two
        int numItemsCharged = this.iItemList.size() - (this.iItemList.size() / 3);
        return numItemsCharged * this.itemPrice;
    }
}
