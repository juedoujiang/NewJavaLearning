package chapter4;

import java.util.Scanner;

public class Homework_2a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		char [] c = s.toCharArray();
		int cnt = s.length();
		for(int i=0;i<cnt;i++)
		{
			switch(c[i])
			{
			case '-':
				System.out.print("fu");
				break;
			case '0':
				System.out.print("ling");
				break;	
			case '1':
				System.out.print("yi");
				break;
			case '2':
				System.out.print("er");
				break;
			case '3':
				System.out.print("san");
				break;
			case '4':
				System.out.print("si");
				break;
			case '5':
				System.out.print("wu");
				break;
			case '6':
				System.out.print("liu");
				break;
			case '7':
				System.out.print("qi");
				break;
			case '8':
				System.out.print("ba");
				break;
			case '9':
				System.out.print("jiu");
				break;
			default:
				break;
			}
//			if(c[i]=='-')
//			{
//				System.out.print("fu");
//			}
//			else if(c[i]=='0')
//			{
//				System.out.print("ling");
//			}
//			else if(c[i]=='1')
//			{
//				System.out.print("yi");
//			}
//			else if(c[i]=='2')
//			{
//				System.out.print("er");
//			}
//			else if(c[i]=='3')
//			{
//				System.out.print("san");
//			}
//			else if(c[i]=='4')
//			{
//				System.out.print("si");
//			}
//			else if(c[i]=='5')
//			{
//				System.out.print("wu");
//			}
//			else if(c[i]=='6')
//			{
//				System.out.print("liu");
//			}
//			else if(c[i]=='7')
//			{
//				System.out.print("qi");
//			}
//			else if(c[i]=='8')
//			{
//				System.out.print("ba");
//			}
//			else if(c[i]=='9')
//			{
//				System.out.print("jiu");
//			}
			if (i!=cnt-1)
			{
				System.out.print(" ");
			}
		}	
		
		in.close();

	}

}
