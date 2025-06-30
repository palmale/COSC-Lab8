// Main.java
public class Main {
    public static void main(String[] args) {
        Car car = new Car(60, 40.5, 4);
        car.start();
        car.displayFuel();
        car.honk();

        System.out.println();

        Bicycle bikeWithBell = new Bicycle(15, 0.0, true);
        bikeWithBell.start();
        bikeWithBell.displayFuel();
        bikeWithBell.ringBell();

        System.out.println();

        Bicycle bikeWithoutBell = new Bicycle(10, 0.0, false);
        bikeWithoutBell.start();
        bikeWithoutBell.displayFuel();
        bikeWithoutBell.ringBell();
    }
}