package Figure;

import static org.junit.jupiter.api.Assertions.*;

class PointTest {

    @org.junit.jupiter.api.Test
    void setX() {
        Point point = new Point(2, 0);

        assertEquals(2, point.x);

        point.setX(4);

        assertEquals(4, point.x);
    }

    @org.junit.jupiter.api.Test
    void setY() {
        Point point = new Point(2, 0);

        assertEquals(0, point.y);

        point.setY(4);

        assertEquals(4, point.y);
    }

    @org.junit.jupiter.api.Test
    void getX() {
        Point point = new Point(2, 0);

        assertEquals(2, point.getX());
    }

    @org.junit.jupiter.api.Test
    void getY() {
        Point point = new Point(2, 0);

        assertEquals(0, point.getY());
    }

    @org.junit.jupiter.api.Test
    void move() {
        Point point = new Point(2, 0);
        point.move(2, 2);

        assertEquals(4, point.x);
        assertEquals(2, point.y);
    }

    @org.junit.jupiter.api.Test
    void flip() {
        Point point = new Point(2, 0);
        point.flip();

        assertEquals(-2, point.x);
        assertEquals(0, point.y);
    }

    @org.junit.jupiter.api.Test
    void equals1() {
        Point point = new Point(2, 0);
        Point point2 = new Point(2, 0);

        assertNotEquals(point.hashCode(), point2.hashCode());
        assertEquals(point, point2);
    }

    @org.junit.jupiter.api.Test
    void clone1() {
        Point point = new Point(2, 0);

        assertNotEquals(point.hashCode(), point.clone().hashCode());
        assertEquals(point, point.clone());
    }
}