package Day01;

import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dividend = sc.nextInt();
        int divisor = sc.nextInt();

        int quotient = dividend / divisor;  // 商
        int remainder = dividend % divisor;  // 余数

        System.out.println(quotient + " " + remainder);
        sc.close();
    }
}
