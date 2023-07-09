
public class Fifth_P {
	public static void main(String[] args) {
		
		int a[] = {64,25,12,22,11};//12
		
		int length =a.length;
		
		for(int i=0;i<length-1;i++) {
			int min_index=i;
			
			for(int j=i+1;j<length-1;j++) {
				if(a[min_index]>a[j]) {//64
					min_index=j;
				}
				
			}
			int temp=a[min_index];
			a[min_index]=a[i];
			a[i]=temp;
			
		}
		
		for(int i=0;i<length-1;i++) {
			System.out.print("the elements are ::"+a[i]+" ");
		}
		
	}

}
