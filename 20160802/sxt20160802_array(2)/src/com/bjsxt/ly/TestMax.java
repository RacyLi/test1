package com.bjsxt.ly;

import java.util.ArrayList;

/**
 * ����[1-10000]���� 100�����������������Ƕ���
 * 
 * Ϊ�������������
 * 
 * @author Administrator
 *
 */
public class TestMax {
	public static void main(String[] args) {
		//��������ĳ���
		int length = 100;
		//��������
		int[] nums = new int[length];
		//��ʼ������̬��ʼ��
		for (int i = 0; i < length; i++) {
			nums[i] = (int) (Math.random() * 10000 + 1);
		}
		//������������
		int max = nums[0];
		//��������,�ҳ�����
		for (int i = 1; i < length; i++) {
			//��ʼ�ж��Ƿ�Ϊ����
			if (nums[i] > max) {
				max = nums[i];
			}
		}
		//��ӡ����������
		System.out.println("�������ɵ��������Ϊ:" + max);

	}
}
