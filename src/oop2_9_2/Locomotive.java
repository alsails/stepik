package oop2_9_2;

class Locomotive extends LandTransport implements SteamPowered {
    public Locomotive(String name, int speed, int capacity) {
        super(name, speed, capacity);
    }

    @Override
    public void move() {
        System.out.println(name + " движется по рельсам.");
    }

    @Override
    public void startSteamEngine() {
        System.out.println("Запущен паровой двигатель у " + name);
    }
}
