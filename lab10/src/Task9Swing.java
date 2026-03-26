import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Task9Swing extends JPanel implements ActionListener {

    private int x = 0, y = 100;
    private Timer timer;

    public Task9Swing() {
        timer = new Timer(30, this); // каждые 30 мс
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.ORANGE);
        g.fillOval(x, y, 50, 50);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        x += 2;
        if (x > getWidth()) x = -50;
        repaint();
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Task9 – Анимация");
        Task9Swing panel = new Task9Swing();
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.setVisible(true);
    }
}
