package com.geminno.demodowhile;

public class demo007 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=0;
for(int i=1;i<=99;i++){
	if(i%5==0){
		System.out.println(i);
		continue;
	}
	num++;
}
    System.out.println("num:"+num);
	}

}
