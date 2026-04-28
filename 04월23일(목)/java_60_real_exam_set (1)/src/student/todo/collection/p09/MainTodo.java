package student.todo.collection.p09;

import java.util.ArrayList;
import java.util.List;

class StudentTodo {
    String name;
    int score;

    // TODO 1: 생성자 작성
    public StudentTodo(String name, int score) {
        this.name = name;
        this.score = score;
    }
}

public class MainTodo {
    public static void main(String[] args) {
        // TODO 2: StudentTodo 리스트 생성
        List<StudentTodo> student = new ArrayList<StudentTodo>();
        // TODO 3: 객체 3개 추가
        student.add(new StudentTodo("박신형",90));
        student.add(new StudentTodo("홍길동",80));
        student.add(new StudentTodo("고길동",100));
        // TODO 4: 평균 점수 출력
        int sum = 0;
        for(StudentTodo i : student){
            sum+= i.score;
        }
        System.out.println("평균 : "+ sum/student.size());
    }
}
