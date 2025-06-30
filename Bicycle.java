// Bicycle.java
public class Bicycle extends Vehicle {
    private boolean hasBell;

    public Bicycle(int speed, double fuel, boolean hasBell) {
        super(speed, fuel);
        this.hasBell = hasBell;
    }

    @Override
    public void start() {
        System.out.println("Bicycle started. Pedal away!");
    }

    public void ringBell() {
        if (hasBell) {
            System.out.println("Ring Ring!");
        } else {
            System.out.println("This bicycle has no bell.");
        }
    }

    public boolean hasBell() {
        return hasBell;
    }

    public void setHasBell(boolean hasBell) {
        this.hasBell = hasBell;
    }
}