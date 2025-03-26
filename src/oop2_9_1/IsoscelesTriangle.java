package oop2_9_1;

class IsoscelesTriangle extends Triangle {
    public IsoscelesTriangle(double base, double side) {
        super("Равнобедренный треугольник", base, side, side);
    }

    @Override
    public double getArea() {
        double height = Math.sqrt(b * b - (a / 2) * (a / 2));
        return (a * height) / 2;
    }
}
