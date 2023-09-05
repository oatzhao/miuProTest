package LEE;

import java.util.ArrayList;
import java.util.List;

public class WordSearch2 {
    private static boolean[][] visited;
    private static final int[][] DIRECTIONS={{1,0}, {0,1}, {-1,0}, {0,-1}};

    public List<String> findWords(char[][] board, String[] words) {
        List<String> res=new ArrayList<>();
        for(String word: words){
            if(findWord(board, word)) res.add(word);
        }
        return res;
    }

    public static boolean findWord(char[][] board, String word) {
        visited = new boolean[board.length][board[0].length];
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(dfs(board, word, i , j, 0))return true;
            }
        }
        return false;
    }

    private static boolean dfs(char[][] board, String word, int x, int y, int index){
        if(index==word.length()-1) return board[x][y]==word.charAt(index);
        if(board[x][y]!=word.charAt(index))return false;
        if(board[x][y]==word.charAt(index)){
            System.out.println(board[x][y]);
            visited[x][y]=true;
            for(int[] direction : DIRECTIONS){
                int newX=x+direction[0];
                int newY=y+direction[1];
                if(inArea(newX, newY, board) && !visited[newX][newY]) {
                    if(dfs(board, word, newX, newY, index+1)) return true;
                }
            }
            visited[x][y]=false;
        }
        return false;
    }

    private static boolean inArea(int x, int y, char[][] board){
        return x>=0 && x<board.length && y>=0 && y<board[0].length;
    }

    public static void main(String[] args) {
        char[][] board ={{'a','b'},{'c','d'}};
        String word = "acdb";
        System.out.println(findWord(board, word));
    }
}
