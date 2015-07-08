package 练习;

public class Phone {
//属性（特征）
	String name;
	String brand;
	int price;
	//行为（方法）
	void call(){
		System.out.println("打电话~");
		
	}
	void sendmag(){
		System.out.println("发短信~");
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//实例化一个手机
		Phone P=new Phone();
		P.name="note";
		P.brand="三星";
		P.price=1000;
		System.out.println(P.brand);
		P.sendmag();
		
		
				
	}

}
