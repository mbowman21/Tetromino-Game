package shapes;

import java.awt.Color;

public class TShape extends Piece {
    int[][] locations = {
            { -1, 0 },
            { 0, 0 },
            { 1, 0 },
            { 2, 0 } };

    public TShape() {
        super.color = Color.MAGENTA;
    }
}