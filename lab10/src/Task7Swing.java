import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Task7Swing extends JPanel {

    private char keyChar = '\0';

    public Task7Swing() {
        setFocusable(true);
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                keyChar = e.getKeyChar();
                repaint();
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setFont(new Font("Arial", Font.BOLD, 24));
        g.drawString("Нажатый символ: " + keyChar, 50, 100);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Task7 – Символ с клавиатуры");
        Task7Swing panel = new Task7Swing();
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.setVisible(true);
    }
}
