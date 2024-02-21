package salableProduct;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SalableProduct {
    private String name;
    private String description;
    private double price;
    private int quantity;
    private int quantityPurchased;

    // Constructor
    @JsonCreator
    public SalableProduct(@JsonProperty("name") String name, 
                          @JsonProperty("description") String description,
                          @JsonProperty("price") double price, 
                          @JsonProperty("quantity") int quantity,
    					  @JsonProperty("quantityPurchased") int quantityPurchased){
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
    }
    // Getters
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
    
    public int getQuantityPurchased() {
        return quantityPurchased;
    }
    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int compareTo(SalableProduct otherProduct) {
        // Compare based on the name, ignoring case
        return this.name.compareToIgnoreCase(otherProduct.getName());
    }
    
    public void setQuantityPurchased(int quantityPurchased) {
        this.quantityPurchased = quantityPurchased;
    }
}



