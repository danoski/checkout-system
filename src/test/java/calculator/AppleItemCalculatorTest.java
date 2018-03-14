package calculator;

import model.Item;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by danos on 13/03/2018.
 */
public class AppleItemCalculatorTest {
    private IItemCalculator iItemCalculator;

    @Before
    public void before(){
        this.iItemCalculator = new AppleItemCalculator(new Float(0.6));
    }

    @Test
    public void testItemCalculationForZeroItemsReturnZero(){
        //arrange
        //act
        Float result = this.iItemCalculator.calculateCost();

        //assert
        assertEquals(0.0f, result.floatValue(),0.0009f);

    }

    @Test
    public void testItemCalculationForOneAppleReturnsExpectedResult(){
        //arrange
        iItemCalculator.addItem(new Item("Apple"));
        //act
        Float result = this.iItemCalculator.calculateCost();

        //assert
        assertEquals(0.6f, result.floatValue(),0.0009f);

    }

    @Test
    public void testItemCalculationForSevenApplesReturnsExpectedResult(){
        //arrange
        iItemCalculator.addItem(new Item("Apple"));
        iItemCalculator.addItem(new Item("Apple"));
        iItemCalculator.addItem(new Item("Apple"));
        iItemCalculator.addItem(new Item("Apple"));
        iItemCalculator.addItem(new Item("Apple"));
        iItemCalculator.addItem(new Item("Apple"));
        iItemCalculator.addItem(new Item("Apple"));
        //act
        Float result = this.iItemCalculator.calculateCost();

        //assert
        assertEquals(2.4f, result.floatValue(),0.0009f);

    }

}