package sec03.exam04_operation;

public class OperationPromotionExample {

	public static void main(String[] args) {
		
		byte byteValue1 = 10;
		byte byteValue2 = 20;
		
		// byteŸ���� ������ �ڵ����� intŸ������ ��ȯ�� �ǰ� ������ ����� byte�� ������ �� ���� ������ int�� �����ؾ� �Ѵ�.
		//byte byteValue3 = byteValue1 + byteValue2;
		int intValue1 = byteValue1 + byteValue2;
		System.out.println(intValue1);
		
		// ���� A ����
		char charValue1 = 'A';
		
		// �����ڵ� 1 ����
		char charValue2 = 1;
		
		// intŸ�� ������ ����Ÿ���� �����ϰ� �Ǹ� int�� �ڵ���ȯ�Ǿ� ����� int�� �ȴ�.
		//char charValue3 = charValue1 + charValue2;
		
		// A�� �����ڵ� 65�̴�.
		int intValue2 = charValue1 + charValue2;
		
		
		System.out.println("�����ڵ�=" + intValue2);
		System.out.println("��¹���=" + (char) intValue2);
		
		int intValue3 = 10;
		
		// ���� ������ ���� ���� �����̴�.
		int intValue4 = intValue3 / 4;
		
		System.out.println(intValue4);
		
		// �ǿ������߿��� �Ǽ� ���ͷ��� ������ ������ �ڵ����� doubleŸ������ ��ȯ�� �ȴ�.
		int intValue5 = 10;
		//int intValue6 = 10 / 4.0;
		
		double doubleValue = intValue5 / 4.0;
		System.out.println(doubleValue);
		
	}
}
