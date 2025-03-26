package oop2_9_2;

public class Main {
    public static void main(String[] args) {
        Transport[] park = {
                new Car("Лада", 120, 5),
                new Bus("Автобус №42", 60, 40),
                new Locomotive("Паровоз СУ", 80, 200),
                new Ship("Титаник", 40, 3000),
                new Plane("Боинг 747", 900, 500),
                new Tank("Т-90", 65, 3)
        };

        for (Transport fleet : park) {
            System.out.println(fleet);
            System.out.println();
        }
    }
}