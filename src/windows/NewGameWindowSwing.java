package windows;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NewGameWindowSwing extends Window{
    // TODO: 11-Jan-21 add "wybiez zwierze" text at top
    // TODO: 11-Jan-21 add buttons with names of animals you can choose of
    // TODO: 11-Jan-21 add text "nadaj imie" and text box next to it with place to fill in with text
    private JRadioButton catRadioButton;
    private JRadioButton dogRadioButton;
    private JRadioButton fishRadioButton;
    private JRadioButton hamsterRadioButton;
    private JPanel rootPanel;
    private JPanel firstPanel;
    private JTextField petNameTextField;
    private JButton startGameButton;
    private JPanel petName;
    private JTextField textField1;

    public NewGameWindowSwing(JFrame _frame) {
        newWindow(rootPanel, this, _frame);
        startGameButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AnimalMainWindowSwing animal = new AnimalMainWindowSwing();
                animal.newWindow(_frame);
            }
        });
    }

    public void newWindow(JPanel _panel, Object _class, JFrame _frame){
        super.newWindow(_panel, _class, _frame);
    }
}