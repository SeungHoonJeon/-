package java_basic_test;


public class MainClass {
	public static void main(String[] args) {
		String str = "JAVA";
		//String str = new String("Java"); �̷��Ե� �ᵵ ������ ���� ���̴� Ŭ�����̱� ������ �����ϰ� �� �� �ְ� �̷��� ����
		System.out.println("str: "+str);
		
		str = str + "_8";
		System.out.println("str"+ str);
		
		StringBuffer sf = new StringBuffer("JAVA");
		System.out.println("sf : "+sf);
		sf.append("World");
		System.out.println("sf: " +sf);
		System.out.println("sf.length():"+sf.length());
		sf.insert(sf.length(), "~~~~"); //�Ű�����1 : ������ ��ġ, �Ű�����2: ���� �� ���ڿ�
		System.out.println("sf: " +sf);
		
		sf.delete(4, 8);
		System.out.println("sf: " +sf);
		
		StringBuilder sb = new StringBuilder("JAVA World!!");
		System.out.println("sb: "+sb);
	}
}
