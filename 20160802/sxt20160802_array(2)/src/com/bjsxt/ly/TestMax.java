package com.bjsxt.ly;

import java.util.ArrayList;

/**
 * 生成[1-10000]数字 100个，求出里面最大数是多少
 * 
 * 为后面的排序打基础
 * 
 * @author Administrator
 *
 */
public class TestMax {
	public static void main(String[] args) {
		//声明数组的长度
		int length = 100;
		//创建数组
		int[] nums = new int[length];
		//开始遍历动态初始化
		for (int i = 0; i < length; i++) {
			nums[i] = (int) (Math.random() * 10000 + 1);
		}
		//首先声明最大的
		int max = nums[0];
		//遍历数组,找出最大的
		for (int i = 1; i < length; i++) {
			//开始判断是否为最大的
			if (nums[i] > max) {
				max = nums[i];
			}
		}
		//打印出最大的数字
		System.out.println("本次生成的数字最大为:" + max);

	}
}
