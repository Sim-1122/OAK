package sec06.exam06.array_reference_object;

public class ArrayReferenceObjectExample {

	public static void main(String[] args) {
		
		String[] strArray = new String[3];
		
		strArray[0] = "Java";
		strArray[1] = "Java";
		strArray[2] = new String("Java");
		
		// 0 �ε����� 1 �ε����� ��ü�� ����.
		System.out.println( strArray[0] == strArray[1] );
		// 0 �ε����� 2 �ε����� ��ü�� �ٸ���.
		System.out.println( strArray[0] == strArray[2] );
		// 0 �ε����� 2 �ε����� ���ڿ��� ����.
		System.out.println( strArray[0].equals(strArray[2]) );

	}

}
