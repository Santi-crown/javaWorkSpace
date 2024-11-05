//import java.Toolkit.*;
import java.awt.*;
import javax.swing.*;
public class FrameTest3{
    public static void main(String[] args){
        JFrame frame = new JFrame("What's up");
        frame.setSize(200,200);

        // Technique for centering a frame on the screen
        Dimension frameSize = frame.getSize();
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        frame.setLocation((screenSize.width/2 - frameSize.width/2),(screenSize.height/2 - frameSize.height/2));


        // Let's adda component
        Container contentPane = frame.getContentPane();
        // second argument - centers the label
        JLabel stuff = new JLabel("text", JLabel.CENTER);
        // We use the north space in layout
        contentPane.add(stuff, BorderLayout.NORTH);

        frame.setVisible(true);
    }

}