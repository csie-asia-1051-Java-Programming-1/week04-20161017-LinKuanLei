package hw;
/*
 * 讓使用者輸入1, 2, 3, 與4選項，
1.輸入 n 並顯示圖形 (ex: n = 5)
2.輸入 n 並顯示圖形
3.輸入 n (必須是奇數)並顯示圖形
4.結束程式
 * Date: 2016/10/17
 * Author: 103051089 林冠磊
 */
import java.util.Scanner;
public class hw04_103051089 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);		
		boolean bl = true;
		while(bl){
			System.out.println("輸入1~3，輸入4結束");
			int sw = scn.nextInt();
			switch(sw){
				case 1:{
					System.out.print("(1)輸入 n 並顯示圖形:");
					int n = scn.nextInt();
					if(n%2==0){
						System.out.println("Error!!");
						continue;
					}
					n /= 2;
					for(int i=1;i<=n+1;i++){
						for(int ii=n+1;ii>=i;ii--){
							System.out.print("@");
						}
						System.out.print("\n");
					}
					for(int i=1;i<=n;i++){
						for(int ii=1;ii<=i+1;ii++){
							System.out.print("@");
						}
						System.out.print("\n");
					}
					System.out.println("Complete!!");
					break;
				}
				case 2:{
					System.out.print("(2)輸入 n 並顯示圖形:");
					int n = scn.nextInt();
					n /= 2;
					if(n%2==0){
						System.out.println("Error");
						continue;
					}
					for(int i = 1 ; i <= n+1 ;i++){
						for(int ii = 1 ; ii <= i;ii++){
							System.out.print("*");
						}
						System.out.print("\n");
					}
					for(int i = 1 ; i <= n; i++){
						for(int ii = n ; ii >= i ; ii--){
							System.out.print("*");
						}
						System.out.print("\n");
					}
					System.out.println("Complete!!");
					break;
				}
				case 3:{
					System.out.print("(3)輸入 n 並顯示圖形:");
					int n = scn.nextInt();
					if(n%2==0){
						System.out.println("Error!!");
						continue;
					}
					int nn = n/2;
					for(int i = 1; i<=nn+1;i++){
						for( int b = n-nn; b >=i+1;b--){
							System.out.print(" ");
						}
						for( int ii = 1;ii<=i;ii++){
							
							System.out.print("*");
						}
						for( int ii = 1;ii<=i-1;ii++){

							System.out.print("*");
						}
						System.out.print("\n");
					}
					for(int i =1 ; i<=nn ; i++){
						for( int b = 1; b <=i;b++){
							System.out.print(" ");
						}
						for( int ii = n-nn;ii>i;ii--){

							System.out.print("*");
						}
						for( int ii = n-nn;ii>i+1;ii--){

							System.out.print("*");
						}
						System.out.print("\n");
					}
					System.out.println("Complete!!");
					break;
				}
				case 4:{
					System.out.println("Bye");
					bl = false;
					break;
				}
				default:{
					System.out.println("Not found!!");
				}
			}
		
		}
	System.out.println("Thank You");
	}	
}

