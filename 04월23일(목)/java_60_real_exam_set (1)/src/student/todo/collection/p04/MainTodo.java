package student.todo.collection.p04;

import java.util.HashMap;
import java.util.Map;

public class MainTodo {
    public static void main(String[] args) {
        // TODO 1: Map<String, Integer> 생성
        Map<String,Integer> score = new HashMap<String, Integer>();
        // TODO 2: 국어 90, 영어 80, 수학 95 저장
        score.put("국어",90);
        score.put("영어",80);
        score.put("수학",95);
        // TODO 3: 영어 점수 출력
        System.out.println(score);
        System.out.println("영어점수: "+score.get("영어"));
        for(var s: score.entrySet()){
            System.out.println(s.getKey()+ " : " + s.getValue());
        }
    }
}
