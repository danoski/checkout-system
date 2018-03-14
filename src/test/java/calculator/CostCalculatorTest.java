package calculator;

import model.IItem;
import model.Item;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by danos on 13/03/2018.
 */
public class CostCalculatorTest {
    ICostCalculator iCostCalculator;

    @Before
    public void before(){
        this.iCostCalculator = new CostCalculator();
        this.iCostCalculator.addItemCalculator("Apple", new AppleItemCalculator(0.25f));
        this.iCostCalculator.addItemCalculator("Orange", new OrangeItemCalculator(0.60f));
    }

    @Test
    public void testWhenOnlyOneAppleAddedCorrectTotalCostCalculated() throws Exception {
        //arrange
        List<IItem> items = new ArrayList();
        items.add(new Item("Apple"));


        //act
        Float result = this.iCostCalculator.calculateCostOfItems(items);

        //assert
        assertEquals(0.25f, result, 0.0009f);
    }

    @Test
    public void testWhenTwoApplesAddedCorrectTotalCostCalculated() throws Exception {
        //arrange
        List<IItem> items = new ArrayList();
        items.add(new Item("Apple"));
        items.add(new Item("Apple"));

        //act
        Float result = this.iCostCalculator.calculateCostOfItems(items);

        //assert
        assertEquals(0.50f, result, 0.0009f);
    }

    @Test
    public void testWhenOneOrangeAddedCorrectTotalCostCalculated() throws Exception {
        //arrange
        List<IItem> items = new ArrayList();
        items.add(new Item("Orange"));


        //act
        Float result = this.iCostCalculator.calculateCostOfItems(items);

        //assert
        assertEquals(0.60f, result, 0.0009f);
    }

    @Test
    public void testWhenTwoOrangesAddedCorrectTotalCostCalculated() throws Exception {
        //arrange
        List<IItem> items = new ArrayList();
        items.add(new Item("Orange"));
        items.add(new Item("Orange"));


        //act
        Float result = this.iCostCalculator.calculateCostOfItems(items);

        //assert
        assertEquals(1.2f, result, 0.0009f);
    }

    @Test
    public void testWhenTwoOrangesAndOneAppleAddedCorrectTotalCostCalculated() throws Exception {
        //arrange
        List<IItem> items = new ArrayList();
        items.add(new Item("Orange"));
        items.add(new Item("Orange"));
        items.add(new Item("Apple"));

        //act
        Float result = this.iCostCalculator.calculateCostOfItems(items);

        //assert
        assertEquals(1.45f, result, 0.0009f);
    }

}