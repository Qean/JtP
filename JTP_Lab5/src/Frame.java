import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {
    public Frame() {
        JFrame jf = new JFrame("Demo");
        Container cp = jf.getContentPane();
        jf.setSize(800, 800);
        jf.setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Szachownica_8x8 t1 = new Szachownica_8x8();
        //Pionek t2 = new Pionek();
        cp.add(t1);
        //cp.add(t2);
    }
}
