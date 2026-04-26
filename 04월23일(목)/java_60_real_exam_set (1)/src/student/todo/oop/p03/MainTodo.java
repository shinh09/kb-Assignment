package student.todo.oop.p03;

class RectangleTodo {
    int width;
    int height;

    RectangleTodo(int width, int height) {
        // TODO 1: 필드 초기화
        this.width = width;
        this.height = height;
    }

    // TODO 2: getArea() 작성
    void getArea(){
        System.out.println("getArea : "+ width*height);
    }
    // TODO 3: getPerimeter() 작성
    void getPerimeter(){
        System.out.println("getPerimeter : "+ 2*(width+height));
    }
}

public class MainTodo {
    public static void main(String[] args) {
        // TODO 4: RectangleTodo 객체 생성
        RectangleTodo rec = new RectangleTodo(3,4);
        // TODO 5: 넓이와 둘레 출력
        rec.getArea();
        rec.getPerimeter();
    }
}
