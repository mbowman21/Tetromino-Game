package shapes;

import java.awt.Color;
import java.awt.Graphics;

abstract class Piece {
    Color color;
    int[][] locations;

    public Color getColor() {
        return color;
    }
    
    public void draw(Graphics g) {

    }
}