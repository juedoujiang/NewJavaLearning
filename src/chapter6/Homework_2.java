package chapter6;

import java.util.Scanner;

public class Homework_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String[] str = new String[100];
		String[] split = new String[100];
		int key = 0;
		int count = 0;
//		String s = "$GPRMC,024813.640,A,3158.4608,N,11848.3737,E,10.05,324.27,150706,,,A*50";
		for (int i = 0;;i++)
		{
			str[i] = in.nextLine();
			count++;
			if (str[i].equals("END"))
			{
				break;
			}
		}
		for (int i = 0;i<count;i++)
		{
			if (str[i].startsWith("$GPRMC"))
			{
				int index = 1;
				int testsum = str[i].charAt(index);
				for (index = 2;str[i].charAt(index) != '*';index++)
				{
					testsum ^= str[i].charAt(index);
				}
				testsum %= 65536;
				
				int checksum = Integer.parseInt(str[i].substring(index+1),16);
				if (checksum != testsum)
				{
					continue;
				}
				split = str[i].split(",");
				if(!split[2].equals("A"))
				{
					continue;
				}
				key = i;
			}
		}
		String time = str[key].split(",")[1];
		int hh = (Integer.parseInt(time.substring(0,2))+8)%24;
		String mm = time.substring(2,4);
		String ss = time.substring(4,6);
		if (hh<10)
		{
			System.out.print("0");
		}
		System.out.print(hh+":"+mm+":"+ss);
		in.close();
	}
}
