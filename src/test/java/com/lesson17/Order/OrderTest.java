package com.lesson17.Order;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class OrderTest {

    @Test
    void calculateOrderPriceWithProductList() {
        Order order = new Order();
        order.setProductList(Arrays.asList(
                new Product(1, "Apple", 250),
                new Product(2, "Banana", 440),
                new Product(3, "Orange", 310)
        ));
        double totalPrice = order.calculateOrderPrice();
        Assertions.assertEquals(totalPrice, 1000);
    }

    @Test
    void calculateOrderPriceWithEmptyProductList() {
        Order order = new Order();
        double totalPrice = order.calculateOrderPrice();
        Assertions.assertEquals(totalPrice, 0);
    }

    @Test
    void calculateOrderPriceWithOneProductInList() {
        Order order = new Order();
        order.setProductList(Arrays.asList(
                new Product(1, "Apple", 250)
        ));
        double totalPrice = order.calculateOrderPrice();
        Assertions.assertEquals(totalPrice, 250);
    }


    @Test
    void getProductList() {
        Order order = new Order();
        order.setProductList(Arrays.asList(
                new Product(4, "Mango", 510)
        ));
        Assertions.assertEquals(order.getProductList(), Arrays.asList(
                new Product(4, "Mango", 510)
        ));
    }

    @Test
    void getEmptyProductList() {
        Order order = new Order();
        Assertions.assertEquals(order.getProductList(), null);
    }

    @Test
    void ToStringOrder() {
        Order order = new Order();
        order.setProductList(List.of(
                new Product(1, "Apple", 250)
        ));
        Assertions.assertEquals(order.toString(), "Order(id=0, productList=[Product(id=1, name=Apple, price=250.0)])");
    }

    @Test
    void ToStringEmptyOrder() {
        Order order = new Order();
        Assertions.assertEquals(order.toString(), "Order(id=0, productList=null)");
    }


}
