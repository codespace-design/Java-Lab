public class Main {
    public static void main(String[] args) {
        RescueRobot[] robots = {
            new AirRescueRobot("SkyDiver", "Flood Zone"),
            new WaterRescueRobot("WaveGuard", "Coastal Area"),
            new MountainRescueRobot("ClimberX", "Hill Range"),
            new MultiTerrainRobot("Atlas", "Disaster Site")
        };

        for (RescueRobot robot : robots) {
            System.out.println("========================================");
            robot.displayRobotDetails();
            robot.performMission();

            if (robot instanceof Flyable) {
                ((Flyable) robot).fly();
            }
            if (robot instanceof Swimmable) {
                ((Swimmable) robot).swim();
            }
            if (robot instanceof Climbable) {
                ((Climbable) robot).climb();
            }
        }
    }
}
