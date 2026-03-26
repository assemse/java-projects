import javax.swing.*;
import java.awt.*;

public class Task1Swing extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Прямоугольник
        g.setColor(Color.RED);
        g.drawRect(50, 50, 120, 80);
        g.drawString("Прямоугольник", 50, 45);

        // Круг
        g.setColor(Color.BLUE);
        g.drawOval(220, 50, 80, 80);
        g.drawString("Круг", 220, 45);

        // Линия
        g.setColor(Color.GREEN);
        g.drawLine(50, 170, 300, 170);
        g.drawString("Линия", 50, 165);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Task1 – Рисование фигур");
        Task1Swing panel = new Task1Swing();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.add(panel);
        frame.setVisible(true);
    }
}