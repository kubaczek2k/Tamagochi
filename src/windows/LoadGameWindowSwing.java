package windows;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoadGameWindowSwing extends Window {
    private JPanel panel1;
    private JTextField usernameField;
    private JButton loadButton;
    // TODO: 12-Jan-21 add text box "nazwa użytkownika" and button "dalej"
    // TODO: 12-Jan-21 in future add possibility to have multiple animals

    public LoadGameWindowSwing(JFrame _frame) {
        loadButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AnimalMainWindowSwing animal = new AnimalMainWindowSwing();
                animal.newWindow(_frame);
            }
        });
    }

    public void newWindow(JFrame _frame){
        super.newWindow(panel1,this,_frame);
    }
}
