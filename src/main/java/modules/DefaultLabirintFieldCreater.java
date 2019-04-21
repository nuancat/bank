package modules;

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
        int[][] labirintTemplate = new int[height * 2 + 1][width * 2 + 1];
        createField(labirintTemplate);
        return labirintTemplate;
    }

    //todo по заданию сменить на минус -1
    private void createField(int[][] field) {
        for (int i = 0; field.length > i; i++) {
            for (int j = 0; field[i].length > j; j++) {
                if (i % 2 == 1 && j % 2 == 1) {
                    field[i][j] = 0;
                } else {
                    field[i][j] = 1;
                }
            }
        }
    }

}
