package oop2_9_1;

class Rhombus extends Quadrilateral {
    private double height;

    public Rhombus(double side, double height) {
        super("Ромб", side, side, side, side);
        this.height = height;
    }

    @Override
    public double getArea() {
        return side1 * height;
    }
}
