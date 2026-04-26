package student.todo.inheritance.p08;

class BaseTodo {
    // TODO 1: final showInfo() 작성
    final void showInfo(){
        System.out.println("show를 호출합니다.");
    }
}

class SubTodo extends BaseTodo {
    // TODO 2: extra() 작성
    void extra(){
        System.out.println("extra를 호출합니다.");
    }
}

public class MainTodo {
    public static void main(String[] args) {
        // TODO 3: showInfo와 extra 호출
        SubTodo sub = new SubTodo();
        sub.extra();
        sub.showInfo();
    }
}
