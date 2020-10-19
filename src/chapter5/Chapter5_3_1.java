package chapter5;

import java.util.Scanner;

public class Chapter5_3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// tic-tac-toe游戏
		Scanner in = new Scanner(System.in);
		final int SIZE = 3;
		int[][] board = new int[SIZE][SIZE];
		boolean gotResult = false;
		int numOfX = 0;
		int numOfO = 0;
		
		// 读入数据
		for(int i=0;i<board.length;i++)
		{
			for(int j=0;j<board[i].length;j++)
			{
				board[i][j] = in.nextInt();
			}
		}
		
		// 检查行
		if(!gotResult)
		{
			for (int i=0;i<board.length;i++)
			{
				numOfX = 0;
				numOfO = 0;
				for (int j=0;j<board[i].length;j++)
				{
					if (board[i][j] == 1)
					{
						numOfX ++;
					}
					else
					{
						numOfO ++;
					}
				}
				if (numOfX == SIZE || numOfO == SIZE)
				{
					gotResult = true;
					break;
				}
			}
		}
		
		// 检查列
		if(!gotResult)
		{
			for (int i=0;i<board.length;i++)
			{
				numOfX = 0;
				numOfO = 0;
				for (int j=0;j<board[i].length;j++)
				{
					if (board[j][i] == 1)
					{
						numOfX ++;
					}
					else
					{
						numOfO ++;
					}
				}
				if (numOfX == SIZE || numOfO == SIZE)
				{
					gotResult = true;
					break;
				}
			}
		}
		
		// 检查对角线
		if(!gotResult)
		{
			for (int i=0;i<board.length;i++)
			{
				numOfX = 0;
				numOfO = 0;
				if (board[i][i] == 1)
				{
					numOfX ++;
				}
				else
				{
					numOfO ++;
				}
			}
			if (numOfX == SIZE || numOfO == SIZE)
			{
				gotResult = true;
			}
		}
		
		// 检查反对角线
		if(!gotResult)
		{
			for (int i=0;i<board.length;i++)
			{
				numOfX = 0;
				numOfO = 0;
				if (board[i][SIZE-i-1] == 1)
				{
					numOfX ++;
				}
				else
				{
					numOfO ++;
				}
			}
			if (numOfX == SIZE || numOfO == SIZE)
			{
				gotResult = true;
			}
		}
		if(gotResult)
		{
			if(numOfX == 3)
			{
				System.out.print("X win");
			}
			else
			{
				System.out.print("Y win");
			}
		}
		if(!gotResult)
		{
			System.out.print("no result!");
		}
		in.close();
	}

}
