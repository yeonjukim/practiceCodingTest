package Junggo.num1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        int n = s.nextInt();

        char[][] iArray = new char[m][n];

        for (int i = 0; i < m; i++) {
            Scanner input = new Scanner(System.in);
            String line = input.nextLine();
            for (int j = 0; j < n; j++) {
                iArray[i][j] = line.charAt(j);
            }
        }
        StringBuffer output = new StringBuffer();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                switch (iArray[i][j]) {
                    case '*':
                        output.append('*');
                        break;
                    default:
                        int count = 0;

                        for(int ii = i-1; ii <= i+1; i++) {
//                            if (((i - 1 >= 0 || i + 1 < m) && (j - 1 >= 0 || j + 1 < n)))
                            if(i-1 >= 0 || i+1 <= m){
                                for(int jj = j-1; jj <= j+1; j++){
                                    if(jj >= 0 && jj <=n){
                                        if(iArray[ii][jj] == '*') count++;
                                    }
                                }
                            }
                        }
                        output.append(count);
                        break;
                }
            }
            output.append("\n");

        }
        System.out.println(output);
    }
}
