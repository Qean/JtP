import javax.swing.*;
import java.awt.*;

public class Szachownica_8x8 extends JComponent {
    Pionek pionek = new Pionek(0,0);
    public Szachownica_8x8() {
        addMouseListener(new MouseSpy(this));
    }

    public Pionek getPionek() {
        return pionek;
    }

    @Override
    protected void paintComponent(Graphics g) {
        if (g instanceof Graphics2D) {
            int x=50, y=50, i, j;
            Integer str_left = 1;
            Character[] char_up = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H'};
            Color last_color;
            Graphics2D g2 = (Graphics2D) g;
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2.drawRect(50, 50, 600, 600);
            pionek.paintComponent(g);
            for (i = 0; i < 8; i++) {
                for (j = 7; j >= 0; j--) {
                    if (g.getColor() == Color.white)
                        g.setColor(Color.black);
                    else
                        g.setColor(Color.white);
                    last_color = g.getColor();
                    if(y == 50) {
                        g.setColor(Color.black);
                        if (x == 50)
                            g2.drawString(char_up[j].toString(), 50 + 35, 45);
                        else
                            g2.drawString(char_up[j].toString(), x + 35, 45);
                        g.setColor(last_color);
                    }
                    g2.fillRect(x,y,75,75);
                    x += 75;
                }
                if (g.getColor() == Color.white)
                    g.setColor(Color.black);
                else
                    g.setColor(Color.white);
                last_color = g.getColor();
                g.setColor(Color.black);
                if (y == 0)
                    g2.drawString(str_left.toString(), 35,75+45);
                else
                    g2.drawString(str_left.toString(), 35,y+45);
                g.setColor(last_color);
                str_left++;
                x = 50;
                y += 75;
            }
        }
        super.paintComponent(g);
    }

}