public class Main {
    public static void main(String[] args) {
        SmartSpeaker speaker = new SmartSpeaker();
        SmartTV television = new SmartTV();
        SmartThermostat thermostat = new SmartThermostat();
        SmartCar car = new SmartCar();

        speaker.connectToWiFi();
        speaker.activateVoiceControl();
        speaker.playMusic();

        television.connectToWiFi();
        television.playMusic();
        television.streamVideo();

        thermostat.connectToWiFi();
        thermostat.monitorTemperature();

        car.connectToWiFi();
        car.activateVoiceControl();
        car.playMusic();
        car.streamVideo();
    }
}
