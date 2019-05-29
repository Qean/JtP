package Wspolrzedne;

public class Point {
    double x, y;
    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }
    public double getX(){
        return this.x;
    }
    public double getY(){
        return this.y;
    }
    public void move(double x, double y){
        this.x += x;
        this.y += y;
    }

    public void flip(){
        this.x = -this.x;
        this.y = -this.y;
    }

    @Override
    public String toString() {
        return "Punkt: x = " + this.x + ", y = " + this.y;
    }
}