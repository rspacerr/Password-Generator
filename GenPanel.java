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
    private JButton updateNum;

    public GenPanel() {
        frame = new JFrame();
        panel = new JPanel();
        labelLength = new JLabel("Password length:");
        labelNum = new JLabel("Number of passwords:");
        pwlength = new JTextField();
        pwnum = new JTextField();
        updateLength = new JButton("Update");
        updateNum = new JButton("Update");

        /* Setup labels */
        panel.setLayout(null);
        labelLength.setBounds(50, 20, 150, 25);
        labelNum.setBounds(350, 20, 150, 25);
        panel.add(labelLength);
        panel.add(labelNum);

        /* Setup Textfields */
        pwlength.setBounds(65, 40, 80, 25);
        pwnum.setBounds(385, 40, 80, 25);
        panel.add(pwlength);
        panel.add(pwnum);

        /* Setup Buttons */
        updateLength.setBounds(65, 65, 80, 25);
        updateNum.setBounds(385, 65, 80, 25);
        updateLength.addActionListener(new GenPanel());
        updateLength.addActionListener(new GenPanel());
        panel.add(updateLength);
        panel.add(updateNum);

        frame.add(panel, BorderLayout.CENTER);
        frame.setSize(550, 400);
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
