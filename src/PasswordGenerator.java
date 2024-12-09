import javax.swing.*;
import java.awt.*;

public class PasswordGenerator extends JFrame {
    public PasswordGenerator(){
        // render frame and ad a title
        super("Password Generator");

        // set the size of the GUI
        setSize(540, 570);

        // prevent GUI from being able to resized
        setResizable(false);

        // we will set the layout to be null to have control over the postiion and size of our components in our app
        setLayout(null);

        // terminate the program when the GUI is closed (ends the process)
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // center the GUI to the screen
        setLocationRelativeTo(null);

        // render GUI components
        addGuiComponents();
    }

    private void addGuiComponents(){
        // create title text
        JLabel titleLabel = new JLabel("Password Generator");

        // increase the font size and make it bold
        titleLabel.setFont(new Font("Dialog", Font.BOLD, 32));

        // center the text to the screen
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);

        // set x,y coordinates and width/height values
        titleLabel.setBounds(0, 10, 540, 39);

        // add to GUI
        add(titleLabel);

        // create result text area
        JTextArea passwordOutput = new JTextArea();

        // prevent editing the text area
        passwordOutput.setEditable(false);
        passwordOutput.setFont(new Font("Dialog", Font.BOLD, 32));

        // add scrollability in case output becomes too big
        JScrollPane passwordOutputPane = new JScrollPane(passwordOutput);
        passwordOutputPane.setBounds(25, 97, 479, 70);

        // create a black border around the text area
        passwordOutputPane.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        add(passwordOutputPane);

        // create password length label
        JLabel passwordLengthLabel = new JLabel("Password Length: ");
        passwordLengthLabel.setFont(new Font("Dialog", Font.PLAIN, 30));
        passwordLengthLabel.setBounds(25, 215, 272, 39);
        add(passwordLengthLabel);

    }
}
