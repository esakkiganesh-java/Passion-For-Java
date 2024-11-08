package esakkiganesh;
import java.util.*;
//public class ArrayLearnings// {

	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[][]a= { {0,0,6,0,0,0,5,0,8},
				{1,0,2,3,8,0,0,0,4},
				{0,0,0,2,0,0,1,9,0},
				{0,0,0,0,6,3,0,4,5},
				{0,6,3,4,0,5,8,7,0},
				{5,4,0,9,2,0,0,0,0},
				{0,8,7,0,0,4,0,0,0},
				{2,0,0,0,9,8,4,0,7},
				{4,0,9,0,0,0,3,0,0}   }; 
		//a[0][0]=8;
		System.out.println(" Array:");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
				
		}
		System.out.println("Array:");
		for(int i=0;i<a[0].length;i++)
		{
			if(a[0][i]==0)
			{
				
				System.out.println("enter the value:");
				int value=sc.nextInt();
				System.out.print(a[0][i]=value);
				}
			for(int j=0;j<a[0].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
}*/
//public class SudokuSolver {
  /*  public static void main(String[] args) {
        int[][] board = {
            {5, 3, 0, 0, 7, 0, 0, 0, 0},
            {6, 0, 0, 1, 9, 5, 0, 0, 0},
            {0, 9, 8, 0, 0, 0, 0, 6, 0},
            {8, 0, 0, 0, 6, 0, 0, 0, 3},
            {4, 0, 0, 8, 0, 3, 0, 0, 1},
            {7, 0, 0, 0, 2, 0, 0, 0, 6},
            {0, 6, 0, 0, 0, 0, 2, 8, 0},
            {0, 0, 0, 4, 1, 9, 0, 0, 5},
            {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };

        if (solveSudoku(board)) {
            printBoard(board);
        } else {
            System.out.println("No solution exists.");
        }
    }

    private static boolean solveSudoku(int[][] board) {
        int[] nextEmpty = findEmptyCell(board);
        int row = nextEmpty[0];
        int col = nextEmpty[1];

        if (row == -1 && col == -1) {
            return true; // All cells filled, puzzle solved
        }

        for (int num = 1; num <= 9; num++) {
            if (isValidMove(board, row, col, num)) {
                board[row][col] = num;

                if (solveSudoku(board)) {
                    return true; // If the current configuration leads to a solution
                }

                board[row][col] = 0; // Backtrack
            }
        }

        return false; // No valid number found for this cell, trigger backtrack
    }

    private static boolean isValidMove(int[][] board, int row, int col, int num) {
        // Check if the number is already in the current row or column
        for (int i = 0; i < 9; i++) {
            if (board[row][i] == num || board[i][col] == num) {
                return false;
            }
        }

        // Check if the number is already in the current 3x3 subgrid
        int startRow = row - row % 3;
        int startCol = col - col % 3;
        for (int i = startRow; i < startRow + 3; i++) {
            for (int j = startCol; j < startCol + 3; j++) {
                if (board[i][j] == num) {
                    return false;
                }
            }
        }

        return true;
    }

    private static int[] findEmptyCell(int[][] board) {
        int[] result = {-1, -1};

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == 0) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }

        return result;
    }

    private static void printBoard(int[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
*/
	/*import java.util.Scanner;

	public class ArrayLearnings {
	    private static final int SIZE = 9;
	    private int[][] board;

	    public ArrayLearnings() {
	        board = new int[SIZE][SIZE];
	    }

	    public void initializeBoard() {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter Sudoku puzzle values (0 for empty cells):");

	        for (int i = 0; i < SIZE; i++) {
	            for (int j = 0; j < SIZE; j++) {
	                System.out.print("Enter value for cell (" + (i+1) + ", " + (j+1) + "): ");
	                int value = scanner.nextInt();
	                if (value < 0 || value > 9) {
	                    System.out.println("Invalid input. Please enter a number between 0 and 9.");
	                    j--; // Re-enter the value for the same cell
	                } else {
	                    board[i][j] = value;
	                }
	            }
	        }
	    }

	    public void printBoard() {
	        System.out.println("Sudoku puzzle:");
	        for (int i = 0; i < SIZE; i++) {
	            for (int j = 0; j < SIZE; j++) {
	                System.out.print(board[i][j] + " ");
	                if ((j + 1) % 3 == 0 && j < SIZE - 1) {
	                    System.out.print("| ");
	                }
	            }
	            System.out.println();
	            if ((i + 1) % 3 == 0 && i < SIZE - 1) {
	                System.out.println("---------------------");
	            }
	        }
	    }

	    public static void main(String[] args) {
	        ArrayLearnings solver = new ArrayLearnings();
	        solver.initializeBoard();
	        solver.printBoard();
	    }
	}*/
import java.util.Scanner;

public class ArrayLearnings {

    private static final int SIZE = 9;
    private int[][] board;

    public ArrayLearnings() {
        board = new int[SIZE][SIZE];
    }

    public void initializeBoard() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Sudoku puzzle values (0 for empty cells):");

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.print("Enter value for cell (" + (i + 1) + ", " + (j + 1) + "): ");
                int value = scanner.nextInt();
                if (value < 0 || value > 9) {
                    System.out.println("Invalid input. Please enter a number between 0 and 9.");
                    j--; // Re-enter the value for the same cell
                } else {
                    board[i][j] = value;
                }
            }
        }
    }

    public void printBoard() {
        System.out.println("Sudoku puzzle:");
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.print(board[i][j] + " ");
                if ((j + 1) % 3 == 0 && j < SIZE - 1) {
                    System.out.print("| ");
                }
            }
            System.out.println();
            if ((i + 1) % 3 == 0 && i < SIZE - 1) {
                System.out.println("---------------------");
            }
        }
    }

    public boolean solveSudoku() {
        int row = -1;
        int col = -1;
        boolean isEmpty = true;

        // Find the first empty cell
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (board[i][j] == 0) {
                    row = i;
                    col = j;
                    isEmpty = false;
                    break;
                }
            }
            if (!isEmpty) {
                break;
            }
        }

        // If there is no empty cell, the puzzle is solved
        if (isEmpty) {
            return true;
        }

        // Try placing numbers 1-9 in the empty cell
        for (int num = 1; num <= SIZE; num++) {
            if (isValidMove(row, col, num)) {
                board[row][col] = num;

                // Recursively try to solve the puzzle
                if (solveSudoku()) {
                    return true;
                }

                // If recursion fails, backtrack
                board[row][col] = 0;
            }
        }

        // If none of the numbers work, return false to backtrack
        return false;
    }

    private boolean isValidMove(int row, int col, int num) {
        // Check if num is not already in the same row or column
        for (int i = 0; i < SIZE; i++) {
            if (board[row][i] == num || board[i][col] == num) {
                return false;
            }
        }

        // Check if num is not already in the same 3x3 box
        int boxRow = row - row % 3;
        int boxCol = col - col % 3;
        for (int i = boxRow; i < boxRow + 3; i++) {
            for (int j = boxCol; j < boxCol + 3; j++) {
                if (board[i][j] == num) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        ArrayLearnings solver = new ArrayLearnings();
        solver.initializeBoard();
        solver.printBoard();

        if (solver.solveSudoku()) {
            System.out.println("\nSolution:");
            solver.printBoard();
        } else {
            System.out.println("No solution exists.");
        }
    }
}

