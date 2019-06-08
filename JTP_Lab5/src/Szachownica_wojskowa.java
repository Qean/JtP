import javax.swing.*;
import java.awt.*;

public class Szachownica_wojskowa extends JComponent {
    @Override
    protected void paintComponent(Graphics g) {
        if (g instanceof Graphics2D) {
            Graphics2D g2 = (Graphics2D) g;
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g.setColor(Color.white);
            g2.fillRect(0,0,60,60);
            g.setColor(Color.red);
            g2.fillRect(60,0,60,60);
            g.setColor(Color.red);
            g2.fillRect(0,60,60,60);
            g.setColor(Color.white);
            g2.fillRect(60,60,60,60);
            g.setColor(Color.black);
            g2.drawString("Polska", 40,130);
        }
        super.paintComponent(g);
    }

}
