package bojBronze4;

import java.util.Scanner;
public class BOJ25304 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        int N = sc.nextInt();
        int sum = 0;
        for (int i =0; i<N; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            sum += a*b;
        }
        if(total==sum){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}
