// りんごが５個、みかんがN個、ユーザーが整数Nを入力した時、リンゴとミカンの合計数を出力するプログラム
//制約；1≦N≦100
//実行時間制限：１秒
import java.util.Scanner;

public class P001 {
    public static void main(String[] args) {
        int result;
        Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt();

        if (0 <= N && N <= 100) {
            result = 5 + N;
            System.out.println(result);
        } else {
            System.out.println("Invalid Number");
        }
        


    }
    
}