package Figure;

public class Point implements Figure {
    double x, y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    @Override
    public void move(double x, double y) {
        this.x += x;
        this.y += y;
    }

    @Override
    public void flip() {
        if (this.x != 0)
            this.x = -this.x;
        if (this.y != 0)
            this.y = -this.y;
    }

    @Override
    public String toString() {
        return "Punkt: x = " + this.x + ", y = " + this.y;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Point) {
            return this.x == ((Point) o).x && this.y == ((Point) o).y;
        } else
            return super.equals(o);
    }
}