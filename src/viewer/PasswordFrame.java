package viewer;

import model.Password;

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
    private JButton newPasswordButton;

    public PasswordFrame() {
        this.setContentPane(mainPanel);
        this.setTitle("Password Generator");
        this.setMinimumSize(new Dimension(0,0));
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
        newPasswordButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setPasswordLabel();
            }
        });
    }

    private void setPasswordLabel() {
        String strTamanho = JOptionPane.showInputDialog(null,"Insira o tamanho da senha:","Tamanho da Senha",JOptionPane.WARNING_MESSAGE);
        try{
            int tamanho = Integer.parseInt(strTamanho);
            this.passwordLabel.setText(Password.generatePassword(tamanho));
        }catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null,"Erro ao ler o número: " + e,"Error",JOptionPane.ERROR_MESSAGE);
        }
    }
}
