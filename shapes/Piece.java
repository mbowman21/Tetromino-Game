package shapes;

import java.awt.Color;
import java.awt.Graphics;

abstract class Piece {
    Color color;
    Coordinate location;
    Coordinate[] dimensions = new Coordinate[4];

    public Color getColor() {
        return this.color;
    }

    public void draw(Graphics g) {
        g.setColor(this.color);
        for (Coordinate coordinate : dimensions) {
            // MORE STUFF GOES HERE
        }
    }

    public void moveDown() {
        Coordinate[] tryMove = new Coordinate[dimensions.length];

        for (int i = 0; i < dimensions.length; i++) {
            tryMove[i] = new Coordinate(dimensions[i].getX(), dimensions[i].getY() - 1);
        }

        if (!checkCollisions(tryMove)) {
            location = new Coordinate(location.getX(), location.getY() - 1);
        } else {
            placePiece();
        }
    }

    public void rotate(boolean clockwise) {
        Coordinate[] tryRotate = new Coordinate[dimensions.length];

        for (int i = 0; i < dimensions.length; i++) {
            if (clockwise) {
                tryRotate[i] = new Coordinate(dimensions[i].getY(), -dimensions[i].getX());
            } else {
                tryRotate[i] = new Coordinate(-dimensions[i].getY(), dimensions[i].getX());
            }
        }

        if (!checkCollisions(tryRotate)) {
            dimensions = tryRotate;
        }
    }

    private boolean checkCollisions(Coordinate[] checkDimensions) {
        // STUFF GOES HERE
        return true;
    }

    private void placePiece() {
        // STUFF ALSO GOES HERE
    }

    class Coordinate {
        private int x;
        private int y;

        Coordinate(int x, int y) {
            this.x = x;
            this.y = y;
        }

        private int getX() {
            return this.x;
        }

        private int getY() {
            return this.y;
        }
    }
}