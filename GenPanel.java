import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GenPanel implements ActionListener {
    private static JFrame frame;
    private static JPanel panel;
    private static JLabel labelLength;
    // private JLabel labelNum;
    private static JTextField pwlength;
    // private static JTextField pwnum;
    private static JButton generate;
    private static int passwordLength;
    private static JLabel passwordLabel;

    public GenPanel() {
        frame = new JFrame();
        panel = new JPanel();
        labelLength = new JLabel("Password length:");
        // labelNum = new JLabel("Number of passwords:");
        // pwnum = new JTextField();
        pwlength = new JTextField();
        passwordLabel = new JLabel("");
        generate = new JButton("Generate");

        /* Setup labels */
        panel.setLayout(null);
        labelLength.setBounds(110, 20, 150, 25);
        passwordLabel.setBounds(100, 95, 200, 25);
        panel.add(labelLength);
        panel.add(passwordLabel);
        // panel.add(labelNum);

        /* Setup Textfields */
        pwlength.setBounds(120, 40, 80, 25);
        panel.add(pwlength);
        // panel.add(pwnum);

        /* Setup Buttons */
        generate.setBounds(120, 65, 80, 25);
        generate.addActionListener(this);
        panel.add(generate);

        frame.add(panel, BorderLayout.CENTER);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Password Generator");
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            passwordLength = Integer.parseInt(pwlength.getText());
            passwordLabel.setText(generatePasswords(passwordLength));
        }
        catch (NumberFormatException n) {
            passwordLabel.setText("Enter a length!");
        }
    }

    public String generatePasswords(int length) {
        java.util.Random r = new java.util.Random();
        String password = "";
        for (int i = 0; i < length; i++) {
            password += ((char) ('!' + r.nextInt(93)));
        }
        return password;
    }

    public static void main(String[] args) {
        new GenPanel();
    }
}
