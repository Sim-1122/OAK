package sec01.exam01_variable;

public class LiteralExample {

	public static void main(String[] args) {
		// int ������ ����Ѵ�.
		int var1 = 10;
		System.out.println(var1);
		
		// 8���� �տ� 0�� �ٿ� ����Ѵ�.
		int var2 = 010;
		System.out.println(var2);
		
		// 16���� 0x �� ���� ����Ѵ�.
		int var3 = 0x10;
		System.out.println(var3);
		
		// double ������ ����Ѵ�.
		double var4 = 0.25;
		System.out.println(var4);
		
		// ������ ������ ǥ���ؾߵǴ� 2 x 10^5�� ����Ѵ�.
		double var5 = 2E5;
		System.out.println(var5);
		
		// ���� ���� char�� ���� ����ǥ�� ���� ����Ѵ�.
		char var6 = 'A';
		System.out.println(var6);
		
		// �ѱ� �� �ڸ� ����Ѵ�.
		char var7 = '��';
		System.out.println(var7);
		
		// �鿩���⸦ �ϱ� ���ؼ� \t�� ǥ���Ѵ�.
		System.out.println('\t' + "�鿩����");
		
		// ���� ū����ǥ�� �־� ǥ���Ѵ�.
		System.out.println("����" + '\n' + "�鿩����");
		
		// ��������ǥ �� �ڸ� ǥ���ϱ� ���� �տ� \�� �ٿ� ǥ���Ѵ�.
		System.out.println("This" + '\'' + "s Java");
		
		// ū����ǥ�� �� �ڸ� ǥ���ϱ� ���� �տ� \�� �ٿ� ǥ���Ѵ�. 
		System.out.println("�̰���" + '\"' + "�߿�" + '\"' + "�մϴ�");
		
		// '\' �ϳ��� ���ڸ� ǥ���ϱ� ���� �տ� \�� �ٿ� ǥ���Ѵ�.
		System.out.println("������" + '\\' + "300�Դϴ�.");
		
		// �����ڵ� 4�ڸ� 16������ ǥ���ϱ� ���� u�� �տ� �ٿ� 0041�̶�� 4�ڸ� 16������ �����ڵ�� ����Ѵ�.
		char var8 = '\u0041';
		System.out.println(var8);
		
		// ���ڿ� ���ͷ�
		System.out.println("����" + "�α�");
		
		// ���ڿ� ���� ������
		System.out.println("java" + 8);
		
		// ���ڿ��� String Ÿ�� ������ �����Ѵ�.
		/*String var9 = "�ڹ�";*/
		
		// �� ������
		boolean var10 = true;
		/*boolean var11 = false;*/
		
		System.out.println(var10);
	}
}
