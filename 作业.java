public class HomeWork {
	public static void main(String[] args) {
		bus();		
		hospital();	
		train();	
		airplane();
	}
	public static  void bus(){
		int num = 7;
		String plateNumber = "��E��00000";
		String beginTime = "6:00";
		String endTime = "20:00";
		System.out.println(num +"·");
		System.out.println("���ƺ�:"+plateNumber);
		System.out.println("���ʱ��"+beginTime);
		System.out.println("���ʱ��"+endTime);
	}
	public static void hospital() {
		String name = "��������ҽԺ";
		String address = "�����е�ǰ��26��";
		int tel = 69009090;
		System.out.println("\n"+"ҽԺ���ƣ�"+ name);
		System.out.println("��ַ��"+ address);
		System.out.println("�绰��"+ "0512-"+ tel);
	}
	public static void train() {
		String name = "����";
		String trainNum = "K28";
		String startStation = "���";
		String endStation = "����";
		String time = "2020��4��10��";
		int price = 22;
		long id = 371082199203056453L;
		System.out.println("\n"+"������"+ name);
		System.out.println("���Σ�"+ trainNum);
		System.out.println("��ʼվ��"+ startStation);
		System.out.println("�յ�վ��"+ endStation);
		System.out.println("ʱ�䣺"+time);
		System.out.println(price+"Ԫ");
		System.out.println("���֤�ţ�"+id);
	}
	public static void airplane() {
		String flight = "HK 497";
		String name = "����";
		String date = "19MAY";
		String startingStation = "����";
		String arrivalStation = "���";
		String boardingGate = "D05";
		String seatNumString = "14A";
		String time = "0740";
		System.out.println("\n"+"����ţ�"+ flight);
		System.out.println("������"+ name);
		System.out.println("���ڣ�"+ date);
		System.out.println("ʼ��վ��"+ startingStation);
		System.out.println("����վ��"+ arrivalStation);
		System.out.println("�ǻ��ڣ�"+ boardingGate);
		System.out.println("��λ�ţ�"+ seatNumString);
		System.out.println("�ǻ�ʱ�䣺"+ time);
	}
	
}

