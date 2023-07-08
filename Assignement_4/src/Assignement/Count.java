package Assignement;

public class Count {

	public static void main(String[] args) {

		String str = "srinadhsrinadhss";

		int len = str.length();
		int len_s= str.replace("s", "").length()-len;
		int len_a= str.replace("a", "").length()-len;
		int len_i= str.replace("n", "").length()-len;
		int len_d= str.replace("d", "").length()-len;
		int len_h= str.replace("h", "").length()-len;
		System.out.println("The orginal String "+len);
		System.out.println("lenght_s"+len_s);
		System.out.println("lenght_a"+len_a);
		System.out.println("lenght_h"+len_h);
		System.out.println("lenght_i"+len_i);
		System.out.println("lenght_d"+len_d);
		
		
	}

}
