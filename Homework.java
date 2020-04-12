public class HomeWork {
	public static void main(String[] args) {
		bus();		
		hospital();	
		train();	
		airplane();
	}
	public static  void bus(){
		int num = 7;
		String plateNumber = "苏E·00000";
		String beginTime = "6:00";
		String endTime = "20:00";
		System.out.println(num +"路");
		System.out.println("车牌号:"+plateNumber);
		System.out.println("早班时间："+beginTime);
		System.out.println("晚班时间："+endTime);
	}
	public static void hospital() {
		String name = "苏州市立医院";
		String address = "苏州市道前街26号";
		int tel = 69009090;
		System.out.println("\n"+"医院名称："+ name);
		System.out.println("地址："+ address);
		System.out.println("电话："+ "0512-"+ tel);
	}
	public static void train() {
		String name = "张三";
		String trainNum = "K28";
		String startStation = "天津";
		String endStation = "北京";
		String time = "2020年4月10日";
		int price = 22;
		long id = 371082199203056453L;
		System.out.println("\n"+"姓名："+ name);
		System.out.println("车次："+ trainNum);
		System.out.println("起始站："+ startStation);
		System.out.println("终点站："+ endStation);
		System.out.println("时间："+time);
		System.out.println(price+"元");
		System.out.println("身份证号："+id);
	}
	public static void airplane() {
		String flight = "HK 497";
		String name = "李四";
		String date = "19MAY";
		String startingStation = "重庆";
		String arrivalStation = "香港";
		String boardingGate = "D05";
		String seatNumString = "14A";
		String time = "0740";
		System.out.println("\n"+"航班号："+ flight);
		System.out.println("姓名："+ name);
		System.out.println("日期："+ date);
		System.out.println("始发站："+ startingStation);
		System.out.println("到达站："+ arrivalStation);
		System.out.println("登机口："+ boardingGate);
		System.out.println("座位号："+ seatNumString);
		System.out.println("登机时间："+ time);
	}
	
}

