package Assignement;

public class Second_Problem {

	public static void main(String[] args) {

		
		String str = "aabbccd";
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<str.length();j++) {
				
				if(str.charAt(i)==str.charAt(j)) {
					System.out.println("The are the duplicates elements :"+str.charAt(j));
				break;
				}
				
			}
		}
		
		
	}

}
