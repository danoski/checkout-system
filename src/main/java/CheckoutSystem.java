import calculator.CostCalculator;
import calculator.ICostCalculator;
import model.IItem;
import model.Item;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by danos on 13/03/2018.
 */
public class CheckoutSystem {

    public CheckoutSystem(ICostCalculator iCostCalculator) {
    }

    public static void main(String[] args) {
        final CheckoutSystem checkoutSystem = new CheckoutSystem(new CostCalculator());
        createItems();
//        checkoutSystem.addItems();
//        System.out.println(checkoutSystem.printCost());
    }

    private static List<IItem> createItems() {
        List<IItem> items = new ArrayList();
        items.add(new Item("Apple"));
        items.add(new Item("Apple"));
        items.add(new Item("Orange"));

        return items;
    }
}
