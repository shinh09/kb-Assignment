package student.todo.inheritance.p03;

abstract class AnimalTodo {
    // TODO 1: run() 작성
    public void run(){
        System.out.println("동물이 달린다. ");
    }
}

class DogTodo extends AnimalTodo {
    // TODO 2: run() 오버라이딩
    public void run(){
        System.out.println("강아지가 달린다. ");
    }
}

public class MainTodo {
    public static void main(String[] args) {
        // TODO 3: DogTodo 객체 생성 후 run 호출
        DogTodo dog = new DogTodo();
        dog.run();
    }
}
