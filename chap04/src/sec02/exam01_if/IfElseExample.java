package sec02.exam01_if;

public class IfElseExample {

	public static void main(String[] args) {
		
		int score = 85;
		
		if(score>=90) {
			System.out.println("������ 90���� Ů�ϴ�.");
			System.out.println("����� A �Դϴ�.");
		} else {
			System.out.println("������ 90���� �۽��ϴ�.");
			System.out.println("����� B �Դϴ�.");
		}
		
		/* ���⿡�� score�� 85�̱� ������ �����帧���� ����Ǵٰ�
		 ���ǹ����� false�� �Ǿ� else�� �Ѿ �����ϰ� �ȴ�. 
		 score�� 95�� �ٲ�� �Ǹ� if������ �����ϰ� �Ǵ� ���� �� �� �ִ�. */
	}
}
