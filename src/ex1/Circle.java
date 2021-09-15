package ex1;

public class Circle {
    int x, y;
    int radius;

    public Circle(int x, int y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public String toString() {
        return "ex1.Circle(" + x + "," + y + ")" + "반지름" + radius;
    }

    public boolean equals(Object obj) {
        Circle c = (Circle) obj;
        if (c.x == x && c.y == y)
            return true;
        else
            return false;
    }
}
