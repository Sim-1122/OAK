package sec06.exam07_array_copy;

public class ArrayCopyExample {

	public static void main(String[] args) {
		
		String[] oldStrArray = { "java", "array", "copy" };
		String[] newStrArray = new String[5];
		
		// ���� �迭, ���� �迭�� ���� ��ġ, ���ο� �迭, ���ο� �迭�� �ٿ��ֱ� ��ġ, ������ ������ �־��ش�.
		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);
		
		for(int i=0; i<newStrArray.length; i++) {
			System.out.print(newStrArray[i] + ",");
		}

	}

}
