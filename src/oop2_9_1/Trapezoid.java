package oop2_9_1;

class Trapezoid extends Quadrilateral {
    private double height;

    public Trapezoid(double base1, double base2, double side1, double side2, double height) {
        super("Трапеция", base1, side1, base2, side2);
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0.5 * (side1 + side3) * height;
    }
}
