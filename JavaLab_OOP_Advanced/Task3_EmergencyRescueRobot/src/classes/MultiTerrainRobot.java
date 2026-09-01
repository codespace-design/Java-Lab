public class MultiTerrainRobot extends RescueRobot implements Flyable, Swimmable, Climbable {
    public MultiTerrainRobot(String robotName, String location) {
        super(robotName, location);
    }

    @Override
    public void performMission() {
        System.out.println("Multi Terrain Robot is handling multiple rescue missions at once.");
    }

    @Override
    public void fly() {
        System.out.println("Multi Terrain Robot is flying across the rescue zone.");
    }

    @Override
    public void swim() {
        System.out.println("Multi Terrain Robot is moving through water.");
    }

    @Override
    public void climb() {
        System.out.println("Multi Terrain Robot is climbing difficult surfaces.");
    }
}
