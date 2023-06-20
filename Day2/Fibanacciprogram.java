package week1.Day2;

public class Fibanacciprogram {

	public static void main(String[] args) {
		int n=8;
		int firstNum=0;
		int secNum=1;
		for (int i = 0; i <= n; i++) 
		{
		int sum=firstNum+secNum;
		firstNum=secNum;
		secNum=sum;
		System.out.println(sum);
		}

	}

}
