package model;

/**
 * Created by danos on 13/03/2018.
 */
public class Item implements IItem {
    private String name;

    public Item(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
