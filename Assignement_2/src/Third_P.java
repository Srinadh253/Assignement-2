
public class Third_P {

	public static void main(String[] args) {

		int[] a = {3,1,12,31,2,5};
		int temp;
		
		for(int i=0;i<a.length;i++) {
			
			for(int j=i+1;j<a.length;j++) {
				
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int i=0;i<a.length;i++) {
			
			System.out.print("The array after sorting :::->"+a[i]+" ");
		}
		
	}

}
