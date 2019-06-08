import javax.swing.*;
import java.awt.*;

public class Pionek extends JComponent {
    int x, y, width = 30, height = 30;
    double[] center = {0,0};

    public Pionek(int x, int y) {
        this.x = x;
        this.y = y;
        center[0] = x + width * Math.sqrt(2);
        center[1] = y + width * Math.sqrt(2);
    }

    public double[] getCenter() {
        return center;
    }

    @Override
    public int getX() {
        return x;
    }

    @Override
    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    protected void paintComponent(Graphics g) {
        if (g instanceof Graphics2D) {
            Graphics2D g2 = (Graphics2D) g;
            g.setColor(Color.gray);
            g2.fillOval(x, y, width, height);
        }
    }
}
