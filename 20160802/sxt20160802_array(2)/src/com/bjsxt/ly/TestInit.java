package com.bjsxt.ly;

/**
 * 
 * 我们创建一个数组就是创建一个对象，对象有自己的属性数组也有属性，
 * 		如果我们定义一个长度为10的数组，相当于这个数组有10个属性
 * 		属性的类型就是我们数组的类型
 * 		对象在创建之后需要给属性赋值，如果没有赋值会采用默认值
 *  
 * 动态的初始化
 * 		我们创建完成数组之后才开始赋值
 * 静态的初始化
 * 		在创建数组的同时直接赋值
 * 
 * 如果只声明不赋值，数组会给每个元素分配一个默认值
 * 	
 * Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 
 * 		数组下标越界
 * 
 * 为了保证遍历数组的时候不出现越界的错误，我们需要知道数组的长度length
 * 		因为一个数组下标的有效访问区间是[0,length-1];
 * 所有的数组都有一个属性叫做length,我们可以通过length知道数组的长度
 * 		但是我们没办法知道数组的实际使用长度 
 *
 * 
 * 
 * @author Administrator
 *
 */
public class TestInit {
	public static void main(String[] args) {
		//首先声明一个数组
		int[] nums = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		String[] strings = { "aa", "bb", "cc" };

		int[] nos = new int[(int) (Math.random() * 100)];

		//遍历数组
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
	}

	private static void dyInit() {
		//手动定义一个数组的长度
		int length = 20;
		//首先声明一个数组
		int[] nums = new int[length];
		//动态的赋值
		for (int i = 0; i < length; i++) {
			nums[i] = (int) (Math.random() * 101);
		}
		System.out.println("----------------打印随机数()--------------------");
		for (int i = 0; i < length; i++) {
			System.out.println(nums[i]);
		}
	}
}
