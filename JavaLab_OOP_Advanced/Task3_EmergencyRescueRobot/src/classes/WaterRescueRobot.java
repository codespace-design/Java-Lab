public class WaterRescueRobot extends RescueRobot implements Swimmable {
    public WaterRescueRobot(String robotName, String location) {
        super(robotName, location);
    }

    @Override
    public void performMission() {
        System.out.println("Water Rescue Robot is searching in flooded areas.");
    }

    @Override
    public void swim() {
        System.out.println("Water Rescue Robot is swimming through floodwater.");
    }
}
