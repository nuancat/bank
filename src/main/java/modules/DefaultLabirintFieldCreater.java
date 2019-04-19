package modules;

import java.util.Arrays;

public class DefaultLabirintFieldCreater implements ILabirintFieldCreator {

    private int width;
    private int height;

    public DefaultLabirintFieldCreater(int width, int height) throws IllegalArgumentException {
        if (height < 5 || width < 5) {
            throw new IllegalArgumentException("Минимальное значение высоты и ширины - 5");
        }
        this.width = width;
        this.height = height;
    }

    public int[][] createLabirint() {
        int[][] labirintTemplate = new int[height][width];
        for (int[] line : labirintTemplate) {
            Arrays.fill(line, -1);
        }
        return labirintTemplate;
    }
}
