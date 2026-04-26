package student.todo.oop.p01;

class StudentTodo {
    // TODO 1: name 필드 선언 (String)
    // TODO 2: studentNo 필드 선언 (String)
    // TODO 3: grade 필드 선언 (int)
    // TODO 4: printInfo() 메소드 작성
    // 이름, 학번, 학년을 한 줄씩 출력
    String name;
    String studentNo ;
    int grade;
    void printInfo(){
        System.out.printf("이름: %s, 학번: %s , 학년: %d\n",name, studentNo,grade);
    }
}

public class MainTodo {
    public static void main(String[] args) {
        // TODO 5: StudentTodo 객체 2개 생성
        StudentTodo stu1 = new StudentTodo();
        StudentTodo stu2 = new StudentTodo();
        // TODO 6: 서로 다른 학생 정보 저장
        stu1.name = "홍길동";
        stu1.studentNo = "1234";
        stu1.grade = 4;
        stu2.name = "고길동";
        stu2.studentNo = "345";
        stu2.grade = 6;
        // TODO 7: 각 객체의 printInfo() 호출
        stu1.printInfo();
        stu2.printInfo();
    }
}
