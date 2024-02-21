package storeFront;

import inventoryManager.InventoryManager;
import shoppingCart.ShoppingCart;
import salableProduct.SalableProduct;
import java.util.ArrayList;
import java.util.List;

import inventoryManager.InventoryManager;
import shoppingCart.ShoppingCart;
import salableProduct.SalableProduct;
import java.util.List;
import java.util.ArrayList;

public class StoreFront {
    private InventoryManager inventoryManager;
    private List<ShoppingCart> shoppingCarts = new ArrayList<>();

    public StoreFront() {
        inventoryManager = new InventoryManager();
    }

    public InventoryManager getInventoryManager() { // Added method
        return inventoryManager;
    }

//    public void initializeStore() {
//        // Initialize the store with products
//        SalableProduct weapon1 = new SalableProduct("Sword", "A sharp blade for combat", 50.0, 10);
//        SalableProduct weapon2 = new SalableProduct("Bow", "A ranged weapon for archers", 40.0, 15);
//        SalableProduct armor1 = new SalableProduct("Plate Mail", "Heavy armor for protection", 100.0, 5);
//        SalableProduct armor2 = new SalableProduct("Leather Armor", "Light armor for agility", 60.0, 8);
//        SalableProduct healthPotion = new SalableProduct("Health Potion", "Restores health points", 20.0, 20);
//        SalableProduct bubbleBath = new SalableProduct("Bubble Bath", "Relaxing bubble bath solution", 9.99, 200);
//        SalableProduct soap = new SalableProduct("Soap", "Refreshing scented soap", 2.49, 300);
//        SalableProduct perfume = new SalableProduct("Perfume", "Elegant fragrance", 29.99, 150);
//        
//        inventoryManager.addProduct(weapon1);
//        inventoryManager.addProduct(weapon2);
//        inventoryManager.addProduct(armor1);
//        inventoryManager.addProduct(armor2);
//        inventoryManager.addProduct(healthPotion);
//        inventoryManager.addProduct(bubbleBath);
//        inventoryManager.addProduct(soap);
//        inventoryManager.addProduct(perfume);
//        
//    }
        // Other initialization tasks
    

    public void purchaseProduct(SalableProduct product, ShoppingCart cart, int quantity) {
        if (inventoryManager.getProductList().contains(product)) {
            if (product.getQuantity() >= quantity) {
                cart.addProduct(product, quantity);
                product.setQuantity(product.getQuantity() - quantity); // Reduce the quantity
                System.out.println("Product purchased: " + product.getName());
            } else {
                System.out.println("Insufficient quantity in inventory for: " + product.getName());
            }
        } else {
            System.out.println("Product not found in inventory: " + product.getName());
        }
    }


    public void cancelPurchase(SalableProduct product, ShoppingCart cart, int quantity) {
        if (cart.getCartItems().contains(product)) {
            int cartQuantity = cart.getQuantityInCart(product);
            if (cartQuantity >= quantity) {
                cart.removeProduct(product, quantity);
                product.setQuantity(product.getQuantity() + quantity); // Add the canceled quantity back to inventory
                System.out.println("Purchase canceled, product returned to inventory: " + product.getName());
            } else {
                System.out.println("Insufficient quantity in cart for: " + product.getName());
            }
        } else {
            System.out.println("Product not found in cart: " + product.getName());
        }
    }

     // Other methods for StoreFront
    //Would like to add a receipt. Will output a txt file as a receipt.
}