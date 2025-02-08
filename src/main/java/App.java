import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        BoardState boardState = new BoardState(5, 5);
        boardState.randomState();
        boardState.render();

    }
}
