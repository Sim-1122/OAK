package sec03.exam02_casting;

public class CheckValueBeforeCasting {

	public static void main(String[] args) {
		
		// 강제타입 변환시 문제가 발생하지 않도록 if문을 설정해준다.
		int i = 125;
		
		if(i<Byte.MIN_VALUE || i>Byte.MAX_VALUE) {
			System.out.println("byte 타입으로 변환할 수 없습니다.");
			System.out.println("값을 다시 확인해 주세요");
		} else {
			byte b = (byte) i;
			System.out.println(b);
		}
		
	}
}
