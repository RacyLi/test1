package com.bjsxt.ly;

public class TestSort {
	public static void main(String[] args) {
		//冒泡排序
		int[] nums = randomArray(10);
		bubbleSortSec(nums);
		printArray(nums);
	}

	/**
	 * 冒泡排序
	 * 外循环负责交换的次数
	 * 内循环负责数字的交换
	 * 
	 * @param nums
	 */
	public static void bubbleSort(int[] nums) {
		for (int i = 0; i < nums.length - 1; i++) {
			//开始比较并交换
			for (int j = 0; j < nums.length - 1 - i; j++) {
				if (nums[j] > nums[j + 1]) {
					//交换
					int temp = nums[j];
					nums[j] = nums[j + 1];
					nums[j + 1] = temp;
				}
			}
			printArray(nums);
		}
	}

	/**
	 * 继续修改  
	 * 就是为了在第三次的时候已经全部排序好，不需要继续排序
	 * 不需要交换就是排好了，我们需要统计每次交换的次数
	 * 
	 * @param nums
	 */
	public static void bubbleSortSec(int[] nums) {
		for (int i = 0; i < nums.length - 1; i++) {
			//定义一个变量记录交换的次数，如果次数为0，说明数组已经排序完成
			int changeCount = 0;
			//开始比较并交换
			for (int j = 0; j < nums.length - 1 - i; j++) {
				if (nums[j] > nums[j + 1]) {
					//交换
					int temp = nums[j];
					nums[j] = nums[j + 1];
					nums[j + 1] = temp;
					//开始计数
					changeCount++;
				}
			}
			//开始判断本次有没有数字的交换
			if (changeCount == 0) {
				break;
			}
			System.out.print("第" + i + "次循环：");
			printArray(nums);
		}
	}

	/**
	 * 打印数组
	 * @param nums
	 */
	private static void printArray(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + "\t");
		}
		System.out.println();
	}

	private static int[] randomArray(int length) {
		//声明一个数组
		int[] nums = new int[length];
		//开始动态初始化
		for (int i = 0; i < nums.length; i++) {
			nums[i] = (int) (Math.random() * 10000);
		}
		//返回数组
		return nums;
	}

}
