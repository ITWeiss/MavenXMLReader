package com.lesson17.Order;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Order {

    private int id;
    private List<Product> productList;

    public double calculateOrderPrice() {
        double totalPrice = 0;
        if (productList == null) {
            return 0;
        } else {
            for (Product product : productList) {
                totalPrice += product.getPrice();
            }
            return totalPrice;
        }
    }
}
