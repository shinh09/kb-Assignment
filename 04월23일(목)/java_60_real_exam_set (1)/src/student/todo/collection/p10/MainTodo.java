package student.todo.collection.p10;

import java.util.*;

public class MainTodo {
    public static void main(String[] args) {
        // TODO 1: List<Map<String, Object>> 구조를 사용해 학생 2명 정보 저장
        // 이름, 점수 키 사용
        List<Map<String, Object>> students = new ArrayList<>();
        // TODO 2: 모든 학생 정보 출력
        Map<String,Object> s1 = new HashMap<>();
        s1.put("이름","홍길동");
        s1.put("점수",90);
        students.add(s1);
        Map<String,Object> s2 = new HashMap<>();
        s2.put("이름","고길동");
        s2.put("점수",100);
        students.add(s2);

        for(var s : students){
            System.out.println(s.get("이름")+" : "+s.get("점수"));
        };
    }
}
class Student{
    private String name;
    private int score;
    private int height;

    public Student(String name, int score, int height) {
        this.name = name;
        this.score = score;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
