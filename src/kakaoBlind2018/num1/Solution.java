package kakaoBlind2018.num1;

import java.util.*;

public class Solution {
    public String[] solution(String[] record) {

        ArrayList<String> tmpAnswer = new ArrayList<>();
        Queue<String> enter = new LinkedList<>();
        Queue<String> leave = new LinkedList<>();
        HashMap<String, String> nameMap = new HashMap<>();

        for (String v: record) {
            String id = v.split(" ")[1];

            if (v.startsWith("E")){
                String name = v.split(" ")[2];
                enter.offer(id);
                nameMap.put(id, name);
            }else if(v.startsWith("L")){
                leave.offer(id);
            }else{
                String changedName = v.split(" ")[2];
                nameMap.put(id, changedName);
            }
        }
        for (String v: record) {
            String id = v.split(" ")[1];

            if (v.startsWith("E")){
                String name = nameMap.get(id);
                tmpAnswer.add(name + "님이 들어왔습니다.");
            }else if(v.startsWith("L")){
                String name = nameMap.get(id);
                tmpAnswer.add(name + "님이 나갔습니다.");
            }else{
                continue;
            }
        }
        String[] answer = new String[tmpAnswer.size()];

        tmpAnswer.toArray( answer );

        return answer;
    }
}
