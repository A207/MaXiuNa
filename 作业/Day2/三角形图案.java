package 练习;
import java.util.Scanner;
public class 三角形图案 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input=new Scanner(System.in);
System.out.print("请输入行号：");
int num=input.nextInt();
for(int i=1;i<=num;i++){
	for(int j=1;j<=i;j++){
		System.out.println("*");
	}
	System.out.println();
}
	}

}
