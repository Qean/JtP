package Figure;

public class Group implements Figure{
    Figure[] figures;

    public Group(Figure[] figureArray) {
        int i = 0;
        this.figures = new Figure[figureArray.length];
        for (Figure figure: figureArray) {
            this.figures[i] = figure.clone();
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
    public boolean equals(Object o) {
        boolean test;
        if (o instanceof  Group){
            for (int i = 0; i < this.figures.length; i++) {
                test = ((Group) o).figures[i].equals(this.figures[i]);
                if (!test)
                    return false;
            }
            return true;
        }
        return super.equals(o);
    }

    @Override
    public Group clone() {
        int i = 0;
        Figure figures[] = new Figure[this.figures.length];
        for (Figure figure: this.figures) {
            figures[i] = figure.clone();
            i++;
        }
        return new Group(figures);
    }
}
