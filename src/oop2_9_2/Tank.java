package oop2_9_2;

class Tank extends LandTransport implements Military {
    public Tank(String name, int speed, int capacity) {
        super(name, speed, capacity);
    }

    @Override
    public void move() {
        System.out.println(name + " движется по полю боя.");
    }

    @Override
    public void engageTarget() {
        System.out.println(name + " стреляет по цели!");
    }
}
