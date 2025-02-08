import java.util.Arrays;

public class GameOfLife {
    private int width;
    private int height;
    private int[][] boardState;

    public GameOfLife(int width, int height) {
        this.width = width;
        this.height = height;
        this.boardState = new int[width][height];
    }

    public int[][] nexBoardState() {

        int[][] updatedBoardState = new int[width][height];
        int aliveCellCount = 0;

        int[] xAxis = {-1, -1, -1, 0, 0, 1, 1, 1};
        int[] yAxis = {-1, 0, 1, -1, 1, -1, 0, 1};

        for (int col = 0; col < width; col++) {
            for (int row = 0; row < height; row++) {

                for (int i = 0; i < 8; i++) {
                    int xPos = row + xAxis[i];
                    int yPos = col + yAxis[i];

                    if (xPos >= 0 && xPos < this.width && yPos >= 0 && yPos < this.height) {
                        if (this.boardState[xPos][yPos] == 1) {
                            aliveCellCount++;
                        }
                    }
                }
                if (this.boardState[row][col] == 1 && aliveCellCount <= 1) {
                    updatedBoardState[row][col] = 0;
                } else if (this.boardState[row][col] == 1 && aliveCellCount <= 3) {
                    updatedBoardState[row][col] = 1;
                } else if (this.boardState[row][col] == 1 && aliveCellCount > 3) {
                    updatedBoardState[row][col] = 0;
                } else if (this.boardState[row][col] == 0 && aliveCellCount == 3) {
                    updatedBoardState[row][col] = 1;
                }
                aliveCellCount = 0;
            }
        }

        return this.boardState = updatedBoardState;

    }

    public void render() {
        String[][] boardStateRender = new String[width][height];

        for (int i = 0; i < boardState.length; i++) {
            for (int j = 0; j < boardState[i].length; j++) {
                if (boardState[i][j] == 0) {
                    boardStateRender[i][j] = " # ";
                } else {
                    boardStateRender[i][j] = " ## ";
                }
            }
        }
        for (String[] row : boardStateRender) {
            System.out.println(Arrays.toString(row));
        }

    }

    public void render2() {
        StringBuilder builder = new StringBuilder();

        for (int[] col : this.boardState) {
            builder.append("| ");
            for (int row : col) {
                if (row == 0) {
                    builder.append(" --- ");
                } else {
                    builder.append(" *** ");
                }
            }
            builder.append(" |\n");
        }
        System.out.println(builder);

    }

    public int[][] deadState() {

        Arrays.stream(this.boardState).forEach(row -> Arrays.fill(row, 0));

        for (int[] row : this.boardState) {
            System.out.println(Arrays.toString(row));
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