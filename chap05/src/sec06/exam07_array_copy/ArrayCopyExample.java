package sec06.exam07_array_copy;

public class ArrayCopyExample {

	public static void main(String[] args) {
		
		String[] oldStrArray = { "java", "array", "copy" };
		String[] newStrArray = new String[5];
		
		// 이전 배열, 이전 배열의 복사 위치, 새로운 배열, 새로운 배열의 붙여넣기 위치, 복사할 개수를 넣어준다.
		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);
		
		for(int i=0; i<newStrArray.length; i++) {
			System.out.print(newStrArray[i] + ",");
		}

	}

}
