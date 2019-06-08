import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
public class MouseSpy extends JApplet implements MouseListener {
    Pionek pionek;
    Point location;
    Szachownica_8x8 plansza;

    public MouseSpy(Szachownica_8x8 plansza){
        this.plansza = plansza;
        pionek = plansza.pionek;
    }

    public boolean checkBounds(int x, int y, Pionek pionek){
        boolean check_x, check_y;
        check_x = x <= pionek.getCenter()[0] + pionek.width / 2 && x >= pionek.getCenter()[0] - pionek.width / 2;
        check_y = y <= pionek.getCenter()[1] + pionek.width / 2 && y >= pionek.getCenter()[1] - pionek.width / 2;
        return check_x && check_y;
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    public void mousePressed(MouseEvent event) {
        location = event.getPoint();
    }

    public void mouseReleased(MouseEvent event) {
        System.out.println("Mouse released. x = "
                + event.getX() + " y =" + event.getY());
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}