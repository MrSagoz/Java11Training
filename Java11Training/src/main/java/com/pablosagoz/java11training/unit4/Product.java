package com.pablosagoz.java11training.unit4;

import java.math.BigDecimal;
import static java.math.RoundingMode.HALF_UP;

/**
 * {@code Product} class 
 * <br>
 * Each class an id, name, price
 * <br>
 * Eacn produc can have a different discuount, calculated based on
 * {@link DISCOUNT_RATE discount rate}
 * @version 1.0
 * @author PabloSagoz
 */
public class Product {

    /**
     * A constant that defines a {@link java.math.BigDecimal BigDecimal} value
     * of the discount rate
     * <br>
     * Discount rate is 10%
     */
    public static final BigDecimal DISCOUNT_RATE = BigDecimal.valueOf(0.1);

    private int id;
    private String name;
    private BigDecimal price;

    public int getId() {
        return id;
    }

    public void setId(final int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(final BigDecimal price) {
        this.price = price;
    }

    /**
     * Calculates discount based on a product proce and 
     * {@link DISCOUNT_RATE discount rate}
     * @return a {@link java.math.BigDecimal BigDecimal} value of the discount
     */
    public BigDecimal getDiscount() {
        return price.multiply(DISCOUNT_RATE).setScale(2, HALF_UP);
    }
}
