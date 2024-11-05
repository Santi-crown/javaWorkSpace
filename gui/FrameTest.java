import javax.swing.*;

public class FrameTest {
    public static void main(String[] args){
        JFrame theFrame = new JFrame("Whee!!");
        theFrame.setSize(200,200);
        theFrame.setVisible(true);

        JButton button = new JButton("Press me");
        button.setSize(100, 100);

        theFrame.add(button);

    }
}