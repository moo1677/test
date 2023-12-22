import javax.swing.*;
import java.awt.*;

public class Titles extends JFrame {
    //private Image nail;
    private Image screenImage;
    private Graphics screenGraphic;
    private Image introBackground;
    public Titles(){
    //    nail = new ImageIcon(Main.class.getResource("../IMG/nail_259646.png")).getImage();
     //   introBackground = new ImageIcon(Main.class.getResource("../IMG/hammer_769743.png")).getImage();
    }
    public void paint(Graphics s){
        screenImage = createImage(1280,750);
        screenGraphic = screenImage.getGraphics();
        screenDraw(screenGraphic);
        s.drawImage(screenImage,0,0,null);
    }
    public void screenDraw(Graphics g){
        g.drawImage(introBackground,0,0,null);
        this.repaint();
    }
}
