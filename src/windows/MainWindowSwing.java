package windows;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindowSwing extends Window{
    // TODO: 11-Jan-21 Add variable for windows size
    // TODO: 11-Jan-21 button with "nowa gra" text and logic
    // TODO: 11-Jan-21 button with "wczytaj zapis" text and its logic
    // TODO: 11-Jan-21 name Tamagochi displayed on top

    private JFrame frame;
    private JPanel rootPanel;
    private JLabel titleText;
    private JButton newGame;
    private JButton loadGameButton;

    public MainWindowSwing(){
        frame = new JFrame("Tamagochi");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        newGame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                NewGameWindowSwing game = new NewGameWindowSwing(frame);
            }
        });

        //logic to work after load game button is pressed
        loadGameButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LoadGameWindowSwing loadGame = new LoadGameWindowSwing(frame);
            }
        });
    }

    public void newWindow(){
        super.newWindow(rootPanel, this, frame);
    }
}