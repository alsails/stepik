package oop2_9_1;

class EquilateralTriangle extends Triangle {
    public EquilateralTriangle(double side) {
        super("Равносторонний треугольник", side, side, side);
    }

    @Override
    public double getArea() {
        return (Math.sqrt(3) / 4) * a * a;
    }
}
