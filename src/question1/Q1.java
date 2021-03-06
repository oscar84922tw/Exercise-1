package question1;

import java.util.Scanner;

/* 題目
 * 寫一個方法（函數） boolean isPrime(int n)，接受一個整數n為參數，若n 為質數
 * ，則傳回true；若不為質數則傳回false。質數的判斷方法如下：
 * 如果n不是質數，那麼n一定有一個小於等於√n的因數。換句話說，如果n沒有任何小於等於√n的因數，那麼必定是質數。
 * 要配上一個最大公因數的method。
 * 可以利用（int）Math.sqrt(double a)求出√n，然後利用for loop針對每一個小於√n的整數，計算與n 的最大公因數，
 * 只要全部的最大公因數都為1，那麼，n 就是質數。
 */
public class Q1 {

	public static boolean isPrime(int n) {
		int tmp = (int) Math.sqrt(n);// 求√n並設為tmp
		for (int i = tmp; i > 1; i--) {
			if (n % i == 0) {// 如果n有小於他的因數的話會餘數呈現零
				return false;// 返回false值，他不是質數，並結束方法
			} else {
			}
		}
		return true;// 沒有小逾n的因數，回傳true
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int demo = sc.nextInt();
		System.out.println(isPrime(demo));
		sc.close();
	}
}
