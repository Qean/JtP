package Figure;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GroupTest {

    @Test
    void move() {
        Point point = new Point(2, 0);
        Point point1 = new Point(2, 2);
        Point point2 = new Point(4, 4);
        Line line1 = new Line(point1, point2);
        Point[] points1 = new Point[4];
        points1[0] = new Point(0, 0);
        points1[1] = new Point(0, 2);
        points1[2] = new Point(2, 0);
        points1[3] = new Point(2, 2);
        Polygon polygon1 = new Polygon(points1);
        Figure[] figures1 = new Figure[3];
        figures1[0] = point;
        figures1[1] = line1;
        figures1[2] = polygon1;
        Group group1 = new Group(figures1);

        Point p = new Point(4, 2);
        Point p1 = new Point(4, 4);
        Point p2 = new Point(6, 6);
        Line line2 = new Line(p1, p2);
        Point[] points2 = new Point[4];
        points2[0] = new Point(2, 2);
        points2[1] = new Point(2, 4);
        points2[2] = new Point(4, 2);
        points2[3] = new Point(4, 4);
        Polygon polygon2 = new Polygon(points2);
        Figure[] figures2 = new Figure[3];
        figures2[0] = p;
        figures2[1] = line2;
        figures2[2] = polygon2;
        Group group2 = new Group(figures2);

        group1.move(2,2);
        assertEquals(group1, group2);
    }

    @Test
    void flip() {
        Point point = new Point(2, 0);
        Point point1 = new Point(2, 2);
        Point point2 = new Point(4, 4);
        Line line1 = new Line(point1, point2);
        Point[] points1 = new Point[4];
        points1[0] = new Point(0, 0);
        points1[1] = new Point(0, 2);
        points1[2] = new Point(2, 0);
        points1[3] = new Point(2, 2);
        Polygon polygon1 = new Polygon(points1);
        Figure[] figures1 = new Figure[3];
        figures1[0] = point;
        figures1[1] = line1;
        figures1[2] = polygon1;
        Group group1 = new Group(figures1);

        Point p = new Point(-2, 0);
        Point p1 = new Point(-2, -2);
        Point p2 = new Point(-4, -4);
        Line line2 = new Line(p1, p2);
        Point[] points2 = new Point[4];
        points2[0] = new Point(0, 0);
        points2[1] = new Point(0, -2);
        points2[2] = new Point(-2, 0);
        points2[3] = new Point(-2, -2);
        Polygon polygon2 = new Polygon(points2);
        Figure[] figures2 = new Figure[3];
        figures2[0] = p;
        figures2[1] = line2;
        figures2[2] = polygon2;
        Group group2 = new Group(figures2);

        group1.flip();
        assertEquals(group1, group2);
    }

    @Test
    void equals1() {
        Point point = new Point(2, 0);
        Point point1 = new Point(2, 2);
        Point point2 = new Point(4, 4);
        Line line1 = new Line(point1, point2);
        Point[] points1 = new Point[4];
        points1[0] = new Point(0, 0);
        points1[1] = new Point(0, 2);
        points1[2] = new Point(2, 0);
        points1[3] = new Point(2, 2);
        Polygon polygon1 = new Polygon(points1);
        Figure[] figures1 = new Figure[3];
        figures1[0] = point;
        figures1[1] = line1;
        figures1[2] = polygon1;
        Group group1 = new Group(figures1);

        Point p = new Point(2, 0);
        Point p1 = new Point(2, 2);
        Point p2 = new Point(4, 4);
        Line line2 = new Line(p1, p2);
        Point[] points2 = new Point[4];
        points2[0] = new Point(0, 0);
        points2[1] = new Point(0, 2);
        points2[2] = new Point(2, 0);
        points2[3] = new Point(2, 2);
        Polygon polygon2 = new Polygon(points2);
        Figure[] figures2 = new Figure[3];
        figures2[0] = p;
        figures2[1] = line2;
        figures2[2] = polygon2;
        Group group2 = new Group(figures2);

        assertNotEquals(group1.hashCode(), group2.hashCode());
        assertEquals(group1, group2);
    }

    @Test
    void clone1() {
        Point point = new Point(2, 0);
        Point point1 = new Point(2, 2);
        Point point2 = new Point(4, 4);
        Line line1 = new Line(point1, point2);
        Point[] points1 = new Point[4];
        points1[0] = new Point(0, 0);
        points1[1] = new Point(0, 2);
        points1[2] = new Point(2, 0);
        points1[3] = new Point(2, 2);
        Polygon polygon1 = new Polygon(points1);
        Figure[] figures1 = new Figure[3];
        figures1[0] = point;
        figures1[1] = line1;
        figures1[2] = polygon1;
        Group group1 = new Group(figures1);

        assertNotEquals(group1.hashCode(), group1.clone().hashCode());
        assertEquals(group1, group1.clone());
    }
}