import javax.swing.*;
import java.awt.*;

public class Task3Swing extends JFrame {

    public Task3Swing() {
        setTitle("Task3 – Ввод имени");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        JLabel prompt = new JLabel("Введите имя:");
        JTextField textField = new JTextField(20);
        JButton button = new JButton("Приветствовать");
        JLabel output = new JLabel("");

        button.addActionListener(e -> output.setText("Привет, " + textField.getText() + "!"));

        add(prompt);
        add(textField);
        add(button);
        add(output);

        setVisible(true);
    }

    public static void main(String[] args) {
        new Task3Swing();
    }
}
