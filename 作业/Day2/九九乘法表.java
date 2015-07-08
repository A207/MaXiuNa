package 练习;

public class 九九乘法表 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    //i代表第一个乘数
	for(int i=1;i<=9;i++){
		//j代表第二个乘数
		for(int j=1;j<=i;j++){
			System.out.println(i+"*"+j+"="+(i*j)+"\t");
		}
		System.out.println("");
	}
	}

}
