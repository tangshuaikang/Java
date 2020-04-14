/*
	一个人去医院里挂号，取消预约超过三次则提示无法预约
*/
/**
 * 
 * @author tsk
 * @date   2020年4月14日
 */
import java.util.Scanner;
public class Hospital {

	public static void main(String[] args) {
			register();
	}
	public static void register() {
		int count = 0;
		for(int i = 0; i < 3; i++) {
			Scanner s =new Scanner(System.in);
			for(int j = 1; j > 0; j++) {
				System.out.print("预约挂号（Y/N）：");
				String cfm = s.next();
				if (cfm.equals("Y")||cfm.equals("y")) {
				System.out.println("挂号成功！");
				break;
				}else if (cfm.equals("N")||cfm.equals("y")) {
				System.out.println("已退出");
				return;
				}else {
				System.out.println("您输入的有误,请重新输入");
				}
			}
			for(int k =1 ; k > 0; k++) {
				System.out.print("退出系统（Y）"+"\t");
				System.out.println("取消预约（N）");
				System.out.println("请输入：");
				String cl = s.next();
				if(cl.equals("Y")||cl.equals("y")) {
					System.out.println("已退出");
					return;
				}else if(cl.equals("N")||cl.equals("n")) {
					System.out.println("已取消预约");
					count++;
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
}
