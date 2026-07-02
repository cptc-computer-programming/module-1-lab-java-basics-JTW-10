// src/main/java/week01/part02_methods/StreamingVideo.java
package week01.part02_methods;

public class StreamingVideo {

    public static void main(String[] args) {
        playVideo();
    }

    // TODO: main must call this method.
    // This method must call:
    //   1) loadVideo()
    //   2) startPlayback()
    // and startPlayback() must call:
    //   - showAd()
    //   - beginStream()
    //
    // Print exactly:
    // Play video selected.
    // Loading video.
    // Showing ad.
    // Video is now playing.
    public static void playVideo() {
        System.out.println("Play video selected.");
        loadVideo();
        startPlayback();
    }

    // TODO: Print exactly: Loading video.
    public static void loadVideo() {
        System.out.println("Loading video.");
    }

    // TODO: Must call showAd() and beginStream()
    public static void startPlayback() {
        showAd();
        beginStream();
    }

    // TODO: Print exactly: Showing ad.
    public static void showAd() {
        System.out.println("Showing ad.");
    }

    // TODO: Print exactly: Video is now playing.
    public static void beginStream() {
        System.out.println("Video is now playing.");
    }
}
