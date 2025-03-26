package oop2_9_1;

class ConvexQuadrilateral extends Quadrilateral {
    private double diagonal;
    private double angle; // в градусах между диагоналями

    public ConvexQuadrilateral(double s1, double s2, double s3, double s4, double diagonal, double angle) {
        super("Выпуклый четырёхугольник", s1, s2, s3, s4);
        this.diagonal = diagonal;
        this.angle = angle;
    }

    @Override
    public double getArea() {
        double radians = Math.toRadians(angle);
        return 0.5 * diagonal * diagonal * Math.sin(radians);
    }
}