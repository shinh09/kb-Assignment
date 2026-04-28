package student.todo.collection.p07;

import java.util.LinkedList;
import java.util.Queue;

public class MainTodo {
    public static void main(String[] args) {
        // TODO 1: Queue<String> 생성
        Queue<String> q = new LinkedList<>();
        // TODO 2: offer로 3개 추가
        q.offer("1");
        q.offer("2");
        q.offer("3");
        // TODO 3: poll 하며 출력
        String result = q.poll();
        System.out.println(result);
    }
}
