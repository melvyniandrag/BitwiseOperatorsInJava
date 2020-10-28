
public class Homework {

	/**
	 * TODO: change bitmask1 and bitmask2 so that this prints true twice.
	 */
	public static void usingAND() {
		System.out.println("Testing & ...");
		int bitmask1 = 0x00000000;
		int value1   = 0xFFFFFFFF;
		
		System.out.println((bitmask1 & value1) == 3);
		
		int bitmask2 = 0x00000000;
		int value2   = 0x00FFFFFF;
		
		System.out.println((bitmask2 & value2) == 256);
	}
	
	/**
	 * TODO: change bitmask1 and bitmask2 so that this prints true twice.
	 * 
	 * bitmask1 | value 1 should be even.
	 * bitmask2 | value 2 should be odd.
	 */
	public static void usingOR() {
		System.out.println("\nTesting | ...");
		int bitmask1 = 0x00000000;
		int value1   = 0xFFFFFFF1;
		
		System.out.println((bitmask1 | value1) % 2 == 0);
		
		int bitmask2 = 0x00000000;
		int value2   = 0x00FFFFF2;
		
		System.out.println((bitmask2 | value2) % 2 == 1);
	}
	
	/**
	 * TODO
	 * Change value1 into 256
	 * Change value2 into 768
	 */
	public static void usingLeftShift() {
		System.out.println("\nTesting <<...");
		
		int value1 = 0x00000001;
		int shiftThisFar1 = 0; // how far should we shift the binary 1?
		System.out.println((value1 << shiftThisFar1) == 256);
		
		int value2 = 3; // aka 00000000 00000000 00000000 00000011
		int shiftThisFar2 = 0; //how far should we shift these bits?
		System.out.println((value2 << shiftThisFar2) == 768);
	}
	
	/**
	 * TODO 
	 * Change value1 into 1
	 * Change value2 into 1
	 */
	public static void usingRightShift() {
		System.out.println("\nTesting <<...");
		int value1 = 256; // I'm writing it in decimal rather than hex for no special reason.
		// Note that 256 in binary is "00000000 00000000 00000001 00000000"
		int shiftThisFar1 = 0; // how far should we shift the binary 1?
		System.out.println((value1 >> shiftThisFar1) == 1);
		
		int value2 = 0xFF; // 00000000 00000000 00000000 11111111 how to make this number into 1?
		int shiftThisFar2 = 0;
		System.out.println((value2 >> shiftThisFar2) == 1);
	}
	
	public static void main(String[] args) {
		usingAND();
		usingOR();
		usingLeftShift();
		usingRightShift();
	}

}
