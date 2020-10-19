package chapter5;

import java.util.Scanner;

public class Chapter5_2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 搜索
		// 在一组给定的数组中，找出某个数据是否存在
		Scanner in = new Scanner(System.in);
		int[] data = {3,2,5,7,4,9,11,34,12,28};
		int x = in.nextInt();
		int loc = -1;
//		boolean found = false; // 对应下面注释的代码，用for-each循环，不必标注位置
		for(int i=0;i<data.length;i++)
		{
			if(x==data[i])
			{
				loc = i;
				break;
			}
		}
//		for (int k :data)
//		{
//			if(k == x)
//			{
//				found = true;
//				break;
//			}
//		}
		if(loc>-1)
		{
			System.out.println(x+"是第"+(loc+1)+"个");
		}
		else
		{
			System.out.println(x+"不在其中");
		}
		in.close();
	}

}
