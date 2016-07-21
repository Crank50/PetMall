package entities;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 * Created by Justin on 7/21/16.
 */
public class Order {
    private Long orderId;
    private Long ownerId;
    private LocalDate orderDate;
    private ArrayList products;

    //constructors

    public Order() {

    }

    public Order(Long orderId, Long ownerId, LocalDate orderDate, ArrayList products) {


    }


    //getters and setters

    public Long getOrderId() {

        return orderId;
    }

    public void setOrderId(Long orderId) {

        this.orderId = orderId;
    }

    public LocalDate getOrderDate() {

        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {

        this.orderDate = orderDate;
    }

    public Long getOwnerId() {

        return ownerId;
    }

    public void setOwnerId(Long ownerId) {

        this.ownerId = ownerId;
    }

    public ArrayList getProducts() {

        return products;
    }

    public void setProducts(ArrayList products) {

        this.products = products;
    }
}




