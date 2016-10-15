package com.bjsxt.homework;

import java.util.Scanner;

/**
 * 北京尚学堂学校管理系统
 * @author Administrator
 *
 */
public class Bjsxt {
	public static void main(String[] args) {
		//声明一个数组存放学生信息
		Student[] students = new Student[10];
		//声明系统扫描仪，获取用户的输出
		Scanner scanner = new Scanner(System.in);
		//用于存放用户输入的菜单编号
		String menuNum = null;
		while (true) {
			//打印欢迎信息
			printSystemMenu();
			//获取用户的输入
			menuNum = scanner.nextLine();
			//开始匹配用户的输入
			switch (menuNum) {
			case "1":
				addStudent(students);
				break;
			case "2":
				deleteStudent(students);
				break;
			case "3":
				updateStudent(students);
				break;
			case "4":
				queryStudent(students);
				break;
			case "5":
				showStudent(students);
				break;
			case "0":
				System.out.println("-------------------退出系统成功，欢迎下次继续使用");
				return;
			default:
				System.out.println("-------------------对不起找不到对应的处理方法");
				break;
			}
		}

	}

	/**
	 * 显示所有的学生信息
	 * @param students
	 */
	private static void showStudent(Student[] students) {
		System.out.println("BjsxtManagementSystem.showStudent()");

	}

	/**
	 * 查询学生信息
	 * @param students
	 */
	private static void queryStudent(Student[] students) {
		System.out.println("BjsxtManagementSystem.queryStudent()");

	}

	/**
	 * 修改学生信息
	 * @param students
	 */
	private static void updateStudent(Student[] students) {
		System.out.println("BjsxtManagementSystem.updateStudent()");

	}

	/**
	 * 删除学生信息
	 * @param students
	 */
	private static void deleteStudent(Student[] students) {
		//显示所有的学生信息
		//输入要删除学生的学号		
		//删除学生信息		
	}

	/**
	 * 新增学生信息
	 * @param students
	 */
	private static void addStudent(Student[] students) {
		//输入学生的学号，姓名和年龄
		//创建学生对象
		//将学生对象存放至数组
	}

	/**
	 * 打印管理系统菜单
	 */
	private static void printSystemMenu() {
		System.out.println("-------------------欢迎您来到北京尚学堂学校管理系统");
		System.out.println("----------1:新增学生信息");
		System.out.println("----------2:删除学生信息");
		System.out.println("----------3:修改学生信息");
		System.out.println("----------4:查询学生信息");
		System.out.println("----------5:显示所有学生信息");
		System.out.println("----------0:退出系统");
		System.out.println("-------------------请输入菜单编号");
	}
}
