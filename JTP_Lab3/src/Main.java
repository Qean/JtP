import Figure.Figure;
import Figure.Group;
import Figure.Point;
import Figure.Polygon;

public class Main {

    public static void main(String[] args) {
        Point point1 = new Point(2, 0);
        Point point2 = new Point(3, 1);
        Point point3 = new Point(4, 2);
        Point[] pointArray = {point1, point2, point3};
        Polygon figure = new Polygon(pointArray);
        pointArray[2] = new Point(0, 7);
        Polygon figure2 = new Polygon(pointArray);
        Figure[] figArray = new Figure[2];
        figArray[0] = figure;
        figArray[1] = figure2;
        Figure group = new Group(figArray);
        System.out.println(group.toString());
        group.flip();
        System.out.println(group.toString());

    }
}
