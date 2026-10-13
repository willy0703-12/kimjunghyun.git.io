import java.util.Scanner;
public class Homework3 {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("몇 개의 수를 입력할 예정인가요?");
        int count=scanner.nextInt();
        int nums[]= new int[count];

        System.out.println("수를 입력하세요:");
        for(int i=0; i<count; i++){
            nums[i]=scanner.nextInt();
        }
        int min = nums[0];
        int max = nums[0];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
            if (nums[i] > max) {
                max = nums[i];
            }
        }
            System.out.println("최대값: " +max);
            System.out.println("최소값: " +min);
    }
}
