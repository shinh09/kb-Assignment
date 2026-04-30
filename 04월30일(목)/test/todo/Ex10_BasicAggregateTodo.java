package todo;
import todo.common.Order;

import java.util.List;
public class Ex10_BasicAggregateTodo {
    public static void main(String[] args) {
        List<Order> orders = List.of(new Order(1,"홍길동","DONE",30000), new Order(2,"김수영","READY",12000), new Order(3,"오해영","DONE",45000), new Order(4,"강감찬","DONE",22000));
        // TODO: DONE 주문 기준 count, sum, average, max, min을 구하세요.
        long count = orders.stream().filter(order-> order.getStatus().equals("DONE")).count();
        System.out.println("count = " + count);
        long sum = orders.stream().filter(order-> order.getStatus().equals("DONE")).mapToInt(Order::getAmount).sum();
        System.out.println("sum = " + sum);
        double average = orders.stream().filter(order-> order.getStatus().equals("DONE")).mapToInt(Order::getAmount).average().orElse(0.0);
        System.out.println("average = " + average);
        int min = orders.stream().filter(order-> order.getStatus().equals("DONE")).mapToInt(Order::getAmount).min().orElse(0);
        System.out.println("min = " + min);
        int max = orders.stream().filter(order-> order.getStatus().equals("DONE")).mapToInt(Order::getAmount).max().orElse(0);
        System.out.println("max = " + max);
        // TODO: READY 주문 중 첫 번째 주문 금액을 findFirst로 구하세요. 없으면 -1을 출력하세요.
        int findFirst = orders.stream().filter(order->order.getStatus().equals("READY")).mapToInt(Order::getAmount).findFirst().orElse(-1);
        System.out.println("READY 주문중 첫번째 주문금액 : " + findFirst);
    }
}
