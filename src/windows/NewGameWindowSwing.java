package windows;

import javax.swing.*;

public class NewGameWindowSwing extends Window{
    private JRadioButton radioButton1;
    private JRadioButton radioButton2;
    private JRadioButton radioButton3;
    private JRadioButton radioButton4;
    private JPanel rootPanel;

    public NewGameWindowSwing(JFrame _frame) {
        newWindow(rootPanel, this, _frame);
    }

    public void newWindow(JPanel _panel, Object _class, JFrame _frame){
        super.newWindow(_panel, _class, _frame);
    }
}