package student.todo.collection.p01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MainTodo {
    public static void main(String[] args) {
        // TODO 1: List<String> 생성
        List<String> list = new ArrayList<String>();
        // TODO 2: "Java", "Spring", "Vue" 추가
        list.add("Java");
        list.add("Spring");
        list.add("Vue");
        // TODO 3: 전체 요소 출력
//       for(var i : list){
//            System.out.println(i);
//        }
        Iterator iterator = list.iterator();
        while(iterator.hasNext()){
            String result = iterator.next().toString();
            System.out.println(result);
        }
    }
}
