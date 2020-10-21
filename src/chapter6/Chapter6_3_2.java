package chapter6;

public class Chapter6_3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "abc";
		String s2 = "abb";
		System.out.println(s1.compareTo(s2));
		String s3 = "adr";
		for(int i = 0; i<s1.length();i++)
		{
			System.out.println(s3.charAt(i));
		}
		String s4 = "0123A56389ºº×Ö";
		int loc = s4.indexOf('3');
		System.out.println(s4.substring(2));
		System.out.println(s4.substring(2,4));
		System.out.println(s4.indexOf('4'));
		System.out.println(s4.indexOf('A'));
		System.out.println(s4.indexOf("A56"));
		System.out.println(s4.indexOf('3'));
		System.out.println(s4.indexOf('3', loc+1));
	}

}
