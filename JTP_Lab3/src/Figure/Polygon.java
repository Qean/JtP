package Figure;

public class Polygon implements Figure {
    Point[] points;

    public Polygon(Point[] point) {
        int i = 0;
        this.points = new Point[point.length];
        for (Point p: point) {
            points[i] = new Point(p.getX(), p.getY());
            i++;
        }
    }

    @Override
    public void move(double dx, double dy) {
        for (Point point : this.points) {
            point.move(dx, dy);
        }
    }

    @Override
    public void flip() {
        for (Point point : this.points) {
            point.flip();
        }
    }

    @Override
    public String toString() {
        int i = 1;
        String string = "Figura ma nastepujace punkty:";
        for (Point point : this.points) {
            string += "\n" + i + ". " + point.toString();
            i++;
        }
        return string;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Polygon){
            return this.toString().equals(o.toString());
        }
        return super.equals(o);
    }
}
