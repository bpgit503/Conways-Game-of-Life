import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        BoardState boardState = new BoardState(20, 30);
        boardState.deadState();
        boardState.render2();
        boardState.randomState();
        boardState.render2();

    }
}
