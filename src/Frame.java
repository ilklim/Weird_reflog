import javax.swing.*;

/**
 * Created by Iosif on 14.06.2014.
 */
public class Frame extends JFrame{
    public Frame() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);
        add(new Panel());

    }
}
