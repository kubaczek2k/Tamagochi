package windows;

import javax.swing.*;

public class MainWindow extends JFrame{
    // TODO: 11-Jan-21 Add variable for windows size
    // TODO: 11-Jan-21 button with "nowa gra" text and logic
    // TODO: 11-Jan-21 button with "wczytaj zapis" text and its logic
    // TODO: 11-Jan-21 name Tamagochi displayed on top

    public MainWindow(){
        super("Tamagochi game");

        setSize(400,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
