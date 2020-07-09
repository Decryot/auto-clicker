import java.lang.Thread;

public class Main {
    static Clicker autoClicker;

    public static void main(String[] args) {
        autoClicker = new Clicker(1);

        try { Thread.sleep(3000); }
        catch (Exception e) {}

        for (int i = 0; i < 5000; i++) {
            autoClicker.click(16);
            System.out.println(i+1);
        }
    }
}