import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Task10Swing extends JPanel {

    private boolean red = false, green = false, blue = false;

    public Task10Swing() {
        JCheckBox redBox = new JCheckBox("Red");
        JCheckBox greenBox = new JCheckBox("Green");
        JCheckBox blueBox = new JCheckBox("Blue");

        ActionListener listener = e -> {
            red = redBox.isSelected();
            green = greenBox.isSelected();
            blue = blueBox.isSelected();
            repaint();
        };

        redBox.addActionListener(listener);
        greenBox.addActionListener(listener);
        blueBox.addActionListener(listener);

        this.add(redBox);
        this.add(greenBox);
        this.add(blueBox);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int r = red ? 255 : 0;
        int gr = green ? 255 : 0;
        int b = blue ? 255 : 0;
        g.setColor(new Color(r, gr, b));
        g.fillRect(50, 50, 100, 100);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Task10 – Checkbox цвета");
        Task10Swing panel = new Task10Swing();
        frame.setSize(300, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.setVisible(true);
    }
}
