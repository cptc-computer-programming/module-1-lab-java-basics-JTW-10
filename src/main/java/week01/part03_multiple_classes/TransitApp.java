// src/main/java/week01/part03_multiple_classes/TransitApp.java
package week01.part03_multiple_classes;

public class TransitApp {

    public static void main(String[] args) {
        startTrip();
    }

    public static void startTrip() {
        System.out.println("Trip started.");
        Station.enter();
        Ticket.scan();
        Train.depart();
        System.out.println("Trip in progress.");
    }
}
