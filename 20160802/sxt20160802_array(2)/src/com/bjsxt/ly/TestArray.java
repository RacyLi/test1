package com.bjsxt.ly;

/**
 * ����ĺô�
 * 		��ͬ���͵��������
 * 		�����Ⱥ�˳�����δ��
 * 		ÿһ�����ݳ�Ϊһ��Ԫ��
 * 		�±�,����(�ṩ��һ�����Ǵ�����ȡ���ݵķ�ʽ)
 * 		��������ĳ�����10  ����Ӧ����[0,9] == [0,length-1]
 * 	Java������ص�
 * 		1������ĳ����ǹ̶���
 * 			�����ڳ�ʼ��һ�������ʱ�򣬾�Ҫָ�����Ĵ�С����Сһ��ȷ������û���ı�	
 * 		2�������е��������ͱ���Ҫͳһ
 * 			һ��������ֻ��װ��ͬ���͵�����
 * 		3�������е�Ԫ�ؿ�������������
 * 			������������ 
 * 			������������
 * 			ֻҪ����֪�����ͣ���Щ�����Ա�����Ϊһ������
 * 
 * 		�κ����Ͷ������������飬����֮��ֻ��װ�����͵����ݣ����ҳ����ڳ�ʼ��֮��Ͳ����ٸı�
 * Java���������
 * 		����[] ��ʶ��;
 * 		���� ��ʶ��[];
 * 		
 * 		��������������ʼ������ĳ���֮������ĸ���λ�ö���������Ĭ��ֵ
 * 			������������ 
 * 				0 0 0 0 0.0 0.0 '\u0000' false
 * 			������������
 * 				null
 * 		����Ҳ��һ���������͵�����		
 * 
 * 
 * 		Ϊʲô������0��ʼ
 * 			http://www.cs.utexas.edu/users/EWD/transcriptions/EWD08xx/EWD831.html
 * 			http://blog.sina.com.cn/s/blog_7309637a0100tk71.html
 * 			���˵�ƨ�� ---- �涨
 * 
 * 
 * @author Administrator
 *
 */
public class TestArray {
	public static void main(String[] args) {

		//������������ַ�ʽ,����һ��
		String[] strArray;
		int intArray[];
		//��������г�ʼ��
		strArray = new String[20];
		intArray = new int[20];
		Student[] students = new Student[150];
		double[] doubleArray = new double[20];
		//��ʼ�����鸳ֵ
		strArray[0] = "aaa";
		intArray[0] = 15;
		students[0] = new Student();
		//�������鲢��ֵ
		for (int i = 0; i < 150; i++) {
			System.out.println(students[i]);
		}

		//		for (int i = 0; i < 20; i++) {
		//			System.out.println(strArray[i]);
		//		}
		//
		//		for (int i = 0; i < 20; i++) {
		//			System.out.println(doubleArray[i]);
		//		}

		//		for (int i = 0; i < 20; i++) {
		//			intArray[i] = i * 100;
		//		}
		//		for (int i = 0; i < 20; i++) {
		//			System.out.println(intArray[i]);
		//		}

		GirlFriend[] girlFriends = new GirlFriend[100];
		girlFriends[0] = new GirlFriend("�绨");
		girlFriends[1] = new GirlFriend("ܽ��");
		girlFriends[2] = new GirlFriend("���");

	}
}

class Student {

}

class GirlFriend {
	private String name;

	public GirlFriend(String name) {
		this.name = name;
	}
}
