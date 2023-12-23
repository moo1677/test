import javax.swing.*;
import java.awt.*;

public class Titles extends JPanel {
    //private Image nail;
    public Titles(JFrame f){
        put_btt(f);
    }
    public void put_btt(JFrame f){
        JButton startb = new JButton("Start!");
        f.add(startb);
    }

}
