public class SmartSpeaker implements WiFiEnabled, VoiceControlled, MusicPlayer {
    public void connectToWiFi() {
        System.out.println("Smart Speaker connected to Wi-Fi.");
    }

    public void activateVoiceControl() {
        System.out.println("Smart Speaker voice assistant activated.");
    }

    public void playMusic() {
        System.out.println("Smart Speaker is playing music.");
    }
}
