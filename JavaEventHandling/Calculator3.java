
// in this class, we are gonna implement a annonymous inner class that implements the Action listener interface. It's a pretty interesting kind of class. Cuz it doesn't have a header, just a body. 
import java.awt.*;
import javax.swing.*;

public class Calculator3 extends JFrame {

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
    public Calculator3() {
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
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new Calculator3();
        }
}
