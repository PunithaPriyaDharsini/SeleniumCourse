package week1.Day2;

public class NegativeNumber {

	public static void main(String[] args) {
		int number=-40;
		if(number<0)
		{
			System.out.println("The Number is Negative");
		}
		int positiveNumber=Math.abs(number);
		System.out.println("The positive number is"+positiveNumber);
	}

}
