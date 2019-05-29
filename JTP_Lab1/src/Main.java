import Wspolrzedne.Line;
import Wspolrzedne.Point;

public class Main {

    public static void main(String[] args) {
        Point point1 = new Point(2.0, 3.0);
        Point point2 = new Point(4.0, 1.0);
        Line line = new Line(point1, point2);

        System.out.println("Poczatkowe wartosci");
        System.out.println(point1.toString());
        System.out.println(point2.toString());
        System.out.println(line.toString());

        System.out.println("Po przesunieciu");

        point1.move(1.0, 2.0);
        System.out.println(point1.toString());
        point2.move(2.0, 2.0);
        System.out.println(point2.toString());
        line.move(point1.getX(), point1.getY());
        System.out.println(line.toString());

        System.out.println("Po odbiciu wzgledem poczatku");

        point1.flip();
        System.out.println(point1.toString());
        point2.flip();
        System.out.println(point2.toString());
        line.flip();
        System.out.println(line.toString());

    }
}