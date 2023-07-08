package Assignement;

public class Panagram_P {
	public static void main(String[] args) {
		
		
		String str ="The quick brown fox jumps over a lazy dog".replace("", "").toLowerCase();
		String str2="";
		
		for(char i='a';i<='z';i++) {
			
			
			if(str.indexOf(i)!=-1)
				str2=str2+i;		
		}
	

	if(str2.length()==26)
		System.out.println("panagram");
	else
		System.out.println("NO a panagram");
	}
	
}
