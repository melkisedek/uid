package uid;

import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class LabelDemo {
    public static void main(String[] args){
        //Create a label with plain text
        JLabel northLabel = new JLabel("north");
        //Create an icon from an image so we can put it on a JLabel
        ImageIcon labelIcon = new ImageIcon("img/GUItip.gif");
        //Create a label with an icon istead of text
        JLabel centerLabel = new JLabel(labelIcon);
        //create another label with an icon
        JLabel southLabel = new JLabel(labelIcon);
        //set the label to display text (as well as an icon)
        southLabel.setText("South");
        
        //create a frame to hold the labels
        JFrame application = new JFrame();
        
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //add the label to the frame; the second argument specifies
        //where on the frame to add the label
        application.add(northLabel, BorderLayout.NORTH);
        application.add(centerLabel, BorderLayout.CENTER);
        application.add(southLabel, BorderLayout.SOUTH);
        
        application.setSize(300, 300);//set the size of the frame
        application.setVisible(true);//show the frame
    }
}
