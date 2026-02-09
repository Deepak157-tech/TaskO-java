class Engine {
    void start() {
        System.out.println("Engine Started");
    }
}

class Car {
    Engine engine = new Engine();

    void drive() {
        engine.start();
        System.out.println("Car is moving");
    }
}

public class CarExample {
    public static void main(String[] args) {
        Car c = new Car();
        c.drive();
    }
}
