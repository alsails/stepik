package oop2_9_2;

class Ship extends WaterTransport {
    public Ship(String name, int speed, int capacity) {
        super(name, speed, capacity);
    }

    @Override
    public void move() {
        System.out.println(name + " плывёт по воде.");
    }
}
