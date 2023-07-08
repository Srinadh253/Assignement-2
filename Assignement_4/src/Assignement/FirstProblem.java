package Assignement;

public class FirstProblem {

	public static void main(String[] args) {

		String str = "Hello aa bb cc";
		System.out.println("This is the orginal string ::" + str);
		System.out.println("*******************************");
		StringBuilder str2 = new StringBuilder();

		str.chars().distinct().forEach(c -> str2.append((char) c));

		System.out.println("With out dupilcates using java 8::" + str2);

		StringBuilder sb2 = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);
			int idx = str.indexOf(ch, i + 1);
			if (idx == -1)
				sb2.append(ch);

		}
		System.out.println("*******************************");
		System.out.println("This is index method.. ::" + sb2);
   
		
	}

}
