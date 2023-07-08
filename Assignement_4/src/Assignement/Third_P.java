package Assignement;

public class Third_P {

	public static void main(String[] args) {

		String str = "2552";
		String str2 = "";
		int n = 2552;
		int sum = 0, r;

		for (int i = 0; i < str.length(); i++) {

			str2 = str2 + str.charAt(i);
		}

		if (str2.equals(str))
			System.out.println("Yes it is a palindrome................");
		else
			System.out.println("This is not a palindrome>>>>>>");
		int temp = n;

		while (n > 0) {
			r = n % 10;
			sum = sum * 10 + r;
			n = n / 10;

		}
		if (sum == temp)
			System.out.println("Yes it is a palindrome................");
		else
			System.out.println("This is not a palindrome>>>>>>");

	}
}
