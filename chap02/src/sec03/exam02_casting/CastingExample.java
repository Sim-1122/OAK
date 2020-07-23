package sec03.exam02_casting;

public class CastingExample {

	public static void main(String[] args) {
		
		// intValue는 4바이트 charValue는 2바이트이기 때문에 강제변환을 해줘야 한다.
		int intValue = 44032;
		char charValue = (char)intValue;
		System.out.println(charValue);
		
		// longValue는 8바이트 intValue는 4바이트이기 때문에 강제변환을 해줘야 한다.
		long longValue = 500;
		intValue = (int)longValue;
		System.out.println(intValue);
		
		// doubleValue는 실수타입 intValue는 정수타입이기 때문에 강제변환을 해줘야 한다.
		double doubleValue = 3.14;
		intValue = (int) doubleValue;
		System.out.println(intValue);
	}
}
