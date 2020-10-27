public class UnsignedShift{
	public static void main(String[] args){
		byte i = -1; // aka 0xFF 0xFF 0xFF 0xFF. 
		byte iUShift = (byte) ( i >>> 1 ); // aka 0x7F 0xFF 0xFF 0xFF ( note the the leading byte is now a 0 ( b01111111 = 0x7F )
		System.out.println(String.valueOf(iUShift));
		
		int j = i >>> 1;
		System.out.println(j); // turns to a big positive number because a zero is pushed into the left spot on the int.
		System.out.println(Integer.MAX_VALUE); // not that it acutally turns into the largest int possible.
		
		System.out.println(0xFF); // 0x00 0x00 0x00 0xFF
		
		//double d = (double)0xff; how to make doubles from literals?
		//System.out.println((double)1.8p1d); // the link below says like this
		// interesting read
		//https://stackoverflow.com/questions/42722895/java-hexadecimal-base-double-literal
		// i wonder if it doesnt work because I'm using corretto. Perhaps they didnt implement that 
		// part of the specification.
	}
}
