package sec02.exam02_char;

public class CharExample {

	public static void main(String[] args) {
		
		// char ������ ���� A�� �����Ѵ�.
		char c1 = 'A';
		
		// char ������ �����ڵ� 65�� �����Ѵ�.
		char c2 = 65;
		
		// char ������ 4�ڸ� 16���� 0041�� �����Ѵ�.
		char c3 = '\u0041';
		
		// char ������ �ѱ��� �����Ѵ�.
		char c4 = '��';
		
		// char ������ 10������ ���� �����Ѵ�.
		char c5 = 44032;
		
		// char ������ 4�ڸ� 16���� AC00�� �����Ѵ�.
		char c6 = '\uAC00';
		
		// char ������ �����ڵ�� �˱� ���ؼ��� int Ÿ���� ������ �����Ѵ�.
		int uniCode = c1;
		
		// ����Ѵ�.
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c6);
		
		System.out.println(uniCode);
		
	}
}
