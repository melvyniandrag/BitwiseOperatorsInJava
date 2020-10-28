
public class FirstBitwiseOr {

	public static void main(String[] args) {
	    int x = 0x10FF;          // 00000000 00000000 00010000 11111111
	    int y = 0x01FF111A;      // 00000001 11111111 00010001 00011010
	                             // -----------------------------------
	    int z = x | y;           // 00000001 11111111 00010001 11111111
	    System.out.println(z);  // Convert the above to decimal: 33493503
	}

}
