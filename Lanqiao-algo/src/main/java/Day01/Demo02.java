package Day01;

import java.util.Scanner;

public class Demo02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer a = sc.nextInt();
        Integer b = sc.nextInt();

        String[] dayOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        Integer res = 1;
        while (b > 0) {
            if ((b & 1) == 1) {
                // System.out.print(res + " ");
                res = (((res * a) % 7) + 7) % 7; // 确保非负
                // System.out.println(res);
            }
            a = a * a % 7;  // 底数平方
            b >>= 1;  // 指数右移 1 位
        }

        System.out.println(dayOfWeek[res]);
    }
}
