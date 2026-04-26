package student.todo.inheritance.p04;

class TireTodo {
    // TODO 1: roll() 작성
    public void roll(){
        System.out.println("tire가 굴러간다. ");
    }
}

class SnowTireTodo extends TireTodo {
    // TODO 2: roll() 오버라이딩
    public void roll(){
        System.out.println("snowtire가 굴러간다.");
    }
}

public class MainTodo {
    public static void main(String[] args) {
        // TODO 3: SnowTireTodo 객체를 TireTodo 변수에 대입 후 roll 호출
        SnowTireTodo tire1 = new SnowTireTodo();
        tire1.roll();
        TireTodo tire2 = tire1;
        tire2.roll();
        //upcasting해도 결과는 동일하다.
        //실제 메모리에 생성되는 객체는 snowtiretodo이기 때문에

        TireTodo tire3 = new TireTodo();
        tire3.roll();
    }
}
