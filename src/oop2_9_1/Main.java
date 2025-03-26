package oop2_9_1;

public class Main {
    public static void main(String[] args) {
        Figure[] figures = {
                new IsoscelesTriangle(10, 13),
                new EquilateralTriangle(7),
                new RightTriangle(6, 8),
                new ConvexQuadrilateral(4, 5, 6, 7, 6, 60),
                new Parallelogram(10, 6, 5),
                new Rectangle(5, 8),
                new Square(6),
                new Rhombus(7, 4),
                new Trapezoid(8, 6, 5, 5, 4),
                new Pentagon(5),
                new Hexagon(6),
                new Oval(6, 3),
                new Circle(5)
        };

        for (Figure figure : figures) {
            System.out.println(figure);
            System.out.println();
        }
    }
}
