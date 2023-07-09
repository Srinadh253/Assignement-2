
public class First_P {

	public static void main(String[] args) {

		int a[] = {1,2,12,1,2,14,24};
         String str ="";		
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length-1;j++) {
				
				if(a[i]==a[j+1])
					
				str=str+a[i];
			}
			
		}
		System.out.println("The Duplicates elements are :::"+str);
	}

}
