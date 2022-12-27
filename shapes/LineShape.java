package shapes;

import java.awt.Color;

public class LineShape extends Piece {
    public LineShape() {
        super.color = Color.CYAN;
        super.dimensions[0] = new Coordinate(-1, 0);
        super.dimensions[1] = new Coordinate(0, 0);
        super.dimensions[2] = new Coordinate(1, 0);
        super.dimensions[3] = new Coordinate(2, 0);
    }
}