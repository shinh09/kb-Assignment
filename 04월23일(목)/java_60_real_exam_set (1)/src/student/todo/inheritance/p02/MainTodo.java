package student.todo.inheritance.p02;

class ParentTodo {
    String name;

    // TODO 1: ParentTodo(String name) 생성자 작성
    public ParentTodo(String name){
        this.name = name;
    }
}

class ChildTodo extends ParentTodo {
    int age;

    // TODO 2: ChildTodo(String name, int age) 생성자 작성
    // super(name) 사용
    public ChildTodo(String name, int age){
        super(name);
        this.age = age;
        System.out.println("이름:"+ name + " 나이:"+ age);
    }
}

public class MainTodo {
    public static void main(String[] args) {
        // TODO 3: ChildTodo 객체 생성 및 출력
        ChildTodo child = new ChildTodo("박신형",23);

    }
}
