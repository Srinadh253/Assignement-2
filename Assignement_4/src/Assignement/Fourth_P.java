package Assignement;

public class Fourth_P {

	public static void main(String[] args) {

		String str="Abcd123$ %#34srinadh".toLowerCase();
		String cont="",ovwels="",special="",num="";
		
		for(int i=0;i<str.length();i++) {
			
			if(str.charAt(i)=='a'|| str.charAt(i)=='e'||str.charAt(i)=='i'|| str.charAt(i)=='o'
					||str.charAt(i)=='u')
			ovwels=ovwels+str.charAt(i);
			else if(str.charAt(i)>='0' && str.charAt(i)<='9')
                    num=num+str.charAt(i);
			else if(str.charAt(i)>='a' && str.charAt(i)<='z')
				cont=cont+str.charAt(i);
			else
				special = special+str.charAt(i);
		}
		
		System.out.println("ovewls are  : "+ovwels);
		System.out.println("constants are::"+cont);
		System.out.println("speical symbols"+special);
		System.out.println("numbers are ::"+num);
		
	}

}
