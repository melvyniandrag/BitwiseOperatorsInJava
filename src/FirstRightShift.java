
public class FirstRightShift {

	
	public static void main(String[] args) {
		// 7005 is decimal
		// The value in binary is 00000000 00000000 00011011 01011101
		// How do we turn this number into 3?
		// 3 in binary is 00000000 00000000 00000000 00000011
		
		int x = 7005;
		System.out.println(x >> 11);
		
		
		// How do we turn y into 0x000000FF? ( aka 255 )
		// Just shift the bottom byte off!
		int y = 0x0000FFFF;
		System.out.println(y >> 8 );
		
		
	}

}
