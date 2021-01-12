import windows.MainWindow;
import windows.MainWindowSwing;
import windows.NewGameWindow;

import javax.swing.*;
import java.awt.*;

public class Main {
    private JPanel rootPanel;

    public static void main(String[] args) {
        //new MainWindowSwing();
        MainWindowSwing mainGame = new MainWindowSwing();
        mainGame.windowCreation();
    }
}
