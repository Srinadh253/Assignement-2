package Assignement;

public class Unique_P {

	public static void main(String[] args) {

		
		String str = "srinadh";
		String str2="";
		boolean flag=true;
		
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<str.length();j++) {
				if(str.charAt(i)==str.charAt(j))

			flag=false;
			}
		}

	if(flag) {
		System.out.println("yes Unique");
	}else
		System.out.println("NO not Unique");
	}

}
