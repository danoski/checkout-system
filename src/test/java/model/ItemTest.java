package model;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by danos on 13/03/2018.
 */
public class ItemTest {

    @Test
    public void testNameOfItemMatchesAsExpected() {
        //arrange

        // act
        IItem iItem = new Item("Orange");

        //assert
        assertEquals("Orange", iItem.getName());
    }
}