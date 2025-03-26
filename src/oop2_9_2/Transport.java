package oop2_9_2;

abstract class Transport {
    protected String name;
    protected int speed;
    protected int capacity;

    public Transport(String name, int speed, int capacity) {
        this.name = name;
        this.speed = speed;
        this.capacity = capacity;
    }

    public abstract void move();

    @Override
    public String toString() {
        return "Название: " + name + "\nСкорость: " + speed + " км/ч.\nВместимость: " + capacity;
    }
}
