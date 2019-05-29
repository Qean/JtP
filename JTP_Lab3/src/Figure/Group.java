package Figure;

public class Group implements Figure{
    Figure[] figures;

    public Group(Figure[] figureArray) {
        int i = 0;
        this.figures = new Figure[figureArray.length];
        for (Figure figure: figureArray) {
            if (figure instanceof Point)
                this.figures[i] = new Point(((Point) figure).getX(), ((Point) figure).getY());
            else if (figure instanceof Line)
                this.figures[i] = new Line(((Line) figure).getStart(), ((Line) figure).getEnd());
            else if (figure instanceof Polygon)
                this.figures[i] = new Polygon(((Polygon) figure).points);
            i++;
        }
    }

    @Override
    public void move(double dx, double dy) {
        for (Figure figure: this.figures) {
            figure.move(dx, dy);
        }
    }

    @Override
    public void flip() {
        for (Figure figure: this.figures) {
            figure.flip();
        }
    }

    @Override
    public String toString() {
        int i = 1;
        String group = "W grupie sa nastepujace figury:";
        for (Figure figure: this.figures) {
            group += "\n" + i + " Element\n" + figure.toString();
            i++;
        }
        return group;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
