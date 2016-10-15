package com.bjsxt.ly;

public class TestSort {
	public static void main(String[] args) {
		//ð������
		int[] nums = randomArray(10);
		bubbleSortSec(nums);
		printArray(nums);
	}

	/**
	 * ð������
	 * ��ѭ�����𽻻��Ĵ���
	 * ��ѭ���������ֵĽ���
	 * 
	 * @param nums
	 */
	public static void bubbleSort(int[] nums) {
		for (int i = 0; i < nums.length - 1; i++) {
			//��ʼ�Ƚϲ�����
			for (int j = 0; j < nums.length - 1 - i; j++) {
				if (nums[j] > nums[j + 1]) {
					//����
					int temp = nums[j];
					nums[j] = nums[j + 1];
					nums[j + 1] = temp;
				}
			}
			printArray(nums);
		}
	}

	/**
	 * �����޸�  
	 * ����Ϊ���ڵ����ε�ʱ���Ѿ�ȫ������ã�����Ҫ��������
	 * ����Ҫ���������ź��ˣ�������Ҫͳ��ÿ�ν����Ĵ���
	 * 
	 * @param nums
	 */
	public static void bubbleSortSec(int[] nums) {
		for (int i = 0; i < nums.length - 1; i++) {
			//����һ��������¼�����Ĵ������������Ϊ0��˵�������Ѿ��������
			int changeCount = 0;
			//��ʼ�Ƚϲ�����
			for (int j = 0; j < nums.length - 1 - i; j++) {
				if (nums[j] > nums[j + 1]) {
					//����
					int temp = nums[j];
					nums[j] = nums[j + 1];
					nums[j + 1] = temp;
					//��ʼ����
					changeCount++;
				}
			}
			//��ʼ�жϱ�����û�����ֵĽ���
			if (changeCount == 0) {
				break;
			}
			System.out.print("��" + i + "��ѭ����");
			printArray(nums);
		}
	}

	/**
	 * ��ӡ����
	 * @param nums
	 */
	private static void printArray(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + "\t");
		}
		System.out.println();
	}

	private static int[] randomArray(int length) {
		//����һ������
		int[] nums = new int[length];
		//��ʼ��̬��ʼ��
		for (int i = 0; i < nums.length; i++) {
			nums[i] = (int) (Math.random() * 10000);
		}
		//��������
		return nums;
	}

}
