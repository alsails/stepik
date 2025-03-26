package oop2_10;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> outputLines = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader("src/oop2_10/input.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.trim().isEmpty()) continue;

                String[] input = line.trim().split(" ");
                String result;

                if (input.length != 3) {
                    result = "Invalid input";
                } else {
                    try {
                        Expression expr = new Expression(input[0], input[1], input[2]);
                        result = String.valueOf(expr.evaluate());
                    } catch (IllegalArgumentException ex) {
                        result = ex.getMessage();
                    }
                }

                outputLines.add(line + " = " + result);
            }
        } catch (IOException e) {
            System.out.println("File read error: " + e.getMessage());
            return;
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("src/oop2_10/output.txt"))) {
            for (String line : outputLines) {
                writer.write(line);
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("File write error: " + e.getMessage());
        }
    }
}