package gui3_1_1;
import javax.swing.*;
import java.awt.*;

class TrafficLight extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Корпус
        g.setColor(Color.DARK_GRAY);
        g.fillRoundRect((600 / 2 - 60), (700 / 2 - 180), 120, 300, 20, 20);

        // Красный
        g.setColor(Color.RED);
        g.fillOval((600 / 2 - 40), (700 / 2 - 160), 80, 80);

        // Жёлтый
        g.setColor(Color.YELLOW);
        g.fillOval((600 / 2 - 40), (700 / 2 - 70), 80, 80);

        // Зелёный
        g.setColor(Color.GREEN);
        g.fillOval((600 / 2 - 40), (700 / 2 + 20), 80, 80);

        g.setColor(Color.DARK_GRAY);
        g.fillRoundRect((600 / 2 - 25), 475, 50, 60, 20, 20);

        int[] xPoints = {365, 365, 435};
        int[] yPoints = {(700 / 2 - 160), (700 / 2 - 90), (700 / 2 - 160)};
        int nPoints = 3;

        g.setColor(Color.DARK_GRAY);
        g.fillPolygon(xPoints, yPoints, nPoints);

        int[] xPoints2 = {365, 365, 435};
        int[] yPoints2 = {(700 / 2 - 70), (700 / 2), (700 / 2 - 70)};
        int nPoints2 = 3;

        g.setColor(Color.DARK_GRAY);
        g.fillPolygon(xPoints2, yPoints2, nPoints2);

        int[] xPoints3 = {365, 365, 435};
        int[] yPoints3 = {(700 / 2 + 20), (700 / 2 + 90), (700 / 2 + 20)};
        int nPoints3 = 3;

        g.setColor(Color.DARK_GRAY);
        g.fillPolygon(xPoints3, yPoints3, nPoints3);

        int[] xPoints4 = {235, 235, 165};
        int[] yPoints4 = {(700 / 2 - 160), (700 / 2 - 90), (700 / 2 - 160)};
        int nPoints4 = 3;

        g.setColor(Color.DARK_GRAY);
        g.fillPolygon(xPoints4, yPoints4, nPoints4);

        int[] xPoints5 = {235, 235, 165};
        int[] yPoints5 = {(700 / 2 - 70), (700 / 2), (700 / 2 - 70)};
        int nPoints5 = 3;

        g.setColor(Color.DARK_GRAY);
        g.fillPolygon(xPoints5, yPoints5, nPoints5);

        int[] xPoints6 = {235, 235, 165};
        int[] yPoints6 = {(700 / 2 + 20), (700 / 2 + 90), (700 / 2 + 20)};
        int nPoints6 = 3;

        g.setColor(Color.DARK_GRAY);
        g.fillPolygon(xPoints6, yPoints6, nPoints6);

        g.setColor(Color.DARK_GRAY);
        g.fillArc((600 / 2 - 50), (700 / 2 - 210), 100, 50, 0, 180);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Светофор");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 700);
        frame.setContentPane(new TrafficLight());
        frame.setVisible(true);
    }
}

