public class SmartTV implements WiFiEnabled, VideoStreaming, MusicPlayer {
    public void connectToWiFi() {
        System.out.println("Smart TV connected to Wi-Fi.");
    }

    public void streamVideo() {
        System.out.println("Smart TV is streaming a movie.");
    }

    public void playMusic() {
        System.out.println("Smart TV is playing audio.");
    }
}
