package APIs;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UIDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple Swing GUI");
        JButton button = new JButton("Click Me");
        JButton button1 = new JButton("Click me2");

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button clicked left!");
            }
        });

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button clicked right");
            }
        });

        JPanel panel = new JPanel();
        panel.add(button1);
        panel.add(button);
        frame.getContentPane().add(panel);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}