package Wspolrzedne;

import junit.framework.TestCase;

public class LineTest extends TestCase {

    public void testSetStart() {
        Point point1 = new Point(2, 2);
        Point point2 = new Point(4.5, 4.5);
        Line line = new Line(point1, point2);
        assertEquals(point1.toString(), line.start.toString());
        line.setStart(point2);
        assertEquals(point2.toString(), line.start.toString());
    }

    public void testSetEnd() {
        Point point1 = new Point(2, 2);
        Point point2 = new Point(4.5, 4.5);
        Line line = new Line(point1, point2);
        assertEquals(point2.toString(), line.end.toString());
        line.setEnd(point1);
        assertEquals(point1.toString(), line.end.toString());
    }

    public void testGetStart() {
        Point point1 = new Point(2, 2);
        Point point2 = new Point(4.5, 4.5);
        Line line = new Line(point1, point2);
        assertEquals(point1.toString(), line.getStart().toString());
    }

    public void testGetEnd() {
        Point point1 = new Point(2, 2);
        Point point2 = new Point(4.5, 4.5);
        Line line = new Line(point1, point2);
        assertEquals(point2.getX(), line.getEnd().getX());
        assertEquals(point2.getY(), line.getEnd().getY());
    }

    public void testMove() {
        Point point1 = new Point(2, 2);
        Point point2 = new Point(4.5, 4.5);
        Point point3 = new Point(4, 4);
        Point point4 = new Point(6.5, 6.5);
        Line line = new Line(point1, point2);
        line.move(2.0, 2.0);
        assertEquals(point3.toString(), line.start.toString());
        assertEquals(point4.toString(), line.end.toString());
    }

    public void testFlip() {
        Point point1 = new Point(2, 2);
        Point point2 = new Point(4.5, 4.5);
        Point point3 = new Point(-2, -2);
        Point point4 = new Point(-4.5, -4.5);
        Line line1 = new Line(point1, point2);
        Line line2 = new Line(point3, point4);
        line1.flip();
        assertEquals(line1.toString(), line2.toString());
    }
}