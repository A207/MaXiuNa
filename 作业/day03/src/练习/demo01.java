package ��ϰ;
public class demo01 {
  
       public static void main(String[] args) {
	 
       }
}
		class Person1 {
			String name;
			int age;
			String address;
		public Person1(){
			}
		public Person1(String name,int age){
				this.name=name;
				this.age=age;
			}
		public Person1(String name,int age,String address){
				this(name,age);//���õ�ǰ������������Ĺ��췽��
				this.address=address;
				
			}
			void hello(){
				System.out.println("hello~");
				
			}
			void introduce(){
				System.out.println("name:"+this.name+"\tage:"+this.age+"\taddress:"+this.address);
				this.hello();
			}
		 }
	
	


