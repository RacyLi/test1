/*
	����
		�������������Եĺ�������һ�� ��� �ض����� �� ����Ƭ��
		
		
	���η�
		public static
	����ֵ
		������������
		��������
		void(��)
		
			��������˷���ֵ��Ϊ�գ�����ʹ�ùؼ���return ����һ��ֵ
		
	������(��ʶ��)
		����֪��
	�����б�
		�����Լ���ҵ��������п���
		
		�β��б�:����˵������������ڵ��õ�ʱ����Ҫ����Ĳ���
			
		ʵ���б�:���ǵ��÷�����ʱ����������Ĳ���
		
		�βε���Ŀ��ʵ�ε���Ŀ  ��������˳�� ������һ��
		
		
	������(������)
		������
	
	
	���η�... ����ֵ �������������б�{
		������
	}
	
	����д��֮����Ҫ�����ò��ܹ�ִ��
		������();   
		

*/
public class Method01{
	
	public static void main(String[] args){
		//������
		System.out.println("������1");
		//sayHello01();
		//String personName ="�������";
		//sayHello02(personName);
		
		//String date ="2016��7��20��";
		//String personName = "���";
		//sayHello03(personName,date);
		
		//String  date="2016��7��20��";
		//String personName = "���";
		//int num = 3;
		//sayHello04(personName,num,date);
		
		boolean b = login("zhangsan","123456");
		System.out.println(b);
		
		System.out.println("������2");
	}
	
	public static void sayHello01(){
		String personName="������";
		System.out.println("2016��7��20�� ��ӭ   "+personName+"   ����������ѧ��");
	}
	
	public static void sayHello02(String personName){
		System.out.println("��ӭ   "+personName+"   ����������ѧ��");
	}
	
	public static void sayHello03(String personName,String date){
		System.out.println(date + " ��ӭ   "+personName+"   ����������ѧ��");
	}
	
	public static void sayHello04(String personName,String date,int num){
		System.out.println(date + " ��ӭ   "+personName+" Эͬ"+num+"λͬ��  ����������ѧ��");
	}
	
	public static boolean login(String userName,String password){
	
		System.out.println("��������û���������Ϊ["+userName+"]["+password+"]");	
		return true;
	
	}
	
	
	
}

