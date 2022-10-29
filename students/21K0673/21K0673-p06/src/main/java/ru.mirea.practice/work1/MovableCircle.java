package ru.mirea.practice.work1;

public class MovableCircle extends MovablePoint {
    private int radius;
    private MovablePoint center;

    MovableCircle(int x, int y, int xspeed, int yspeed, int radius, MovablePoint center) {
        super(x, y, xspeed, yspeed);
        this.radius = radius;
        this.center = center;
    }

    public int getRadius() {
        return radius;
    }

    public MovablePoint getCenter() {
        return center;
    }

    @Override
    public String toString() {
        return "MovableCircle: {center: " + center + ", radius = " + radius + "}";
    }

    public void moveUp() {
        this.y++;
    }

    public void moveDown() {
        this.y--;
    }

    public void moveLeft() {
        this.x--;
    }

    public void moveRight() {
        this.x++;
    }
}
