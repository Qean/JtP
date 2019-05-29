package Figure;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LineTest {

    @Test
    void setStart() {
        Point point1 = new Point(2, 2);
        Point point2 = new Point(4, 4);
        Line line = new Line(point1, point2);
        assertEquals(line.start, point1);
        assertEquals(line.end, point2);
        line.setStart(point2);
        assertEquals(line.start, line.end);
    }

    @Test
    void setEnd() {
        Point point1 = new Point(2, 2);
        Point point2 = new Point(4, 4);
        Line line = new Line(point1, point2);
        assertEquals(line.start, point1);
        assertEquals(line.end, point2);
        line.setEnd(point1);
        assertEquals(line.start, line.end);
    }

    @Test
    void getStart() {
        Point point1 = new Point(2, 2);
        Point point2 = new Point(4, 4);
        Line line = new Line(point1, point2);
        assertEquals(point1, line.getStart());
    }

    @Test
    void getEnd() {
        Point point1 = new Point(2, 2);
        Point point2 = new Point(4, 4);
        Line line = new Line(point1, point2);
        assertEquals(point2, line.getEnd());
    }

    @Test
    void move() {
        Point point1 = new Point(2, 2);
        Point point2 = new Point(4, 4);
        Line line = new Line(point1, point2);
        line.move(2, 2);
        assertEquals(4, line.getStart().getX());
        assertEquals(4, line.getStart().getY());
        assertEquals(6, line.getEnd().getX());
        assertEquals(6, line.getEnd().getY());
    }

    @Test
    void flip() {
        Point point1 = new Point(2, 2);
        Point point2 = new Point(4, 4);
        Line line = new Line(point1, point2);
        line.flip();
        assertEquals(-2, line.getStart().getX());
        assertEquals(-2, line.getStart().getY());
        assertEquals(-4, line.getEnd().getX());
        assertEquals(-4, line.getEnd().getY());
    }

    @Test
    void equals1() {
        Point point1 = new Point(2, 2);
        Point point2 = new Point(4, 4);
        Line line1 = new Line(point1, point2);

        Point p1 = new Point(2, 2);
        Point p2 = new Point(4, 4);
        Line line2 = new Line(p1, p2);

        assertNotEquals(line1.hashCode(), line2.hashCode());
        assertEquals(line1, line2);
    }

    @Test
    void clone1() {
        Point point1 = new Point(2, 2);
        Point point2 = new Point(4, 4);
        Line line = new Line(point1, point2);

        assertNotEquals(line.hashCode(), line.clone().hashCode());
        assertEquals(line, line.clone());
    }
}