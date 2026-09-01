public class AirRescueRobot extends RescueRobot implements Flyable {
    public AirRescueRobot(String robotName, String location) {
        super(robotName, location);
    }

    @Override
    public void performMission() {
        System.out.println("Air Rescue Robot is surveying from the sky.");
    }

    @Override
    public void fly() {
        System.out.println("Air Rescue Robot is flying to the disaster area.");
    }
}
