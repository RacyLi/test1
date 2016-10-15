/*
	方法
		类似于其他语言的函数，是一段 完成 特定功能 的 代码片段
		
		
	修饰符
		public static
	返回值
		基本数据类型
		引用类型
		void(空)
		
			如果声明了返回值不为空，必须使用关键字return 返回一个值
		
	方法名(标识符)
		见名知意
	参数列表
		根据自己的业务需求可有可无
		
		形参列表:就是说明了这个方法在调用的时候需要传入的参数
			
		实参列表:就是调用方法的时候真正传入的参数
		
		形参的数目和实参的数目  数量类型顺序 都必须一样
		
		
	大括号(花括号)
		代码区
	
	
	修饰符... 返回值 方法名（参数列表）{
		代码区
	}
	
	方法写好之后需要被调用才能够执行
		方法名();   
		

*/
public class Method01{
	
	public static void main(String[] args){
		//代码区
		System.out.println("主方法1");
		//sayHello01();
		//String personName ="独孤求败";
		//sayHello02(personName);
		
		//String date ="2016年7月20号";
		//String personName = "杨过";
		//sayHello03(personName,date);
		
		//String  date="2016年7月20号";
		//String personName = "杨过";
		//int num = 3;
		//sayHello04(personName,num,date);
		
		boolean b = login("zhangsan","123456");
		System.out.println(b);
		
		System.out.println("主方法2");
	}
	
	public static void sayHello01(){
		String personName="张三丰";
		System.out.println("2016年7月20号 欢迎   "+personName+"   来到北京尚学堂");
	}
	
	public static void sayHello02(String personName){
		System.out.println("欢迎   "+personName+"   来到北京尚学堂");
	}
	
	public static void sayHello03(String personName,String date){
		System.out.println(date + " 欢迎   "+personName+"   来到北京尚学堂");
	}
	
	public static void sayHello04(String personName,String date,int num){
		System.out.println(date + " 欢迎   "+personName+" 协同"+num+"位同事  来到北京尚学堂");
	}
	
	public static boolean login(String userName,String password){
	
		System.out.println("您输入的用户名和密码为["+userName+"]["+password+"]");	
		return true;
	
	}
	
	
	
}

