package hw;
import java.util.Scanner;
/*
 * 使用者輸入正整數 n 與 m 然後計算
 * Date: 2016/10/17
 * Author: 103051089 林冠磊
 */
public class hw02_103051089 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("輸入正整數 n 與 m ");
		int n = scn.nextInt() , m = scn.nextInt()  ;
		int val1 = 1;
		for(int i =1;i<=n;i++){
			val1 *= i;
		}
		int val2 = 1;
		for(int i =1;i<=m;i++){
			val2 *= i;
		}
		int val3 = 1;
		for(int i =1;i<=(n-m);i++){
			val3 *= i;
		}
		System.out.println(val1/(val2*val3));
	}
	
	
}


	

