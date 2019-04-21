package modules;

import pojo.Point;

import java.util.HashSet;
import java.util.Random;

public class DefaultLabirintPathCreator {

    private int height;
    private int width;

    private int[][] labirintField;
    private HashSet<Point> checkedPoints;

    public DefaultLabirintPathCreator(int[][] labirintField) {
        this.labirintField = labirintField;
        this.height = (labirintField.length - 1) / 2;
        this.width = (labirintField[0].length - 1) / 2;
    }

    private Point randomizeStartPoint() {
        Random r = new Random();
        int i = r.nextInt(height) * 2 + 1;
        int j = r.nextInt(width) * 2 + 1;
        return new Point(i, j);
    }

    private Point[] lookAroundForAvailableMovementPoints() {
        return null;
    }
}
