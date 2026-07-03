// src/main/java/week01/part02_methods/OnlineOrder.java
package week01.part02_methods;

public class OnlineOrder {

    public static void main(String[] args) {
        processOrder();
    }

    public static void processOrder() {
        System.out.println("Processing order...");
        addItems();
        checkout();
        confirmOrder();
    }

    public static void addItems() {
        System.out.println("Adding items to cart.");
    }

    public static void checkout() {
        System.out.println("Checking out.");
    }

    public static void confirmOrder() {
        System.out.println("Order confirmed.");
    }
}
