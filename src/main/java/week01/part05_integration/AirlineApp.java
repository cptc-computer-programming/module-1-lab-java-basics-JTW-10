// src/main/java/week01/part05_integration/AirlineApp.java
package week01.part05_integration;

public class AirlineApp {

    public static void main(String[] args) {
        runCheckIn();
    }

    public static void runCheckIn() {
        AirportScreen.showTitle();
        System.out.println(AirlineMessages.START);
        CheckInWorkflow.enterPassengerDetails();
        CheckInWorkflow.selectSeat();
        BoardingPass.generate();
        System.out.println(AirlineMessages.DONE);
    }
}
