package ��ϰ;

public class Phone {
//���ԣ�������
	String name;
	String brand;
	int price;
	//��Ϊ��������
	void call(){
		System.out.println("��绰~");
		
	}
	void sendmag(){
		System.out.println("������~");
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//ʵ����һ���ֻ�
		Phone P=new Phone();
		P.name="note";
		P.brand="����";
		P.price=1000;
		System.out.println(P.brand);
		P.sendmag();
		
		
				
	}

}
