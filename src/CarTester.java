public class CarTester {
    public static void main(String[] args) {
        Car car1 = new Car("Maluch", 52, 31);
        car1.show();

        car1.turbo();
        car1.show();

        car1.increaseSpeed(20);
        car1.show();

        car1.decreaseSpeed(10);
        car1.show();

    }
}
