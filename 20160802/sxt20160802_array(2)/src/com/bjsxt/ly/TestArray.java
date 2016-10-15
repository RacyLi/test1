package com.bjsxt.ly;

/**
 * 数组的好处
 * 		相同类型的如果数据
 * 		按照先后顺序依次存放
 * 		每一个数据称为一个元素
 * 		下标,索引(提供了一种我们从数组取数据的方式)
 * 		假如数组的长度是10  索引应该是[0,9] == [0,length-1]
 * 	Java数组的特点
 * 		1。数组的长度是固定的
 * 			我们在初始化一个数组的时候，就要指定他的大小，大小一旦确定，就没法改变	
 * 		2。数组中的数据类型必须要统一
 * 			一个数组中只能装相同类型的数据
 * 		3。数组中的元素可以是任意类型
 * 			基本数据类型 
 * 			引用数据类型
 * 			只要是已知的类型，这些都可以被声明为一个数组
 * 
 * 		任何类型都可以声明数组，声明之后只能装该类型的数据，而且长度在初始化之后就不会再改变
 * Java数组的声明
 * 		类型[] 标识符;
 * 		类型 标识符[];
 * 		
 * 		当我们声明并初始化数组的长度之后，数组的各个位置都被赋予了默认值
 * 			基本数据类型 
 * 				0 0 0 0 0.0 0.0 '\u0000' false
 * 			引用数据类型
 * 				null
 * 		数组也是一个引用类型的数据		
 * 
 * 
 * 		为什么索引从0开始
 * 			http://www.cs.utexas.edu/users/EWD/transcriptions/EWD08xx/EWD831.html
 * 			http://blog.sina.com.cn/s/blog_7309637a0100tk71.html
 * 			王八的屁股 ---- 规定
 * 
 * 
 * @author Administrator
 *
 */
public class TestArray {
	public static void main(String[] args) {

		//声明数组的两种方式,荐第一种
		String[] strArray;
		int intArray[];
		//对数组进行初始化
		strArray = new String[20];
		intArray = new int[20];
		Student[] students = new Student[150];
		double[] doubleArray = new double[20];
		//开始对数组赋值
		strArray[0] = "aaa";
		intArray[0] = 15;
		students[0] = new Student();
		//遍历数组并赋值
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
		girlFriends[0] = new GirlFriend("如花");
		girlFriends[1] = new GirlFriend("芙蓉");
		girlFriends[2] = new GirlFriend("玉凤");

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
