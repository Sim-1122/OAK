package sec03.exam01_promotion;

public class PromotionExample {

	public static void main(String[] args) {
		
		// byte������ int������ ��ȯ�Ѵ�.
		byte byteValue = 10;
		int intValue = byteValue;
		System.out.println(intValue);
		
		// char������ int������ ��ȯ�Ѵ�.
		char charValue = '��';
		intValue = charValue;
		System.out.println(intValue);
		
		// int������ long������ ��ȯ�Ѵ�.
		intValue = 500;
		long longValue = intValue;
		System.out.println(longValue);
		
		// float�� �ε��Ҽ������� ���̱� ������ long�������� ū ���� ������ �� �ִ�.
		longValue = 10000000000L;
		float floatValue = longValue;
		System.out.println(floatValue);
	}
}
