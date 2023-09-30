package viewer;

import javax.swing.*;
import java.awt.*;

public class CreditsFrame extends JFrame {
    private JPanel mainPanel;

    public CreditsFrame() {
        this.setContentPane(mainPanel);
        this.setTitle("Créditos");
        this.setMinimumSize(new Dimension(250,0));
        this.pack();
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}
