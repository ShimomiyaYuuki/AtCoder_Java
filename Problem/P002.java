//３つの整数A1，A2，A3があるとき、３つの合計を出力するプログラム
//制約:1 <= A1，A2，A3<= 100

import java.util.Scanner;

public class P002 {
    public static void main(String[] args) {
        int[] num = new int[3]; //入力回数分の配列の生成
        int result = 0; //入力した値の合計値

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
            result += num[i];
        }
        System.out.println("３つの整数A1，A2，A3の合計は" + result);
    }
}
