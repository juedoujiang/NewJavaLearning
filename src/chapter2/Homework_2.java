package chapter2;

import java.util.Scanner;

public class Homework_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int signal = in.nextInt();
		int R = signal/10;
		int S = signal%10;
		String result_1 = " ";
		String result_2 = " ";
		switch (R)
		{
		case 1:
			result_2 = "unreadable";
			break;
		case 2:
			result_2 = "barely readable, occasional words distinguishable";
			break;
		case 3:
			result_2 = "readable with considerable difficulty";
			break;
		case 4:
			result_2 = "readable with practically no difficulty";
			break;
		case 5:
			result_2 = "perfectly readable";
			break;
		default:
			break;
		}
		switch(S)
		{
		case 1:
			result_1 = "Faint signals, barely perceptible";
			break;
		case 2:
			result_1 = "Very weak signals";
			break;
		case 3:
			result_1 = "Weak signals";
			break;
		case 4:
			result_1 = "Fair signals";
			break;
		case 5:
			result_1 = "Fairly good signals";
			break;
		case 6:
			result_1 = "Good signals";
			break;
		case 7:
			result_1 = "Moderately strong signals";
			break;
		case 8:
			result_1 = "Strong signals";
			break;
		case 9:
			result_1 = "Extremely strong signals";
			break;
		default:
			break;
		}
		System.out.print(result_1 + ", " + result_2 + ".");
		in.close();
	}
}
