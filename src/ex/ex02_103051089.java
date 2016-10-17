package ex;
import java.util.Scanner;
/*
 * Topic: 寫一個程式讓使用者輸入兩個正整數 n 與 m，然後顯示n x m 的乘法表，顯示完後問使用者是否繼續(Y/n) ，Y 可以重新輸入 n 則結束程式。
 * Date: 2016/10/17
 * Author: 103051089 林冠磊
 */

public class ex02_103051089 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		while(true){
			System.out.print("輸入 n 與 m，顯示n x m 的乘法表：");
			int n =scn.nextInt(),m=scn.nextInt();
			for(int i =1;i<=n;i++){
				for(int ii =1;ii<=m;ii++){
					System.out.println(i+"*"+ii+"="+(i*ii));
				}
			}
			System.out.print("是否繼續(Y/n)：");
			char check = scn.next().charAt(0);
			if(check=='N'||check=='n'){
				System.out.print("Bye");
				break;
			}else{
				continue;
			}
		}
	}

}
