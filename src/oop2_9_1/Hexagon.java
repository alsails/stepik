package oop2_9_1;

class Hexagon extends Figure {
    private double side;

    public Hexagon(double side) {
        super("Шестиугольник");
        this.side = side;
    }

    @Override
    public double getPerimeter() {
        return 6 * side;
    }

    @Override
    public double getArea() {
        return ((3 * Math.sqrt(3)) / 2) * side * side;
    }
}
