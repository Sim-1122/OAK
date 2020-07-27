package sec06.exam02_array_bynew;

public class ArrayCreateByNewExample {

	public static void main(String[] args) {
		
		// 길이 3짜리 배열을 만든다.
		int[] arr1 = new int[3];
		for(int i=0; i<3; i++) {
			System.out.println("arr1[" + i + "]:" + arr1[i]);
		}
		System.out.println();
		
		
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		for(int i=0; i<3; i++) {
			System.out.println("arr1[" + i + "]:" + arr1[i]);
		}
		System.out.println();
		
		// 실수이기 때문에 0.0으로 모두 초기화 되었다.
		double[] arr2 = new double[3];
		for(int i=0; i<3; i++) {
			System.out.println("arr2[" + i + "]:" + arr2[i]);
		}
		System.out.println();
		
		
		arr2[0] = 0.1;
		arr2[1] = 0.2;
		arr2[2] = 0.3;
		for(int i=0; i<3; i++) {
			System.out.println("arr2[" + i + "]:" + arr2[i]);
		}
		System.out.println();
		
		
		// 문자열 배열
		// String은 class타입으로 참조 타입이기 때문에 null값이 들어가있다.
		String[] arr3 = new String[3];
		for(int i=0; i<3; i++) {
			System.out.println("arr3[" + i + "]:" + arr3[i]);
		}
		System.out.println();
		
		
		arr3[0] = "1월";
		arr3[1] = "2월";
		arr3[2] = "3월";
		for(int i=0; i<3; i++) {
			System.out.println("arr3[" + i + "]:" + arr3[i]);
		}
	}
		

}
