import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.*;

public class FrameTest2 {
    public static void main(String[] args){
        JFrame frame = new JFrame("My frame");
        frame.setSize(200,200);        

        Dimension frameSize = frame.getSize();

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        frame.setLocation((screenSize.width/2 - frameSize.width/2),(screenSize.height/2 - frameSize.height/2));

        frame.setVisible(true);
        
        
    }
}
