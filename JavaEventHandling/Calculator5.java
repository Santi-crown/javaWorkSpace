// in this class, we are gonna implement a annonymous inner class that implements the Action listener interface. It's a pretty interesting kind of class. Cuz it doesn't have a header, just a body. 
import java.awt.*;
import java.awt.event.*;
import javax.swing.*; // added for event handling

public class Calculator5 extends JFrame {

    // Components are treated as attributes, so that they will be
    // visible to all of the methods of the class.
    private Container contentPane;
    // Use descriptive names for components where possible; it makes
    // your job easier later on!
    private JPanel leftPanel;
    private JPanel centerPanel;
    private JPanel buttonPanel;
    private JTextField input1TextField;

    private JTextField input2TextField;
    private JLabel answerLabel;
    private JButton plusButton;
    private JButton minusButton;

    // Constructor.
    public Calculator5() {
        // Invoke the generic JFrame constructor.
        super("Simple Calculator");
        // The content pane container is now declared to be an
        // attribute.
        contentPane = this.getContentPane();
        this.setSize(250, 100);

        // Technique for centering a frame on the screen
        Dimension frameSize = this.getSize();
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        this.setLocation((screenSize.width / 2 - frameSize.width / 2), (screenSize.height / 2 - frameSize.height / 2));

        leftPanel = new JPanel();
        leftPanel.setLayout(new GridLayout(3, 1));
        leftPanel.add(new JLabel("Input 1:  "));
        leftPanel.add(new JLabel("Input 2:  "));
        leftPanel.add(new JLabel("Answer:  "));
        contentPane.add(leftPanel, BorderLayout.WEST);
        centerPanel = new JPanel();
        centerPanel.setLayout(new GridLayout(3, 1));
        input1TextField = new JTextField(10);
        input2TextField = new JTextField(10);
        answerLabel = new JLabel();
        centerPanel.add(input1TextField);
        centerPanel.add(input2TextField);
        centerPanel.add(answerLabel);
        contentPane.add(centerPanel, BorderLayout.CENTER);
        buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(2, 1));
        plusButton = new JButton("+");
        minusButton = new JButton("-");
        buttonPanel.add(plusButton);
        buttonPanel.add(minusButton);
        contentPane.add(buttonPanel, BorderLayout.EAST);    

        // Add behaviors! Note the use of anonymous inner classes.
        // First, we create a listener object to respond to
        // the "plus" button ...
        ActionListener l = new ActionListener() {
            public void actionPerformed(ActionEvent e){
                double d1 = Double.parseDouble(input1TextField.getText());
                double d2 = Double.parseDouble(input2TextField.getText());
                
                // listener object to listen to BOTH buttons.
                if (e.getSource() == plusButton){
                    // Add the values
                    answerLabel.setText("" + (d1 + d2));
                } else{
                    // Subtrac the value
                    answerLabel.setText("" + (d1 - d2));
                }                 
            }
        };

        // ... and then we register both listener with the 
        // component.
        plusButton.addActionListener(l);         
        minusButton.addActionListener(l);

        // We want to use a WindowListener to terminate the application when the user closes the 
        //window; we’ll create the listener as an instance of an anonymous inner class:
        WindowListener w = new WindowListener() {
            public void windowClosing(WindowEvent e){
                // Note the need to preface "this." with
                // the name of the outer class.
                Calculator5.this.dispose();  // See notes after the code
                System.exit(0);
            }
            // TheWindowListener interface calls for seven methods to be programmed; we don’t want to
            //do anything in particular when any of the other six situations arise, and yet we must program
            //all seven methods in order for our code to compile, so we “stub out” the other six:
            public void windowOpened(WindowEvent e) { }
            public void windowClosed(WindowEvent e) { }
            public void windowIconified(WindowEvent e) { }
            public void windowDeiconified(WindowEvent e) { }
            public void windowActivated(WindowEvent e) { }
            public void windowDeactivated(WindowEvent e) { }
        };

        this.addWindowListener(w);
        // We set the frame to be visible AFTER registering the listeners
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new Calculator5();
        }
}
