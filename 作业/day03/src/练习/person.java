package 练习;

public class person {
String name;
int age;
String address;
person(){
	
}
//有参构造方法
person(String n,int a, String add){
	name=n;
	age=a;
	address=add;
	
}
//自我介绍
void introduce(){
	System.out.println("大家好，我叫"+name+",今年"+age+"岁,来自"+address);
}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
person person=new person();
person.name="张晓明";
person.age=22;
person.address="合肥";
person.introduce();

	}

}
