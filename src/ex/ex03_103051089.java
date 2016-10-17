package ex;
import java.util.Scanner;
/*
 * Topic: 讓使用者輸入 一個正整數 n 然後顯示出下列圖形 (例 n = 4)
	* 
	** 
	***
	****
 * Date: 2016/10/17
 * Author: 103051089 林冠磊
 */

public class ex03_103051089 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("輸入 一個正整數 n 然後顯示圖形：");
		int n = scn.nextInt();
		for(int i =1;i<=n;i++){
			for(int ii =1;ii<=i;ii++){
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}

}
