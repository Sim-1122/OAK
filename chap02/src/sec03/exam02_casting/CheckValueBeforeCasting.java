package sec03.exam02_casting;

public class CheckValueBeforeCasting {

	public static void main(String[] args) {
		
		// ����Ÿ�� ��ȯ�� ������ �߻����� �ʵ��� if���� �������ش�.
		int i = 125;
		
		if(i<Byte.MIN_VALUE || i>Byte.MAX_VALUE) {
			System.out.println("byte Ÿ������ ��ȯ�� �� �����ϴ�.");
			System.out.println("���� �ٽ� Ȯ���� �ּ���");
		} else {
			byte b = (byte) i;
			System.out.println(b);
		}
		
	}
}
