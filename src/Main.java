import windows.MainWindowSwing;

import javax.swing.*;

public class Main {
    private JPanel rootPanel;

    public static void main(String[] args) {
        //new MainWindowSwing();
        MainWindowSwing mainGame = new MainWindowSwing();
        mainGame.newWindow();
    }
}
