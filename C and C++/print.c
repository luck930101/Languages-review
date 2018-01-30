#include <stdio.h>

int main () {

// 1	 c       haracter
// 2	 d or i  Signed decimal integer
// 3	 e       Scientific notation (mantissa/exponent) using e character
// 4	 E       Scientific notation (mantissa/exponent) using E character
// 5	 f       Decimal floating point
// 6	 g       Uses the shorter of %e or %f
// 7	 G       Uses the shorter of %E or %f
// 8	 o       Signed octal
// 9	 s       String of characters
// 10	 u       Unsigned decimal integer
// 11	 x       Unsigned hexadecimal integer
// 12	 X       Unsigned hexadecimal integer (capital letters)
// 13	 p       Pointer address
// 14	 n       Nothing printed
// 15	 %       Character

	int integernum = 123;
	float floatnum = 123.456789123456;
	double doublenum = 123.456789123456;
	char str[30] = "This is a sentence.";
	char cr = 'a';// can have only one letter
				  // if write 'ab', only print ab

	printf("\n");
	printf("integer is : %d  // in Decimal \n",integernum);
	printf("integer is : %x // Hexadecimal\n ",integernum);
	printf("float is : %f\n",floatnum);
	printf("float is : %.3f // 3 represents the number of digits after the dot.\n",floatnum);
	printf("double is : %lf\n",doublenum);
	printf("double is : %.10f\n // 10 represents the number of digits after the dot.",doublenum);
	printf("String(char) is : %s\n",str);
	printf("character(char) is : %c\n",cr);
	printf("\n");
	return 0;
}