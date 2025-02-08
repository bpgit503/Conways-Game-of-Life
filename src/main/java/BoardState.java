import java.util.Arrays;

public class BoardState {
    private int width;
    private int height;
    private int[][] boardState;

    public BoardState(int width, int height) {
        this.width = width;
        this.height = height;
        this.boardState = new int[width][height];
    }

    public int[][] deadState() {
        Arrays.stream(this.boardState).forEach(row -> Arrays.fill(row, 0));
        for(int[] row : this.boardState) {
            for(int col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
//        System.out.println(Arrays.deepToString(this.boardSate));
        return this.boardState;
    }

}