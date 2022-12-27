package shapes;

import java.awt.Color;

public class ZShape extends Piece {
    public ZShape() {
        super.color = Color.RED;
        super.dimensions[0] = new Coordinate(-1, 0);
        super.dimensions[1] = new Coordinate(0, 0);
        super.dimensions[2] = new Coordinate(0, 1);
        super.dimensions[3] = new Coordinate(1, 1);
    }
}