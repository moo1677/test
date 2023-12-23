import javax.swing.*;
import java.awt.*;

public class Titles extends JPanel {
    ImageIcon hammer = new ImageIcon("src/IMG/hammer_769743.png");
    ImageIcon nail = new ImageIcon("src/IMG/nail_259646.png");
    //private Image nail;
    public Titles(JFrame f){
        f.getContentPane().setLayout(null);
        //put_btt(f);
        imglood(f);
    }
    public void put_btt(JFrame f){
        JButton startb = new JButton("Start!");
        startb.setBounds(10,10,50,50);
        f.add(startb);
    }
    public void imglood(JFrame f){
        JLabel HAmmer = IMGBounds(hammer,135,175,535,575);
        JLabel NAil = IMGBounds(nail,790,175,1190,575);
        f.add(HAmmer);
        f.add(NAil);
    }
    public JLabel IMGBounds(ImageIcon img, int fx, int fy,int lx, int ly ){
        /*이미지 크기 변환*/
        Image IMG = img.getImage();
        Image changeImg = IMG.getScaledInstance(lx-fx,ly-fy,Image.SCALE_SMOOTH);
        ImageIcon changeIcon = new ImageIcon(changeImg);
        /*이미지 아이콘 라벨링*/
        JLabel imglabel = new JLabel();
        imglabel.setBounds(fx, fy, lx, ly);
        imglabel.setIcon(changeIcon);
        return imglabel;
    }
}
