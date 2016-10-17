package ex;
import java.util.Scanner;
/*
 * Topic: 讓使用者輸入 一個正整數 n 及一個字元符號，然後顯示出下列圖形 (例 n = 4,字元符號= @)
    @@@@
    @@@  
    @@  
    @
 * Date: 2016/10/17
 * Author: 103051089 林冠磊
 */

public class ex04_103051089 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("輸入 一個正整數 n及一個字元符號，然後顯示圖形");
		System.out.print("輸入 一個正整數：");
		int n = scn.nextInt();
		System.out.print("輸入 一個符號：");
		char c = scn.next().charAt(0);
		for(int i =1;i<=n;i++){
			for(int ii =n;ii>=1;ii--){
				System.out.print(c);
			}
			System.out.print("\n");
		}
	}
}


