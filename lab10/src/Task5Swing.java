import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Task5Swing extends JPanel {

    private int x = -50, y = -50;
    private JTextField xField, yField;
    private JButton drawButton;

    public Task5Swing() {
        xField = new JTextField(5);
        yField = new JTextField(5);
        drawButton = new JButton("Нарисовать");

        drawButton.addActionListener(e -> {
            try {
                x = Integer.parseInt(xField.getText());
                y = Integer.parseInt(yField.getText());
                repaint();
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Введите числа!");
            }
        });

        this.add(new JLabel("X:"));
        this.add(xField);
        this.add(new JLabel("Y:"));
        this.add(yField);
        this.add(drawButton);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLUE);
        g.fillOval(x, y, 30, 30);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Task5 – Рисование по координатам");
        Task5Swing panel = new Task5Swing();
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.setVisible(true);
    }
}
