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

    public void render() {
        StringBuilder builder = new StringBuilder();
        String[][] boardStateRender = new String[width][height];

        for (int i = 0; i < boardState.length; i++) {
            for (int j = 0; j < boardState[i].length; j++) {
                if (boardState[i][j] == 0) {
                    boardStateRender[i][j] = " # ";
                }else{
                    boardStateRender[i][j] = " ### ";
                }
            }
        }
        for( String[] row : boardStateRender ) {
            System.out.println(Arrays.toString(row));
        }

//        builder.append("| ");
//        for (int[] column : this.boardState) {
//            for (int x : column) {
//                if (x == 0) {
//                    builder.append(" # ");
//                } else {
//                    builder.append(" ### ");
//                }
//            }
//            builder.append(" |");
//
//        }
//        System.out.println(builder.toString());

    }

    public int[][] deadState() {

        Arrays.stream(this.boardState).forEach(row -> Arrays.fill(row, 0));

        for (int[] row : this.boardState) {

            for (int col : row) {

                System.out.print(col + " #");
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

    public int[][] getBoardState() {
        return boardState;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }
}