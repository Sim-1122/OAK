package sec03.exam02_casting;

public class CastingExample {

	public static void main(String[] args) {
		
		// intValue�� 4����Ʈ charValue�� 2����Ʈ�̱� ������ ������ȯ�� ����� �Ѵ�.
		int intValue = 44032;
		char charValue = (char)intValue;
		System.out.println(charValue);
		
		// longValue�� 8����Ʈ intValue�� 4����Ʈ�̱� ������ ������ȯ�� ����� �Ѵ�.
		long longValue = 500;
		intValue = (int)longValue;
		System.out.println(intValue);
		
		// doubleValue�� �Ǽ�Ÿ�� intValue�� ����Ÿ���̱� ������ ������ȯ�� ����� �Ѵ�.
		double doubleValue = 3.14;
		intValue = (int) doubleValue;
		System.out.println(intValue);
	}
}
