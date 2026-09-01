public class SmartCar implements WiFiEnabled, VoiceControlled, MusicPlayer, VideoStreaming {
    public void connectToWiFi() {
        System.out.println("Smart Car connected to Wi-Fi.");
    }

    public void activateVoiceControl() {
        System.out.println("Smart Car voice assistant activated.");
    }

    public void playMusic() {
        System.out.println("Smart Car is playing music.");
    }

    public void streamVideo() {
        System.out.println("Smart Car is streaming a video.");
    }
}
