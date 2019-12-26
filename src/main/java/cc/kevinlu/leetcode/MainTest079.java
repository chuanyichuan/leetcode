package cc.kevinlu.leetcode;

public class MainTest079 {

    public static void main(String[] args) {
        char[][] board ={{'A','B','C','E'},
                {'S','F','C','S'},
                {'A','D','E','E'}};
        String word = "FCE";
        exist(board, word);
    }
    public static  boolean exist(char[][] board, String word) {
        if (word == null || word.length() == 0) {
            return true;
        }
        char[] chs = word.toCharArray();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (dfs(board, chs, 0, i, j)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean dfs(char[][] board, char[] words, int index, int x, int y) {
        if (index == words.length) {
            return true;
        }
        if (x < 0 || x == board.length || y < 0 || y == board[0].length) {
            return false;
        }
        if (board[x][y] != words[index]) {
            return false;
        }
        char source = board[x][y];
        board[x][y] = '\0';
        boolean exist = dfs(board, words, index + 1, x-1, y)
                || dfs(board, words, index + 1, x, y +1)
                || dfs(board, words, index + 1, x + 1, y)
                || dfs(board, words, index + 1, x, y-1);
        board[x][y] = source;
        return exist;
    }

}
