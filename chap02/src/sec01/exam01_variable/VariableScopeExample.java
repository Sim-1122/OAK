package sec01.exam01_variable;

public class VariableScopeExample {

	public static void main(String[] args) {
		// int Ÿ���� ���� ������ �Ѵ�.
		/*int var1;*/
		
		// if�� ���
		if(true) {
		/*	int var2;	*/
			
		/*	var1 = 10;	*/
		/*	var2 = 20;	*/
		}
		
		// var1�� 10�� ������ �� �ִ�.
		/*var1 = 10;*/
		
		// var2�� 20�� ��ȣ �ȿ��� ����� ������ ����� �� ����.
		//var2 = 20;
		
		// for�� ���
		for(int i=0; i<1; i++) {
		/*	int var3;	*/
			
		/*	var1 = 10;	*/
		/*	var3 = 30;	*/
		}
		
		// var1�� 10�� ������ �� �ִ�.
		/*var1 = 10;*/
		
		// var3�� ��ȣ�� ����� ������ 30�� ������ �� ����.
		//var3 = 30;
	}
}
