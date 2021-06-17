package HW8;

import javax.swing.*;
import java.awt.*;

public class MyWindow extends JFrame {
    MyWindow () {
        setTitle("Test Window");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(300, 300, 400, 400);
//        JButton button1 = new JButton("Simple Button1");
//        JButton button2 = new JButton("Simple Button2");
//        add(button1, BorderLayout.NORTH);
//        add(button2, BorderLayout.SOUTH);
        setLayout(new GridLayout(3,3));
        for (int i = 0; i < 9; i++){
            add(new JButton(String.valueOf(i + 1)));
        }

        setVisible(true);
    }
}
