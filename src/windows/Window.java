package windows;

import javax.swing.*;
import java.awt.*;

abstract class Window {
    public void newWindow(JPanel _panel, Object _class, JFrame _frame){
        GridBagLayout grid = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();
        _frame.setLayout(grid);
        _frame.setContentPane(_panel);
        _frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        _frame.setPreferredSize(new Dimension(600,600));
        _frame.pack();
        _frame.setVisible(true);
    }
}
