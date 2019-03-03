package kakaoBlind2018.num2;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = {};
        double[] failRate = new double[N];
        int[] success = new int[N];
        int[] stay = new int[N+1];

        ArrayList<Integer> tmpList = new ArrayList<>();

        for (int stage: stages) {
            stay[stage - 1]++;
            if(stage > N){
                for(int i = 0; i < success.length; i++){
                    success[i]++;
                }
            }else {
                for(int i = 0; i < stage-1; i++){
                    success[i]++;
                }
            }
        }
        for(int i = 0; i < failRate.length; i++){
            failRate[i] = (double)stay[i] / (stay[i] + success[i]);
        }

        double tmp = 0;

        for(int i = 0; i < failRate.length; i++){
            for(int j = 0; j < failRate.length; j++){
                if(i != j){

                }
            }
        }

        System.out.print(Arrays.toString(failRate));


        return answer;
    }
}
