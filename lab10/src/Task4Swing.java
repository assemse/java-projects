import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Task4Swing extends JPanel {

    private Color currentColor = Color.RED;
    private JButton button;

    public Task4Swing() {
        button = new JButton("Сменить цвет");
        button.addActionListener(e -> {
            if (currentColor == Color.RED) currentColor = Color.GREEN;
            else if (currentColor == Color.GREEN) currentColor = Color.BLUE;
            else currentColor = Color.RED;
            repaint();
        });
        this.add(button);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(currentColor);
        g.fillRect(50, 50, 100, 100);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Task4 – Цвет фигуры");
        Task4Swing panel = new Task4Swing();
        frame.setSize(300, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.setVisible(true);
    }
}
