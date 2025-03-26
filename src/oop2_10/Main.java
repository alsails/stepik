package oop2_10;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        String line = null;
        String output;

        try (BufferedReader reader = new BufferedReader(new FileReader("src/oop2_10/input.txt"))) {
            line = reader.readLine();
        } catch (IOException e) {
            output = "File read error: " + e.getMessage();
            writeOutput(output);
            return;
        }

        if (line == null || line.isEmpty()) {
            output = "No input found in file";
            writeOutput(output);
            return;
        }

        String[] input = line.trim().split(" ");

        if (input.length != 3) {
            output = "Invalid input";
            writeOutput(output);
            return;
        }

        try {
            Expression expr = new Expression(input[0], input[1], input[2]);
            output = String.valueOf(expr.evaluate());
        } catch (IllegalArgumentException ex) {
            output = ex.getMessage();
        }

        writeOutput(output);
    }

    private static void writeOutput(String result) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("src/oop2_10/output.txt"))) {
            writer.write(result);
        } catch (IOException e) {
            System.out.println("File write error: " + e.getMessage());
        }
    }
}