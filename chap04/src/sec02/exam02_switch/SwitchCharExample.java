package sec02.exam02_switch;

public class SwitchCharExample {

	public static void main(String[] args) {
		
		char grade = 'B';
		
		// ��ȣ �ȿ� ���� ���� ����Ÿ���̸� ��� ����. char Ÿ�Ե� ����Ÿ���̱� ������ �����ϴ�.
		switch(grade) {
			/* �ڹٴ� ��ҹ��ڸ� ������.
			 2���� ������ ������ �ڵ带 �����ؾ� �ȴٸ� �ٿ��� ����� �� �ִ�. */
			case 'A':
			case 'a':
				System.out.println("��� ȸ���Դϴ�.");
				break;
			case 'B':
			case 'b':
				System.out.println("��� ȸ���Դϴ�.");
				break;
			default:
				System.out.println("�մ��Դϴ�.");
		}

	}

}
