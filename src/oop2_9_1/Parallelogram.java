package oop2_9_1;

class Parallelogram extends Quadrilateral {
    private double height;

    public Parallelogram(double base, double side, double height) {
        super("Параллелограмм", base, side, base, side);
        this.height = height;
    }

    @Override
    public double getArea() {
        return side1 * height;
    }
}
