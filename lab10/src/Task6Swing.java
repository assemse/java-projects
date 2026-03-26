import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Task6Swing extends JPanel {

    private int x = -10, y = -10;

    public Task6Swing() {
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                x = e.getX();
                y = e.getY();
                repaint();
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.RED);
        g.fillOval(x - 5, y - 5, 10, 10);
        g.drawString("X: " + x + " Y: " + y, 10, 20);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Task6 – Точка мышью");
        Task6Swing panel = new Task6Swing();
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.setVisible(true);
    }
}
