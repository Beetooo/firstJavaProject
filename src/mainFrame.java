import javax.swing.JFrame;
import javax.swing.WindowConstants;

//public class mainFrame
public class mainFrame extends JFrame{
    public void init(){
        setTitle("Pop up window!");
        setSize(600, 300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }
}

