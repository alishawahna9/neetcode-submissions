class Solution {
    public boolean isValidSudoku(char[][] board) {
        //1.check if every row is valid in the big and small matrix
        for(int i=0;i<9;i++){

            Set<Character> row=new HashSet<>();
            Set<Character> col=new HashSet<>();
            Set<Character> box=new HashSet<>();

            for(int j=0;j<9;j++){
                //check rows
                char r=board[i][j];
                if(r!='.'){
                    if(row.contains(r)) return false;
                    row.add(r);
                }

                //check cols
                char c=board[j][i];
                if(c!='.'){
                    if(col.contains(c)) return false;
                    col.add(c);
                }

                //check small matrix
                int rowIndex = 3 * (i / 3);
                int colIndex = 3 * (i % 3);
                char b = board[rowIndex + j / 3][colIndex + j % 3];

                if (b != '.') {
                    if (box.contains(b)) return false;
                    box.add(b);
                }

            }
        }
        return true;
    }
}
