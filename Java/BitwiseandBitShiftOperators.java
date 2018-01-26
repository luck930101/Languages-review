
public class BitwiseandBitShiftOperators {

	public static void main(String[] args) {

//		| Bitwise OR
//		& Bitwise AND
//		~ Bitwise Complement
//		^ Bitwise XOR
//		<< Left Shift
//		>> Right Shift
//		>>> Unsigned Right Shift
		
		int i = 72;
		int leftshifti = i << 2;
		System.out.println("72 left shift 2 is : "+leftshifti);// 288--72*2^2
		
		int rightshifti = i >> 2;
		System.out.println("72 right shift is : "+rightshifti);// 18--72/(2^2)
		
		System.out.println("***********************************");
		

		
		System.out.println("1|1 is : "+(1|1));
		System.out.println("1|0 is : "+(1|0));
		System.out.println("0|1 is : "+(0|1));
		System.out.println("0|0 is : "+(0|0));
		System.out.println("1&1 is : "+(1&1));
		System.out.println("1&0 is : "+(1&0));
		System.out.println("0&1 is : "+(0&1));
		System.out.println("0&0 is : "+(0&0));
		System.out.println("~0 is : "+(~0));
		System.out.println("~1 is : "+(~1));
		
		System.out.println("********************");
//		12 = 00001100 (In Binary)
//				25 = 00011001 (In Binary)
//
//				Bitwise OR Operation of 12 and 25
//				  00001100
//				| 00011001
//				  ________
//				  00011101  = 29 (In decimal)
		int number1 = 12, number2 = 25, result1;
    	
    	result1 = number1 | number2;
    	System.out.println("12|25 is : "+result1);//print 29 
    	
    	
//    	12 = 00001100 (In Binary)
//    			25 = 00011001 (In Binary)
//
//    			Bit Operation of 12 and 25
//    			  00001100
//    			& 00011001
//    			  ________
//    			  00001000  = 8 (In decimal)
    	int number3 = 12, number4 = 25, result2;
    	
    	result2 = number3 & number4;
    	System.out.println("12&25 is : "+result2);

    	
//    	35 = 00100011 (In Binary)
//
//    			Bitwise complement Operation of 35
//    			~ 00100011 
//    			  ________
//    			  11011100  = 220 (In decimal)
//    	But the answer is not 220
    	
//    	For any integer n, 2's complement of n will be -(n+1).
//
//    	 Decimal         Binary                      2's complement
//    	---------       ---------          ---------------------------------------  
//    	0             00000000          -(11111111+1) = -00000000 = -0(decimal)
//    	1             00000001          -(11111110+1) = -11111111 = -256(decimal)
//    	12            00001100          -(11110011+1) = -11110100 = -244(decimal)
//    	220           11011100          -(00100011+1) = -00100100 = -36(decimal)
//
//    	Note: Overflow is ignored while computing 2's complement.
//    	The bitwise complement of 35 is 220 (in decimal). 
//    	The 2's complement of 220 is -36. Hence, the output is -36 instead of 220.

    	int number = 35, result3;
    	
    	result3 = ~number;
    	System.out.println("~35 is : " +result3);
    	
    	
//    	12 = 00001100 (In Binary)
//    			25 = 00011001 (In Binary)
//
//    			Bitwise XOR Operation of 12 and 25
//    			  00001100
//    			| 00011001
//    			  ________
//    			  00010101  = 21 (In decimal)
    	
    	int number5 = 12, number6 = 25, result4;
    	
    	result4 = number5 ^ number6;
    	System.out.println("12^25 is : " + result4);
    	
		System.out.println("***********************************");
    	
//		The unsigned right shift operator << shifts zero into the leftmost position.
    	int number7 = 5, number8 = -5;
    	
    	// Signed right shift 
    	System.out.println("Signed right shift of 5 is : "+ (number7 >> 1));
    	
    	// Unsigned right shift
    	System.out.println("Unsigned right shift of 5 is : "+ (number7 >>> 1));
    	
    	// Signed right shift 
    	System.out.println("Signed right shift of -5 is : "+ (number8 >> 1));
    	
    	// Unsigned right shift
    	System.out.println("Unsigned right shift of -5 is : "+ (number8 >>> 1));
    	
//    	Notice, how signed and unsigned right shift works differently for 2's complement.
//
//    	The 2's complement of 2147483645 is 3.
//    	
    	
    	
	}

}
