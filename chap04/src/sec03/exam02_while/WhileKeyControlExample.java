package sec03.exam02_while;

public class WhileKeyControlExample {

	public static void main(String[] args) throws Exception {
		
		/* Ű����� �Է��� 3���� ���ڸ� �����ؼ�
		���� �ӵ��� ���� �� ������ ���� �� ������ ���α׷��� ���� �� �������� 
		while������ �Է��� �ް� if���� ���� ó���ϴ� ���α׷��̴�. */
		
		// �Ĺݺ� IO(Input, Output)����¿��� ����ȴ�.
		// Ű������ Ű �ڵ� ���� �д� �޼ҵ��̴� ex) Ű���� 1�� KeyCode������ 49�� �ȴ�.
		// ���� ó���� ���� throw Exception�� �Է��Ѵ�.
		
		boolean run = true;
		int speed = 0;
		int keyCode = 0;
		
		while(run) {
			// ���� keyCode�� 13�� �ƴϰ� 10�� �ƴ϶�� = ����Ű�� �ƴ϶��
			// 13���� 10���� ���ܵǱ� ������ 1���� ����.
			if(keyCode!=13 && keyCode!=10) {
				System.out.println("---------------------------");
				System.out.println("1.���� | 2.���� | 3.����");
				System.out.println("---------------------------");
				// println�� ����� �� �� ���� ������ ����� �ϰ� print�� ���� �ٲ��� �ʰ� ��� ����Ѵ�.
				System.out.print("����: ");
			}
			
			keyCode = System.in.read();
			
			if(keyCode == 49) {
				speed++;
				System.out.println("���� �ӵ�=" + speed);
			} else if(keyCode == 50) {
				speed--;
				System.out.println("���� �ӵ�=" + speed);
			} else if(keyCode == 51) {
				run = false;
			}
		}
		// ���ʹ� Carriage Return and Line Feed ��  \n �� Enter
		System.out.println("���α׷� ����");
	}

}
