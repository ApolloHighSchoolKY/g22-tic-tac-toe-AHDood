// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class TicTacToe
{
	private char[][] mat;



	public TicTacToe(String game)
	{
	mat = new char[3][3];
		int i=0;		
		for(int r=0; r<3;r++)
		{
			for(int c=0; c<3;c++)
			{
				mat[r][c]=game.charAt(i);
				i++;
			}
		}
	}	
	

	public String getWinner()
	{
		for(int r=0; r<3;r++)
		{
			if (mat[r][0]==mat[r][1] && mat[r][1]== mat[r][2])
			{
				return "" + mat[r][0];
			}
		}
		for(int c=0; c<3; c++)
		{
			if(mat[0][c]==mat[1][c] && mat[1][c]==mat[2][c])
			{
				return ""+mat[0][c];
			}
		}	
		if(mat[0][2]==mat[1][1]&& mat[1][1]==mat[2][2])
		{
			return "" + mat[0][0];
		}            

		boolean tie = true;
		for(int r=0;r<3; r++)
		{
			for (int c=0; c<3; c++)
			{
				if(mat[r][c] != 'X' && mat[r][c] != 'O')
				{
					tie=false;
				}
				}
			}	
		if(tie)
		{
			return "TIE!";
		}
		return "no winners...";
	}
			
	

	public String toString()
	{
		String output="";

		for(int r=0; r<3;r++)
		{
			for(int c=0; c<3;c++)
			{
				output = output + mat[r][c]+"";
			}
			output = output + "\n";
		}

	return output;
	}
}