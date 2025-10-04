import java.util.HashSet;

public class ValidSudoku {

    public boolean isValidSudoku(char[][] board) {
        HashSet<Character>[] rows = new HashSet[9]; 
        HashSet<Character>[] cols = new HashSet[9];
        HashSet<Character>[] boxes = new HashSet[9];
        int i = 0;
        while( i < 9) {
            rows[i] = new HashSet<>();
            cols[i] = new HashSet<>();
            boxes[i] = new HashSet<>();
            i++;
        }
        for(int k = 0; k < 9; k ++) {
            for(int j = 0; j < 9; j++) {

                if(board[k][j] == '.')
                continue;

                if(rows[k].contains(board[k][j]))
                return false;

                rows[k].add(board[k][j]);

                if(cols[j].contains(board[k][j]))
                return false;

                cols[j].add(board[k][j]);

                int boxIndex = (k / 3) * 3 + (j / 3);
                   if(boxes[boxIndex].contains(board[k][j]))
                return false;

                boxes[boxIndex].add(board[k][j]);

            }
        }
        return true;
    }
    public static void main(String args[]){

    }
}
