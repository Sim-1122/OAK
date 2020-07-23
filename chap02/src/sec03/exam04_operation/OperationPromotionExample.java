package sec03.exam04_operation;

public class OperationPromotionExample {

	public static void main(String[] args) {
		
		byte byteValue1 = 10;
		byte byteValue2 = 20;
		
		// byte타입의 연산은 자동으로 int타입으로 변환이 되고 연산의 결과를 byte에 저장할 수 없기 때문에 int에 저장해야 한다.
		//byte byteValue3 = byteValue1 + byteValue2;
		int intValue1 = byteValue1 + byteValue2;
		System.out.println(intValue1);
		
		// 문자 A 저장
		char charValue1 = 'A';
		
		// 유니코드 1 저장
		char charValue2 = 1;
		
		// int타입 이하의 정수타입을 연산하게 되면 int로 자동변환되어 결과는 int가 된다.
		//char charValue3 = charValue1 + charValue2;
		
		// A는 유니코드 65이다.
		int intValue2 = charValue1 + charValue2;
		
		
		System.out.println("유니코드=" + intValue2);
		System.out.println("출력문자=" + (char) intValue2);
		
		int intValue3 = 10;
		
		// 정수 나누기 정수 값은 정수이다.
		int intValue4 = intValue3 / 4;
		
		System.out.println(intValue4);
		
		// 피연산자중에서 실수 리터럴이 있으면 정수는 자동으로 double타입으로 변환이 된다.
		int intValue5 = 10;
		//int intValue6 = 10 / 4.0;
		
		double doubleValue = intValue5 / 4.0;
		System.out.println(doubleValue);
		
	}
}
