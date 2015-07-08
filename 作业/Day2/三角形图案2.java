package 练习;

import java.util.Scanner;

public class 三角形图案2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =new Scanner(System.in);
		System.out.print("请输入行号：");
		int num=input.nextInt();
		for(int i=1;i<=num;i++){
			//打印空格
			for(int j=1;j<=num-i;j++){
				System.out.println(" ");
			}
			//打印星号
			for(int j=1;j<=i*2-1;j++){
				System.out.println("*");
			}
			System.out.println();
		}
			}

	}


