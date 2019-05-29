package Figure;

public interface Figure {
    void move(double dx, double dy);
    void flip();
    @Override
    boolean equals(Object o);
    @Override
    String toString();
}
