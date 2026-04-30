package todo;
import java.util.List;
public class Ex02_InternalIteratorTodo {
    public static void main(String[] args) {
        List<Integer> orderAmounts = List.of(12000, 35000, 8000, 64000, 17000);
        // TODO 1: stream()으로 주문 금액과 현재 스레드명을 출력하세요.
        orderAmounts.stream().forEach(order -> System.out.println("order = " + order + " 현재스레드 : "+ Thread.currentThread().getName()) );
        // TODO 2: parallelStream()으로 주문 금액과 현재 스레드명을 출력하세요.
        orderAmounts.parallelStream().forEach(order -> System.out.println("order = " + order + " 현재스레드 : "+ Thread.currentThread().getName()));
        // TODO 3: 출력 순서가 항상 같지 않을 수 있는 이유를 주석으로 설명하세요.
        // 병렬스트림으로 스트림을 생성해서 각 스트림이 병렬로 처리된다. 각 스레드가 비동기?적으로 실행되기 때문에 실행할 때마다 순서가 바뀔수있다.
    }
}
