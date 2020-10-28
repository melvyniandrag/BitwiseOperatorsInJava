
public class FirstLeftShift {
	public static void main(String[] args) {
		
		// How do we turn y into 0x00FFFF00? ( aka 16776960 )
		// Just shift the bottom byte off!
		int y = 0x0000FFFF;
		System.out.println(y << 8 );
	
		// 7005 is decimal
		// The value in binary is 00000000 00000000 00011011 01011101
		// How do we turn this number into 00000000 00000000 11011010 11101000? ( aka 56040 )		
		int x = 7005;
		System.out.println(x << 3);
	
	}


}
