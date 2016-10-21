package hw;
import java.util.Scanner;
/*
 * 程式個程式讓使用者連續輸入整數 (正數、負數及零)，直到使用者輸入 999 時停止，然後顯示正數有多少個，0 有幾個，負數總共有幾個，使用者可以重覆執行直到使用者輸入n

 * Date: 2016/10/17
 * Author: 103051089 林冠磊
 */
public class hw03_103051089 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int  pCount = 0 , nCount = 0 , zCount = 0;
		while(true){
			pCount = 0 ; nCount = 0 ; zCount = 0;
			while(true){
				System.out.print("輸入整數(輸入999停止輸入)：");
				int n = scn.nextInt();
				if(n==999){
					break;
				}
				if(n>0){
					pCount++;
				}else if(n<0){
					nCount++;
				}else if (n==0){
					zCount++;
				}						
			}
			System.out.println("正整數："+pCount+"\t負整數："+nCount+"\t0："+zCount);			
			System.out.print("輸入n結束程式：");
			char check = scn.next().charAt(0);
			if(check=='N'||check=='n'){
				break;
			}
		}		
	}

}
