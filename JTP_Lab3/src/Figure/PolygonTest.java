package Figure;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PolygonTest {

    @Test
    void move() {
        Point[] points1 = new Point[4];
        points1[0] = new Point(0, 0);
        points1[1] = new Point(0, 2);
        points1[2] = new Point(2, 0);
        points1[3] = new Point(2, 2);
        Polygon polygon1 = new Polygon(points1);

        Point[] points2 = new Point[4];
        points2[0] = new Point(2, 2);
        points2[1] = new Point(2, 4);
        points2[2] = new Point(4, 2);
        points2[3] = new Point(4, 4);
        Polygon polygon2 = new Polygon(points2);

        polygon1.move(2, 2);
        assertEquals(polygon2, polygon1);
    }

    @Test
    void flip() {
        Point points1[] = new Point[4];
        points1[0] = new Point(0, 0);
        points1[1] = new Point(0, 2);
        points1[2] = new Point(2, 0);
        points1[3] = new Point(2, 2);
        Polygon polygon1 = new Polygon(points1);

        Point points2[] = new Point[4];
        points2[0] = new Point(0, 0);
        points2[1] = new Point(0, -2);
        points2[2] = new Point(-2, 0);
        points2[3] = new Point(-2, -2);
        Polygon polygon2 = new Polygon(points2);

        polygon1.flip();
        assertEquals(polygon2, polygon1);
    }

    @Test
    void equals1() {
        Point points1[] = new Point[4];
        points1[0] = new Point(0, 0);
        points1[1] = new Point(0, 2);
        points1[2] = new Point(2, 0);
        points1[3] = new Point(2, 2);
        Polygon polygon1 = new Polygon(points1);

        Point points2[] = new Point[4];
        points2[0] = new Point(0, 0);
        points2[1] = new Point(0, 2);
        points2[2] = new Point(2, 0);
        points2[3] = new Point(2, 2);
        Polygon polygon2 = new Polygon(points2);

        assertNotEquals(polygon1.hashCode(), polygon2.hashCode());
        assertEquals(polygon1, polygon2);
    }

    @Test
    void clone1() {
        Point points1[] = new Point[4];
        points1[0] = new Point(0, 0);
        points1[1] = new Point(0, 2);
        points1[2] = new Point(2, 0);
        points1[3] = new Point(2, 2);
        Polygon polygon1 = new Polygon(points1);

        assertNotEquals(polygon1.hashCode(), polygon1.clone().hashCode());
        assertEquals(polygon1, polygon1.clone());
    }
}