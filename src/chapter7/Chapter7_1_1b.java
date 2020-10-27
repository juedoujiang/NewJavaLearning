package chapter7;

public class Chapter7_1_1b {

	public static void sum(int a,int b) 
	{
		int i;
		int sum;
		sum = 0;
		for(i=a;i<=b;i++)
		{
			sum+=i;
		}
		System.out.println(a+"到"+b+"的和是"+sum);
	}
	
	public static void main(String[] args) {
		sum(1,10);
		sum(20,30);
		sum(35,45);
	}

}
