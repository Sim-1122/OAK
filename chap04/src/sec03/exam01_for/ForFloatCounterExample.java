package sec03.exam01_for;

public class ForFloatCounterExample {

	public static void main(String[] args) {
		
		/* x�� 0.1���� �����Ѵ�.
		�ε��Ҽ��� ��Ŀ����� 0.1����� �� ���� �ʴ´�.
		�����ϸ� ���� ������ �ϴ°��� ����. */
		for(float x = 0.1f; x<=1.0f; x+=0.1f) {
			System.out.println(x);
		}

	}

}
