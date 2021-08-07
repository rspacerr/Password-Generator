import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GenPanel implements ActionListener {
    private JFrame frame;
    private JPanel panel;
    private JLabel labelLength;
    private JLabel labelNum;
    private JTextField pwlength;
    private JTextField pwnum;
    private JButton updateLength;

    public GenPanel() {
        frame = new JFrame();
        panel = new JPanel();
        labelLength = new JLabel("Password length:");
        labelNum = new JLabel("Number of passwords:");
        pwlength = new JTextField();
        pwnum = new JTextField();
        updateLength = new JButton("Update");

        /* Setup labels */
        panel.setLayout(null);
        labelLength.setBounds(110, 20, 150, 25);
        panel.add(labelLength);
        panel.add(labelNum);

        /* Setup Textfields */
        pwlength.setBounds(120, 40, 80, 25);
        panel.add(pwlength);
        panel.add(pwnum);

        /* Setup Buttons */
        updateLength.setBounds(120, 65, 80, 25);
        panel.add(updateLength);

        frame.add(panel, BorderLayout.CENTER);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Password Generator");
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO: implement save text
    }

    public static void main(String[] args) {
        new GenPanel();
    }
}
