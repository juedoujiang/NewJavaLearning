package chapter5;

import java.util.Scanner;

public class Chapter5_2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ����
		// ��һ������������У��ҳ�ĳ�������Ƿ����
		Scanner in = new Scanner(System.in);
		int[] data = {3,2,5,7,4,9,11,34,12,28};
		int x = in.nextInt();
		int loc = -1;
//		boolean found = false; // ��Ӧ����ע�͵Ĵ��룬��for-eachѭ�������ر�עλ��
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
			System.out.println(x+"�ǵ�"+(loc+1)+"��");
		}
		else
		{
			System.out.println(x+"��������");
		}
		in.close();
	}

}
