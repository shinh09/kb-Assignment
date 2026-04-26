package student.todo.oop.p04;

class PrinterTodo {
    // TODO 1: println(int value)
    // TODO 2: println(boolean value)
    // TODO 3: println(double value)
    // TODO 4: println(String value)
    void println(int value){
        System.out.println("int: "+ value);
    }
    void println(boolean value){
        System.out.println("boolean: "+value);
    }
    void println(double value){
        System.out.println("double: "+ value);
    }
    void println(String value){
        System.out.println("String: "+ value);
    }
}

public class MainTodo {
    public static void main(String[] args) {
        // TODO 5: PrinterTodo 객체 생성 후 네 메소드 호출
        PrinterTodo printer1 = new PrinterTodo();
        printer1.println(1);
        printer1.println(true);
        printer1.println("신형");
        printer1.println(1.123);
    }
}
