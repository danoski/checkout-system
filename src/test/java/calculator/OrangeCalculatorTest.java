package calculator;

import model.Item;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by danos on 13/03/2018.
 */
public class OrangeCalculatorTest {
    private IItemCalculator iItemCalculator;


    @Before
    public void before(){
        this.iItemCalculator = new OrangeItemCalculator(0.25f);
    }

    @Test
    public void testZeroOrangeItemsCostZeroAmt() throws Exception {
        //arrange
        //act
        Float res = this.iItemCalculator.calculateCost();

        //assert
        assertEquals(0.0f,res, .0009f);
    }

    @Test
    public void testWhenOneItemCorrectAmoutCalculated() throws Exception {
        //arrange
        this.iItemCalculator.addItem(new Item("Orange"));

        //act
        Float res = this.iItemCalculator.calculateCost();

        //assert
        assertEquals(0.25f,res, .0009f);
    }

    @Test
    public void testWhenTenItemsTheCorrectAmountCalculated() throws Exception {
        //arrange
        this.iItemCalculator.addItem(new Item("Orange"));
        this.iItemCalculator.addItem(new Item("Orange"));
        this.iItemCalculator.addItem(new Item("Orange"));
        this.iItemCalculator.addItem(new Item("Orange"));
        this.iItemCalculator.addItem(new Item("Orange"));
        this.iItemCalculator.addItem(new Item("Orange"));
        this.iItemCalculator.addItem(new Item("Orange"));
        this.iItemCalculator.addItem(new Item("Orange"));
        this.iItemCalculator.addItem(new Item("Orange"));
        this.iItemCalculator.addItem(new Item("Orange"));

        //act
        Float res = this.iItemCalculator.calculateCost();

        //assert
        assertEquals(2.5f,res, .0009f);
    }

}