// src/main/java/week01/part04_constants/SoccerApp.java
package week01.part04_constants;

public class SoccerApp {

    public static void main(String[] args) {
        runMatch();
    }

    public static void runMatch() {
        printTitle();
        printKickoff();
        printGoal();
        printHalftime();
        printFulltime();
    }


    public static void printTitle() {
        System.out.println(Messages.TITLE);
    }


    public static void printKickoff() {
        System.out.println(Messages.KICKOFF);
    }


    public static void printGoal() {
        System.out.println(Messages.GOAL);
    }


    public static void printHalftime() {
        System.out.println(Messages.HALFTIME);
    }


    public static void printFulltime() {
        System.out.println(Messages.FULLTIME);
    }
}
