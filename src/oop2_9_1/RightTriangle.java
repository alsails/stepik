package oop2_9_1;

class RightTriangle extends Triangle {
    public RightTriangle(double a, double b) {
        super("Прямоугольный треугольник", a, b, Math.sqrt(a * a + b * b));
    }

    @Override
    public double getArea() {
        return (a * b) / 2;
    }
}
