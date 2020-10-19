package chapter5;

import java.util.Scanner;

public class Homework_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int[][] input1 = new int[100][2];
		int[][] input2 = new int[100][2];
		int[][] output = new int[100][2];
		for (int i = 0;;i++)
		{
			for(int j = 0;j<2;j++)
			{
				input1[i][j] = in.nextInt();
			}
			if (input1[i][0] == 0)
			{
				break;
			}
		}
		
		for (int i = 0;;i++)
		{
			for(int j = 0;j<2;j++)
			{
				input2[i][j] = in.nextInt();
			}
			if (input2[i][0] == 0)
			{
				break;
			}
		}
		int maxcount = (input1[0][0]>input2[0][0])?input1[0][0]:input2[0][0];
		for (int i = 0;i<=maxcount;i++)
		{
			for(int j = 0;j<=maxcount;j++)
			{
				boolean flag = false;
				if(input1[j][0]==(maxcount-i))
				{
					flag = true;
					output[i][0] = maxcount-i;
					output[i][1] += input1[j][1];
				}
				if(flag) 
				{
					break;
				}
			}
			for(int j = 0;j<=maxcount;j++)
			{
				boolean flag =false;
				if(input2[j][0]==(maxcount-i))
				{
					flag = true;
					output[i][0] = maxcount-i;
					output[i][1] += input2[j][1];
				}
				if(flag)
				{
					break;
				}
			}
		}
		if (maxcount != 0)
		{
			if (output[0][1] != 0)
			{
				if (output[0][1] != 1 && output[0][1] !=-1)
				{
					System.out.print(output[0][1]+"x"+output[0][0]);
				}
				else
				{
					if(output[0][1] == 1)
					{
						System.out.print("x"+output[0][0]);
					}
					else
					{
						System.out.print("-x"+output[0][0]);
					}
				}
			}
			else
			{
				int zeroCount=0;
				for (int i=1;i<=maxcount;i++)
				{
					
					if(output[i][1] == 0)
					{
						zeroCount++;
					}
				}
				if(zeroCount == 6 )
				{
					System.out.print(0);
				}
			}
		}
		else
		{
			System.out.print(output[0][1]);
		}
		
		for (int i = 1;i<maxcount-1;i++)
		{
			if (output[i][1] != 0)
			{
				if(output[i][1] != 1 && output[i][1] !=-1)
				{
					int zeroCount = 0;
					for(int j = 0;j<i;j++)
					{
						if(output[j][1] == 0)
						{
							zeroCount++;
						}
					}
					
					if(output[i][1] > 0 && zeroCount!=i)
					{
						System.out.print("+"+output[i][1]+"x"+output[i][0]);
					}
					else
					{
						System.out.print(output[i][1]+"x"+output[i][0]);
					}
				}
				else
				{
					int zeroCount = 0;
					for(int j = 0;j<i;j++)
					{
						if(output[j][1] == 0)
						{
							zeroCount++;
						}
					}
					if(output[i][1] == 1 && zeroCount==i-1)
					{
						System.out.print("+"+"x"+output[i][0]);
					}
					else
					{
						System.out.print("-"+"x"+output[i][0]);
					}
				}
			}
		}
		if (maxcount >=1 )
		{
			if (output[maxcount-1][1] !=0)
			{
				if(output[maxcount-1][1] != 1 && output[maxcount-1][1] !=-1)
				{
					int zeroCount = 0;
					for(int j = 0;j<maxcount-1;j++)
					{
						if(output[j][1] == 0)
						{
							zeroCount++;
						}
					}
					if(output[maxcount-1][1] > 0 && zeroCount != maxcount-1)
					{
						System.out.print("+"+output[maxcount-1][1]+"x");
					}
					else
					{
						System.out.print(output[maxcount-1][1]+"x");
					}
				}
				else
				{
					int zeroCount = 0;
					for(int j = 0;j<maxcount-1;j++)
					{
						if(output[j][1] == 0)
						{
							zeroCount++;
						}
					}
					if(output[maxcount-1][1] == 1 && zeroCount != maxcount-1)
					{
						System.out.print("+"+"x");
					}
					else
					{
						System.out.print("-"+"x");
					}
				}
			}
			if (output[maxcount][1] > 0)
			{
				System.out.print("+"+output[maxcount][1]);
			}
			else if (output[maxcount][1] < 0)
			{
				System.out.print(output[maxcount][1]);
			}
		}
		in.close();
	}
}
		

