/*
 	一个人去医院里挂号，取消预约超过三次则提示不能再次预约。
*/
/**
 * 
 * @author tsk
 * @date   2020年4月14日
 */
import java.util.Scanner;
public class Hospital {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
			register();
	}
	public static void register() {
		int count = 0;
		for(int i = 0; i < 3; i++) {
			Scanner s =new Scanner(System.in);
			register1();
			for(int k =1 ; k > 0; k++) {
				System.out.print("退出系统（Y）"+"\t");
				System.out.println("取消预约（N）"+"\t");
				System.out.println("预约挂号（R）");
				System.out.println("请输入：");
				String cl = s.next();
				if(cl.equals("Y")||cl.equals("y")) {
					System.out.println("已退出");
					return;
				}else if(cl.equals("N")||cl.equals("n")) {
					System.out.println("已取消预约");
					System.out.println("您还有 " + (2-count)+"次机会取消预约");
					count++;
					break;
				}else if (cl.equals("R")||cl.equals("r")){
					break;
				}else {
					System.out.println("输入有误");
				}
			}
			if(count == 3) {
				System.out.println("当天取消三次"+"\n"+"您已被列入黑名单！无法进行下一次预约");				
			}
		}
	}
	
	//预约挂号
	public static void register1() {
		Scanner s = new Scanner(System.in);
		for(int j = 1; j > 0; j++) {
			System.out.print("请输入您需要挂号科室的序号：");
			System.out.println("1.外科   "+"2.内科   "+"3.皮肤科   "+"4.耳鼻喉科   "+"5.儿科");
			int cfm = s.nextInt();//输入所需挂号科室
			if (cfm == 1||cfm == 2||cfm == 3||cfm == 4||cfm == 5) {
				System.out.println("请输入预约时间（7.30-18.30）：");
				double time = s.nextDouble();
				if (time < 7.30||time>18.30) {
					System.out.println("输入时间有误");
				}else {
					System.out.println("挂号成功！");
				}
			break;	
			}else {
				System.out.println("您输入的有误,请重新输入");
			return;
			}
		}
	}
}
