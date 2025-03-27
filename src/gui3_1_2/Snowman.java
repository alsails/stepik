package gui3_1_2;

import javax.swing.*;
import java.awt.*;

public class Snowman extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(2));

        g.drawOval(150, 60, 100, 100);   // Head
        g.drawOval(130, 160, 140, 140);  // Middle
        g.drawOval(110, 300, 180, 180);  // Bottom

        g.fillOval(180, 90, 5, 5);
        g.fillOval(215, 90, 5, 5);

        int[] mouthXs = {180, 190, 200, 210, 220};
        for (int x : mouthXs) {
            g.fillOval(x, 130, 4, 4);
        }

        int[] noseX = {197, 240, 197};
        int[] noseY = {105, 110, 115};
        g.drawPolygon(noseX, noseY, 3);

        g.fillOval(195, 200, 5, 5);
        g.fillOval(195, 220, 5, 5);
        g.fillOval(195, 240, 5, 5);
        g.fillOval(195, 260, 5, 5);

        g.drawLine(128, 230, 60, 130);
        g.drawLine(60, 130, 70, 125);
        g.drawLine(60, 130, 65, 140);

        g.drawLine(270, 170, 340, 130);
        g.drawLine(340, 130, 330, 125);
        g.drawLine(340, 130, 335, 140);

        g.drawRect(175, 20, 50, 30);
        g.drawRect(160, 50, 80, 10);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Снеговик");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 700);
        frame.setContentPane(new Snowman());
        frame.setVisible(true);
    }
}
