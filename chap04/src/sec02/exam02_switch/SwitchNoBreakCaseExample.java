package sec02.exam02_switch;

public class SwitchNoBreakCaseExample {

	public static void main(String[] args) {
		
		/* Math.random()�� 0��Math.random��1�� ���� ���� ������.
		 ���� Math.random()*6�� 0��Math.random*4��4�� ���� ���� ������
		  8�� Math.random*4 + 8 ��12�� ������ ������. */
		int time = (int)(Math.random()*4) + 8;
		System.out.println("[���� �ð�: " + time + " ��]");
		
		switch(time) {
			case 8:
				System.out.println("����մϴ�.");
			case 9:
				System.out.println("ȸ�Ǹ� �մϴ�.");
			case 10:
				System.out.println("������ �մϴ�.");
			default:
				System.out.println("�ܱ��� �����ϴ�.");
				
		}
	}

}
