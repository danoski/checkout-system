package calculator;

import model.IItem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by danos on 13/03/2018.
 */
public class AppleItemCalculator implements IItemCalculator {
    private Float itemPrice = 0.0f;
    private List<IItem> iItemList = new ArrayList();

    public AppleItemCalculator(Float itemPrice) {
        this.itemPrice = itemPrice;
    }

    /**
     * THis method is responsible for adding a product to be computed
     * @param iItem A product item
     */
    public void addItem(IItem iItem) {
        this.iItemList.add(iItem);
    }

    /**
     *
     * @return
     */
    public Float calculateCost() {
        // introduce bogof
        int numItemsCharged = this.iItemList.size() / 2;
        int oddOnes = this.iItemList.size() % 2;
        return (numItemsCharged+oddOnes)*this.itemPrice;
    }
}
