package chapter05;

public class TrycatchThrows {

	public static void fun() throws Exception{
		
		try {  // �����ڵ�
			System.out.println("fun()�޼���");
		} catch (RuntimeException e) {  // RuntimeException : �����߿� �߻��ϴ� ����
			// ������ �����ϴ� ���๮
			System.out.println("���ܹ߻�");
			
		}finally { // ������ ���� ���ϰų� ������ ��Ƶ� ������ �����ؾ��ϴ� �ڵ�
			System.out.println("finally  ����");
		}
		
	}
	
	public static void main(String[] args) {
		// static �̹Ƿ� �ٷ� ȣ�� �����ؾ������� throws Exception �޼ҵ� �̹Ƿ� try catch�� ȣ��
		// fun()
		try {
            fun();			
		} catch (Exception e) {
			System.out.println("main()�� catch�� ����");
		}
		

	}

}
