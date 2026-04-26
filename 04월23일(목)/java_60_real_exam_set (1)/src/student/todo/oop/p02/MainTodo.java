package student.todo.oop.p02;

class MemberTodo {
    String name;
    String id;

    // TODO 1: 생성자 작성
    // name, id를 받아 this로 초기화
    MemberTodo(String name, String id){
        this.name = name;
        this.id = id;
    }

    void printInfo() {
        System.out.println("이름: " + name);
        System.out.println("아이디: " + id);
    }
}

public class MainTodo {
    public static void main(String[] args) {
        // TODO 2: 생성자를 이용해 객체 생성
        // TODO 3: printInfo() 호출
        MemberTodo member1 = new MemberTodo("박신형","1234");
        member1.printInfo();

    }
}
