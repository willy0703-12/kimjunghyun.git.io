import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        System.out.print("정수를 입력하세요: ");
        sum += sc.nextInt();
        System.out.printf("현재까지의 합은 %d입니다.\n", sum);

        System.out.print("정수를 입력하세요: ");
        sum += sc.nextInt();
        System.out.printf("현재까지의 합은 %d입니다.\n", sum);

        System.out.print("정수를 입력하세요: ");
        sum += sc.nextInt();
        System.out.printf("현재까지의 합은 %d입니다.\n", sum);

        System.out.print("정수를 입력하세요: ");
        sum += sc.nextInt();
        System.out.printf("현재까지의 합은 %d입니다.\n", sum);

        System.out.print("정수를 입력하세요: ");
        sum += sc.nextInt();
        System.out.printf("현재까지의 합은 %d입니다.\n", sum);

        sc.close();
    }
}