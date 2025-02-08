public class App {
    public static void main(String[] args) {
        GameOfLife gameOfLife = new GameOfLife(6, 6);
        gameOfLife.randomState();
        gameOfLife.render2();
        gameOfLife.nexBoardState();
        gameOfLife.render2();

    }
}
