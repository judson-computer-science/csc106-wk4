import java.math.*;
 
public class NumberTest {
 
  public static void main(String[] args) {
 
	// this is the largest Integer possible
	Integer maxInteger = Integer.valueOf(Integer.MAX_VALUE);
	System.out.println("value is " + maxInteger.intValue());
 
	// this number can't be represented in an Integer
	// so it will print an unexpected value
	Integer bigNum = Integer.valueOf(maxInteger * 1000);
	System.out.println("value is " + bigNum.intValue());
 
	// now let's represent the expected result as a String
	String maxIntegerStr = maxInteger.toString() + "000";
 
	// and instantiate a BigInteger to hold represent that number
	BigInteger bigNum2 = new BigInteger(maxIntegerStr);
	System.out.println("value is " + bigNum2.toString());
 
	// not only does the BigInteger hold the number, but we
	// can go even bigger...let's multiply it by 5
	BigInteger bigNum3 = bigNum2.multiply(new BigInteger("5"));
	System.out.println("value is " + bigNum3.toString());
 
 
	// so we can see that BigInteger is useful for working with
	// values much larger than an Integer or event a Long can contain
	// Goodbye!
	System.exit(0);
  }
}

