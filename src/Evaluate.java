/*
 * Name: Amie Lacson
 * Test Harness Project
 * Date: December 9 2019
 */

/*
 * The Evaluate class provides static methods for
 *  evaluating operations on two integers.
 */

public class Evaluate {

	int num1 = 0;
	int num2 = 0;
	/*
	 * The GCD() method returns the greatest common
	 * divisor of num1 and num2
	 */
	public static int GCD(int num1, int num2){
		if(num2 == 0){
            return num1;
        }
        return GCD(num2, num1%num2);
    }
  

	/*
	 * The isPrime() method returns true if
	 * num is a prime number
	 */
	public static boolean isPrime(int num){
		if (num <=1) return false;
		if( num == 2 || num == 3) return true;
		if (num > 2 && num % 2 == 0 ) return false;
		int sqrt = (int)Math.sqrt(num)+1;
		for (int j = 3; j < sqrt; j+=2) {
			if (num % j == 0) {
				return false;
			}
		}
		return true;
	}

	/*
	 * The maximum() method returns the larger of the two
	 * numbers between num1 and num2
	 */
	public static int maximum(int num1, int num2){
		{ 
	    	int max;
			if(num1>num2)
	        {
	            max = num1;
	        }
	        else
	        {
	            max = num2;
	        }
			return max;
	    } 
	}
	/*
	 * The minimum() method returns the smaller of the two
	 * numbers between num1 and num2
	 */
	public static int minimum(int num1, int num2){
		{ 
	    	int min;
			if(num1<num2)
	        {
	            min = num1;
	        }
	        else
	        {
	            min = num2;
	        }
			return min;
	    } 
	}

	/*
	 * The average() method returns the average of num1 and num2
	 */
	public static int average(int num1, int num2){
		return (num1 + num2) / 2;
	}

	/*
	 * The intToChar() method returns the character represented
	 * by the integer value num
	 */
	public static char intToChar(int num) {
		
		Character convertIntToChar = (char) num;
		return convertIntToChar;
		
	}
}

