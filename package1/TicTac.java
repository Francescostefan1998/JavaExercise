package package1;

public class TicTac {
    public char[][] ticTacGame = initializeGame();

    public static void printString(String... strings) {
        for (String str : strings) {
            System.out.println(str);
        }
    }

    public static void printLoopString(String... strings) {
        for (String str : strings) {
            System.out.println(str);
        }
    }

    public static char[][] initializeGame() {
        char[][] ticTacGame = new char[3][3];
        ticTacGame[0][0] = 'x';
        ticTacGame[0][1] = 'x';
        ticTacGame[0][2] = 'x';
        ticTacGame[1][0] = 'x';
        ticTacGame[1][1] = 'x';
        ticTacGame[1][2] = 'x';
        ticTacGame[2][0] = 'x';
        ticTacGame[2][1] = 'x';
        ticTacGame[2][2] = 'o';

        return ticTacGame;
    }
}
