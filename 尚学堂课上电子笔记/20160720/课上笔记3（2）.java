/*
	�������
		if��ѡ�ṹ
*/

public class TestIf{
	
	public static void main(String[] args){
		//checkScore(99);
		//eat(200.5);
		sz();
	}
	
	public static void checkScore(int score){
		boolean flag = score>90;
		//���flag��ֵΪtrue����ȥ���뵽if������ȥִ�У�false��ֱ������
		if(flag){
			//�����ķ�������90�֣��ҵ���ȥ����
			System.out.println(flag + "��������90   ���� gogogo");
			System.out.println("��������ʼǱ�");
			System.out.println("�������Ǧ�ʺ�");
		}
		System.out.println("-----------------------");
	}
	
	public static void eat(double money){
		//�������ϵ�Ǯ����500��ȥ�Ժ���
		boolean flag = money>500;
		if(flag){
			System.out.println("�Ҵ���ȥ�Ժ���");
		}
		if(!flag){
			System.out.println("�Ҵ���ȥ������");
		}
	}
	/*
		�� >=10
		С <=9
		���� ������� 
	
	*/
	public static void sz(){
		//��������
		int num1 = (int)(Math.random()*6 + 1);
		int num2 = (int)(Math.random()*6 + 1);
		int num3 = (int)(Math.random()*6 + 1);
		
		int total = num1+num2+num3;
		
		System.out.println(num1+"--"+num2+"--"+num3);
		//��ʼ�ж�
		if(total>=10){
			System.out.print("��");
		}
		if(total<=9 &&){
			System.out.print("С");
		}
		if(num1=num2=num3){
			System.out.print("����");
		}
	}
	
	
	
}
