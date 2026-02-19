//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Lab24d
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner (new File("lab24d.dat"));
		int game = file.nextInt();
		file.nextLine();

		for(int i=0; i< game;i++)
		{
			String board = file.nextLine();
			TicTacToe games = new TicTacToe(board);

			System.out.println(games);
			System.out.println("the Winner is..." + games.getWinner());
			
		}	
		file.close();
	}
}



