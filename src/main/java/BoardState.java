import java.util.Arrays;
import java.util.Random;

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

        for (int[] row : this.boardState) {

            for (int col : row) {

                System.out.print(col + " ");
            }
            System.out.println();
        }
        return this.boardState;
    }

    public int[][] randomState() {
        int random;

        for (int col = 0; col < this.height; col++) {
            for (int row = 0; row < this.width; row++) {

                random = (Math.random() > 0.5 ? 1 : 0);

                this.boardState[row][col] = random;
            }
        }

        for (int[] row : this.boardState) {

            System.out.println(Arrays.toString(row));

        }

        return this.boardState;
    }

}