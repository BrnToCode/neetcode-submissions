class Solution {
    public boolean isValidSudoku(char[][] board) {
        

        for(int i=0;i<board.length;i++){
            HashSet<Character> row=new HashSet<>();
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]=='.'){
                    continue;
                }
                if(row.contains(board[i][j])){
                    return false;
                }
                row.add(board[i][j]);
            }
        }

        for(int j=0;j<board[0].length;j++){
            HashSet<Character> col=new HashSet<>();
            for(int i=0;i<board.length;i++){
                if(board[i][j]=='.'){
                    continue;
                }
                if(col.contains(board[i][j])){
                    return false;
                }
                col.add(board[i][j]);
            }
        }

        for(int j=0;j<board[0].length;j++){
            HashSet<Character> col=new HashSet<>();
            for(int i=0;i<board.length;i++){
                if(board[i][j]=='.'){
                    continue;
                }
                if(col.contains(board[i][j])){
                    return false;
                }
                col.add(board[i][j]);
            }
        }

        
        for(int i=0;i<board.length;i+=3){
            for(int j=0;j<board.length;j+=3){
                HashSet<Character> box=new HashSet<>();
                for(int k=i;k<i+3;k++){
                    for(int l=j;l<j+3;l++){
                        if(board[k][l]=='.'){
                            continue;
                        }
                        if(box.contains(board[k][l])){
                            return false;
                        }
                        box.add(board[k][l]);
                    }
                }
            }
        }



        return true;
    }
}
