package com.bjsxt.ly;

/**
 * 
 * ���Ǵ���һ��������Ǵ���һ�����󣬶������Լ�����������Ҳ�����ԣ�
 * 		������Ƕ���һ������Ϊ10�����飬�൱�����������10������
 * 		���Ե����;����������������
 * 		�����ڴ���֮����Ҫ�����Ը�ֵ�����û�и�ֵ�����Ĭ��ֵ
 *  
 * ��̬�ĳ�ʼ��
 * 		���Ǵ����������֮��ſ�ʼ��ֵ
 * ��̬�ĳ�ʼ��
 * 		�ڴ��������ͬʱֱ�Ӹ�ֵ
 * 
 * ���ֻ��������ֵ��������ÿ��Ԫ�ط���һ��Ĭ��ֵ
 * 	
 * Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 
 * 		�����±�Խ��
 * 
 * Ϊ�˱�֤���������ʱ�򲻳���Խ��Ĵ���������Ҫ֪������ĳ���length
 * 		��Ϊһ�������±����Ч����������[0,length-1];
 * ���е����鶼��һ�����Խ���length,���ǿ���ͨ��length֪������ĳ���
 * 		��������û�취֪�������ʵ��ʹ�ó��� 
 *
 * 
 * 
 * @author Administrator
 *
 */
public class TestInit {
	public static void main(String[] args) {
		//��������һ������
		int[] nums = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		String[] strings = { "aa", "bb", "cc" };

		int[] nos = new int[(int) (Math.random() * 100)];

		//��������
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
	}

	private static void dyInit() {
		//�ֶ�����һ������ĳ���
		int length = 20;
		//��������һ������
		int[] nums = new int[length];
		//��̬�ĸ�ֵ
		for (int i = 0; i < length; i++) {
			nums[i] = (int) (Math.random() * 101);
		}
		System.out.println("----------------��ӡ�����()--------------------");
		for (int i = 0; i < length; i++) {
			System.out.println(nums[i]);
		}
	}
}
