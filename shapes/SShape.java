package shapes;

import java.awt.Color;

public class SShape extends Piece {
    public SShape() {
        super.color = Color.GREEN;
        super.dimensions[0] = new Coordinate(-1, 1);
        super.dimensions[1] = new Coordinate(0, 1);
        super.dimensions[2] = new Coordinate(0, 0);
        super.dimensions[3] = new Coordinate(1, 0);
    }
}