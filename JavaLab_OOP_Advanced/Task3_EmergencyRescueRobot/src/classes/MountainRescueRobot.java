public class MountainRescueRobot extends RescueRobot implements Climbable {
    public MountainRescueRobot(String robotName, String location) {
        super(robotName, location);
    }

    @Override
    public void performMission() {
        System.out.println("Mountain Rescue Robot is climbing steep terrain.");
    }

    @Override
    public void climb() {
        System.out.println("Mountain Rescue Robot is climbing the mountain side.");
    }
}
