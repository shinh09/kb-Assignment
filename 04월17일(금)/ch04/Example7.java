package ch04;

import java.util.Scanner;

public class Example7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
        System.out.println("1.예금 |2.출금|3.잔고|4.종료");
        System.out.print("선택>");
        int first = sc.nextInt();
        if(first==4) {
            System.out.println("프로그램 종료");
            break;}
            System.out.print("잔고>");
            int second = sc.nextInt();
        }

    }
}
