/* *****************************************************************************
 *              ALL STUDENTS COMPLETE THESE SECTIONS
 * Title:            (program's title)
 * Files:            (list of source files)
 * Semester:         Spring 2022
 * 
 * Author:           (your name and email address)
 * 
 * Description:		 (a short description of the program)
 * 
 * Written:       	 (date)
 * 
 * Credits:          (list anyone or any resource that helped you write your program)
 **************************************************************************** */


/**
 * (Write a succinct description of this class here. You should avoid wordiness
 * and redundancy. If necessary, additional paragraphs should be preceded by
 * <p>
 * , the html tag for a new paragraph.)
 *
 * <p>
 * Bugs: (a list of bugs and other problems)
 *
 * @author (your name)
 */
public class SudokuSolver {

		/**
		 * Main entry point of the program. Prints out a hardcoded
		 * sudoku board, then tries to check if the board is valid
		 * (i.e., no duplicates in any rows, columns, or boxes)
		 * then tries to solve the board.
		 *
		 * @param args  No command-line arguments expected
		 */
		public static void main(String[] args) {
			
			// Here we've hardcoded 2 simple Sudoku boards
			// for you to use in implementing and testing your methods
			// Feel free to change the values in these boards (or
			// create your own boards) to help in testing (e.g., for
			// testing if other components of your checkBoard method 
			// works for duplicates in columns and boxes).
			
			// board1 is not valid (notice the duplicate 9's in the
			// first row)
			int[][] board1 = {{9, 2, 3, 4, 5, 6, 7, 8, 9},
							  {4, 5, 6, 7, 8, 9, 1, 2, 3},
							  {7, 8, 9, 1, 2, 3, 0, 5, 0},
							  {2, 1, 4, 3, 6, 5, 8, 9, 7},
							  {3, 6, 5, 8, 9, 7, 2, 1, 4},
							  {8, 9, 7, 2, 1, 4, 0, 6, 5},
							  {5, 3, 1, 6, 4, 2, 9, 7, 8},
							  {6, 4, 2, 9, 7, 8, 5, 3, 1},
							  {9, 7, 8, 5, 3, 1, 6, 4, 0}};
				
			// board2 is valid and corresponds to the board in the
			// easy.txt file. This one should take your computer less
			// than a second to solve.
			int[][] board2 =  {{0, 2, 3, 4, 5, 6, 7, 8, 9},
							   {4, 5, 6, 7, 8, 9, 1, 2, 3},
							   {7, 8, 9, 1, 2, 3, 0, 5, 0},
							   {2, 1, 4, 3, 6, 5, 8, 9, 7},
							   {3, 6, 5, 8, 9, 7, 2, 1, 4},
							   {8, 9, 7, 2, 1, 4, 0, 6, 5},
							   {5, 3, 1, 6, 4, 2, 9, 7, 8},
							   {6, 4, 2, 9, 7, 8, 5, 3, 1},
							   {9, 7, 8, 5, 3, 1, 6, 4, 0}};			
			
			printBoard(board1);
			if (checkBoard(board1)) {
				System.out.println("The board is valid");
			}
			else {
				System.out.println("The board is not valid!");
			}
		}

		/**
		 * Prints out a sudoku board to the console.
		 * @param board A 2D array of ints corresponding to a
		 * 				sudoku board, where 0's indicate empty cells
		 */
		public static void printBoard(int[][] board)
		{
			System.out.println("---------------------"); // Top of the board
			for (int row = 0; row < board.length; row++)
			{
				for (int col = 0; col < board[row].length; col++)
				{
					// Print out an empty space if the cell is 0
					if (board[row][col] == 0) 
					{
						System.out.print("_ ");
					}
					else // Otherwise print the sudoku value
					{
						System.out.print(board[row][col] + " ");
					}
					
					// Divide the boxes vertically by inserting a 
					// vertical line every 3 columns
					if (col % 3 == 2)
					{
						System.out.print("| "); 
					}
				}
				// Divide the boxes horizontally by inserting a horizontal
				// line every 3 rows
				if (row % 3 == 2)
				{
					System.out.println("\n---------------------");
				}
				else
				{
					System.out.println();
				}
			}
		}
		
		/**
		 * Checks to see if the current board is valid. A valid board is one where
		 * there are no duplicate values in:
		 *   -Any row
		 *   -Any column
		 *   -Any of the 3x3 subgrids (boxes)
		 *   
		 * @param board A 2D array of ints corresponding to a sudoku board where
		 * 		  		0's indicate an empty cell
		 * @return True if the board is valid (i.e., does not contain any
		 * 		   duplicates in any rows, columns, or sub 3x3 boxes
		 */
		public static boolean checkBoard(int[][] board) 
		{
			 /* This method should return true if the board is valid (no duplicates)
			 * and false otherwise. To solve this, create and implement
			 * 4 helper methods:
			 * 	 -checkRow - checks a single row for duplicates
			 *   -checkColumn - checks a single column for duplicates
			 *   -checkBoxes - divides the grid into 9 3x3 boxes and calls
			 *   			   checkBox for each box
			 *   -checkBox - checks a single 3x3 box for duplicates
			 *   
			 * Using these methods, your pseudocode for checkBoard is as follows:
			 * 	 for (each row in board):
			 * 		if (row contains duplicate): return false
			 *   endfor
			 *   for (each column in board):
			 *      if (column contains duplicate) return false
			 *   if (checkBoxes(board) indicates a box contains a duplicate): return false
			 *   return true; 
			 */
			return false;
		}
}
