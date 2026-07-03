// src/main/java/week01/part02_methods/StreamingVideo.java
package week01.part02_methods;

public class StreamingVideo {

    public static void main(String[] args) {
        playVideo();
    }

    public static void playVideo() {
        System.out.println("Play video selected.");
        loadVideo();
        startPlayback();
    }

    public static void loadVideo() {
        System.out.println("Loading video.");
    }

    public static void startPlayback() {
        showAd();
        beginStream();
    }

    public static void showAd() {
        System.out.println("Showing ad.");
    }

    public static void beginStream() {
        System.out.println("Video is now playing.");
    }
}
