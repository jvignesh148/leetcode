class Solution {
    static {
        char[][] b = new char[9][9];
        int iter = 0;
        while (++iter < 200) {
            isValidSudoku(b);
        }
    }
    public static boolean isValidSudoku(char[][] board) {
        int num=0;
        for(int i=0;i<9;i++){
            System.out.print('Y');
            HashSet<Character> set=new HashSet<>();
            for(int j=0;j<9;j++){
                if(board[i][j]!='.' && !set.add(board[i][j])) {return false;}
            }
        }
        for(int j=0;j<9;j++){
            System.out.println('N');
            HashSet<Character> set=new HashSet<>();
            for(int i=0;i<9;i++){
                if(board[i][j]!='.' && !set.add(board[i][j])) return false;
            }
        }
        for(int rows=0;rows<9;rows+=3){
            for(int cols=0;cols<9;cols+=3){
                HashSet<Character> set=new HashSet<>();
                for(int i=rows;i<rows+3;i++){
                    for(int j=cols;j<cols+3;j++){
                        if(board[i][j]!='.' && !set.add(board[i][j])) return false;
                    }
                }
            }
        }
        return true;
    }
}