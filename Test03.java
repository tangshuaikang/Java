/*
	从控制台接收一个正整数，判断该数字是否为质数；
	质数：大于1的自然数中，除了1和本身没有其他因数的自然数。
*/
import java.util.Scanner;
public class Test03{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.print("请输入数字：");
		int num = s.nextInt();
		boolean zhishu = true;
		for(int i = 2; i <num; i++){
			if(num % i ==0){
				//System.out.println("改数字不是质数");
				zhishu = false;
				break;
			}
		}
		System.out.println(num + (zhishu ? "是" : "不是") + "质数");
	}
}