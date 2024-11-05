import java.awt.*;
import javax.swing.*;

public class FrameTest2 {
    public static void main(String[] args){
        JFrame frame = new JFrame("My frame");
        frame.setSize(200,200);        

        Dimension frameSize = frame.getSize();

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        frame.setLocation((screenSize.width/2 - frameSize.width/2),(screenSize.height/2 - frameSize.height/2));
                
         // Let's create and add a component. In modern java, we can ommit the container
         Container contentPane = frame.getContentPane();
         JLabel stuff = new JLabel("I'm a label");
         contentPane.add(stuff);

         frame.setVisible(true);
    }
}
