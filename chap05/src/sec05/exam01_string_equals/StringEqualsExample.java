package sec05.exam01_string_equals;

public class StringEqualsExample {

	public static void main(String[] args) {
		
		// �Ȱ��� ���ڿ� ���ͷ��� ����
		String strVar1 = "�Ź�ö";
		String strVar2 = "�Ź�ö";
		
		// strVar1�� strVar2�� �����ϴ� ��ü�� ���������� �˾ƺ���.
		if(strVar1 == strVar2) {
			System.out.println("strVar1�� strVar2�� ������ ����");
		} else {
			System.out.println("strVar1�� strVar2�� ������ �ٸ�");
		}
		
		String strVar3 = new String("�Ź�ö");
		String strVar4 = new String("�Ź�ö");
		
		if(strVar3 == strVar4) {
			System.out.println("strVar3�� strVar4�� ������ ����");
		} else {
			System.out.println("strVar3�� strVar4�� ������ �ٸ�");
		}
		
		// strVar3�� �����ϰ� �ִ� ��ü�� ���ڿ��� strVar4�� �������� �˾ƺ���.
		if( strVar3.equals(strVar4)) {
			System.out.println("strVar3�� strVar4�� ���ڿ��� ����");
		}
	}

}
