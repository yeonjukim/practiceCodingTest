package line.pre2;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int l = 0;

        do {
            for (int i = 0; i < a; i++) {
                System.out.print("*");
            }
            l++;
            System.out.print("\n");
        }while(l != b);

    }
}
