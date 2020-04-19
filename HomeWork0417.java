package homework;
import java.util.Scanner;

public class HomeWork0417 {	
	
	public static void card() {
		System.out.println((int)((Math.random()*9+1)*1000));
	}
	
	public static void main(String[] args) {
		Hotel h1= new Hotel();
		h1.name = "苏州过车站南广场拙政园商务酒店";
		h1.address = "江苏省苏州市姑苏区人民路2156号";
		
		
		Hotel h2= new Hotel();
		h2.name = "格雅苏州工业园区金鸡湖东方之门酒店";
		h2.address = "江苏省苏州工业园区星海街169号";
		
		Hotel h3= new Hotel();
		h3.name = "格林豪泰苏州漕湖工业园智选酒店";
		h3.address = "江苏省苏州市相城区黄畦路3号";
		
		
		String[] hotel = {"1.",h1.name,"2.",h2.name,"3.",h3.name};
		for (String s : hotel) {
			System.out.print(s);
		}
		System.out.println();
		Scanner s = new Scanner(System.in);
		for(int m =1; m > 0; m++) {
			System.out.print("请选择酒店：");
			int num = s.nextInt();
			if (num==1) {
				System.out.println(h1.name);
				System.out.println(h1.address);
				hotel1();
				break;
			}else if (num==2) {
				System.out.println(h2.name);
				System.out.println(h2.address);
				hotel2();
				break;
			}else if (num==3) {
				System.out.println(h3.name);
				System.out.println(h3.address);
				hotel3();
				break;
			}else {
				System.out.println("输入有误");
			}
		}
		System.out.println("您的房卡为：");
		card();
	}
	
	public static void hotel1() {
		String[]type = {"标准间","大床房","豪华双床房"};
		int[] price = {169,189,209};
		int[] vipPrice = {149,161,190};
		Scanner s = new Scanner(System.in);
		for (int i = 0 ; i < type.length; i++) {
			System.out.println(type[i]+"\t"+price[i]+"元");
		}
		for(int n = 1; n > 0 ; n++) {
			System.out.println("登录会员享会员专属价格"+"\n"+"登录会员(Y/N)");
			String vip = s.next();
			if (vip.equals("Y")||vip.equals("y")) {
				for (int i = 0; i < price.length; i++) {
					System.out.println(type[i]+"\t"+vipPrice[i]+"元");
				}
				break;
			}else if (vip.equals("N")||vip.equals("n")) {
				break;
			}else {
				System.out.println("输入有误");
			}
		}
		System.out.println("请输入您需要预定的房型：");
		String k = s.next();
		if(k.equals("大床房")||k.equals("标准间")||k.equals("豪华双床房")) {
			return;
		}else {
			System.out.println("您输入的有误");
		}
	}
	
	public static void hotel2() {
		Scanner s = new Scanner(System.in);
		System.out.println("豪华双床房：399元");
		System.out.println("登录会员享会员专属价格"+"\n"+"登录会员(Y/N)");
		
		for (int i = 1; i > 0; i++) {
			String vip = s.next();
			if (vip.equals("Y")||vip.equals("y")) {
				System.out.println(339+"元");
				break;
			}else if (vip.equals("N")||vip.equals("n")) {
				break;
			}else {
				System.out.println("您输入有误");
			}
		}
		System.out.println("请输入您需要预定的房型：");
		String k = s.next();
		if(k.equals("豪华双床房")) {
			return;
		}
	}
	
	public static void hotel3() {
		Scanner s = new Scanner(System.in);
		System.out.println("高级大床房：189元");
		System.out.println("登录会员享会员专属价格"+"\n"+"登录会员(Y/N)");
		
		for (int i = 1; i > 0; i++) {
			String vip = s.next();
			if (vip.equals("Y")||vip.equals("y")) {
				System.out.println(161+"元");
				break;
			}else if (vip.equals("N")||vip.equals("n")) {
				break;
			}else {
				System.out.println("您输入有误");
			}
		}
		System.out.println("请输入您需要预定的房型：");
		String k = s.next();
		if(k.equals("高级大床房")) {
			return;
		}
	}
}

class Hotel {
	String name;//酒店名
	String address;//地址
}
