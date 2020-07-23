package sec03.exam01_promotion;

public class PromotionExample {

	public static void main(String[] args) {
		
		// byte변수를 int변수로 변환한다.
		byte byteValue = 10;
		int intValue = byteValue;
		System.out.println(intValue);
		
		// char변수를 int변수로 변환한다.
		char charValue = '가';
		intValue = charValue;
		System.out.println(intValue);
		
		// int변수를 long변수로 변환한다.
		intValue = 500;
		long longValue = intValue;
		System.out.println(longValue);
		
		// float는 부동소수점으로 쓰이기 때문에 long변수보다 큰 값을 저장할 수 있다.
		longValue = 10000000000L;
		float floatValue = longValue;
		System.out.println(floatValue);
	}
}
