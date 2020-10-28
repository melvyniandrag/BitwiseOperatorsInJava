
public class FirstBitwiseAnd {

	public static void main(String[] args) {
		int x = 0xFFFF;          // 00000000 00000000 11111111 11111111
	    int y = 0xFFFF111A;      // 11111111 11111111 00010001 00011010
                                 // -----------------------------------
	    int z = x & y;           // 00000000 00000000 00010001 00011010
		System.out.println(z);  // Convert the above to decimal: 4378

	}

}
