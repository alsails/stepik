package oop2_9_2;

class Bus extends LandTransport implements PublicTransport {
    public Bus(String name, int speed, int capacity) {
        super(name, speed, capacity);
    }

    @Override
    public void move() {
        System.out.println(name + " перевозит пассажиров по маршруту.");
    }

    @Override
    public void boardPassengers() {
        System.out.println("Пассажиры садятся в автобус " + name);
    }
}
