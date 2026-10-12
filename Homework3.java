import java.util.Scanner;

public class Homework3 {
    static int gcd(int m, int n) {
        if (n == 0)
            return m;

        int small, large;
        if (m < n) {
            small = m;
            large = n;
        } else {
            small = n;
            large = m;
        }

        if (small == 0)          // 0으로 나누는 것을 방지
            return large;

        return gcd(small, large % small);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("두 수를 입력하세요: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("두 수의 최대공약수는 " + gcd(a, b) + "입니다.");
        sc.close();
    }
}
