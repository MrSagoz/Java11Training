package com.pablosagoz.java11training.unit4;

import java.math.BigDecimal;

/**
 * {@code Shop} class represents an application that manages Products
 * @version 1.0
 * @author PabloSagoz
 */
public class Shop {

    public static void main(String[] args) {
        Product product = new Product();
        product.setId(101);
        product.setName("name");
        product.setPrice(BigDecimal.valueOf(1.99));

        System.out.println(product.getId() + " " + product.getName() + " " + product.getPrice()+ " "+ product.getDiscount());
    }
}
