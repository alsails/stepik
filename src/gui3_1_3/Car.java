package gui3_1_3;

import javax.swing.*;
import java.awt.*;

public class Car extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(3));

        // Car body
        g.setColor(Color.YELLOW);
        g.fillRoundRect(100, 200, 400, 100, 50, 50);

        g.fillArc(100, 115, 350, 250, 0, 180);

        g.setColor(Color.WHITE);
        g.fillArc(150, 130, 250, 150, 0, 180);

        g.setColor(Color.BLACK);
        g.drawLine(275, 130, 275, 205);

        g.drawLine(280, 230, 310, 230);

        // Headlight
        g.setColor(Color.WHITE);
        g.fillOval(470, 230, 30, 20);
        g.setColor(Color.BLACK);
        g.drawOval(470, 230, 30, 20);

        // Wheels
        g.setColor(Color.BLACK);
        g.fillOval(140, 270, 80, 80);
        g.fillOval(330, 270, 80, 80);

        g.setColor(Color.WHITE);
        g.fillOval(160, 290, 40, 40);
        g.fillOval(350, 290, 40, 40);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Машина");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 450);
        frame.setContentPane(new Car());
        frame.setVisible(true);
    }
}
