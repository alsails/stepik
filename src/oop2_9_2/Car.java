package oop2_9_2;

class Car extends LandTransport {
    public Car(String name, int speed, int capacity) {
        super(name, speed, capacity);
    }

    @Override
    public void move() {
        System.out.println(name + " едет по дороге.");
    }
}