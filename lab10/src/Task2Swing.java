import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Task2Swing extends JFrame {

    private JLabel label;
    private JButton button;

    public Task2Swing() {
        setTitle("Task2 – Кнопка");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout()); // простой лэйаут

        label = new JLabel(""); // место для текста
        button = new JButton("Нажми");

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("Hello Java"); // при нажатии меняем текст
            }
        });

        add(button);
        add(label);

        setVisible(true);
    }

    public static void main(String[] args) {
        new Task2Swing();
    }
}
