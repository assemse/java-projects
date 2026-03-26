import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Task8Swing extends JFrame {

    public Task8Swing() {
        setTitle("Task8 – Калькулятор");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        JTextField field1 = new JTextField(5);
        JTextField field2 = new JTextField(5);
        JButton addButton = new JButton("Сложить");
        JLabel resultLabel = new JLabel("Результат: ");

        addButton.addActionListener(e -> {
            try {
                int num1 = Integer.parseInt(field1.getText());
                int num2 = Integer.parseInt(field2.getText());
                resultLabel.setText("Результат: " + (num1 + num2));
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Введите числа!");
            }
        });

        add(new JLabel("Число 1:"));
        add(field1);
        add(new JLabel("Число 2:"));
        add(field2);
        add(addButton);
        add(resultLabel);

        setVisible(true);
    }

    public static void main(String[] args) {
        new Task8Swing();
    }
}
