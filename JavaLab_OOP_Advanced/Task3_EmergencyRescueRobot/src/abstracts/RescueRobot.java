public abstract class RescueRobot {
    protected String robotName;
    protected String location;

    public RescueRobot(String robotName, String location) {
        this.robotName = robotName;
        this.location = location;
    }

    public void displayRobotDetails() {
        System.out.println("Robot Name: " + robotName);
        System.out.println("Location: " + location);
    }

    public abstract void performMission();
}
