import calculator.AppleItemCalculator;
import calculator.CostCalculator;
import calculator.ICostCalculator;
import calculator.OrangeItemCalculator;
import model.IItem;
import model.Item;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by danos on 13/03/2018.
 */
public class CheckoutSystem {
    private final ICostCalculator iCostCalculator;

    public CheckoutSystem(ICostCalculator iCostCalculator) {
        this.iCostCalculator = iCostCalculator;
        this.iCostCalculator.addItemCalculator("Apple", new AppleItemCalculator(0.60f));
        this.iCostCalculator.addItemCalculator("Orange", new OrangeItemCalculator(0.25f));
    }

    private Float checkout(List<IItem> iItems){
        return this.iCostCalculator.calculateCostOfItems(iItems);
    }

    public static void main(String[] args) {
        final CheckoutSystem checkoutSystem = new CheckoutSystem(new CostCalculator());

        //add items
        List<IItem> items = new ArrayList();
        items.add(new Item("Apple"));
        items.add(new Item("Apple"));
        items.add(new Item("Orange"));
        items.add(new Item("Orange"));
        Float totalCost = checkoutSystem.checkout(items);

        System.out.println("£"+String.format("%.2f",totalCost));
    }

    private static List<IItem> createItems() {
        List<IItem> items = new ArrayList();
        items.add(new Item("Apple"));
        items.add(new Item("Apple"));
        items.add(new Item("Orange"));

        return items;
    }
}
