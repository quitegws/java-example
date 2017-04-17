package algorithm;

import java.util.HashSet;

public class ValidSudoku {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] a = {	".87654321".toCharArray(),
						"2........".toCharArray(),
						"3........".toCharArray(),
						"4........".toCharArray(),
						"5........".toCharArray(),
						"6........".toCharArray(),
						"7........".toCharArray(),
						"8........".toCharArray(),
						"9........".toCharArray()};
		System.out.println(isValidSudoku(a));
	}
    /**
     * @param board: the board
       @return: wether the Sudoku is valid
     */
   public static boolean isValidSudoku(char[][] board) {
	   if (board == null || board.length != 9 || board[0].length != 9){
		   return false;
	   }
	   HashSet set = new HashSet<Character>();
	   for(int i = 0; i < 9; i++){
		   for(int j = 0; j < 9; j++){
			   if (board[i][j] != '.'){
				   if (!set.contains(board[i][j])) {
					   set.add(board[i][j]);
				   }else{
					   return false;
				   }
			   }
		   }
		   set.clear();
	   }
	   set.clear();
	   for(int i = 0; i < 9; i++){
		   for(int j = 0; j < 9; j++){
			   if (board[j][i] != '.'){
				   if (!set.contains(board[j][i])) {
					   set.add(board[j][i]);
				   }else{
					   return false;
				   }
			   }
		   }
		   set.clear();
	   }
	   set.clear();
	   for(int i = 0; i < 9; i+=3){
		   for(int j = 0; j < 9; j+=3){
			   for(int k = 0; k < 9; k++){
				   int _i = i + k/3;
				   int _j = j + k%3;
				   if (board[_i][_j] != '.'){
					   if (!set.contains(board[_i][_j])) {
						   set.add(board[_i][_j]);
					   }else{
						   return false;
					   }
				   }
				   
			   }
			   set.clear();
		   }
	   }
	   return true;
   }

}
