package student.todo.inheritance.p01;

class ParentTodo {
    // TODO 1: name 필드 선언
    public String name;
}

class ChildTodo extends ParentTodo {
    // TODO 2: age 필드 선언
    public int age;
    public ChildTodo(String name, int age){
        this.age = age;
        this.name = name;
        System.out.println("이름:"+ name + " 나이:"+ age);
    }
}

public class MainTodo {
    public static void main(String[] args) {
        // TODO 3: ChildTodo 객체를 생성하고 부모/자식 필드 출력
        ChildTodo child = new ChildTodo("홍길동",14);
    }
}
