package viewer;

import javax.swing.*;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static model.Password.generatePassword;

public class PasswordFrame extends JFrame{
    private JLabel textLabel;
    private JButton copiarButton;
    private JLabel passwordLabel;
    private JPanel mainPanel;

    public PasswordFrame() {
        this.setContentPane(mainPanel);
        this.setTitle("Passowrd Generator");
        this.setMinimumSize(new Dimension(300,0));
        this.pack();
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        setPasswordLabel();
        this.setVisible(true);
        copiarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String textCopied = passwordLabel.getText();
                StringSelection data = new StringSelection(textCopied);
                Toolkit.getDefaultToolkit().getSystemClipboard().setContents(data,data);
            }
        });
    }

    private void setPasswordLabel() {
        this.passwordLabel.setText(generatePassword());
    }
}
