package sec03.exam05_continue;

public class ContinueExample {

	public static void main(String[] args) {
		
		for(int i=1; i<=10; i++) {
			
			// ���� i�� 2�� ���� �������� 0�� �ƴ϶��
			if( i%2 !=0 ) {
				// �ݺ����� ó������ ���ư���.
				continue;
			}
			
			System.out.println(i);
		}

	}

}
