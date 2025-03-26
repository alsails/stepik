package oop2_9_2;

class Plane extends AirTransport {
    public Plane(String name, int speed, int capacity) {
        super(name, speed, capacity);
    }

    @Override
    public void move() {
        System.out.println(name + " летит по маршруту.");
    }
}
