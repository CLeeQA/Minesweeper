/**
 * 
 */
package minesweeper;

import java.util.Random;

/**
 * @author Admin
 *
 */
public class GenerateMines {
	public static void main(String[] args) {
		
		Random rand = new Random();
		int[][] boardArray = new int[10][10];
		
		for (int k = 0; k < 20; k ++) {
			
			int randomOne = rand.nextInt((10));
			int randomTwo = rand.nextInt((10));
			boardArray[randomOne][randomTwo] = 1;
		}
			
		for(int i = 0; i < boardArray.length; i ++) {
			for(int j = 0; j < boardArray.length; j++) {
				System.out.print(boardArray[i][j]);
			}	
			System.out.println();	
		}
	}
}

