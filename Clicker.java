import java.awt.Robot;

public class Clicker {
    Robot robot;
    int delay;

    public Clicker(int delay) {
        this.delay = delay;
        try {
            robot = new Robot();
        }catch (Exception e) {}
    }

    public void click(int button) {
        try {
            robot.mousePress(button);
            robot.delay(5);
            robot.mouseRelease(button);
            robot.delay(delay);
        }catch (Exception e) {}
    }
}