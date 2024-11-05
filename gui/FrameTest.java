import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.*;

public class FrameTest {
    public static void main(String[] args){
        JFrame theFrame = new JFrame("Whee!!");
        theFrame.setSize(200,200);
        theFrame.setVisible(true);
        theFrame.setLocation(400,400);

        // Technique for centering a frame on the screeen
        // First, obtain the size of the frame to be centered. Invoking
        // the getSize method on a Component returns a Dimension

        Dimension frameSize = theFrame.getSize();

        // Now, invoke the static getDefaultToolkit method on the
        // Toolkit class to obtain a handle on the AWT Toolkit object
        // for this platform, and then invoke its getScreenSize()
        // method to obtain a second Dimension object.

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        // Compute the center point of the screen as (centerX, centerY).
        int centerX = screenSize.width/2;
        int centerY = screenSize.height/2;

        // We want half of the frame to be to the left of center,
        // and half to be above center.
        int halfWidth = frameSize.width/2;
        int halfHeight = frameSize.height/2;
        theFrame.setLocation(centerX - halfWidth, centerY - halfHeight);

        theFrame.setVisible(true);


    }
}