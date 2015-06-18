package com.ilroberts.demo.coffee;

/**
 * Created by iwanroberts on 17/06/15.
 */

import org.mongodb.morphia.annotations.Id;

public class Order {
    private String drinker;
    private String size;
    private Long coffeShopId;
    private String[] selectedOptions;

    public String getId() {
        return id;
    }

    @Id
    private String id;

    public String getDrinker() {
        return drinker;
    }

    public String getSize() {
        return size;
    }

    public Long getCoffeShopId() {
        return coffeShopId;
    }

    public String[] getSelectedOptions() {
        return selectedOptions;
    }

    public DrinkType getType() {
        return type;
    }

    private DrinkType type;
}
