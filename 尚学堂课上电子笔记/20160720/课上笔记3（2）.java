/*
	控制语句
		if单选结构
*/

public class TestIf{
	
	public static void main(String[] args){
		//checkScore(99);
		//eat(200.5);
		sz();
	}
	
	public static void checkScore(int score){
		boolean flag = score>90;
		//如果flag的值为true，就去进入到if的里面去执行，false，直接跳过
		if(flag){
			//如果你的分数大于90分，我到你去北京
			System.out.println(flag + "分数大于90   北京 gogogo");
			System.out.println("给你买个笔记本");
			System.out.println("给你买个铅笔盒");
		}
		System.out.println("-----------------------");
	}
	
	public static void eat(double money){
		//假如身上的钱超过500就去吃海鲜
		boolean flag = money>500;
		if(flag){
			System.out.println("我带你去吃海鲜");
		}
		if(!flag){
			System.out.println("我带你去吃面条");
		}
	}
	/*
		大 >=10
		小 <=9
		豹子 三个相等 
	
	*/
	public static void sz(){
		//三个骰子
		int num1 = (int)(Math.random()*6 + 1);
		int num2 = (int)(Math.random()*6 + 1);
		int num3 = (int)(Math.random()*6 + 1);
		
		int total = num1+num2+num3;
		
		System.out.println(num1+"--"+num2+"--"+num3);
		//开始判断
		if(total>=10){
			System.out.print("大");
		}
		if(total<=9 &&){
			System.out.print("小");
		}
		if(num1=num2=num3){
			System.out.print("豹子");
		}
	}
	
	
	
}
