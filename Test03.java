/*
	�ӿ���̨����һ�����������жϸ������Ƿ�Ϊ������
	����������1����Ȼ���У�����1�ͱ���û��������������Ȼ����
*/
import java.util.Scanner;
public class Test03{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.print("���������֣�");
		int num = s.nextInt();
		boolean zhishu = true;
		for(int i = 2; i <num; i++){
			if(num % i ==0){
				//System.out.println("�����ֲ�������");
				zhishu = false;
				break;
			}
		}
		System.out.println(num + (zhishu ? "��" : "����") + "����");
	}
}