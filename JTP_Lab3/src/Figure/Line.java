package Figure;

public class Line implements Figure {
    Point start;
    Point end;

    public Line(Point point1, Point point2) {
        Point start = new Point(0.0, 0.0);
        Point end = new Point(0.0, 0.0);
        this.start = start;
        this.end = end;

        this.start.x = point1.getX();
        this.start.y = point1.getY();

        this.end.x = point2.getX();
        this.end.y = point2.getY();
    }

    public void setStart(Point point) {
        this.start = point;
    }

    public void setEnd(Point point) {
        this.end = point;
    }

    public Point getStart() {
        return this.start;
    }

    public Point getEnd() {
        return this.end;
    }

    @Override
    public void move(double x, double y) {
        this.start.x += x;
        this.start.y += y;

        this.end.x += x;
        this.end.y += y;
    }

    @Override
    public void flip() {
        this.start.x = -this.start.x;
        this.start.y = -this.start.y;

        this.end.x = -this.end.x;
        this.end.y = -this.end.y;

    }

    @Override
    public String toString() {
        return "Poczatek lini: " + this.start.toString() + "\n" + "Koniec lini: " + this.end.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Line) {
            return this.end.equals(((Line) o).end) && this.start.equals(((Line) o).start);
        }
        return super.equals(o);
    }

    @Override
    public Line clone() {
        Point start = new Point(this.start.x, this.start.y);
        Point end = new Point(this.end.x, this.end.y);
        return new Line(start, end);
    }
}
