package Junggo.num4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();

        int startIdx = 0;
        int endIdx = input.length() - 1;

        for(int i = 1; i <= input.length()/2; i++){
            System.out.print(input.charAt(startIdx));
            System.out.print(input.charAt(endIdx));
            startIdx++;
            endIdx--;
            if(startIdx == endIdx) System.out.print(input.charAt(endIdx));
        }


    }
}
