public class SmartThermostat implements WiFiEnabled, TemperatureMonitor {
    public void connectToWiFi() {
        System.out.println("Smart Thermostat connected to Wi-Fi.");
    }

    public void monitorTemperature() {
        System.out.println("Smart Thermostat is monitoring temperature: 24°C.");
    }
}
