package oop2_10;
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        String line = null;

        try (BufferedReader reader = new BufferedReader(new FileReader("src/oop2_10/input.txt"))) {
            line = reader.readLine();
        } catch (IOException e) {
            System.out.println("File read error: " + e.getMessage());
            return;
        }

        if (line == null || line.isEmpty()) {
            System.out.println("No input found in file");
            return;
        }

        String[] input = line.trim().split(" ");

        if (input.length != 3) {
            System.out.println("Invalid input");
            return;
        }

        try {
            Expression expr = new Expression(input[0], input[1], input[2]);
            System.out.println(expr.evaluate());
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
