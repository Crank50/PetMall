package entities;

/**
 * Created by Justin on 7/21/16.
 */
public class Product {
    private Long productId;
    private String name;
    private String description;
    private double price;

    //constructors

    public Product() {

    }
    public  Product(Long productId, String name, String description, double price) {


    }

// getters and setters

    public Long getProductID() {

        return productId;
    }

    public void setProductID(Long productId) {

        this.productId = productId;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getDescription() {

        return description;
    }

    public void setDescription(String description) {

        this.description = description;
    }

    public double getPrice() {

        return price;
    }

    public void setPrice(double price) {

        this.price = price;
    }


}
