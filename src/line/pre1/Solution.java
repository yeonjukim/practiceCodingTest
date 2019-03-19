package line.pre1;

import java.util.Arrays;

public class Solution {
    public int[] solution(int[][] v) {
        int[] answer = new int[2];


        int x = v[0][0];
        int y = v[0][1];
        int tX = v[1][0];
        int tY = v[1][1];

        int cnt = 0;

        for(int i = 0; i < v.length; i++){
            if(x == v[i][0]) cnt++;
            else tX = v[i][0];
        }
        if(cnt == 2){
            answer[0] = tX;
        }
        else {
            answer[0] = x;
        }

        cnt = 0;

        for(int i = 0; i < v.length; i++){
            if(y == v[i][1]) cnt++;
            else tY = v[i][1];
        }
        if(cnt == 2){
            answer[1] = tY;
        }
        else{
            answer[1] = y;
        }
        System.out.print(Arrays.toString(answer));

        return answer;
    }
}
