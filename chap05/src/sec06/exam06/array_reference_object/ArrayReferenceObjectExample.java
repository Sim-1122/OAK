package sec06.exam06.array_reference_object;

public class ArrayReferenceObjectExample {

	public static void main(String[] args) {
		
		String[] strArray = new String[3];
		
		strArray[0] = "Java";
		strArray[1] = "Java";
		strArray[2] = new String("Java");
		
		// 0 인덱스와 1 인덱스의 객체는 같다.
		System.out.println( strArray[0] == strArray[1] );
		// 0 인덱스와 2 인덱스의 객체는 다르다.
		System.out.println( strArray[0] == strArray[2] );
		// 0 인덱스와 2 인덱스의 문자열은 같다.
		System.out.println( strArray[0].equals(strArray[2]) );

	}

}
