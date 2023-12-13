import java.util.Arrays;
import java.util.Comparator;

public class Warnsdorff {

    private static final int N = 7;
    private static final int[] X_ARR = {-2, -1, 1, 2, 1, 2, -1, -2};
    private static final int[] Y_ARR = {-1, -2, -2, 1, -2, -1, 2, 1};

    private static int[][] board;

    public static void main(String[] args) {
        board = new int[N][N];
        solveKnightsTour(0, 0, 1);
        printBoard();
    }

    private static void solveKnightsTour(int x, int y, int moveNumber) {
        board[x][y] = moveNumber;
        
        if (moveNumber == N * N) {
            return;
        }
        
        int[][] nextMoves = new int[8][3];
        for (int i = 0; i < 8; i++) {
            int nextX = x + X_ARR[i];
            int nextY = y + Y_ARR[i];
            int accessibility = getAccessibility(nextX, nextY);
            nextMoves[i] = new int[]{accessibility, nextX, nextY};
        }
        
        Arrays.sort(nextMoves, Comparator.comparingInt(a -> a[0]));
        
        for (int[] nextMove : nextMoves) {
            int nextX = nextMove[1];
            int nextY = nextMove[2];
            if (isValidMove(nextX, nextY)) {
                solveKnightsTour(nextX, nextY, moveNumber + 1);
            }
        }
        
        board[x][y] = 0; // Backtrack
    }

    private static int getAccessibility(int x, int y) {
        int accessibility = 0;
        for (int i = 0; i < 8; i++) {
            int nextX = x + X_ARR[i];
            int nextY = y + Y_ARR[i];
            if (isValidMove(nextX, nextY)) {
                accessibility++;
            }
        }
        return accessibility;
    }

    private static boolean isValidMove(int x, int y) {
        return x >= 0 && y >= 0 && x < N && y < N && board[x][y] == 0;
    }

    private static void printBoard() {
        for (int[] row : board) {
            for (int num : row) {
                System.out.printf("%2d ", num);
            }
            System.out.println();
        }
    }
}
