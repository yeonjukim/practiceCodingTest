package Junggo.num2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        int n = s.nextInt();

        ArrayList<Integer> array = new ArrayList<>();


        Scanner input = new Scanner(System.in);

        for(int i = 0; i < m ; i++){
            int num = input.nextInt();
            array.add(num);
        }
        for (int i = 0; i < n; i++) {
            int num = input.nextInt();
            array.add(num);
        }
        Collections.sort(array);

        System.out.print(array);

    }
}
