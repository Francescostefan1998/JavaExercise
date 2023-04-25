package package1;

public class TicTac {
    public char[][] ticTacGame = initializeGame();
    public char[][] trainingTable = initializeTable();


    public static char[][] initializeTable() {
        char[][] trainingTable = new char[2][2];
        trainingTable[0][0] = 'c';
        trainingTable[0][1] = 'd';
        trainingTable[1][0] = 'c';
        trainingTable[1][1] = 'g';

        return trainingTable;
    }

    public static void printString(String... strings) {
        for (String str : strings) {
            System.out.println(str);
        }
    }

    public static void passASting(String... strings) {
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
