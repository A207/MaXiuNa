package ��ϰ;

public class person {
String name;
int age;
String address;
person(){
	
}
//�вι��췽��
person(String n,int a, String add){
	name=n;
	age=a;
	address=add;
	
}
//���ҽ���
void introduce(){
	System.out.println("��Һã��ҽ�"+name+",����"+age+"��,����"+address);
}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
person person=new person();
person.name="������";
person.age=22;
person.address="�Ϸ�";
person.introduce();

	}

}
