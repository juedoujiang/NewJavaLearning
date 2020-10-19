package chapter5;

public class Chapter5_2_3b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 输出100以内的素数，计算机思维
		boolean[] isPrime = new boolean[100];
		for (int i = 2;i<isPrime.length;i++)
		{
			isPrime[i] = true;
		}
		for (int i = 2;i<isPrime.length;i++)
		{
			if(isPrime[i])
			{
				for(int k =2;i*k<isPrime.length;k++)
				{
					isPrime[i*k] = false;
				}
			}
		}
		for (int i = 2;i<isPrime.length;i++)
		{
			if(isPrime[i])
			{
				System.out.print(i+" ");
			}
		}
	}

}
