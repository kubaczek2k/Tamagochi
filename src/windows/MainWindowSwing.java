package windows;

import com.sun.tools.javac.Main;

import javax.swing.*;
import java.awt.*;

public class MainWindowSwing {
    // TODO: 11-Jan-21 Add variable for windows size
    // TODO: 11-Jan-21 button with "nowa gra" text and logic
    // TODO: 11-Jan-21 button with "wczytaj zapis" text and its logic
    // TODO: 11-Jan-21 name Tamagochi displayed on top

    private JPanel rootPanel;

    public void windowCreation() {
        JFrame frame = new JFrame("MainWindowSwing");
        frame.setContentPane(new MainWindowSwing().rootPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(600,600));
        frame.pack();
        frame.setVisible(true);
    }
}
