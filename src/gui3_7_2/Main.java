package gui3_7_2;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            TextEditor editor = new TextEditor();
            editor.setTitle("Текстовый редактор");
            editor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            editor.setSize(800, 600);
            editor.setLocationRelativeTo(null);
            editor.setVisible(true);
        });
    }
}
