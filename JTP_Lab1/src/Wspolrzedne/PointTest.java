package Wspolrzedne;

import junit.framework.TestCase;

public class PointTest extends TestCase {

    public void testGetX() {
        Point point = new Point(2, 2);
        assertEquals(2.0, point.getX());
    }

    public void testGetY() {
        Point point = new Point(2, 4);
        assertEquals(4.0, point.getY());
    }

    public void testMove() {
        Point point = new Point(2, 4);
        assertEquals(2.0, point.getX());
        assertEquals(4.0, point.getY());
        point.move(2, 2);
        assertEquals(4.0, point.getX());
        assertEquals(6.0, point.getY());
    }

    public void testFlip() {
        Point point = new Point(2, 4);
        assertEquals(2.0, point.getX());
        assertEquals(4.0, point.getY());
        point.flip();
        assertEquals(-2.0, point.getX());
        assertEquals(-4.0, point.getY());
    }
}