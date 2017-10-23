package uid;

import javax.swing.JFrame;
import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

    public static void verbose() {
        Path currentRelativePath = Paths.get("");
        String s = currentRelativePath.toAbsolutePath().toString();
        System.out.println("Current relative path is: " + s);
    }

    public static void main(String[] args) {
        if (args.length>0 && args[0].equals("-v")) {
            verbose();
        }
        DrawSmiley panel = new DrawSmiley();
        JFrame application = new JFrame();

        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(panel);
        application.setSize(230, 250);
        application.setVisible(true);
    }
}