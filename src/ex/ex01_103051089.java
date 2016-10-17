package ex;
import java.util.Scanner;
/*
 * Topic: 寫一個程式讓使多個正整數(包含0)直到使用者輸入-1 時停止，同時要顯示這些數字 總合 及 平均。
 * Date: 2016/10/17
 * Author: 103051089 林冠磊
 */

public class ex01_103051089 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("輸入多個正整數，輸入-1 停止：");		
		int sum = 0 , count = 0;
		while(true){
			int a = scn.nextInt();
			if(a==-1){
				break;
			}else if(a<-1){
				System.out.println("輸入值非正整數");
				continue;
			}
			sum+=a;
			count ++;
		}
		System.out.println("總合："+sum+"\t 平均："+(sum/count));		
	}

}
