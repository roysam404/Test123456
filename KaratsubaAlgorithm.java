package com.SamplePackage;

public class KaratsubaAlgorithm {

	
	// Karatsuba multiplication class
    public static long karatmultiply(long x, long y)
    {
        // Finding length of both integer
        // numbers x and y
        int noOneLength = numLength(x);
        int noTwoLength = numLength(y);
  
        // Find maximum length from both numbers
        // using math library max function
        int maxNumLength
            = Math.max(noOneLength, noTwoLength);
  
        // For very small values
        // multiply directly
        int smallValue = 1 << 4;
        if (maxNumLength < smallValue)
            return x * y;
  
        // Rounding up the
        // divided Max length
        maxNumLength
            = (maxNumLength / 2) + (maxNumLength % 2);
  
        // Multiplier
        long maxNumLengthTen
            = (long)Math.pow(10, maxNumLength);
  
        // Compute the expressions
        long b = x / maxNumLengthTen;
        long a = x - (b * maxNumLengthTen);
        long d = y / maxNumLengthTen;
        long c = y - (d * maxNumLength);
  
        // Compute all mutilpying variables
        // needed to get the multiplication
        long z0 = karatmultiply(a, c);
        long z1 = karatmultiply(a + b, c + d);
        long z2 = karatmultiply(b, d);
  
        return z0 + ((z1 - z0 - z2) * maxNumLengthTen)
            + (z2 * (long)(Math.pow(10, 2 * maxNumLength)));
    }
  
    // Fucntion to calculate
    // length of the number
    public static int numLength(long n)
    {
        int noLen = 0;
        while (n > 0) {
            noLen++;
            n /= 10;
        }
  
        // Returning length of number n
        return noLen;
    }
  
    // Main driver function
    public static void main(String[] args)
    {
        // Showcasing karatsuba multiplication
        // case 1: Big integer lengths
        long product1 = karatmultiply(1345, 63456);
        System.out.println("Product 1 : " + product1);
  
        // Case 2: quite smaller integer length
        long product2 = karatmultiply(102, 213);
        System.out.println("Product 2 : " + product2);
    }
}
