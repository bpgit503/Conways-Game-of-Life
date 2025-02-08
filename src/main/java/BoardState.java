public class BoardState {
    private int width;
    private int height;
    private int[][] boardState;

    public BoardState(int width, int height) {
        this.width = width;
        this.height = height;
        this.boardState = new int[width][height];
    }
}