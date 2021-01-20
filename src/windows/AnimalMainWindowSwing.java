
package windows;

import javax.swing.*;

public class AnimalMainWindowSwing extends Window{
    private JPanel panel1;
    // TODO: 12-Jan-21 add animal placeholder in middle
    // TODO: 12-Jan-21 in top right health and happiness indicators
    // TODO: 12-Jan-21 on left drop down list with activities that can be done with animal

    public void newWindow(JFrame _frame){
        super.newWindow(panel1, this, _frame);
    }
}
