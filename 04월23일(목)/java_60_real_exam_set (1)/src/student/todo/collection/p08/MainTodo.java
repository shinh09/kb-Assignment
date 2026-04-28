package student.todo.collection.p08;

import java.util.*;

public class MainTodo {
    public static void main(String[] args) {
        // TODO 1: 정수 리스트 생성 후 30, 10, 20 추가
        // TODO 2: 오름차순 정렬 후 출력
        Set<String> tree = new TreeSet<>();
        tree.add("30");
        tree.add("10");
        tree.add("20");
        for(String t: tree){
            System.out.println(t);
        }
    }
}
