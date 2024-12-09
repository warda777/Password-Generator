import javax.swing.*;

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

        // senter the GUI to the screen
        setLocationRelativeTo(null);
    }
}
