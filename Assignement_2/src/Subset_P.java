import java.util.HashSet;

public class Subset_P {
	
	public static boolean Subarray(int a[],int b[]) {
		
		HashSet<Integer> hset = new HashSet<Integer>();
		int m= a.length;
		int n=b.length;
		for(int i=0;i<m;i++) {
			
			if(! hset.contains(a[i]))
				hset.add(a[i]);
				
		}
		System.out.println(hset);
		
		
		for(int i=0;i<n;i++) {
			
			if(!hset.contains(b[i]))
				return false;
		}
		
		
		return true;
	}

	public static void main(String[] args) {

	int a[]= {11,1,13,21,3,7};
	int b[] = {11,3,7,1,1};
	
	
	System.out.println(Subarray(a,b));
	
		
	}

}
