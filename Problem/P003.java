//整数NとN個の整数A1，A2，…ANがあるとき、それらの合計を出力するプログラム
//制約：1 <= N <= 50
//     1 <= 整数 <= 100

import java.util.Scanner;

public class P003 {
    public static void main(String[] args) {
        //整数N個の配列を作成
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int a[]  = new int[N]; 
        int result = 0;
          
        //整数Nが１以上50以下のときのみ実施
        if (1 <= N && N <= 50) {
            for (int i = 0; i < a.length; i++) {
                a[i] = sc.nextInt();
                result += a[i];
            }
        } else {
            System.out.println("Invalid Number");
        }
        System.out.println(result);
        
    }



}
