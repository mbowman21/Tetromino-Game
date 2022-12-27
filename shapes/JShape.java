package shapes;

import java.awt.Color;

public final class JShape extends Piece {
    public JShape() {
        super.color = Color.BLUE;
        super.dimensions[0] = new Coordinate(-1, 0);
        super.dimensions[1] = new Coordinate(0, 0);
        super.dimensions[2] = new Coordinate(1, 0);
        super.dimensions[3] = new Coordinate(1, 1);
    }
}