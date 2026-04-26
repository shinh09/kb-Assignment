package student.todo.oop.p08;

class StudentTodo {
    String name;
    int score;

    // TODO 1: 생성자 작성
    StudentTodo(String name, int score){
        this.name = name;
        this.score = score;
    }
}

public class MainTodo {
    public static void main(String[] args) {
        // TODO 2: StudentTodo 배열 생성
        StudentTodo[] students = new StudentTodo[3];
        // TODO 3: 객체 3개 저장
        students[0] = new StudentTodo("박신형",98);
        students[1] = new StudentTodo("박신형",23);
        students[2] = new StudentTodo("박신형",100);

        // TODO 4: 합계와 평균 출력
        int sum = 0;
        for(StudentTodo stu: students){
            sum += stu.score;
        }
        System.out.printf("합계: %d , 평균: %.2f",sum,(double)sum/3);
    }
}
