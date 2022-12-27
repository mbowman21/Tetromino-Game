class Field {
    private Block[][] field;
    private final int rowNumber = 20;
    private final int columnNumber = 10;

    Field() {
        this.field = new Block[rowNumber][columnNumber];
    }
}