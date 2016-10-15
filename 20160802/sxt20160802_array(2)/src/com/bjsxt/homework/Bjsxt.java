package com.bjsxt.homework;

import java.util.Scanner;

/**
 * ������ѧ��ѧУ����ϵͳ
 * @author Administrator
 *
 */
public class Bjsxt {
	public static void main(String[] args) {
		//����һ��������ѧ����Ϣ
		Student[] students = new Student[10];
		//����ϵͳɨ���ǣ���ȡ�û������
		Scanner scanner = new Scanner(System.in);
		//���ڴ���û�����Ĳ˵����
		String menuNum = null;
		while (true) {
			//��ӡ��ӭ��Ϣ
			printSystemMenu();
			//��ȡ�û�������
			menuNum = scanner.nextLine();
			//��ʼƥ���û�������
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
				System.out.println("-------------------�˳�ϵͳ�ɹ�����ӭ�´μ���ʹ��");
				return;
			default:
				System.out.println("-------------------�Բ����Ҳ�����Ӧ�Ĵ�����");
				break;
			}
		}

	}

	/**
	 * ��ʾ���е�ѧ����Ϣ
	 * @param students
	 */
	private static void showStudent(Student[] students) {
		System.out.println("BjsxtManagementSystem.showStudent()");

	}

	/**
	 * ��ѯѧ����Ϣ
	 * @param students
	 */
	private static void queryStudent(Student[] students) {
		System.out.println("BjsxtManagementSystem.queryStudent()");

	}

	/**
	 * �޸�ѧ����Ϣ
	 * @param students
	 */
	private static void updateStudent(Student[] students) {
		System.out.println("BjsxtManagementSystem.updateStudent()");

	}

	/**
	 * ɾ��ѧ����Ϣ
	 * @param students
	 */
	private static void deleteStudent(Student[] students) {
		//��ʾ���е�ѧ����Ϣ
		//����Ҫɾ��ѧ����ѧ��		
		//ɾ��ѧ����Ϣ		
	}

	/**
	 * ����ѧ����Ϣ
	 * @param students
	 */
	private static void addStudent(Student[] students) {
		//����ѧ����ѧ�ţ�����������
		//����ѧ������
		//��ѧ��������������
	}

	/**
	 * ��ӡ����ϵͳ�˵�
	 */
	private static void printSystemMenu() {
		System.out.println("-------------------��ӭ������������ѧ��ѧУ����ϵͳ");
		System.out.println("----------1:����ѧ����Ϣ");
		System.out.println("----------2:ɾ��ѧ����Ϣ");
		System.out.println("----------3:�޸�ѧ����Ϣ");
		System.out.println("----------4:��ѯѧ����Ϣ");
		System.out.println("----------5:��ʾ����ѧ����Ϣ");
		System.out.println("----------0:�˳�ϵͳ");
		System.out.println("-------------------������˵����");
	}
}
