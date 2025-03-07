import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    float Answer ;

    //(N+1)/2の部分が整数になってしまう。
    //この問題を解決するために、float型にキャストする必要があったが思いつかなかった。
    if (N >= 4 && N <= 100) {
        Answer = (1 + N)/2 * 10000;
        System.out.println(Answer);

    }
  }

  
}